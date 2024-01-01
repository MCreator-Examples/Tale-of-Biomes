package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class RoseShrubBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return (world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("tale_of_biomes:rose_shrub")))
				&& ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == TaleOfBiomesModBlocks.ROSE_SHRUB.get() || (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == TaleOfBiomesModBlocks.ROSE_SHRUB.get()
						|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == TaleOfBiomesModBlocks.ROSE_SHRUB.get() || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == TaleOfBiomesModBlocks.ROSE_SHRUB.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == TaleOfBiomesModBlocks.ROSE_SHRUB.get());
	}
}
