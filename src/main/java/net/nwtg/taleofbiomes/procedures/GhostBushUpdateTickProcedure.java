package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

public class GhostBushUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TaleOfBiomesModBlocks.GHOST_BUSH_0.get() && Mth.nextInt(RandomSource.create(), 1, 5) == 1) {
			world.setBlock(BlockPos.containing(x, y, z), TaleOfBiomesModBlocks.GHOST_BUSH_1.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TaleOfBiomesModBlocks.GHOST_BUSH_1.get() && Mth.nextInt(RandomSource.create(), 1, 4) == 1) {
			world.setBlock(BlockPos.containing(x, y, z), TaleOfBiomesModBlocks.GHOST_BUSH_2.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TaleOfBiomesModBlocks.GHOST_BUSH_2.get() && Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
			world.setBlock(BlockPos.containing(x, y, z), TaleOfBiomesModBlocks.GHOST_BUSH_3.get().defaultBlockState(), 3);
		}
	}
}
