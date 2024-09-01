package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;

public class SetStartSeasonProcedure {
	public static void execute(LevelAccessor world) {
		double nStartSeason = 0;
		nStartSeason = GetModSettingsSeasonStartSeasonProcedure.execute();
		if (nStartSeason == 3) {
			TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName = "Summer";
			TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
		} else if (nStartSeason == 4) {
			TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName = "Autumn";
			TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
		} else if (nStartSeason == 1) {
			TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName = "Winter";
			TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
		} else {
			TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName = "Spring";
			TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
		}
		TaleOfBiomesModVariables.WorldVariables.get(world).setStartSeason = false;
		TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
	}
}
