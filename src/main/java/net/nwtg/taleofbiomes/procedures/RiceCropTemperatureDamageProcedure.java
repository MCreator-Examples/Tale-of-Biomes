package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class RiceCropTemperatureDamageProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double nMinLight = 0;
		double nMaxLight = 0;
		double nDamage = 0;
		double nX = 0;
		double nY = 0;
		double nZ = 0;
		double nDamageAmount = 0;
		double nDamageTime = 0;
		double nTemperature = 0;
		double minTemperature = 0;
		double maxTemperature = 0;
		nX = x;
		nY = y;
		nZ = z;
		nTemperature = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(nX, nY, nZ), "tobTemperatureC");
		nDamage = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(nX, nY, nZ), "tobCropTemperatureDamage");
		nDamageTime = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(nX, nY, nZ), "tobCropTemperatureDamageTime");
		minTemperature = GetCropTemperatureMinCriticalTemperatureProcedure.execute(world, x, y, z);
		maxTemperature = GetCropTemperatureMaxCriticalTemperatureProcedure.execute(world, x, y, z);
		nDamageAmount = GetCropTemperatureDamageProcedure.execute(world, x, y, z);
		if (((world.getBlockState(BlockPos.containing(nX, nY, nZ))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip4 ? (world.getBlockState(BlockPos.containing(nX, nY, nZ))).getValue(_getip4) : -1) > 0) {
			if (nDamageTime > 0 && nDamage != nDamageAmount && (nTemperature <= minTemperature || nTemperature >= maxTemperature)) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(nX, nY, nZ);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("tobCropTemperatureDamageTime", (nDamageTime - 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (nDamageTime == 0 && nDamage != nDamageAmount && (nTemperature <= minTemperature || nTemperature >= maxTemperature)) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(nX, nY, nZ);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("tobCropTemperatureDamage", nDamageAmount);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (nTemperature > minTemperature || nTemperature < maxTemperature) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(nX, nY, nZ);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("tobCropTemperatureDamage", 0);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(nX, nY, nZ);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("tobCropTemperatureDamageTime", GetCropTemperatureMinCriticalTimeProcedure.execute(world, x, y, z));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		}
	}
}
