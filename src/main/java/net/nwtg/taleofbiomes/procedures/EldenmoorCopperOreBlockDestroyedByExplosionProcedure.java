package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModItems;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

public class EldenmoorCopperOreBlockDestroyedByExplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double nRandom = 0;
		double nX = 0;
		double nY = 0;
		double nZ = 0;
		nRandom = Mth.nextInt(RandomSource.create(), 1, 100);
		nX = Math.floor(x) + 0.5;
		nY = Math.floor(y) + 0.25;
		nZ = Math.floor(z) + 0.5;
		if (nRandom >= 85) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, nX, nY, nZ, new ItemStack(TaleOfBiomesModItems.RAW_PURE_COPPER.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (nRandom >= 60) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, nX, nY, nZ, new ItemStack(TaleOfBiomesModItems.RAW_MIXED_COPPER.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, nX, nY, nZ, new ItemStack(TaleOfBiomesModItems.RAW_IMPURE_COPPER.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
