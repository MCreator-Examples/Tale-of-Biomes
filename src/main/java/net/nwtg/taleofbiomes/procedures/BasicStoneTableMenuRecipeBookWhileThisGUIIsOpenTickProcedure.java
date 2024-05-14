package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class BasicStoneTableMenuRecipeBookWhileThisGUIIsOpenTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		BasicStoneTableMenuWhileThisGUIIsOpenTickProcedure.execute(world, entity);
		BasicStoneTableMenuRecipeHelperRecipeUpdateScriptProcedure.execute(world, entity);
	}
}
