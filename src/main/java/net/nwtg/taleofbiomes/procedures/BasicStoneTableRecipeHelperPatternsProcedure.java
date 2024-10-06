package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.entity.Entity;

public class BasicStoneTableRecipeHelperPatternsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 0) {
			BasicStoneTableRecipeHelperCobbledBlockProcedure.execute(entity);
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 1) {
			BasicStoneTableRecipeHelperMossyCobbledBlockProcedure.execute(entity);
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 2) {
			BasicStoneTableRecipeHelperPolishedBlockProcedure.execute(entity);
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 3) {
			BasicStoneTableRecipeHelperStairsProcedure.execute(entity);
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 4) {
			BasicStoneTableRecipeHelperSlabProcedure.execute(entity);
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 5) {
			BasicStoneTableRecipeHelperWallProcedure.execute(entity);
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 6) {
			BasicStoneTableRecipeHelperPressurePlateProcedure.execute(entity);
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 7) {
			BasicStoneTableRecipeHelperButtonProcedure.execute(entity);
		}
	}
}
