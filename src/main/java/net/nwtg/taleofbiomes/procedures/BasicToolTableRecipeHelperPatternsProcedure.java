package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.entity.Entity;

public class BasicToolTableRecipeHelperPatternsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 0) {
			BasicToolTableRecipeHelperGripsProcedure.execute(entity);
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 1) {
			BasicToolTableRecipeHelperAxeHeadPartsProcedure.execute(entity);
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 2) {
			BasicToolTableRecipeHelperHoeHeadPartsProcedure.execute(entity);
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 3) {
			BasicToolTableRecipeHelperPickaxeHeadPartsProcedure.execute(entity);
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 4) {
			BasicToolTableRecipeHelperShovelHeadPartsProcedure.execute(entity);
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 5) {
			BasicToolTableRecipeHelperSickleHeadPartsProcedure.execute(entity);
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 6) {
			BasicToolTableRecipeHelperAxeProcedure.execute(entity);
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 7) {
			BasicToolTableRecipeHelperHoeProcedure.execute(entity);
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 8) {
			BasicToolTableRecipeHelperPickaxeProcedure.execute(entity);
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 9) {
			BasicToolTableRecipeHelperShovelProcedure.execute(entity);
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 10) {
			BasicToolTableRecipeHelperSickleProcedure.execute(entity);
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 11) {
			BasicToolTableRecipeHelperCupProcedure.execute(entity);
		}
	}
}
