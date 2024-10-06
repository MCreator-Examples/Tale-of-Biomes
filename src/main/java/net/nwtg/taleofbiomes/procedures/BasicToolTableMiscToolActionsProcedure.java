package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModItems;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

public class BasicToolTableMiscToolActionsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (BasicToolTablePiruffCupToolConditionProcedure.execute(world, x, y, z)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_CUP.get()).copy();
				_setstack.setCount(1);
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
