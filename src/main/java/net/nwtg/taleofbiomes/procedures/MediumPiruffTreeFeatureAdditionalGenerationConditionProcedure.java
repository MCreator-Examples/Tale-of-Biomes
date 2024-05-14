package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MediumPiruffTreeFeatureAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return MediumPiruffTreeFeatureNonFloatingAddonProcedure.execute(world, x, y, z) && MediumPiruffTreeFeatureTerrainEditorAddonProcedure.execute(world, x, y, z);
	}
}
