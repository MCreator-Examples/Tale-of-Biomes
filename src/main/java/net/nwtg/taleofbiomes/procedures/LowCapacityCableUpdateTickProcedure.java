package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;

public class LowCapacityCableUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide()) {
			LowCapacityCableUpdateTickModelsProcedure.execute(world, x, y, z);
			LowCapacityCableUpdateTickEnergyProcedure.execute(world, x, y, z);
		}
	}
}
