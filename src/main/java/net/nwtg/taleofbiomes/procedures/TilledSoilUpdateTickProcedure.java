package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;

public class TilledSoilUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		TilledSoilUpdateTickCounterProcedure.execute(world, x, y, z);
	}
}
