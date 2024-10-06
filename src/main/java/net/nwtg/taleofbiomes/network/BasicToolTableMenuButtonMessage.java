
package net.nwtg.taleofbiomes.network;

import net.nwtg.taleofbiomes.world.inventory.BasicToolTableMenuMenu;
import net.nwtg.taleofbiomes.procedures.BasicToolTableMenuShowRecipeHelperProcedure;
import net.nwtg.taleofbiomes.TaleOfBiomesMod;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.HashMap;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record BasicToolTableMenuButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<BasicToolTableMenuButtonMessage> TYPE = new Type<>(new ResourceLocation(TaleOfBiomesMod.MODID, "basic_tool_table_menu_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, BasicToolTableMenuButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, BasicToolTableMenuButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new BasicToolTableMenuButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<BasicToolTableMenuButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final BasicToolTableMenuButtonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				Player entity = context.player();
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = BasicToolTableMenuMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			BasicToolTableMenuShowRecipeHelperProcedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		TaleOfBiomesMod.addNetworkMessage(BasicToolTableMenuButtonMessage.TYPE, BasicToolTableMenuButtonMessage.STREAM_CODEC, BasicToolTableMenuButtonMessage::handleData);
	}
}
