package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class RiceCropLightScriptProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double nX = 0;
		double nY = 0;
		double nZ = 0;
		double nMinLightLevel = 0;
		double nStorage = 0;
		double nLightLevel = 0;
		double nDrainAmount = 0;
		double nLight = 0;
		nX = x;
		nY = y;
		nZ = z;
		nStorage = GetCropLightStorageProcedure.execute(world, x, y, z);
		nMinLightLevel = GetCropLightMinLightLevelProcedure.execute(world, x, y, z);
		nDrainAmount = GetCropLightDrainAmountProcedure.execute(world, x, y, z);
		nLight = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(nX, nY, nZ), "tobCropLight");
		if (world.getMaxLocalRawBrightness(BlockPos.containing(nX + 1, nY, nZ)) > nMinLightLevel || world.getMaxLocalRawBrightness(BlockPos.containing(nX - 1, nY, nZ)) > nMinLightLevel
				|| world.getMaxLocalRawBrightness(BlockPos.containing(nX, nY + 1, nZ)) > nMinLightLevel || world.getMaxLocalRawBrightness(BlockPos.containing(nX, nY, nZ + 1)) > nMinLightLevel
				|| world.getMaxLocalRawBrightness(BlockPos.containing(nX, nY, nZ - 1)) > nMinLightLevel) {
			if (nLight != nStorage && nLight < nStorage) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(nX, nY, nZ);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("tobCropLight", (nLight + 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (nLight != nStorage && nLight > nStorage) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(nX, nY, nZ);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("tobCropLight", nStorage);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		} else {
			if (nLight != 0 && nLight > 0) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(nX, nY, nZ);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("tobCropLight", (nLight - nDrainAmount));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (nLight != 0 && nLight < 0) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(nX, nY, nZ);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("tobCropLight", 0);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		}
	}
}
