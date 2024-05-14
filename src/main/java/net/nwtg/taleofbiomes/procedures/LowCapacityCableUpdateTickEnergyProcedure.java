package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.neoforged.neoforge.energy.IEnergyStorage;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class LowCapacityCableUpdateTickEnergyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean blockSouth = false;
		boolean blockNorth = false;
		boolean blockUp = false;
		boolean blockEast = false;
		boolean blockDown = false;
		boolean blockWest = false;
		BlockState cableTag = Blocks.AIR.defaultBlockState();
		double energyLoss = 0;
		double sides = 0;
		double sendNorth = 0;
		double sendEast = 0;
		double sendSouth = 0;
		double sendWest = 0;
		double sendUp = 0;
		double sendDown = 0;
		double extractNorth = 0;
		double extractEast = 0;
		double extractSouth = 0;
		double extractWest = 0;
		double extractUp = 0;
		double extractDown = 0;
		double sideAmount = 0;
		String nbtSouthTagName = "";
		String nbtNorthTagName = "";
		String nbtUpTagName = "";
		String nbtWestTagName = "";
		String nbtEastTagName = "";
		String nbtDownTagName = "";
		if (!world.isClientSide()) {
			energyLoss = 0;
			nbtNorthTagName = "cablesFCopperNorth";
			nbtEastTagName = "cablesFCopperEast";
			nbtSouthTagName = "cablesFCopperSouth";
			nbtWestTagName = "cablesFCopperWest";
			nbtUpTagName = "cablesFCopperUp";
			nbtDownTagName = "cablesFCopperDown";
			if (TaleOfBiomesModVariables.MapVariables.get(world).forgeFlow == 0) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("forgeFlow", 0);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
			if (new Object() {
				public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
					if (level instanceof ILevelExtension _ext) {
						IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, null);
						if (_entityStorage != null)
							return _entityStorage.canExtract();
					}
					return false;
				}
			}.canExtractEnergy(world, BlockPos.containing(x, y, z)) && new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "forgeFlow") > 0) {
				blockNorth = new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						if (level instanceof ILevelExtension _ext) {
							IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.SOUTH);
							if (_entityStorage != null)
								return _entityStorage.canReceive();
						}
						return false;
					}
				}.canReceiveEnergy(world, BlockPos.containing(x, y, z - 1)) && new Object() {
					public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getBoolean(tag);
						return false;
					}
				}.getValue(world, BlockPos.containing(x, y, z - 1), nbtSouthTagName) && new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z - 1), "forgeFlow") < new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "forgeFlow");
				blockEast = new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						if (level instanceof ILevelExtension _ext) {
							IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.WEST);
							if (_entityStorage != null)
								return _entityStorage.canReceive();
						}
						return false;
					}
				}.canReceiveEnergy(world, BlockPos.containing(x + 1, y, z)) && new Object() {
					public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getBoolean(tag);
						return false;
					}
				}.getValue(world, BlockPos.containing(x + 1, y, z), nbtWestTagName) && new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x + 1, y, z), "forgeFlow") < new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "forgeFlow");
				blockSouth = new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						if (level instanceof ILevelExtension _ext) {
							IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.NORTH);
							if (_entityStorage != null)
								return _entityStorage.canReceive();
						}
						return false;
					}
				}.canReceiveEnergy(world, BlockPos.containing(x, y, z + 1)) && new Object() {
					public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getBoolean(tag);
						return false;
					}
				}.getValue(world, BlockPos.containing(x, y, z + 1), nbtNorthTagName) && new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z + 1), "forgeFlow") < new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "forgeFlow");
				blockWest = new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						if (level instanceof ILevelExtension _ext) {
							IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.EAST);
							if (_entityStorage != null)
								return _entityStorage.canReceive();
						}
						return false;
					}
				}.canReceiveEnergy(world, BlockPos.containing(x - 1, y, z)) && new Object() {
					public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getBoolean(tag);
						return false;
					}
				}.getValue(world, BlockPos.containing(x - 1, y, z), nbtEastTagName) && new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x - 1, y, z), "forgeFlow") < new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "forgeFlow");
				blockUp = new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						if (level instanceof ILevelExtension _ext) {
							IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.DOWN);
							if (_entityStorage != null)
								return _entityStorage.canReceive();
						}
						return false;
					}
				}.canReceiveEnergy(world, BlockPos.containing(x, y + 1, z)) && new Object() {
					public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getBoolean(tag);
						return false;
					}
				}.getValue(world, BlockPos.containing(x, y + 1, z), nbtDownTagName) && new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y + 1, z), "forgeFlow") < new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "forgeFlow");
				blockDown = new Object() {
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
				}.getValue(world, BlockPos.containing(x, y - 1, z), nbtUpTagName) && new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y - 1, z), "forgeFlow") < new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "forgeFlow");
				if (blockNorth) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z - 1);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("forgeFlow", ((new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, BlockPos.containing(x, y, z), "forgeFlow")) - 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if (blockEast) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x + 1, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("forgeFlow", ((new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, BlockPos.containing(x, y, z), "forgeFlow")) - 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if (blockSouth) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z + 1);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("forgeFlow", ((new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, BlockPos.containing(x, y, z), "forgeFlow")) - 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if (blockWest) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x - 1, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("forgeFlow", ((new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, BlockPos.containing(x, y, z), "forgeFlow")) - 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if (blockUp) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y + 1, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("forgeFlow", ((new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, BlockPos.containing(x, y, z), "forgeFlow")) - 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if (blockDown) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y + 1, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("forgeFlow", ((new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, BlockPos.containing(x, y, z), "forgeFlow")) - 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				sides = 0;
				if (blockNorth) {
					sides = sides + 1;
				}
				if (blockEast) {
					sides = sides + 1;
				}
				if (blockSouth) {
					sides = sides + 1;
				}
				if (blockWest) {
					sides = sides + 1;
				}
				if (blockUp) {
					sides = sides + 1;
				}
				if (blockDown) {
					sides = sides + 1;
				}
				sideAmount = new Object() {
					public int getEnergyStored(LevelAccessor level, BlockPos pos) {
						if (level instanceof ILevelExtension _ext) {
							IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, null);
							if (_entityStorage != null)
								return _entityStorage.getEnergyStored();
						}
						return 0;
					}
				}.getEnergyStored(world, BlockPos.containing(x, y, z)) / sides;
				if (blockNorth) {
					extractNorth = new Object() {
						public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
							if (level instanceof ILevelExtension _ext) {
								IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.SOUTH);
								if (_entityStorage != null)
									return _entityStorage.receiveEnergy(_amount, true);
							}
							return 0;
						}
					}.receiveEnergySimulate(world, BlockPos.containing(x, y, z - 1), (int) sideAmount);
					sendNorth = extractNorth - energyLoss;
					if (sendNorth >= 1 && new Object() {
						public int getEnergyStored(LevelAccessor level, BlockPos pos) {
							if (level instanceof ILevelExtension _ext) {
								IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.SOUTH);
								if (_entityStorage != null)
									return _entityStorage.getEnergyStored();
							}
							return 0;
						}
					}.getEnergyStored(world, BlockPos.containing(x, y, z - 1)) + sendNorth <= new Object() {
						public int getMaxEnergyStored(LevelAccessor level, BlockPos pos) {
							if (level instanceof ILevelExtension _ext) {
								IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.SOUTH);
								if (_entityStorage != null)
									return _entityStorage.getMaxEnergyStored();
							}
							return 0;
						}
					}.getMaxEnergyStored(world, BlockPos.containing(x, y, z - 1))) {
						if (world instanceof ILevelExtension _ext) {
							IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z - 1), Direction.SOUTH);
							if (_entityStorage != null)
								_entityStorage.receiveEnergy((int) (new Object() {
									public int getEnergyStored(LevelAccessor level, BlockPos pos) {
										if (level instanceof ILevelExtension _ext) {
											IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.SOUTH);
											if (_entityStorage != null)
												return _entityStorage.getEnergyStored();
										}
										return 0;
									}
								}.getEnergyStored(world, BlockPos.containing(x, y, z - 1)) + sendNorth), false);
						}
						if (world instanceof ILevelExtension _ext) {
							IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z), null);
							if (_entityStorage != null)
								_entityStorage.extractEnergy((int) extractNorth, false);
						}
					}
				}
				if (blockEast) {
					extractEast = new Object() {
						public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
							if (level instanceof ILevelExtension _ext) {
								IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.WEST);
								if (_entityStorage != null)
									return _entityStorage.receiveEnergy(_amount, true);
							}
							return 0;
						}
					}.receiveEnergySimulate(world, BlockPos.containing(x + 1, y, z), (int) sideAmount);
					sendEast = extractEast - energyLoss;
					if (sendEast >= 1 && new Object() {
						public int getEnergyStored(LevelAccessor level, BlockPos pos) {
							if (level instanceof ILevelExtension _ext) {
								IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.WEST);
								if (_entityStorage != null)
									return _entityStorage.getEnergyStored();
							}
							return 0;
						}
					}.getEnergyStored(world, BlockPos.containing(x + 1, y, z)) + sendEast <= new Object() {
						public int getMaxEnergyStored(LevelAccessor level, BlockPos pos) {
							if (level instanceof ILevelExtension _ext) {
								IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.WEST);
								if (_entityStorage != null)
									return _entityStorage.getMaxEnergyStored();
							}
							return 0;
						}
					}.getMaxEnergyStored(world, BlockPos.containing(x + 1, y, z))) {
						if (world instanceof ILevelExtension _ext) {
							IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x + 1, y, z), Direction.WEST);
							if (_entityStorage != null)
								_entityStorage.receiveEnergy((int) (new Object() {
									public int getEnergyStored(LevelAccessor level, BlockPos pos) {
										if (level instanceof ILevelExtension _ext) {
											IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.WEST);
											if (_entityStorage != null)
												return _entityStorage.getEnergyStored();
										}
										return 0;
									}
								}.getEnergyStored(world, BlockPos.containing(x + 1, y, z)) + sendEast), false);
						}
						if (world instanceof ILevelExtension _ext) {
							IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z), null);
							if (_entityStorage != null)
								_entityStorage.extractEnergy((int) extractEast, false);
						}
					}
				}
				if (blockSouth) {
					extractSouth = new Object() {
						public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
							if (level instanceof ILevelExtension _ext) {
								IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.NORTH);
								if (_entityStorage != null)
									return _entityStorage.receiveEnergy(_amount, true);
							}
							return 0;
						}
					}.receiveEnergySimulate(world, BlockPos.containing(x, y, z + 1), (int) sideAmount);
					sendSouth = extractSouth - energyLoss;
					if (sendSouth >= 1 && new Object() {
						public int getEnergyStored(LevelAccessor level, BlockPos pos) {
							if (level instanceof ILevelExtension _ext) {
								IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.NORTH);
								if (_entityStorage != null)
									return _entityStorage.getEnergyStored();
							}
							return 0;
						}
					}.getEnergyStored(world, BlockPos.containing(x, y, z + 1)) + sendSouth <= new Object() {
						public int getMaxEnergyStored(LevelAccessor level, BlockPos pos) {
							if (level instanceof ILevelExtension _ext) {
								IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.NORTH);
								if (_entityStorage != null)
									return _entityStorage.getMaxEnergyStored();
							}
							return 0;
						}
					}.getMaxEnergyStored(world, BlockPos.containing(x, y, z + 1))) {
						if (world instanceof ILevelExtension _ext) {
							IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z + 1), Direction.NORTH);
							if (_entityStorage != null)
								_entityStorage.receiveEnergy((int) (new Object() {
									public int getEnergyStored(LevelAccessor level, BlockPos pos) {
										if (level instanceof ILevelExtension _ext) {
											IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.NORTH);
											if (_entityStorage != null)
												return _entityStorage.getEnergyStored();
										}
										return 0;
									}
								}.getEnergyStored(world, BlockPos.containing(x, y, z + 1)) + sendSouth), false);
						}
						if (world instanceof ILevelExtension _ext) {
							IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z), null);
							if (_entityStorage != null)
								_entityStorage.extractEnergy((int) extractSouth, false);
						}
					}
				}
				if (blockWest) {
					extractWest = new Object() {
						public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
							if (level instanceof ILevelExtension _ext) {
								IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.EAST);
								if (_entityStorage != null)
									return _entityStorage.receiveEnergy(_amount, true);
							}
							return 0;
						}
					}.receiveEnergySimulate(world, BlockPos.containing(x - 1, y, z), (int) sideAmount);
					sendWest = extractWest - energyLoss;
					if (sendWest >= 1 && new Object() {
						public int getEnergyStored(LevelAccessor level, BlockPos pos) {
							if (level instanceof ILevelExtension _ext) {
								IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.EAST);
								if (_entityStorage != null)
									return _entityStorage.getEnergyStored();
							}
							return 0;
						}
					}.getEnergyStored(world, BlockPos.containing(x - 1, y, z)) + sendWest <= new Object() {
						public int getMaxEnergyStored(LevelAccessor level, BlockPos pos) {
							if (level instanceof ILevelExtension _ext) {
								IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.EAST);
								if (_entityStorage != null)
									return _entityStorage.getMaxEnergyStored();
							}
							return 0;
						}
					}.getMaxEnergyStored(world, BlockPos.containing(x - 1, y, z))) {
						if (world instanceof ILevelExtension _ext) {
							IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x - 1, y, z), Direction.EAST);
							if (_entityStorage != null)
								_entityStorage.receiveEnergy((int) (new Object() {
									public int getEnergyStored(LevelAccessor level, BlockPos pos) {
										if (level instanceof ILevelExtension _ext) {
											IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.EAST);
											if (_entityStorage != null)
												return _entityStorage.getEnergyStored();
										}
										return 0;
									}
								}.getEnergyStored(world, BlockPos.containing(x - 1, y, z)) + sendWest), false);
						}
						if (world instanceof ILevelExtension _ext) {
							IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z), null);
							if (_entityStorage != null)
								_entityStorage.extractEnergy((int) extractWest, false);
						}
					}
				}
				if (blockUp) {
					extractUp = new Object() {
						public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
							if (level instanceof ILevelExtension _ext) {
								IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.DOWN);
								if (_entityStorage != null)
									return _entityStorage.receiveEnergy(_amount, true);
							}
							return 0;
						}
					}.receiveEnergySimulate(world, BlockPos.containing(x, y + 1, z), (int) sideAmount);
					sendUp = extractUp - energyLoss;
					if (sendUp >= 1 && new Object() {
						public int getEnergyStored(LevelAccessor level, BlockPos pos) {
							if (level instanceof ILevelExtension _ext) {
								IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.DOWN);
								if (_entityStorage != null)
									return _entityStorage.getEnergyStored();
							}
							return 0;
						}
					}.getEnergyStored(world, BlockPos.containing(x, y + 1, z)) + sendUp <= new Object() {
						public int getMaxEnergyStored(LevelAccessor level, BlockPos pos) {
							if (level instanceof ILevelExtension _ext) {
								IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.DOWN);
								if (_entityStorage != null)
									return _entityStorage.getMaxEnergyStored();
							}
							return 0;
						}
					}.getMaxEnergyStored(world, BlockPos.containing(x, y + 1, z))) {
						if (world instanceof ILevelExtension _ext) {
							IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y + 1, z), Direction.DOWN);
							if (_entityStorage != null)
								_entityStorage.receiveEnergy((int) (new Object() {
									public int getEnergyStored(LevelAccessor level, BlockPos pos) {
										if (level instanceof ILevelExtension _ext) {
											IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.DOWN);
											if (_entityStorage != null)
												return _entityStorage.getEnergyStored();
										}
										return 0;
									}
								}.getEnergyStored(world, BlockPos.containing(x, y + 1, z)) + sendUp), false);
						}
						if (world instanceof ILevelExtension _ext) {
							IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z), null);
							if (_entityStorage != null)
								_entityStorage.extractEnergy((int) extractUp, false);
						}
					}
				}
				if (blockDown) {
					extractDown = new Object() {
						public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
							if (level instanceof ILevelExtension _ext) {
								IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.UP);
								if (_entityStorage != null)
									return _entityStorage.receiveEnergy(_amount, true);
							}
							return 0;
						}
					}.receiveEnergySimulate(world, BlockPos.containing(x, y - 1, z), (int) sideAmount);
					sendDown = extractDown - energyLoss;
					if (sendDown >= 1 && new Object() {
						public int getEnergyStored(LevelAccessor level, BlockPos pos) {
							if (level instanceof ILevelExtension _ext) {
								IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.UP);
								if (_entityStorage != null)
									return _entityStorage.getEnergyStored();
							}
							return 0;
						}
					}.getEnergyStored(world, BlockPos.containing(x, y - 1, z)) + sendDown <= new Object() {
						public int getMaxEnergyStored(LevelAccessor level, BlockPos pos) {
							if (level instanceof ILevelExtension _ext) {
								IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.UP);
								if (_entityStorage != null)
									return _entityStorage.getMaxEnergyStored();
							}
							return 0;
						}
					}.getMaxEnergyStored(world, BlockPos.containing(x, y - 1, z))) {
						if (world instanceof ILevelExtension _ext) {
							IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y - 1, z), Direction.UP);
							if (_entityStorage != null)
								_entityStorage.receiveEnergy((int) (new Object() {
									public int getEnergyStored(LevelAccessor level, BlockPos pos) {
										if (level instanceof ILevelExtension _ext) {
											IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.UP);
											if (_entityStorage != null)
												return _entityStorage.getEnergyStored();
										}
										return 0;
									}
								}.getEnergyStored(world, BlockPos.containing(x, y - 1, z)) + sendDown), false);
						}
						if (world instanceof ILevelExtension _ext) {
							IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z), null);
							if (_entityStorage != null)
								_entityStorage.extractEnergy((int) extractDown, false);
						}
					}
				}
			}
		}
	}
}
