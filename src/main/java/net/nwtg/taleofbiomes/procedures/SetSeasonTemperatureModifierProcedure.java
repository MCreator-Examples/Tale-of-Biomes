package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;

public class SetSeasonTemperatureModifierProcedure {
	public static void execute(LevelAccessor world) {
		double nTime = 0;
		nTime = world.dayTime() % 1000;
		if (nTime == 1) {
			if ((TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName).equals("Winter")) {
				TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonTemperature = -5;
				TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
			} else if ((TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName).equals("Spring") || (TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName).equals("Autumn")) {
				TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonTemperature = 10;
				TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
			} else if ((TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName).equals("Summer")) {
				TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonTemperature = 20;
				TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
			}
		}
	}
}
