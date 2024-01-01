package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;

public class PiruffTreeAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return PiruffTreeStructureScriptProcedure.execute(world, x, y, z);
	}
}
