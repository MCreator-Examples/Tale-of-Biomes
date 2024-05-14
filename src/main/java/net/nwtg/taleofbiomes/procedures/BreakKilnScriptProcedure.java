package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;
import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BreakKilnScriptProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String myNamespace = "";
		String myPlacementTag = "";
		double offsetX = 0;
		double posX = 0;
		double posY = 0;
		double offsetZ = 0;
		double posZ = 0;
		double offsetY = 0;
		double group = 0;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE_ON.get()) {
			myNamespace = TaleOfBiomesModVariables.MapVariables.get(world).modNamespace;
			myPlacementTag = "kiln";
			group = new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "group");
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
						if (((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE.get()
								|| (world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE_ON.get()) && group == new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getPersistentData().getDouble(tag);
										return -1;
									}
								}.getValue(world, BlockPos.containing(posX, posY, posZ), "group")) {
							{
								BlockPos _pos = BlockPos.containing(posX, posY, posZ);
								Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), null);
								world.destroyBlock(_pos, false);
							}
						} else if ((world.getBlockState(BlockPos.containing(posX, posY, posZ))).is(BlockTags.create(new ResourceLocation(((myNamespace + ":" + myPlacementTag)).toLowerCase(java.util.Locale.ENGLISH)))) && group == new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, BlockPos.containing(posX, posY, posZ), "group")) {
							world.setBlock(BlockPos.containing(posX, posY, posZ), Blocks.AIR.defaultBlockState(), 3);
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
}
