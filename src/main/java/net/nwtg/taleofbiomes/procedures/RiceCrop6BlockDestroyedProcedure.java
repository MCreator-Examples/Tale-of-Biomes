package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;
import net.nwtg.taleofbiomes.init.TaleOfBiomesModItems;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class RiceCrop6BlockDestroyedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double score = 0;
		double mixScore = 0;
		double rockScore = 0;
		double weedLevel = 0;
		double fertilityScore = 0;
		double phScore = 0;
		if (!world.isClientSide()
				&& (world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation(((TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "tilled_soil")).toLowerCase(java.util.Locale.ENGLISH))))) {
			score = new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y - 1, z), "weedLevel");
			if (score >= 4) {
				weedLevel = 0;
			} else if (score >= 3) {
				weedLevel = 25;
			} else if (score >= 2) {
				weedLevel = 50;
			} else if (score >= 1) {
				weedLevel = 75;
			} else if (score == 0) {
				weedLevel = 100;
			}
			score = new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y - 1, z), "rockLevel");
			if (score >= 4) {
				rockScore = 0;
			} else if (score >= 3) {
				rockScore = 25;
			} else if (score >= 2) {
				rockScore = 50;
			} else if (score >= 1) {
				rockScore = 75;
			} else if (score == 0) {
				rockScore = 100;
			}
			score = new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y - 1, z), "soilMixture");
			if (score >= 2 && score <= 4) {
				mixScore = 100;
			} else if (score == 1 || score == 5) {
				mixScore = 50;
			} else {
				mixScore = 0;
			}
			score = new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y - 1, z), "soilFertility");
			if (score >= 7) {
				fertilityScore = 100;
			} else {
				fertilityScore = 0;
			}
			score = new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y - 1, z), "soilPhLevel");
			if (score >= 7) {
				phScore = 100;
			} else {
				phScore = 0;
			}
			score = rockScore + weedLevel + mixScore + fertilityScore + phScore;
			for (int index0 = 0; index0 < (int) Math.floor(1 * (score / 100) + Mth.nextInt(RandomSource.create(), 2, 3)); index0++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(TaleOfBiomesModItems.RICE_SEEDS.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			IncreaseTilledSoilWeedsProcedure.execute(world, x, y, z);
			IncreaseTilledSoilRocksProcedure.execute(world, x, y, z);
		}
	}
}
