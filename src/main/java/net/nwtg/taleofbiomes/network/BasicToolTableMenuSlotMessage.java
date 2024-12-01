
package net.nwtg.taleofbiomes.network;

import net.nwtg.taleofbiomes.world.inventory.BasicToolTableMenuMenu;
import net.nwtg.taleofbiomes.procedures.ItemTakenFromGUICraftingOutputSlotSingleProcedure;
import net.nwtg.taleofbiomes.procedures.ItemTakenFromGUICraftingOutputSlotShiftProcedure;
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
public record BasicToolTableMenuSlotMessage(int slotID, int x, int y, int z, int changeType, int meta) implements CustomPacketPayload {

	public static final Type<BasicToolTableMenuSlotMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(TaleOfBiomesMod.MODID, "basic_tool_table_menu_slots"));
	public static final StreamCodec<RegistryFriendlyByteBuf, BasicToolTableMenuSlotMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, BasicToolTableMenuSlotMessage message) -> {
		buffer.writeInt(message.slotID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		buffer.writeInt(message.changeType);
		buffer.writeInt(message.meta);
	}, (RegistryFriendlyByteBuf buffer) -> new BasicToolTableMenuSlotMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<BasicToolTableMenuSlotMessage> type() {
		return TYPE;
	}

	public static void handleData(final BasicToolTableMenuSlotMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				Player entity = context.player();
				int slotID = message.slotID;
				int changeType = message.changeType;
				int meta = message.meta;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleSlotAction(entity, slotID, changeType, meta, x, y, z);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleSlotAction(Player entity, int slot, int changeType, int meta, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = BasicToolTableMenuMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (slot == 9 && changeType == 1) {

			ItemTakenFromGUICraftingOutputSlotSingleProcedure.execute(entity);
		}
		if (slot == 9 && changeType == 2) {
			int amount = meta;

			ItemTakenFromGUICraftingOutputSlotShiftProcedure.execute(entity, amount);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		TaleOfBiomesMod.addNetworkMessage(BasicToolTableMenuSlotMessage.TYPE, BasicToolTableMenuSlotMessage.STREAM_CODEC, BasicToolTableMenuSlotMessage::handleData);
	}
}
