package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;

public class CraftingTableOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		CraftingTableActionsProcedure.execute(world, x, y, z);
	}
}
