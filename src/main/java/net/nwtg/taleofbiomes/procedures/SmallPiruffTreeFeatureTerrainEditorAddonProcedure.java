package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class SmallPiruffTreeFeatureTerrainEditorAddonProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean useSingleBlock = false;
		boolean useSurfaceReplaceMode = false;
		boolean useUnderReplaceMode = false;
		boolean useSingleFillBlock = false;
		boolean useSingleUnderFillBlock = false;
		BlockState singleFillBlock = Blocks.AIR.defaultBlockState();
		BlockState singleUnderFillBlock = Blocks.AIR.defaultBlockState();
		String selectionBlockTag = "";
		String randomFillBlockTag = "";
		String randomUnderFillBlockTag = "";
		double size = 0;
		double radius = 0;
		double posX = 0;
		double posY = 0;
		double posZ = 0;
		double dynamicPosX = 0;
		double dynamicPosY = 0;
		double dynamicPosZ = 0;
		double radiusCounter = 0;
		double offsetX = 0;
		double offsetY = 0;
		double offsetZ = 0;
		double maxSize = 0;
		double maxHeight = 0;
		double structureSizeX = 0;
		double structureSizeZ = 0;
		double randomChance = 0;
		useSurfaceReplaceMode = false;
		useUnderReplaceMode = false;
		useSingleFillBlock = true;
		useSingleUnderFillBlock = false;
		singleFillBlock = TaleOfBiomesModBlocks.FERTILE_SOIL.get().defaultBlockState();
		singleUnderFillBlock = TaleOfBiomesModBlocks.SAND.get().defaultBlockState();
		selectionBlockTag = "minecraft" + ":" + "dirt";
		randomFillBlockTag = "minecraft" + ":" + "dirt";
		randomUnderFillBlockTag = "minecraft" + ":" + "dirt";
		structureSizeX = 7;
		structureSizeZ = 7;
		maxSize = 11;
		maxHeight = 12;
		offsetX = x + 0;
		offsetY = y - 3;
		offsetZ = z + 0;
		randomChance = 45;
		for (int index0 = 0; index0 < 1; index0++) {
			if ((new java.text.DecimalFormat("##").format(structureSizeX)).endsWith("1") || (new java.text.DecimalFormat("##").format(structureSizeX)).endsWith("3") || (new java.text.DecimalFormat("##").format(structureSizeX)).endsWith("5")
					|| (new java.text.DecimalFormat("##").format(structureSizeX)).endsWith("7") || (new java.text.DecimalFormat("##").format(structureSizeX)).endsWith("9")) {
				structureSizeX = (structureSizeX - 1) / 2;
			} else {
				structureSizeX = structureSizeX / 2;
			}
			if ((new java.text.DecimalFormat("##").format(structureSizeZ)).endsWith("1") || (new java.text.DecimalFormat("##").format(structureSizeZ)).endsWith("3") || (new java.text.DecimalFormat("##").format(structureSizeZ)).endsWith("5")
					|| (new java.text.DecimalFormat("##").format(structureSizeZ)).endsWith("7") || (new java.text.DecimalFormat("##").format(structureSizeZ)).endsWith("9")) {
				structureSizeZ = (structureSizeZ - 1) / 2;
			} else {
				structureSizeZ = structureSizeZ / 2;
			}
			posX = offsetX + 0.5 + structureSizeX;
			posY = offsetY + 0.5;
			posZ = offsetZ + 0.5 + structureSizeZ;
			for (int index1 = 0; index1 < (int) maxHeight; index1++) {
				posY = posY + 1;
				size = 0;
				for (int index2 = 0; index2 < (int) maxSize; index2++) {
					size = size + 0.29292;
					radiusCounter = 0;
					for (int index3 = 0; index3 < 90; index3++) {
						radiusCounter = radiusCounter + 1;
						radius = radiusCounter / (2 * 2 * Math.PI);
						dynamicPosX = Math.sin(radius) * size;
						dynamicPosY = radius / 16;
						dynamicPosZ = Math.cos(radius) * size;
						dynamicPosX = dynamicPosX + posX;
						dynamicPosY = dynamicPosY + posY;
						dynamicPosZ = dynamicPosZ + posZ;
						if (Mth.nextInt(RandomSource.create(), 1, (int) randomChance) == 1) {
							if (useSurfaceReplaceMode && useSingleFillBlock && (world.getBlockState(BlockPos.containing(dynamicPosX, dynamicPosY, dynamicPosZ))).getBlock() == Blocks.AIR
									&& (world.getBlockState(BlockPos.containing(dynamicPosX, dynamicPosY - 1, dynamicPosZ))).is(BlockTags.create(new ResourceLocation((selectionBlockTag).toLowerCase(java.util.Locale.ENGLISH))))) {
								world.setBlock(BlockPos.containing(dynamicPosX, dynamicPosY, dynamicPosZ), singleFillBlock, 3);
							} else if (useSurfaceReplaceMode && !useSingleFillBlock && (world.getBlockState(BlockPos.containing(dynamicPosX, dynamicPosY, dynamicPosZ))).getBlock() == Blocks.AIR
									&& (world.getBlockState(BlockPos.containing(dynamicPosX, dynamicPosY - 1, dynamicPosZ))).is(BlockTags.create(new ResourceLocation((selectionBlockTag).toLowerCase(java.util.Locale.ENGLISH))))) {
								world.setBlock(BlockPos.containing(dynamicPosX, dynamicPosY, dynamicPosZ), (BuiltInRegistries.BLOCK.getOrCreateTag(BlockTags.create(new ResourceLocation((randomFillBlockTag).toLowerCase(java.util.Locale.ENGLISH))))
										.getRandomElement(RandomSource.create()).orElseGet(() -> BuiltInRegistries.BLOCK.wrapAsHolder(Blocks.AIR)).value()).defaultBlockState(), 3);
							} else if (!useSurfaceReplaceMode && useSingleFillBlock
									&& (world.getBlockState(BlockPos.containing(dynamicPosX, dynamicPosY, dynamicPosZ))).is(BlockTags.create(new ResourceLocation((selectionBlockTag).toLowerCase(java.util.Locale.ENGLISH))))) {
								world.setBlock(BlockPos.containing(dynamicPosX, dynamicPosY, dynamicPosZ), singleFillBlock, 3);
							} else if (!useSurfaceReplaceMode && !useSingleFillBlock
									&& (world.getBlockState(BlockPos.containing(dynamicPosX, dynamicPosY, dynamicPosZ))).is(BlockTags.create(new ResourceLocation((selectionBlockTag).toLowerCase(java.util.Locale.ENGLISH))))) {
								world.setBlock(BlockPos.containing(dynamicPosX, dynamicPosY, dynamicPosZ), (BuiltInRegistries.BLOCK.getOrCreateTag(BlockTags.create(new ResourceLocation((randomFillBlockTag).toLowerCase(java.util.Locale.ENGLISH))))
										.getRandomElement(RandomSource.create()).orElseGet(() -> BuiltInRegistries.BLOCK.wrapAsHolder(Blocks.AIR)).value()).defaultBlockState(), 3);
							}
							if (useUnderReplaceMode && useSingleUnderFillBlock && !((world.getBlockState(BlockPos.containing(dynamicPosX, dynamicPosY, dynamicPosZ))).getBlock() == Blocks.AIR)) {
								world.setBlock(BlockPos.containing(dynamicPosX, dynamicPosY - 1, dynamicPosZ), singleUnderFillBlock, 3);
							} else if (useUnderReplaceMode && !useSingleUnderFillBlock && !((world.getBlockState(BlockPos.containing(dynamicPosX, dynamicPosY, dynamicPosZ))).getBlock() == Blocks.AIR)) {
								world.setBlock(BlockPos.containing(dynamicPosX, dynamicPosY - 1, dynamicPosZ),
										(BuiltInRegistries.BLOCK.getOrCreateTag(BlockTags.create(new ResourceLocation((randomUnderFillBlockTag).toLowerCase(java.util.Locale.ENGLISH)))).getRandomElement(RandomSource.create())
												.orElseGet(() -> BuiltInRegistries.BLOCK.wrapAsHolder(Blocks.AIR)).value()).defaultBlockState(),
										3);
							}
						}
					}
				}
			}
		}
		return true;
	}
}
