package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import java.util.Map;

public class GrassBlockPlantGrowthMechanicsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double plantDelay = 0;
		double plantCount = 0;
		double posX = 0;
		double posY = 0;
		double posZ = 0;
		double randomBlock = 0;
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:air")))) {
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "plantDelay") == 3) {
				plantCount = 0;
				posX = x - 2;
				posY = y - 2;
				posZ = z - 2;
				for (int index0 = 0; index0 < 5; index0++) {
					for (int index1 = 0; index1 < 5; index1++) {
						for (int index2 = 0; index2 < 5; index2++) {
							if ((world.getBlockState(BlockPos.containing(posX, posY, posZ)))
									.is(BlockTags.create(new ResourceLocation(((TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "grass_blocks")).toLowerCase(java.util.Locale.ENGLISH))))
									&& (world.getBlockState(BlockPos.containing(posX, posY + 1, posZ)))
											.is(BlockTags.create(new ResourceLocation(((TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "grass_plants")).toLowerCase(java.util.Locale.ENGLISH))))) {
								plantCount = plantCount + 1;
							}
							posZ = posZ + 1;
						}
						posZ = z - 2;
						posX = posX + 1;
					}
					posX = x - 2;
					posY = posY + 1;
				}
				if (IsInEldenmoorDimensionProcedure.execute(world)
						&& (world.getBiome(BlockPos.containing(x, y, z))
								.is(TagKey.create(Registries.BIOME, new ResourceLocation(((TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "grass_growth/dense")).toLowerCase(java.util.Locale.ENGLISH)))) && plantCount <= 12
								|| world.getBiome(BlockPos.containing(x, y, z)).is(
										TagKey.create(Registries.BIOME, new ResourceLocation(((TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "grass_growth/moderate")).toLowerCase(java.util.Locale.ENGLISH)))) && plantCount <= 6
								|| world.getBiome(BlockPos.containing(x, y, z)).is(
										TagKey.create(Registries.BIOME, new ResourceLocation(((TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "grass_growth/light")).toLowerCase(java.util.Locale.ENGLISH)))) && plantCount <= 3)
						|| !IsInEldenmoorDimensionProcedure.execute(world) && plantCount <= 6) {
					posX = x;
					posY = y + 1;
					posZ = z;
					if (world.getBiome(BlockPos.containing(x, y, z))
							.is(TagKey.create(Registries.BIOME, new ResourceLocation(((TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "eldenmoor/flower_plains")).toLowerCase(java.util.Locale.ENGLISH))))) {
						{
							BlockPos _bp = BlockPos.containing(posX, posY, posZ);
							BlockState _bs = (BuiltInRegistries.BLOCK
									.getOrCreateTag(BlockTags.create(new ResourceLocation(((TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "grass_growth/flower_plains")).toLowerCase(java.util.Locale.ENGLISH))))
									.getRandomElement(RandomSource.create()).orElseGet(() -> BuiltInRegistries.BLOCK.wrapAsHolder(Blocks.AIR)).value()).defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							BlockEntity _be = world.getBlockEntity(_bp);
							CompoundTag _bnbt = null;
							if (_be != null) {
								_bnbt = _be.saveWithFullMetadata();
								_be.setRemoved();
							}
							world.setBlock(_bp, _bs, 3);
							if (_bnbt != null) {
								_be = world.getBlockEntity(_bp);
								if (_be != null) {
									try {
										_be.load(_bnbt);
									} catch (Exception ignored) {
									}
								}
							}
						}
					} else {
						{
							BlockPos _bp = BlockPos.containing(posX, posY, posZ);
							BlockState _bs = (BuiltInRegistries.BLOCK
									.getOrCreateTag(BlockTags.create(new ResourceLocation(((TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "grass_growth/defualt")).toLowerCase(java.util.Locale.ENGLISH))))
									.getRandomElement(RandomSource.create()).orElseGet(() -> BuiltInRegistries.BLOCK.wrapAsHolder(Blocks.AIR)).value()).defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							BlockEntity _be = world.getBlockEntity(_bp);
							CompoundTag _bnbt = null;
							if (_be != null) {
								_bnbt = _be.saveWithFullMetadata();
								_be.setRemoved();
							}
							world.setBlock(_bp, _bs, 3);
							if (_bnbt != null) {
								_be = world.getBlockEntity(_bp);
								if (_be != null) {
									try {
										_be.load(_bnbt);
									} catch (Exception ignored) {
									}
								}
							}
						}
					}
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("plantDelay", 0);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("plantDelay", (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, BlockPos.containing(x, y, z), "plantDelay") + 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		}
	}
}
