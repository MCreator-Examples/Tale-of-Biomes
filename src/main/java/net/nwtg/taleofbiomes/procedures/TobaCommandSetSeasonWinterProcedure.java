package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;

public class TobaCommandSetSeasonWinterProcedure {
	public static void execute(LevelAccessor world) {
		TaleOfBiomesModVariables.WorldVariables.get(world).worldMaxSeasonDay = GetModSettingsSeasonTotalDaysProcedure.execute();
		TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
		TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName = "Winter";
		TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
	}
}
