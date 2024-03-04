package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class PiruffSaplingOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double random = 0;
		if (!world.isClientSide()) {
			random = Mth.nextInt(RandomSource.create(), 1, 6);
			if (random == 1 || random == 4) {
				random = Mth.nextInt(RandomSource.create(), 1, 3);
				if (random == 1) {
					PiruffSaplingSmallSingleVariant1Procedure.execute(world, x, y, z);
				} else if (random == 2) {
					PiruffSaplingSmallSingleVariant2Procedure.execute(world, x, y, z);
				} else if (random == 3) {
					PiruffSaplingSmallSingleVariant3Procedure.execute(world, x, y, z);
				}
			} else if (random == 5) {
				random = Mth.nextInt(RandomSource.create(), 1, 3);
				if (random == 1) {
					PiruffSaplingMediumSingleVariant1Procedure.execute(world, x, y, z);
				} else if (random == 2) {
					PiruffSaplingMediumSingleVariant2Procedure.execute(world, x, y, z);
				} else if (random == 3) {
					PiruffSaplingMediumSingleVariant3Procedure.execute(world, x, y, z);
				}
			} else if (random == 6) {
				random = Mth.nextInt(RandomSource.create(), 1, 3);
				if (random == 1) {
					PiruffSaplingLargeSingleVariant1Procedure.execute(world, x, y, z);
				} else if (random == 2) {
					PiruffSaplingLargeSingleVariant2Procedure.execute(world, x, y, z);
				} else if (random == 3) {
					PiruffSaplingLargeSingleVariant3Procedure.execute(world, x, y, z);
				}
			}
		}
	}
}
