package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.entity.Entity;

public class BasicToolTableRecipeHelperBackButtonProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage - 1 >= 0) {
			{
				TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
				_vars.recipeGroup = 0;
				_vars.syncPlayerVariables(entity);
			}
			{
				TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
				_vars.recipeTimer = 0;
				_vars.syncPlayerVariables(entity);
			}
			{
				TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
				_vars.recipePage = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage - 1;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
