package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;

public class SetTimeTemperatureModifierProcedure {
	public static void execute(LevelAccessor world) {
		double nTime = 0;
		double nTimeTemp = 0;
		nTimeTemp = TaleOfBiomesModVariables.WorldVariables.get(world).worldTimeTemperature;
		nTime = world.dayTime() % 24000;
		if (nTime >= 18000 && nTime < 21000) {
			if (nTimeTemp != -10) {
				TaleOfBiomesModVariables.WorldVariables.get(world).worldTimeTemperature = -10;
				TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
			}
		} else if (nTime >= 21000 && nTime < 23000) {
			if (nTimeTemp < -5) {
				TaleOfBiomesModVariables.WorldVariables.get(world).worldTimeTemperature = nTimeTemp + 0.0125;
				TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
			}
		} else if (nTime >= 23000 && nTime < 24000 && nTime >= 0 && nTime < 2000) {
			if (nTimeTemp < 0) {
				TaleOfBiomesModVariables.WorldVariables.get(world).worldTimeTemperature = nTimeTemp + 0.00834;
				TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
			}
		} else if (nTime >= 2000 && nTime < 6000) {
			if (nTimeTemp < 5) {
				TaleOfBiomesModVariables.WorldVariables.get(world).worldTimeTemperature = nTimeTemp + 0.00625;
				TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
			}
		} else if (nTime >= 6000 && nTime < 12000) {
			if (nTimeTemp != 5) {
				TaleOfBiomesModVariables.WorldVariables.get(world).worldTimeTemperature = 5;
				TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
			}
		} else if (nTime >= 12000 && nTime < 14000) {
			if (nTimeTemp > 0) {
				TaleOfBiomesModVariables.WorldVariables.get(world).worldTimeTemperature = nTimeTemp - 0.0125;
				TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
			}
		} else if (nTime >= 14000 && nTime < 16000) {
			if (nTimeTemp > -5) {
				TaleOfBiomesModVariables.WorldVariables.get(world).worldTimeTemperature = nTimeTemp - 0.0125;
				TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
			}
		} else if (nTime >= 16000 && nTime < 18000) {
			if (nTimeTemp > -10) {
				TaleOfBiomesModVariables.WorldVariables.get(world).worldTimeTemperature = nTimeTemp - 0.0125;
				TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
			}
		}
	}
}
