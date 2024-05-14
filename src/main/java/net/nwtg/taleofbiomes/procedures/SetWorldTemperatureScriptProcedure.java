package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;

public class SetWorldTemperatureScriptProcedure {
	public static void execute(LevelAccessor world) {
		double temperature = 0;
		double time = 0;
		double value = 0;
		SetWorldSeasonScriptProcedure.execute(world);
		SetWorldTimeScriptProcedure.execute(world);
		SetWorldWeatherScriptProcedure.execute(world);
		SetWorldWindScriptProcedure.execute(world);
		temperature = TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonTemperature + TaleOfBiomesModVariables.WorldVariables.get(world).worldWeatherTemperature + TaleOfBiomesModVariables.WorldVariables.get(world).worldWindTemperature
				+ TaleOfBiomesModVariables.WorldVariables.get(world).worldTimeTemperature;
		TaleOfBiomesModVariables.WorldVariables.get(world).worldTemperatureC = temperature;
		TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
		TaleOfBiomesModVariables.WorldVariables.get(world).worldTemperatureF = temperature * 1.8 + 32;
		TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
	}
}
