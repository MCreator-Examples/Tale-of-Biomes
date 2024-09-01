package net.nwtg.taleofbiomes.procedures;

import org.checkerframework.checker.units.qual.s;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;

public class SetWorldTemperatureProcedure {
	public static void execute(LevelAccessor world) {
		double temperature = 0;
		temperature = TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonTemperature + TaleOfBiomesModVariables.WorldVariables.get(world).worldWindTemperature + TaleOfBiomesModVariables.WorldVariables.get(world).worldTimeTemperature
				+ TaleOfBiomesModVariables.WorldVariables.get(world).worldWeatherTemperature;
		TaleOfBiomesModVariables.WorldVariables.get(world).worldTemperatureC = new Object() {
			double convert(String s) {
				try {
					return Double.parseDouble(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert(new java.text.DecimalFormat("##.#").format(temperature));
		TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
		TaleOfBiomesModVariables.WorldVariables.get(world).worldTemperatureF = new Object() {
			double convert(String s) {
				try {
					return Double.parseDouble(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert(new java.text.DecimalFormat("##.#").format(temperature * 1.8 + 32));
		TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
	}
}
