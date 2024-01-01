package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class IvyShrubUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double random = 0;
		BlockState spreadingBlock = Blocks.AIR.defaultBlockState();
		String replacableTag = "";
		if (world.dayTime() % 24000 >= 0 && world.dayTime() % 24000 <= 100) {
			spreadingBlock = TaleOfBiomesModBlocks.IVY_SHRUB.get().defaultBlockState();
			replacableTag = "tale_of_biomes:replaceable/shrub";
			for (int index0 = 0; index0 < 4; index0++) {
				random = Mth.nextInt(RandomSource.create(), 1, 6);
				if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation((replacableTag).toLowerCase(java.util.Locale.ENGLISH)))) && random == 1) {
					world.setBlock(BlockPos.containing(x, y, z - 1), spreadingBlock, 3);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.COMPOSTER, (x + 0.5), (y + 0.5), ((z + 0.5) - 1), 15, 0.25, 0.25, 0.25, 0.5);
					break;
				} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation((replacableTag).toLowerCase(java.util.Locale.ENGLISH)))) && random == 2) {
					world.setBlock(BlockPos.containing(x + 1, y, z), spreadingBlock, 3);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.COMPOSTER, (x + 0.5 + 1), (y + 0.5), (z + 0.5), 15, 0.25, 0.25, 0.25, 0.5);
					break;
				} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation((replacableTag).toLowerCase(java.util.Locale.ENGLISH)))) && random == 3) {
					world.setBlock(BlockPos.containing(x, y, z + 1), spreadingBlock, 3);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.COMPOSTER, (x + 0.5), (y + 0.5), (z + 0.5 + 1), 15, 0.25, 0.25, 0.25, 0.5);
					break;
				} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation((replacableTag).toLowerCase(java.util.Locale.ENGLISH)))) && random == 4) {
					world.setBlock(BlockPos.containing(x - 1, y, z), spreadingBlock, 3);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.COMPOSTER, ((x + 0.5) - 1), (y + 0.5), (z + 0.5), 15, 0.25, 0.25, 0.25, 0.5);
					break;
				} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation((replacableTag).toLowerCase(java.util.Locale.ENGLISH)))) && random == 5) {
					world.setBlock(BlockPos.containing(x, y + 1, z), spreadingBlock, 3);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.COMPOSTER, (x + 0.5), (y + 0.5 + 1), (z + 0.5), 15, 0.25, 0.25, 0.25, 0.5);
					break;
				} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation((replacableTag).toLowerCase(java.util.Locale.ENGLISH)))) && random == 6) {
					world.setBlock(BlockPos.containing(x, y - 1, z), spreadingBlock, 3);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.COMPOSTER, (x + 0.5), ((y + 0.5) - 1), (z + 0.5), 15, 0.25, 0.25, 0.25, 0.5);
					break;
				}
			}
		}
	}
}
