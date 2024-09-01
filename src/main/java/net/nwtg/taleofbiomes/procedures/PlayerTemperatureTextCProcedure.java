package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.entity.Entity;

public class PlayerTemperatureTextCProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Celsius: " + entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).clientTemperatureC;
	}
}
