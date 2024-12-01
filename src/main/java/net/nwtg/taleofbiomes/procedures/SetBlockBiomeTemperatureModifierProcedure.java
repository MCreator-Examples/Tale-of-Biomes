package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class SetBlockBiomeTemperatureModifierProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double nX = 0;
		double nY = 0;
		double nZ = 0;
		if (!world.isClientSide()) {
			nX = x;
			nY = y;
			nZ = z;
			if (world.getBiome(BlockPos.containing(nX, nY, nZ)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("tale_of_biomes:temperature/hot")))
					|| world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f > 1.6 && world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f <= 2) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(nX, nY, nZ);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("tobBiomeTemperature", 15);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (world.getBiome(BlockPos.containing(nX, nY, nZ)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("tale_of_biomes:temperature/toasty")))
					|| world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f > 0.8 && world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f <= 1.6) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(nX, nY, nZ);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("tobBiomeTemperature", 10);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (world.getBiome(BlockPos.containing(nX, nY, nZ)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("tale_of_biomes:temperature/chilly")))
					|| world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f < -0.8 && world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f >= -1.6) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(nX, nY, nZ);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("tobBiomeTemperature", 0);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (world.getBiome(BlockPos.containing(nX, nY, nZ)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("tale_of_biomes:temperature/cold")))
					|| world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f < -1.6 && world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f >= -2) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(nX, nY, nZ);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("tobBiomeTemperature", (-5));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(nX, nY, nZ);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("tobBiomeTemperature", 5);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		}
	}
}
