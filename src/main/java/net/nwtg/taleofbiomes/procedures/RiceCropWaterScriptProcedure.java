package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class RiceCropWaterScriptProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState tSoil = Blocks.AIR.defaultBlockState();
		double nDrain = 0;
		double nFill = 0;
		double nWater = 0;
		double nStorage = 0;
		double nX = 0;
		double nY = 0;
		double nZ = 0;
		String sTobCropWater = "";
		sTobCropWater = "tobCropWater";
		nX = x;
		nY = y;
		nZ = z;
		nDrain = GetCropWaterDrainAmountProcedure.execute(world, x, y, z);
		nFill = GetCropWaterFillAmountProcedure.execute(world, x, y, z);
		nStorage = GetCropWaterStorageProcedure.execute(world, x, y, z);
		nWater = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(nX, nY, nZ), sTobCropWater);
		tSoil = (world.getBlockState(BlockPos.containing(nX, nY - 1, nZ)));
		if (tSoil.getBlock() == TaleOfBiomesModBlocks.TILLED_SOIL.get()) {
			if (tSoil.getFluidState().isSource()) {
				if (nWater != nStorage && nWater + nFill < nStorage) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(nX, nY, nZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble(sTobCropWater, (nWater + nFill));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else if (nWater != nStorage && nWater + nFill >= nStorage) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(nX, nY, nZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble(sTobCropWater, nStorage);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			} else {
				if (nWater != 0 && nWater - nDrain > 0) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(nX, nY, nZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble(sTobCropWater, (nWater - nDrain));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else if (nWater != 0 && nWater - nDrain <= 0) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(nX, nY, nZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble(sTobCropWater, 0);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
		}
	}
}
