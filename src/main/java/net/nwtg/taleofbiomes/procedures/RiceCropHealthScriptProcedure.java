package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class RiceCropHealthScriptProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double nDamageTime = 0;
		double nHealth = 0;
		double nX = 0;
		double nY = 0;
		double nZ = 0;
		RiceCropDamageScriptProcedure.execute(world, x, y, z);
		nX = x;
		nY = y;
		nZ = z;
		if (new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(nX, nY, nZ), "tobCropDamageBlock") && ((world.getBlockState(BlockPos.containing(nX, nY, nZ))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip2
				? (world.getBlockState(BlockPos.containing(nX, nY, nZ))).getValue(_getip2)
				: -1) <= 6) {
			nDamageTime = new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(nX, nY, nZ), "tobCropDamageTime");
			nHealth = new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(nX, nY, nZ), "tobCropHealth");
			if (nHealth > 0) {
				if (nDamageTime <= 0) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(nX, nY, nZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("tobCropDamageTime", GetCropDamageTimeProcedure.execute(world, x, y, z));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(nX, nY, nZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("tobCropHealth", (nHealth - 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(nX, nY, nZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("tobCropDamageTime", (nDamageTime - 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			} else {
				{
					int _value = 7;
					BlockPos _pos = BlockPos.containing(nX, nY, nZ);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		}
	}
}
