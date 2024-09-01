package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;

public class RiceCropMechanicsScriptProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		RiceCropWaterScriptProcedure.execute(world, x, y, z);
		RiceCropLightScriptProcedure.execute(world, x, y, z);
	}
}
