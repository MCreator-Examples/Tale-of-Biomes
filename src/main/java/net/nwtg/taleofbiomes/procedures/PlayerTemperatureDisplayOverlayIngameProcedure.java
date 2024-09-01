package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.entity.Entity;

public class PlayerTemperatureDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).showPlayerTemperature;
	}
}
