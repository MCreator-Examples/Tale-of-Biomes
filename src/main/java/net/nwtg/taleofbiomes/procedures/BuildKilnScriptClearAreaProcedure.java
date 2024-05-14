package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class BuildKilnScriptClearAreaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String myBlockedBlocksTag = "";
		String myNamespace = "";
		String myPlacementTag = "";
		double offsetX = 0;
		double posX = 0;
		double posY = 0;
		double offsetZ = 0;
		double posZ = 0;
		double offsetY = 0;
		myNamespace = TaleOfBiomesModVariables.MapVariables.get(world).modNamespace;
		myPlacementTag = "kiln";
		myBlockedBlocksTag = "kiln/blocked_blocks";
		offsetX = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "offsetX");
		offsetY = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "offsetY");
		offsetZ = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "offsetZ");
		posX = x - offsetX;
		posY = y - offsetY;
		posZ = z - offsetZ;
		for (int index0 = 0; index0 < 5; index0++) {
			for (int index1 = 0; index1 < 5; index1++) {
				for (int index2 = 0; index2 < 5; index2++) {
					if (!(world.getBlockState(BlockPos.containing(posX, posY, posZ))).is(BlockTags.create(new ResourceLocation(((myNamespace + ":" + myPlacementTag)).toLowerCase(java.util.Locale.ENGLISH))))) {
						{
							BlockPos _pos = BlockPos.containing(posX, posY, posZ);
							Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), null);
							world.destroyBlock(_pos, false);
						}
					}
					posZ = posZ + 1;
				}
				posZ = z - offsetZ;
				posX = posX + 1;
			}
			posX = x - offsetX;
			posY = posY + 1;
		}
	}
}
