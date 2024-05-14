package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class BasicToolTableMenuRecipeBookWhileThisGUIIsOpenTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		BasicToolTableMenuWhileThisGUIIsOpenTickProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperRecipeUpdateScriptProcedure.execute(world, entity);
	}
}
