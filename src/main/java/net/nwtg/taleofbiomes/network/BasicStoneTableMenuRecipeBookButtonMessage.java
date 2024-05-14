
package net.nwtg.taleofbiomes.network;

import net.nwtg.taleofbiomes.world.inventory.BasicStoneTableMenuRecipeBookMenu;
import net.nwtg.taleofbiomes.procedures.BasicStoneTableMenuRecipeHelperForwardButtonProcedure;
import net.nwtg.taleofbiomes.procedures.BasicStoneTableMenuRecipeHelperButtonCloseProcedure;
import net.nwtg.taleofbiomes.procedures.BasicStoneTableMenuRecipeHelperBackButtonProcedure;
import net.nwtg.taleofbiomes.TaleOfBiomesMod;

import net.neoforged.neoforge.network.handling.PlayPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public record BasicStoneTableMenuRecipeBookButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final ResourceLocation ID = new ResourceLocation(TaleOfBiomesMod.MODID, "basic_stone_table_menu_recipe_book_buttons");
	public BasicStoneTableMenuRecipeBookButtonMessage(FriendlyByteBuf buffer) {
		this(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt());
	}

	@Override
	public void write(final FriendlyByteBuf buffer) {
		buffer.writeInt(buttonID);
		buffer.writeInt(x);
		buffer.writeInt(y);
		buffer.writeInt(z);
	}

	@Override
	public ResourceLocation id() {
		return ID;
	}

	public static void handleData(final BasicStoneTableMenuRecipeBookButtonMessage message, final PlayPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.workHandler().submitAsync(() -> {
				Player entity = context.player().get();
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			}).exceptionally(e -> {
				context.packetHandler().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = BasicStoneTableMenuRecipeBookMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			BasicStoneTableMenuRecipeHelperBackButtonProcedure.execute(world, entity);
		}
		if (buttonID == 1) {

			BasicStoneTableMenuRecipeHelperForwardButtonProcedure.execute(world, entity);
		}
		if (buttonID == 2) {

			BasicStoneTableMenuRecipeHelperButtonCloseProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		TaleOfBiomesMod.addNetworkMessage(BasicStoneTableMenuRecipeBookButtonMessage.ID, BasicStoneTableMenuRecipeBookButtonMessage::new, BasicStoneTableMenuRecipeBookButtonMessage::handleData);
	}
}
