package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class PhosphoriteStoneUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getFluidState(BlockPos.containing(x, y + 1, z)).createLegacyBlock()).getBlock() == Blocks.WATER && !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == TaleOfBiomesModBlocks.PHOSPHORITE_CRYSTAL.get())
				&& !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == TaleOfBiomesModBlocks.PHOSPHORITE_CRYSTAL_BOTTOM.get())) {
			world.setBlock(BlockPos.containing(x, y + 1, z),
					(TaleOfBiomesModBlocks.PHOSPHORITE_CRYSTAL.get().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _withbp6
							? TaleOfBiomesModBlocks.PHOSPHORITE_CRYSTAL.get().defaultBlockState().setValue(_withbp6, true)
							: TaleOfBiomesModBlocks.PHOSPHORITE_CRYSTAL.get().defaultBlockState()),
					3);
		}
	}
}
