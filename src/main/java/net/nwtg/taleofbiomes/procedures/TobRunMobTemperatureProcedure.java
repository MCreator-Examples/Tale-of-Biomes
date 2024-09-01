package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class TobRunMobTemperatureProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide() && TaleOfBiomesModVariables.MapVariables.get(world).temperatureTimer == 20) {
			SetMobHeightTemperatureModifierProcedure.execute(world, entity);
			SetMobBiomeTemperatureModifierProcedure.execute(world, entity);
			SetMobTemperatureProcedure.execute(world, entity);
		}
	}
}
