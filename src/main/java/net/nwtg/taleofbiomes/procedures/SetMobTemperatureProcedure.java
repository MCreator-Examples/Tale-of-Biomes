package net.nwtg.taleofbiomes.procedures;

import org.checkerframework.checker.units.qual.s;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class SetMobTemperatureProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double nTemperature = 0;
		Entity eEntity = null;
		if (!world.isClientSide()) {
			eEntity = entity;
			nTemperature = TaleOfBiomesModVariables.WorldVariables.get(world).worldTemperatureC + eEntity.getPersistentData().getDouble("tobBiomeTemperature") + eEntity.getPersistentData().getDouble("tobHeightTemperature");
			eEntity.getPersistentData().putDouble("tobTemperatureC", new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(new java.text.DecimalFormat("##.#").format(nTemperature)));
			eEntity.getPersistentData().putDouble("tobTemperatureF", new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(new java.text.DecimalFormat("##.#").format(nTemperature * 1.8 + 32)));
		}
	}
}
