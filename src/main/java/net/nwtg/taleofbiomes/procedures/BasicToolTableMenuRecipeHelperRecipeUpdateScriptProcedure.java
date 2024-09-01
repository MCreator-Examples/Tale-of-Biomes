package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class BasicToolTableMenuRecipeHelperRecipeUpdateScriptProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		BasicToolTableMenuRecipeHelperGripProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperAxeHeadProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperHoeHeadProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperPickaxeHeadProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperShovelHeadProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperSickleHeadProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperSwordHeadProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperAxeProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperHoeProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperPickaxeProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperShovelProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperSickleProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperSwordProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperCupProcedure.execute(world, entity);
	}
}
