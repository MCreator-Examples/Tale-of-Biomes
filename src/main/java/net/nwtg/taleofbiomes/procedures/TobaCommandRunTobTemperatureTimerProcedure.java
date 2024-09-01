package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;

public class TobaCommandRunTobTemperatureTimerProcedure {
	public static void execute(LevelAccessor world) {
		if (TaleOfBiomesModVariables.MapVariables.get(world).temperatureTimer < 20) {
			TaleOfBiomesModVariables.MapVariables.get(world).temperatureTimer = TaleOfBiomesModVariables.MapVariables.get(world).temperatureTimer + 1;
			TaleOfBiomesModVariables.MapVariables.get(world).syncData(world);
		} else {
			TaleOfBiomesModVariables.MapVariables.get(world).temperatureTimer = 1;
			TaleOfBiomesModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
