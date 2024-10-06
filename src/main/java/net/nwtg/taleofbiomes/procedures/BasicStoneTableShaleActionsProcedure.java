package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

public class BasicStoneTableShaleActionsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (BasicStoneTableCobbledShaleConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.COBBLED_SHALE.get()).copy();
				_setstack.setCount(4);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableShaleStairsConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.SHALE_STAIRS.get()).copy();
				_setstack.setCount(4);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableShaleSlabConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.SHALE_SLAB.get()).copy();
				_setstack.setCount(6);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableShaleWallConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.SHALE_WALL.get()).copy();
				_setstack.setCount(6);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableShalePressurePlateConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.SHALE_PRESSURE_PLATE.get()).copy();
				_setstack.setCount(1);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableShaleButtonConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.SHALE_BUTTON.get()).copy();
				_setstack.setCount(1);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableMossyCobbledShaleConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MOSSY_COBBLED_SHALE.get()).copy();
				_setstack.setCount(2);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableCobbledShaleStairsConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.COBBLED_SHALE_STAIRS.get()).copy();
				_setstack.setCount(4);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableCobbledShaleSlabConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.COBBLED_SHALE_SLAB.get()).copy();
				_setstack.setCount(6);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableCobbledShaleWallConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.COBBLED_SHALE_WALL.get()).copy();
				_setstack.setCount(6);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTablePolishedShaleConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.POLISHED_SHALE.get()).copy();
				_setstack.setCount(4);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableMossyCobbledShaleStairsConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MOSSY_COBBLED_SHALE_STAIRS.get()).copy();
				_setstack.setCount(4);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableMossyCobbledShaleSlabConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MOSSY_COBBLED_SHALE_SLAB.get()).copy();
				_setstack.setCount(6);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTableMossyCobbledShaleWallConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MOSSY_COBBLED_SHALE_WALL.get()).copy();
				_setstack.setCount(6);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTablePolishedShaleStairsConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.POLISHED_SHALE_STAIRS.get()).copy();
				_setstack.setCount(4);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTablePolishedShaleSlabConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.POLISHED_SHALE_SLAB.get()).copy();
				_setstack.setCount(6);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else if (BasicStoneTablePolishedShaleWallConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.POLISHED_SHALE_WALL.get()).copy();
				_setstack.setCount(6);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		} else {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_itemHandlerModifiable.setStackInSlot(9, _setstack);
			}
		}
	}
}
