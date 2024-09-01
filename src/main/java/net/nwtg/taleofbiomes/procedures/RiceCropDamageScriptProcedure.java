package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class RiceCropDamageScriptProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double nbtWaterDamage = 0;
		double nbtLightDamage = 0;
		double nX = 0;
		double nY = 0;
		double nZ = 0;
		RiceCropWaterDamageProcedure.execute(world, x, y, z);
		RiceCropLightDamageProcedure.execute(world, x, y, z);
		nX = x;
		nY = y;
		nZ = z;
		nbtWaterDamage = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(nX, nY, nZ), "tobCropWaterDamage");
		nbtLightDamage = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(nX, nY, nZ), "tobCropLightDamage");
		if (nbtWaterDamage > 0 || nbtLightDamage > 0) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(nX, nY, nZ);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("tobCropDamage", (nbtWaterDamage + nbtLightDamage));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(nX, nY, nZ);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putBoolean("tobCropDamageBlock", true);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(nX, nY, nZ);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putBoolean("tobCropDamageBlock", false);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}
