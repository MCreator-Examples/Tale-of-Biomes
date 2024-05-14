package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;

public class SetWorldWeatherScriptProcedure {
	public static void execute(LevelAccessor world) {
		if (world.getLevelData().isThundering() && world.getLevelData().isRaining()) {
			TaleOfBiomesModVariables.WorldVariables.get(world).worldWeatherTemperature = -4;
			TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
		} else if ((world.getLevelData().isRaining() || !world.getLevelData().isThundering()) && (!world.getLevelData().isRaining() || world.getLevelData().isThundering())) {
			TaleOfBiomesModVariables.WorldVariables.get(world).worldWeatherTemperature = 0;
			TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
		} else {
			TaleOfBiomesModVariables.WorldVariables.get(world).worldWeatherTemperature = 4;
			TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
