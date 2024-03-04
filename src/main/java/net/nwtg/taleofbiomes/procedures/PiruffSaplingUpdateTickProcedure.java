package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class PiruffSaplingUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double lightLevel = 0;
		if (!world.isClientSide()) {
			lightLevel = 9;
			if (PiruffSaplingBoneMealSuccessConditionProcedure.execute() && (world.getMaxLocalRawBrightness(BlockPos.containing(x, y + 1, z)) >= lightLevel + 1
					|| world.getMaxLocalRawBrightness(BlockPos.containing(x + 1, y, z)) >= lightLevel + 1 && world.getMaxLocalRawBrightness(BlockPos.containing(x - 1, y, z)) >= lightLevel - 1
					|| world.getMaxLocalRawBrightness(BlockPos.containing(x - 1, y, z)) >= lightLevel + 1 && world.getMaxLocalRawBrightness(BlockPos.containing(x + 1, y, z)) >= lightLevel - 1
					|| world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z + 1)) >= lightLevel + 1 && world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z - 1)) >= lightLevel - 1
					|| world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z - 1)) >= lightLevel + 1 && world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z + 1)) >= lightLevel - 1)) {
				PiruffSaplingOnBoneMealSuccessProcedure.execute(world, x, y, z);
			}
		}
	}
}
