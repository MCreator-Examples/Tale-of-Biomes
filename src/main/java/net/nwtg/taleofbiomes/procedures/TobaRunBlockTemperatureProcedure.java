package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;

public class TobaRunBlockTemperatureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide() && TaleOfBiomesModVariables.MapVariables.get(world).temperatureTimer == 20) {
			SetBlockHeightTemperatureModifierProcedure.execute(world, x, y, z);
			SetBlockBiomeTemperatureModifierProcedure.execute(world, x, y, z);
			SetBlockTemperatureProcedure.execute(world, x, y, z);
		}
	}
}
