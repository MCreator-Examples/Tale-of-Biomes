package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;
import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BuildKilnScriptFoundationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double offsetX = 0;
		double posX = 0;
		double posY = 0;
		double offsetZ = 0;
		double posZ = 0;
		double offsetY = 0;
		String myBlockedBlocksTag = "";
		String myNamespace = "";
		String myPlacementTag = "";
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
				if (!((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE.get())
						&& !((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE_ON.get())) {
					world.setBlock(BlockPos.containing(posX, posY, posZ), TaleOfBiomesModBlocks.KILN_BLOCK_FOUNDATION.get().defaultBlockState(), 3);
				}
				posX = posX + 1;
			}
			posX = x - offsetX;
			posZ = posZ + 1;
		}
	}
}
