package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;

public class LargePiruffTreeFeatureAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return LargePiruffTreeFeatureNonFloatingAddonProcedure.execute(world, x, y, z) && LargePiruffTreeFeatureTerrainEditorAddonProcedure.execute(world, x, y, z);
	}
}
