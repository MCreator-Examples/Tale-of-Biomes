package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.entity.Entity;

public class BasicToolTableRecipeHelperRecipeNameScriptProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 0) {
			return "Tool Grip";
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 1) {
			return "Axe Head";
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 2) {
			return "Hoe Head";
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 3) {
			return "Pickaxe Head";
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 4) {
			return "Shovel Head";
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 5) {
			return "Sickle Head";
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 6) {
			return "Sword Head";
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 7) {
			return "Axe Tool";
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 8) {
			return "Hoe Tool";
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 9) {
			return "Pickaxe Tool";
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 10) {
			return "Shovel Tool";
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 11) {
			return "Sickle Tool";
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 12) {
			return "Sword Tool";
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 13) {
			return "Cup";
		}
		return "";
	}
}
