package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;

public class BasicToolTableOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BasicToolTableGripPartActionsProcedure.execute(world, x, y, z);
	}
}
