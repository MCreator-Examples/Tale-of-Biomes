package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;

public class TobaRunWorldTemperatureProcedure {
	public static void execute(LevelAccessor world) {
		SetWindTemperatureModifierProcedure.execute(world);
		SetTimeTemperatureModifierProcedure.execute(world);
		SetWeatherTemperatureModifierProcedure.execute(world);
		SetSeasonTemperatureModifierProcedure.execute(world);
		SetWorldTemperatureProcedure.execute(world);
	}
}
