package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.entity.Entity;

public class SeasonDevicePropertyValueProviderProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		if ((entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).playerSeasonName).equals("Summer")) {
			return 1;
		} else if ((entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).playerSeasonName).equals("Autumn")) {
			return 2;
		} else if ((entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).playerSeasonName).equals("Winter")) {
			return 3;
		}
		return 0;
	}
}
