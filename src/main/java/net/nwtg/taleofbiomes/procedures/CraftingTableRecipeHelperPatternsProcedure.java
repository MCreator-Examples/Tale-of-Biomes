package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.entity.Entity;

public class CraftingTableRecipeHelperPatternsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 0) {
			CraftingTableRecipeHelperSticksProcedure.execute(entity);
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 1) {
			CraftingTableRecipeHelperBasicCraftingTableProcedure.execute(entity);
		}
	}
}
