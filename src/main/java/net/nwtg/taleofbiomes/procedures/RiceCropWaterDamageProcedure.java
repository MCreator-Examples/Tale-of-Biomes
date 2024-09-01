package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class RiceCropWaterDamageProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double nWaterDamage = 0;
		double nbtWater = 0;
		double nbtWaterDamage = 0;
		double nX = 0;
		double nY = 0;
		double nZ = 0;
		nX = x;
		nY = y;
		nZ = z;
		nbtWater = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(nX, nY, nZ), "tobCropWater");
		nbtWaterDamage = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(nX, nY, nZ), "tobCropWaterDamage");
		nWaterDamage = GetCropWaterDamageProcedure.execute(world, x, y, z);
		if (nbtWater <= 0 && nbtWaterDamage <= 0) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(nX, nY, nZ);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("tobCropWaterDamage", nWaterDamage);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if (nbtWater > 0 && nbtWaterDamage > 0) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(nX, nY, nZ);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("tobCropWaterDamage", 0);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}
