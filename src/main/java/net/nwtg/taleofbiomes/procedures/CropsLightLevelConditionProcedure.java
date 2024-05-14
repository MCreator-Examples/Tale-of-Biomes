package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class CropsLightLevelConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return world.getMaxLocalRawBrightness(BlockPos.containing(x, y + 1, z)) >= 10 || world.getMaxLocalRawBrightness(BlockPos.containing(x - 1, y, z)) >= 10 && world.getMaxLocalRawBrightness(BlockPos.containing(x + 1, y, z)) >= 8
				|| world.getMaxLocalRawBrightness(BlockPos.containing(x + 1, y, z)) >= 10 && world.getMaxLocalRawBrightness(BlockPos.containing(x - 1, y, z)) >= 8
				|| world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z - 1)) >= 10 && world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z + 1)) >= 8
				|| world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z + 1)) >= 10 && world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z - 1)) >= 8;
	}
}
