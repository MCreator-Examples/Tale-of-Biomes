
package net.nwtg.taleofbiomes.network;

import net.nwtg.taleofbiomes.world.inventory.BasicToolTableMenuRecipeBookMenu;
import net.nwtg.taleofbiomes.procedures.BasicToolTableRecipeHelperNextButtonProcedure;
import net.nwtg.taleofbiomes.procedures.BasicToolTableRecipeHelperBackButtonProcedure;
import net.nwtg.taleofbiomes.procedures.BasicToolTableMenuHideRecipeHelperProcedure;
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
public record BasicToolTableMenuRecipeBookButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<BasicToolTableMenuRecipeBookButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(TaleOfBiomesMod.MODID, "basic_tool_table_menu_recipe_book_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, BasicToolTableMenuRecipeBookButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, BasicToolTableMenuRecipeBookButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new BasicToolTableMenuRecipeBookButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<BasicToolTableMenuRecipeBookButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final BasicToolTableMenuRecipeBookButtonMessage message, final IPayloadContext context) {
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
		HashMap guistate = BasicToolTableMenuRecipeBookMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			BasicToolTableRecipeHelperBackButtonProcedure.execute(entity);
		}
		if (buttonID == 1) {

			BasicToolTableRecipeHelperNextButtonProcedure.execute(entity);
		}
		if (buttonID == 2) {

			BasicToolTableMenuHideRecipeHelperProcedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		TaleOfBiomesMod.addNetworkMessage(BasicToolTableMenuRecipeBookButtonMessage.TYPE, BasicToolTableMenuRecipeBookButtonMessage.STREAM_CODEC, BasicToolTableMenuRecipeBookButtonMessage::handleData);
	}
}
