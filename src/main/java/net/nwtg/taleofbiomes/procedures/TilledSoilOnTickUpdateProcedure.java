package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class TilledSoilOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState bsCrop = Blocks.AIR.defaultBlockState();
		double pX = 0;
		double pY = 0;
		double pZ = 0;
		double bX = 0;
		double bY = 0;
		double bZ = 0;
		double nbtPh = 0;
		double nbtFertilizer = 0;
		double nbtWeeds = 0;
		double nbtRocks = 0;
		double nBoost = 0;
		pX = x;
		pY = y + 1;
		pZ = z;
		bX = x;
		bY = y;
		bZ = z;
		bsCrop = (world.getBlockState(BlockPos.containing(pX, pY, pZ)));
		if (bsCrop.is(BlockTags.create(ResourceLocation.parse(((TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "crops")).toLowerCase(java.util.Locale.ENGLISH))))) {
			nbtPh = new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(bX, bY, bZ), "tobPh");
			nbtFertilizer = new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(bX, bY, bZ), "tobFertilizer");
			nbtWeeds = new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(bX, bY, bZ), "tobWeeds");
			nbtRocks = new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(bX, bY, bZ), "tobRocks");
			if (nbtPh > 0 && nbtFertilizer > 0) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(bX, bY, bZ);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("tobFertilizer", (nbtFertilizer - 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(bX, bY, bZ);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("tobPh", (nbtPh - 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				nBoost = 3;
			} else {
				nBoost = 0;
			}
			if (nbtWeeds <= 0) {
				nBoost = nBoost - 1;
			} else if (nbtWeeds > 0) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(bX, bY, bZ);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("tobWeeds", (nbtWeeds - 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				nBoost = nBoost - 0;
			}
			if (nbtRocks <= 0) {
				nBoost = nBoost - 1;
			} else if (nbtRocks > 0) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(bX, bY, bZ);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("tobRocks", (nbtRocks - 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				nBoost = nBoost - 0;
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(pX, pY, pZ);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("tobSoilBoost", nBoost);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}
