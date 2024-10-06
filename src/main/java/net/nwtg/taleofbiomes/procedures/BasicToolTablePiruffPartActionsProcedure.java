package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModItems;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

public class BasicToolTablePiruffPartActionsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (BasicToolTablePiruffAxePartConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_AXE_HEAD.get()).copy();
				_setstack.setCount(1);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicToolTablePiruffHoePartConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_HOE_HEAD.get()).copy();
				_setstack.setCount(1);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicToolTablePiruffPickaxePartConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_PICKAXE_HEAD.get()).copy();
				_setstack.setCount(1);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicToolTablePiruffShovelPartConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_SHOVEL_HEAD.get()).copy();
				_setstack.setCount(1);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicToolTablePiruffSicklePartConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_SICKLE_HEAD.get()).copy();
				_setstack.setCount(1);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicToolTablePiruffSwordPartConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_SWORD_HEAD.get()).copy();
				_setstack.setCount(1);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else {
			BasicToolTablePiruffToolActionsProcedure.execute(world, x, y, z);
		}
	}
}
