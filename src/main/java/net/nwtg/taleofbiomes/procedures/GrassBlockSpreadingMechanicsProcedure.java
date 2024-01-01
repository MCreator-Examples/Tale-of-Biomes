package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import java.util.Map;

public class GrassBlockSpreadingMechanicsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double posX = 0;
		double posY = 0;
		double posZ = 0;
		boolean foundBlock = false;
		posX = x - 1;
		posY = y - 2;
		posZ = z - 1;
		for (int index0 = 0; index0 < 5; index0++) {
			for (int index1 = 0; index1 < 3; index1++) {
				for (int index2 = 0; index2 < 3; index2++) {
					if ((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.DIRT.get()
							&& (world.getBlockState(BlockPos.containing(posX, posY + 1, posZ))).is(BlockTags.create(new ResourceLocation("minecraft:air"))) && world.getMaxLocalRawBrightness(BlockPos.containing(posX, posY + 1, posZ)) >= 9) {
						foundBlock = true;
						break;
					}
					posZ = posZ + 1;
				}
				if (foundBlock) {
					break;
				}
				posZ = z - 1;
				posX = posX + 1;
			}
			if (foundBlock) {
				break;
			}
			posZ = z - 1;
			posX = x - 1;
			posY = posY + 1;
		}
		if (foundBlock) {
			{
				BlockPos _bp = BlockPos.containing(posX, posY, posZ);
				BlockState _bs = TaleOfBiomesModBlocks.GRASS_BLOCK.get().defaultBlockState();
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
		if (world.getBlockState(BlockPos.containing(x, y + 1, z)).getLightBlock(world, BlockPos.containing(x, y + 1, z)) >= 8
				&& !(world.getBlockState(BlockPos.containing(posX, posY + 1, posZ))).is(BlockTags.create(new ResourceLocation("minecraft:air")))) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = TaleOfBiomesModBlocks.DIRT.get().defaultBlockState();
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
}
