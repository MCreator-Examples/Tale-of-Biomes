package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;

public class LargeShrubPlantAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return LargeShrubPlacementScriptProcedure.execute(world, x, y, z);
	}
}
