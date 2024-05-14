package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;

public class SmallPiruffTreeFeatureAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return SmallPiruffTreeFeatureNonFloatingAddonProcedure.execute(world, x, y, z) && SmallPiruffTreeFeatureTerrainEditorAddonProcedure.execute(world, x, y, z);
	}
}
