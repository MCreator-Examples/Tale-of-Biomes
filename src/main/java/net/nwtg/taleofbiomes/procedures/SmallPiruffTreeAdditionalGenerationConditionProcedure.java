package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;

public class SmallPiruffTreeAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return SmallPiruffTreeStructureScriptProcedure.execute(world, x, y, z);
	}
}