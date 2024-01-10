package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class RoseShrubUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double random = 0;
		BlockState spreadingBlock = Blocks.AIR.defaultBlockState();
		BlockState airBlock = Blocks.AIR.defaultBlockState();
		if (!world.isClientSide() && world.dayTime() % 24000 == 1 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "stage") < 3 && !(new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "dormant"))) {
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "stage") < 1) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("stage", 1);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
			airBlock = Blocks.AIR.defaultBlockState();
			spreadingBlock = TaleOfBiomesModBlocks.ROSE_SHRUB.get().defaultBlockState();
			for (int index0 = 0; index0 < 3; index0++) {
				random = Mth.nextInt(RandomSource.create(), 1, 6);
				if (random == 1 && spreadingBlock.canSurvive(world, BlockPos.containing(x, y, z - 1)) && (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == airBlock.getBlock()) {
					world.setBlock(BlockPos.containing(x, y, z - 1), spreadingBlock, 3);
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z - 1);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("stage", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, BlockPos.containing(x, y, z), "stage") + 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.COMPOSTER, (x + 0.5), (y + 0.5), ((z + 0.5) - 1), 15, 1, 1, 1, 0.5);
					break;
				} else if (random == 2 && spreadingBlock.canSurvive(world, BlockPos.containing(x + 1, y, z)) && (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == airBlock.getBlock()) {
					world.setBlock(BlockPos.containing(x + 1, y, z), spreadingBlock, 3);
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x + 1, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("stage", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, BlockPos.containing(x, y, z), "stage") + 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.COMPOSTER, (x + 0.5 + 1), (y + 0.5), (z + 0.5), 15, 1, 1, 1, 0.5);
					break;
				} else if (random == 3 && spreadingBlock.canSurvive(world, BlockPos.containing(x, y, z + 1)) && (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == airBlock.getBlock()) {
					world.setBlock(BlockPos.containing(x, y, z + 1), spreadingBlock, 3);
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z - 1);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("stage", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, BlockPos.containing(x, y, z), "stage") + 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.COMPOSTER, (x + 0.5), (y + 0.5), (z + 0.5 + 1), 15, 1, 1, 1, 0.5);
					break;
				} else if (random == 4 && spreadingBlock.canSurvive(world, BlockPos.containing(x - 1, y, z)) && (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == airBlock.getBlock()) {
					world.setBlock(BlockPos.containing(x - 1, y, z), spreadingBlock, 3);
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x - 1, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("stage", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, BlockPos.containing(x, y, z), "stage") + 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.COMPOSTER, ((x + 0.5) - 1), (y + 0.5), (z + 0.5), 15, 1, 1, 1, 0.5);
					break;
				} else if (random == 5 && spreadingBlock.canSurvive(world, BlockPos.containing(x, y + 1, z)) && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == airBlock.getBlock()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), spreadingBlock, 3);
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y + 1, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("stage", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, BlockPos.containing(x, y, z), "stage") + 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.COMPOSTER, (x + 0.5), (y + 0.5 + 1), (z + 0.5), 15, 1, 1, 1, 0.5);
					break;
				} else if (random == 6 && spreadingBlock.canSurvive(world, BlockPos.containing(x, y - 1, z)) && (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == airBlock.getBlock()) {
					world.setBlock(BlockPos.containing(x, y - 1, z), spreadingBlock, 3);
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y - 1, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("stage", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, BlockPos.containing(x, y, z), "stage") + 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.COMPOSTER, (x + 0.5), ((y + 0.5) - 1), (z + 0.5), 15, 1, 1, 1, 0.5);
					break;
				}
			}
			random = Mth.nextInt(RandomSource.create(), 1, 3);
			if (random >= 2) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putBoolean("dormant", true);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		}
	}
}
