package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;

public class GrassBlockUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		GrassBlockSpreadingMechanicsProcedure.execute(world, x, y, z);
		GrassBlockPlantGrowthMechanicsProcedure.execute(world, x, y, z);
	}
}
