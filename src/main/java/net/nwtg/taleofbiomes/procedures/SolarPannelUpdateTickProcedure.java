package net.nwtg.taleofbiomes.procedures;

import net.neoforged.neoforge.energy.IEnergyStorage;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class SolarPannelUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double testSendDown = 0;
		if (new Object() {
			public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
				if (level instanceof ILevelExtension _ext) {
					IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.UP);
					if (_entityStorage != null)
						return _entityStorage.canReceive();
				}
				return false;
			}
		}.canReceiveEnergy(world, BlockPos.containing(x, y - 1, z)) && new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x, y - 1, z), "cablesFCopperUp") && world instanceof Level _lvl2 && _lvl2.isDay() && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z))) {
			if (world.getLevelData().isThundering() && world.getLevelData().isRaining()) {
				testSendDown = new Object() {
					public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
						if (level instanceof ILevelExtension _ext) {
							IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.UP);
							if (_entityStorage != null)
								return _entityStorage.receiveEnergy(_amount, true);
						}
						return 0;
					}
				}.receiveEnergySimulate(world, BlockPos.containing(x, y - 1, z), 16);
				if (world instanceof ILevelExtension _ext) {
					IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y - 1, z), Direction.UP);
					if (_entityStorage != null)
						_entityStorage.receiveEnergy((int) testSendDown, false);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("forgeFlow", 1024);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (!world.getLevelData().isThundering() && world.getLevelData().isRaining() || world.getLevelData().isThundering() && !world.getLevelData().isRaining()) {
				testSendDown = new Object() {
					public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
						if (level instanceof ILevelExtension _ext) {
							IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.UP);
							if (_entityStorage != null)
								return _entityStorage.receiveEnergy(_amount, true);
						}
						return 0;
					}
				}.receiveEnergySimulate(world, BlockPos.containing(x, y - 1, z), 32);
				if (world instanceof ILevelExtension _ext) {
					IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y - 1, z), Direction.UP);
					if (_entityStorage != null)
						_entityStorage.receiveEnergy((int) testSendDown, false);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("forgeFlow", 1024);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else {
				testSendDown = new Object() {
					public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
						if (level instanceof ILevelExtension _ext) {
							IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.UP);
							if (_entityStorage != null)
								return _entityStorage.receiveEnergy(_amount, true);
						}
						return 0;
					}
				}.receiveEnergySimulate(world, BlockPos.containing(x, y - 1, z), 64);
				if (world instanceof ILevelExtension _ext) {
					IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y - 1, z), Direction.UP);
					if (_entityStorage != null)
						_entityStorage.receiveEnergy((int) testSendDown, false);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("forgeFlow", 1024);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		}
	}
}
