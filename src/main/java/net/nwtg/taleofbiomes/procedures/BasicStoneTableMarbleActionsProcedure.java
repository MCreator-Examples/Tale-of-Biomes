package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

public class BasicStoneTableMarbleActionsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (BasicStoneTableCobbledMarbleConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.COBBLED_MARBLE.get()).copy();
				_setstack.setCount(4);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableMarbleStairsConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MARBLE_STAIRS.get()).copy();
				_setstack.setCount(4);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableMarbleSlabConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MARBLE_SLAB.get()).copy();
				_setstack.setCount(6);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableMarbleWallConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MARBLE_WALL.get()).copy();
				_setstack.setCount(6);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableMarblePressurePlateConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MARBLE_PRESSURE_PLATE.get()).copy();
				_setstack.setCount(1);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableMarbleButtonConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MARBLE_BUTTON.get()).copy();
				_setstack.setCount(1);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableMossyCobbledMarbleConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MOSSY_COBBLED_MARBLE.get()).copy();
				_setstack.setCount(2);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableCobbledMarbleStairsConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.COBBLED_MARBLE_STAIRS.get()).copy();
				_setstack.setCount(4);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableCobbledMarbleSlabConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.COBBLED_MARBLE_SLAB.get()).copy();
				_setstack.setCount(6);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableCobbledMarbleWallConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.COBBLED_MARBLE_WALL.get()).copy();
				_setstack.setCount(6);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTablePolishedMarbleConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.POLISHED_MARBLE.get()).copy();
				_setstack.setCount(4);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableMossyCobbledMarbleStairsConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MOSSY_COBBLED_MARBLE_STAIRS.get()).copy();
				_setstack.setCount(4);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableMossyCobbledMarbleSlabConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MOSSY_COBBLED_MARBLE_SLAB.get()).copy();
				_setstack.setCount(6);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableMossyCobbledMarbleWallConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MOSSY_COBBLED_MARBLE_WALL.get()).copy();
				_setstack.setCount(6);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTablePolishedMarbleStairsConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.POLISHED_MARBLE_STAIRS.get()).copy();
				_setstack.setCount(4);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTablePolishedMarbleSlabConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.POLISHED_MARBLE_SLAB.get()).copy();
				_setstack.setCount(6);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTablePolishedMarbleWallConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.POLISHED_MARBLE_WALL.get()).copy();
				_setstack.setCount(6);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else {
			BasicStoneTableShaleActionsProcedure.execute(world, x, y, z);
		}
	}
}
