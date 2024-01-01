package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class RiceCropBoneMealSuccessConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		return !world.isClientSide() && Mth.nextInt(RandomSource.create(), 1, 100) <= 45;
	}
}
