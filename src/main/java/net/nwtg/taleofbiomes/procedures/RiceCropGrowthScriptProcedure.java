package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class RiceCropGrowthScriptProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState tBlock = Blocks.AIR.defaultBlockState();
		double nX = 0;
		double nY = 0;
		double nZ = 0;
		double nMinLight = 0;
		double nMaxLight = 0;
		double nLight = 0;
		nX = x;
		nY = y;
		nZ = z;
		nMinLight = GetCropLightMinLightProcedure.execute(world, x, y, z);
		nMaxLight = GetCropLightMaxLightProcedure.execute(world, x, y, z);
		nLight = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(nX, nY, nZ), "tobCropLight");
		if (!(new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(nX, nY, nZ), "tobDamageBlock")) && nLight >= nMinLight && nLight <= nMaxLight) {
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(nX, nY, nZ), "tobGrowthTime") <= 0) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(nX, nY, nZ);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("tobGrowthTime", GetCropGrowthTimeProcedure.execute(world, x, y, z));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				tBlock = (world.getBlockState(BlockPos.containing(nX, nY, nZ)));
				if ((tBlock.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip5 ? tBlock.getValue(_getip5) : -1) == 0) {
					{
						int _value = 1;
						BlockPos _pos = BlockPos.containing(nX, nY, nZ);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((tBlock.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip7 ? tBlock.getValue(_getip7) : -1) == 1) {
					{
						int _value = 2;
						BlockPos _pos = BlockPos.containing(nX, nY, nZ);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((tBlock.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip9 ? tBlock.getValue(_getip9) : -1) == 2) {
					{
						int _value = 3;
						BlockPos _pos = BlockPos.containing(nX, nY, nZ);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((tBlock.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip11 ? tBlock.getValue(_getip11) : -1) == 3) {
					{
						int _value = 4;
						BlockPos _pos = BlockPos.containing(nX, nY, nZ);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((tBlock.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip13 ? tBlock.getValue(_getip13) : -1) == 4) {
					{
						int _value = 5;
						BlockPos _pos = BlockPos.containing(nX, nY, nZ);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((tBlock.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip15 ? tBlock.getValue(_getip15) : -1) == 5) {
					{
						int _value = 6;
						BlockPos _pos = BlockPos.containing(nX, nY, nZ);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((tBlock.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip17 ? tBlock.getValue(_getip17) : -1) == 6) {
					{
						int _value = 7;
						BlockPos _pos = BlockPos.containing(nX, nY, nZ);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				}
			} else {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(nX, nY, nZ);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("tobGrowthTime", ((new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, BlockPos.containing(nX, nY, nZ), "tobGrowthTime")) - 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		}
	}
}
