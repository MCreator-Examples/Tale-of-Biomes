package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;

public class BasicStoneTableOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BasicStoneTableBasaltActionsProcedure.execute(world, x, y, z);
	}
}
