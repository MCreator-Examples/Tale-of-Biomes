package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class KilnScreenLightOnConditionProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		double posX = 0;
		double posY = 0;
		double posZ = 0;
		posX = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosX;
		posY = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosY;
		posZ = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosZ;
		return new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(posX, posY, posZ), "isKilnOn");
	}
}
