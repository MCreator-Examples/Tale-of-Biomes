package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;

public class TobaCommandSetSeasonSummerProcedure {
	public static void execute(LevelAccessor world) {
		TaleOfBiomesModVariables.WorldVariables.get(world).worldMaxSeasonDay = GetModSettingsSeasonTotalDaysProcedure.execute();
		TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
		TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName = "Summer";
		TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
	}
}
