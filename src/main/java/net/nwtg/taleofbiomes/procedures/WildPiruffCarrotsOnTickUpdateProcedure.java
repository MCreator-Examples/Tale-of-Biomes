package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class WildPiruffCarrotsOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState blBlock = Blocks.AIR.defaultBlockState();
		BlockState blAir = Blocks.AIR.defaultBlockState();
		blAir = Blocks.AIR.defaultBlockState();
		blBlock = TaleOfBiomesModBlocks.WILD_PIRUFF_CARROTS.get().defaultBlockState();
		if (blBlock.canSurvive(world, BlockPos.containing(x + 1, y, z)) && (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == blAir.getBlock()) {
			world.setBlock(BlockPos.containing(x + 1, y, z), blBlock, 3);
		} else if (blBlock.canSurvive(world, BlockPos.containing(x - 1, y, z)) && (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == blAir.getBlock()) {
			world.setBlock(BlockPos.containing(x - 1, y, z), blBlock, 3);
		} else if (blBlock.canSurvive(world, BlockPos.containing(x, y, z + 1)) && (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == blAir.getBlock()) {
			world.setBlock(BlockPos.containing(x, y, z + 1), blBlock, 3);
		} else if (blBlock.canSurvive(world, BlockPos.containing(x, y, z - 1)) && (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == blAir.getBlock()) {
			world.setBlock(BlockPos.containing(x, y, z - 1), blBlock, 3);
		} else if (blBlock.canSurvive(world, BlockPos.containing(x + 1, y - 1, z)) && (world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == blAir.getBlock()) {
			world.setBlock(BlockPos.containing(x + 1, y - 1, z), blBlock, 3);
		} else if (blBlock.canSurvive(world, BlockPos.containing(x - 1, y - 1, z)) && (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == blAir.getBlock()) {
			world.setBlock(BlockPos.containing(x - 1, y - 1, z), blBlock, 3);
		} else if (blBlock.canSurvive(world, BlockPos.containing(x, y - 1, z + 1)) && (world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == blAir.getBlock()) {
			world.setBlock(BlockPos.containing(x, y - 1, z + 1), blBlock, 3);
		} else if (blBlock.canSurvive(world, BlockPos.containing(x, y - 1, z - 1)) && (world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == blAir.getBlock()) {
			world.setBlock(BlockPos.containing(x, y - 1, z - 1), blBlock, 3);
		} else if (blBlock.canSurvive(world, BlockPos.containing(x + 1, y + 1, z)) && (world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == blAir.getBlock()) {
			world.setBlock(BlockPos.containing(x + 1, y + 1, z), blBlock, 3);
		} else if (blBlock.canSurvive(world, BlockPos.containing(x - 1, y + 1, z)) && (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == blAir.getBlock()) {
			world.setBlock(BlockPos.containing(x - 1, y + 1, z), blBlock, 3);
		} else if (blBlock.canSurvive(world, BlockPos.containing(x, y + 1, z + 1)) && (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == blAir.getBlock()) {
			world.setBlock(BlockPos.containing(x, y + 1, z + 1), blBlock, 3);
		} else if (blBlock.canSurvive(world, BlockPos.containing(x, y + 1, z - 1)) && (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == blAir.getBlock()) {
			world.setBlock(BlockPos.containing(x, y + 1, z - 1), blBlock, 3);
		}
	}
}
