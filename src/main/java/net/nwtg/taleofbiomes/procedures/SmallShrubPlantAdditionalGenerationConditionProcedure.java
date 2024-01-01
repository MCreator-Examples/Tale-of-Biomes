package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;

public class SmallShrubPlantAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return SmallShrubPlacementScriptProcedure.execute(world, x, y, z);
	}
}
