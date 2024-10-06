package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import java.util.function.Supplier;
import java.util.Map;

public class GetBarrelFilledAmountProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		double nMaxStack = 0;
		double nSlotCount = 0;
		double nTargetSlot = 0;
		double nStack = 0;
		ItemStack iStack = ItemStack.EMPTY;
		nSlotCount = 27;
		nTargetSlot = 0;
		nMaxStack = 0;
		nStack = 0;
		for (int index0 = 0; index0 < (int) nSlotCount; index0++) {
			iStack = (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) nTargetSlot)).getItem() : ItemStack.EMPTY);
			if (iStack.getItem() == ItemStack.EMPTY.getItem()) {
				nMaxStack = nMaxStack + 64;
			} else {
				nMaxStack = nMaxStack + iStack.getMaxStackSize();
			}
			nTargetSlot = nTargetSlot + 1;
		}
		nTargetSlot = 0;
		for (int index1 = 0; index1 < (int) nSlotCount; index1++) {
			iStack = (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) nTargetSlot)).getItem() : ItemStack.EMPTY);
			if (iStack.getItem() == ItemStack.EMPTY.getItem()) {
				nStack = nStack + 0;
			} else {
				nStack = nStack + iStack.getCount();
			}
			nTargetSlot = nTargetSlot + 1;
		}
		return Math.floor(nMaxStack - nStack);
	}
}
