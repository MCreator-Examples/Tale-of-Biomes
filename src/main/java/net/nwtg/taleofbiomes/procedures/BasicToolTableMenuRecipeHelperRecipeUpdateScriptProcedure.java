package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class BasicToolTableMenuRecipeHelperRecipeUpdateScriptProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		BasicToolTableMenuRecipeHelperPiruffGripScriptProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperStoneAxeHeadScriptProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperStoneHoeHeadScriptProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperStonePickaxeHeadScriptProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperStoneShovelHeadScriptProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperStoneSickleHeadScriptProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperStoneSwordHeadScriptProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperPiruffStoneAxeScriptProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperPiruffStoneHoeScriptProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperPiruffStonePickaxeScriptProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperPiruffStoneShovelScriptProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperPiruffStoneSickleScriptProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperPiruffStoneSwordScriptProcedure.execute(world, entity);
	}
}
