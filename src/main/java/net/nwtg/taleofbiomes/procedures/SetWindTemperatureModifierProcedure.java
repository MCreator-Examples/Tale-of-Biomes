package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class SetWindTemperatureModifierProcedure {
	public static void execute(LevelAccessor world) {
		double nSpeed = 0;
		double nMaxSpeed = 0;
		double nNewSpeed = 0;
		double nTime = 0;
		nTime = world.dayTime() % 1000;
		if (nTime == 1) {
			nSpeed = TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed;
			nMaxSpeed = TaleOfBiomesModVariables.WorldVariables.get(world).worldMaxWindSpeed;
			nNewSpeed = Mth.nextInt(RandomSource.create(), (int) (nSpeed - 2), (int) (nSpeed + 2));
			if (nNewSpeed > nMaxSpeed) {
				nNewSpeed = nMaxSpeed;
			} else if (nNewSpeed < 0) {
				nNewSpeed = 0;
			}
			TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed = nNewSpeed;
			TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
			TaleOfBiomesModVariables.WorldVariables.get(world).worldWindTemperature = 0 - (TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed / TaleOfBiomesModVariables.WorldVariables.get(world).worldMaxWindSpeed) * 5;
			TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
