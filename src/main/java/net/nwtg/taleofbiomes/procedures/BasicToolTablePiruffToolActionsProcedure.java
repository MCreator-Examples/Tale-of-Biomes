package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModItems;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

public class BasicToolTablePiruffToolActionsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (BasicToolTablePiruffAxeToolConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_AXE.get()).copy();
				_setstack.setCount(1);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicToolTablePiruffHoeToolConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_HOE.get()).copy();
				_setstack.setCount(1);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicToolTablePiruffShovelToolConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_SHOVEL.get()).copy();
				_setstack.setCount(1);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicToolTablePiruffPickaxeToolConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_PICKAXE.get()).copy();
				_setstack.setCount(1);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicToolTablePiruffSickleToolConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_SICKLE.get()).copy();
				_setstack.setCount(1);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicToolTablePiruffSwordToolConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_SWORD.get()).copy();
				_setstack.setCount(1);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else {
			BasicToolTableStonePartActionsProcedure.execute(world, x, y, z);
		}
	}
}
