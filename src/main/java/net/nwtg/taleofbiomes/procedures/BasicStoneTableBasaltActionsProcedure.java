package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

public class BasicStoneTableBasaltActionsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (BasicStoneTableCobbledBasaltConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.COBBLED_BASALT.get()).copy();
				_setstack.setCount(4);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableBasaltStairsConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.BASALT_STAIRS.get()).copy();
				_setstack.setCount(4);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableBasaltSlabConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.BASALT_SLAB.get()).copy();
				_setstack.setCount(6);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableBasaltWallConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.BASALT_WALL.get()).copy();
				_setstack.setCount(6);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableBasaltPressurePlateConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.BASALT_PRESSURE_PLATE.get()).copy();
				_setstack.setCount(1);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableBasaltButtonConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.BASALT_BUTTON.get()).copy();
				_setstack.setCount(1);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableMossyCobbledBasaltConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MOSSY_COBBLED_BASALT.get()).copy();
				_setstack.setCount(2);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableCobbledBasaltStairsConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.COBBLED_BASALT_STAIRS.get()).copy();
				_setstack.setCount(4);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableCobbledBasaltSlabConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.COBBLED_BASALT_SLAB.get()).copy();
				_setstack.setCount(6);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableCobbledBasaltWallConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.COBBLED_BASALT_WALL.get()).copy();
				_setstack.setCount(6);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTablePolishedBasaltConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.POLISHED_BASALT.get()).copy();
				_setstack.setCount(4);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableMossyCobbledBasaltStairsConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MOSSY_COBBLED_BASALT_STAIRS.get()).copy();
				_setstack.setCount(4);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableMossyCobbledBasaltSlabConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MOSSY_COBBLED_BASALT_SLAB.get()).copy();
				_setstack.setCount(6);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableMossyCobbledBasaltWallConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MOSSY_COBBLED_BASALT_WALL.get()).copy();
				_setstack.setCount(6);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTablePolishedBasaltStairsConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.POLISHED_BASALT_STAIRS.get()).copy();
				_setstack.setCount(4);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTablePolishedBasaltSlabConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.POLISHED_BASALT_SLAB.get()).copy();
				_setstack.setCount(6);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTablePolishedBasaltWallConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.POLISHED_BASALT_WALL.get()).copy();
				_setstack.setCount(6);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else {
			BasicStoneTableMarbleActionsProcedure.execute(world, x, y, z);
		}
	}
}
