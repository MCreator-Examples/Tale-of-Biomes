package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class IvyShrubBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		BlockState shurb = Blocks.AIR.defaultBlockState();
		shurb = TaleOfBiomesModBlocks.IVY_SHRUB.get().defaultBlockState();
		return (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == shurb.getBlock() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TaleOfBiomesModBlocks.GRASS_BLOCK.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TaleOfBiomesModBlocks.DIRT.get() || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == shurb.getBlock()
				|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == shurb.getBlock() || (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == shurb.getBlock()
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == shurb.getBlock() || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == shurb.getBlock();
	}
}
