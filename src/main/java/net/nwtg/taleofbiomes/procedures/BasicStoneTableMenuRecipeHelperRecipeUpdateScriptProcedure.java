package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class BasicStoneTableMenuRecipeHelperRecipeUpdateScriptProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipeHelperUpdateTimer == 0) {
				BasicStoneTableMenuRecipeHelperCobbledBlockScriptProcedure.execute(world, entity);
				BasicStoneTableMenuRecipeHelperPolishedBlockScriptProcedure.execute(world, entity);
				BasicStoneTableMenuRecipeHelperMossyCobbledBlockScriptProcedure.execute(world, entity);
				BasicStoneTableMenuRecipeHelperStairsBlockScriptProcedure.execute(world, entity);
				BasicStoneTableMenuRecipeHelperSlabBlockScriptProcedure.execute(world, entity);
				BasicStoneTableMenuRecipeHelperWallScriptProcedure.execute(world, entity);
				BasicStoneTableMenuRecipeHelperPressurePlateScriptProcedure.execute(world, entity);
				BasicStoneTableMenuRecipeHelperButtonScriptProcedure.execute(world, entity);
				{
					TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
					_vars.recipeHelperUpdateTimer = 20;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
					_vars.recipeHelperUpdateTimer = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipeHelperUpdateTimer - 1;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}
