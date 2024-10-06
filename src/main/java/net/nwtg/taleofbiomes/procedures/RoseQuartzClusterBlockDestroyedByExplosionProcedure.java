package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModItems;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class RoseQuartzClusterBlockDestroyedByExplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState blBlock = Blocks.AIR.defaultBlockState();
		ItemStack itMainHand = ItemStack.EMPTY;
		double nX = 0;
		double nY = 0;
		double nZ = 0;
		blBlock = (world.getBlockState(BlockPos.containing(x, y, z)));
		nX = x + 0.5;
		nY = y + 0.5;
		nZ = z + 0.5;
		if ((blBlock.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip1 ? blBlock.getValue(_getip1) : -1) == 3) {
			for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 3, 4); index0++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, nX, nY, nZ, new ItemStack(TaleOfBiomesModItems.ROSE_QUARTZ_SHARD.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if ((blBlock.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip4 ? blBlock.getValue(_getip4) : -1) == 2) {
			for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 2, 3); index1++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, nX, nY, nZ, new ItemStack(TaleOfBiomesModItems.ROSE_QUARTZ_SHARD.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if ((blBlock.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip7 ? blBlock.getValue(_getip7) : -1) == 1) {
			for (int index2 = 0; index2 < Mth.nextInt(RandomSource.create(), 1, 2); index2++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, nX, nY, nZ, new ItemStack(TaleOfBiomesModItems.ROSE_QUARTZ_SHARD.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, nX, nY, nZ, new ItemStack(TaleOfBiomesModItems.ROSE_QUARTZ_SHARD.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
