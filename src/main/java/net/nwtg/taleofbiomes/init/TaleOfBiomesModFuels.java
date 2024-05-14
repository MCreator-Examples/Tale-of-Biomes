
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.nwtg.taleofbiomes.init;

import net.neoforged.neoforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class TaleOfBiomesModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == TaleOfBiomesModBlocks.PIRUFF_LOG.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == TaleOfBiomesModBlocks.PIRUFF_WOOD.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == TaleOfBiomesModBlocks.STRIPPED_PIRUFF_LOG.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == TaleOfBiomesModBlocks.STRIPPED_PIRUFF_WOOD.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == TaleOfBiomesModBlocks.PIRUFF_PLANKS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == TaleOfBiomesModBlocks.PIRUFF_SLAB.get().asItem())
			event.setBurnTime(150);
		else if (itemstack.getItem() == TaleOfBiomesModBlocks.PIRUFF_STAIRS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == TaleOfBiomesModBlocks.PIRUFF_PRESSURE_PLATE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == TaleOfBiomesModBlocks.PIRUFF_BUTTON.get().asItem())
			event.setBurnTime(100);
		else if (itemstack.getItem() == TaleOfBiomesModBlocks.PIRUFF_TRAPDOOR.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == TaleOfBiomesModBlocks.PIRUFF_FENCE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == TaleOfBiomesModBlocks.PIRUFF_FENCE_GATE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == TaleOfBiomesModBlocks.PIRUFF_DOOR.get().asItem())
			event.setBurnTime(200);
	}
}
