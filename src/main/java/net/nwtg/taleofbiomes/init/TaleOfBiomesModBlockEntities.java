
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.nwtg.taleofbiomes.init;

import net.nwtg.taleofbiomes.block.entity.TilledSoilW4S4BlockEntity;
import net.nwtg.taleofbiomes.block.entity.TilledSoilW4S3BlockEntity;
import net.nwtg.taleofbiomes.block.entity.TilledSoilW4S2BlockEntity;
import net.nwtg.taleofbiomes.block.entity.TilledSoilW4S1BlockEntity;
import net.nwtg.taleofbiomes.block.entity.TilledSoilW4S0BlockEntity;
import net.nwtg.taleofbiomes.block.entity.TilledSoilW3S4BlockEntity;
import net.nwtg.taleofbiomes.block.entity.TilledSoilW3S3BlockEntity;
import net.nwtg.taleofbiomes.block.entity.TilledSoilW3S2BlockEntity;
import net.nwtg.taleofbiomes.block.entity.TilledSoilW3S1BlockEntity;
import net.nwtg.taleofbiomes.block.entity.TilledSoilW3S0BlockEntity;
import net.nwtg.taleofbiomes.block.entity.TilledSoilW2S4BlockEntity;
import net.nwtg.taleofbiomes.block.entity.TilledSoilW2S3BlockEntity;
import net.nwtg.taleofbiomes.block.entity.TilledSoilW2S2BlockEntity;
import net.nwtg.taleofbiomes.block.entity.TilledSoilW2S1BlockEntity;
import net.nwtg.taleofbiomes.block.entity.TilledSoilW2S0BlockEntity;
import net.nwtg.taleofbiomes.block.entity.TilledSoilW1S4BlockEntity;
import net.nwtg.taleofbiomes.block.entity.TilledSoilW1S3BlockEntity;
import net.nwtg.taleofbiomes.block.entity.TilledSoilW1S2BlockEntity;
import net.nwtg.taleofbiomes.block.entity.TilledSoilW1S1BlockEntity;
import net.nwtg.taleofbiomes.block.entity.TilledSoilW1S0BlockEntity;
import net.nwtg.taleofbiomes.block.entity.TilledSoilW0S4BlockEntity;
import net.nwtg.taleofbiomes.block.entity.TilledSoilW0S3BlockEntity;
import net.nwtg.taleofbiomes.block.entity.TilledSoilW0S2BlockEntity;
import net.nwtg.taleofbiomes.block.entity.TilledSoilW0S1BlockEntity;
import net.nwtg.taleofbiomes.block.entity.TilledSoilBlockEntity;
import net.nwtg.taleofbiomes.block.entity.RoseShrubBlockEntity;
import net.nwtg.taleofbiomes.block.entity.RiceCrop7BlockEntity;
import net.nwtg.taleofbiomes.block.entity.RiceCrop6BlockEntity;
import net.nwtg.taleofbiomes.block.entity.RiceCrop5BlockEntity;
import net.nwtg.taleofbiomes.block.entity.RiceCrop4BlockEntity;
import net.nwtg.taleofbiomes.block.entity.RiceCrop3BlockEntity;
import net.nwtg.taleofbiomes.block.entity.RiceCrop2BlockEntity;
import net.nwtg.taleofbiomes.block.entity.RiceCrop1BlockEntity;
import net.nwtg.taleofbiomes.block.entity.RiceCrop0BlockEntity;
import net.nwtg.taleofbiomes.block.entity.PhosphoriteStoneBlockEntity;
import net.nwtg.taleofbiomes.block.entity.PhosphoriteCrystalBlockEntity;
import net.nwtg.taleofbiomes.block.entity.KilnLadderBlockEntity;
import net.nwtg.taleofbiomes.block.entity.KilnFurnaceOnBlockEntity;
import net.nwtg.taleofbiomes.block.entity.KilnFurnaceBlockEntity;
import net.nwtg.taleofbiomes.block.entity.KilnBlockMiddleTopBlockEntity;
import net.nwtg.taleofbiomes.block.entity.KilnBlockMiddleCenterBlockEntity;
import net.nwtg.taleofbiomes.block.entity.KilnBlockMiddleBottomBlockEntity;
import net.nwtg.taleofbiomes.block.entity.KilnBlockFoundationBlockEntity;
import net.nwtg.taleofbiomes.block.entity.KilnBlockCornerTopBlockEntity;
import net.nwtg.taleofbiomes.block.entity.KilnBlockCornerCenterBlockEntity;
import net.nwtg.taleofbiomes.block.entity.KilnBlockCornerBottomBlockEntity;
import net.nwtg.taleofbiomes.block.entity.IvyShrubBlockEntity;
import net.nwtg.taleofbiomes.block.entity.HayStrawBlockEntity;
import net.nwtg.taleofbiomes.block.entity.HayGrassBlockEntity;
import net.nwtg.taleofbiomes.block.entity.GrassBlockBlockEntity;
import net.nwtg.taleofbiomes.TaleOfBiomesMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class TaleOfBiomesModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TaleOfBiomesMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> HAY_GRASS = register("hay_grass", TaleOfBiomesModBlocks.HAY_GRASS, HayGrassBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> HAY_STRAW = register("hay_straw", TaleOfBiomesModBlocks.HAY_STRAW, HayStrawBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> IVY_SHRUB = register("ivy_shrub", TaleOfBiomesModBlocks.IVY_SHRUB, IvyShrubBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ROSE_SHRUB = register("rose_shrub", TaleOfBiomesModBlocks.ROSE_SHRUB, RoseShrubBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GRASS_BLOCK = register("grass_block", TaleOfBiomesModBlocks.GRASS_BLOCK, GrassBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TILLED_SOIL = register("tilled_soil", TaleOfBiomesModBlocks.TILLED_SOIL, TilledSoilBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PHOSPHORITE_STONE = register("phosphorite_stone", TaleOfBiomesModBlocks.PHOSPHORITE_STONE, PhosphoriteStoneBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PHOSPHORITE_CRYSTAL = register("phosphorite_crystal", TaleOfBiomesModBlocks.PHOSPHORITE_CRYSTAL, PhosphoriteCrystalBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> KILN_FURNACE = register("kiln_furnace", TaleOfBiomesModBlocks.KILN_FURNACE, KilnFurnaceBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TILLED_SOIL_W_1_S_0 = register("tilled_soil_w_1_s_0", TaleOfBiomesModBlocks.TILLED_SOIL_W_1_S_0, TilledSoilW1S0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TILLED_SOIL_W_1_S_1 = register("tilled_soil_w_1_s_1", TaleOfBiomesModBlocks.TILLED_SOIL_W_1_S_1, TilledSoilW1S1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TILLED_SOIL_W_1_S_2 = register("tilled_soil_w_1_s_2", TaleOfBiomesModBlocks.TILLED_SOIL_W_1_S_2, TilledSoilW1S2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TILLED_SOIL_W_1_S_3 = register("tilled_soil_w_1_s_3", TaleOfBiomesModBlocks.TILLED_SOIL_W_1_S_3, TilledSoilW1S3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TILLED_SOIL_W_1_S_4 = register("tilled_soil_w_1_s_4", TaleOfBiomesModBlocks.TILLED_SOIL_W_1_S_4, TilledSoilW1S4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TILLED_SOIL_W_2_S_0 = register("tilled_soil_w_2_s_0", TaleOfBiomesModBlocks.TILLED_SOIL_W_2_S_0, TilledSoilW2S0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TILLED_SOIL_W_2_S_1 = register("tilled_soil_w_2_s_1", TaleOfBiomesModBlocks.TILLED_SOIL_W_2_S_1, TilledSoilW2S1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TILLED_SOIL_W_2_S_2 = register("tilled_soil_w_2_s_2", TaleOfBiomesModBlocks.TILLED_SOIL_W_2_S_2, TilledSoilW2S2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TILLED_SOIL_W_2_S_3 = register("tilled_soil_w_2_s_3", TaleOfBiomesModBlocks.TILLED_SOIL_W_2_S_3, TilledSoilW2S3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TILLED_SOIL_W_2_S_4 = register("tilled_soil_w_2_s_4", TaleOfBiomesModBlocks.TILLED_SOIL_W_2_S_4, TilledSoilW2S4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TILLED_SOIL_W_3_S_0 = register("tilled_soil_w_3_s_0", TaleOfBiomesModBlocks.TILLED_SOIL_W_3_S_0, TilledSoilW3S0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TILLED_SOIL_W_3_S_1 = register("tilled_soil_w_3_s_1", TaleOfBiomesModBlocks.TILLED_SOIL_W_3_S_1, TilledSoilW3S1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TILLED_SOIL_W_3_S_2 = register("tilled_soil_w_3_s_2", TaleOfBiomesModBlocks.TILLED_SOIL_W_3_S_2, TilledSoilW3S2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TILLED_SOIL_W_3_S_3 = register("tilled_soil_w_3_s_3", TaleOfBiomesModBlocks.TILLED_SOIL_W_3_S_3, TilledSoilW3S3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TILLED_SOIL_W_3_S_4 = register("tilled_soil_w_3_s_4", TaleOfBiomesModBlocks.TILLED_SOIL_W_3_S_4, TilledSoilW3S4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TILLED_SOIL_W_4_S_0 = register("tilled_soil_w_4_s_0", TaleOfBiomesModBlocks.TILLED_SOIL_W_4_S_0, TilledSoilW4S0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TILLED_SOIL_W_4_S_1 = register("tilled_soil_w_4_s_1", TaleOfBiomesModBlocks.TILLED_SOIL_W_4_S_1, TilledSoilW4S1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TILLED_SOIL_W_4_S_2 = register("tilled_soil_w_4_s_2", TaleOfBiomesModBlocks.TILLED_SOIL_W_4_S_2, TilledSoilW4S2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TILLED_SOIL_W_4_S_3 = register("tilled_soil_w_4_s_3", TaleOfBiomesModBlocks.TILLED_SOIL_W_4_S_3, TilledSoilW4S3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TILLED_SOIL_W_4_S_4 = register("tilled_soil_w_4_s_4", TaleOfBiomesModBlocks.TILLED_SOIL_W_4_S_4, TilledSoilW4S4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TILLED_SOIL_W_0_S_1 = register("tilled_soil_w_0_s_1", TaleOfBiomesModBlocks.TILLED_SOIL_W_0_S_1, TilledSoilW0S1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TILLED_SOIL_W_0_S_2 = register("tilled_soil_w_0_s_2", TaleOfBiomesModBlocks.TILLED_SOIL_W_0_S_2, TilledSoilW0S2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TILLED_SOIL_W_0_S_3 = register("tilled_soil_w_0_s_3", TaleOfBiomesModBlocks.TILLED_SOIL_W_0_S_3, TilledSoilW0S3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TILLED_SOIL_W_0_S_4 = register("tilled_soil_w_0_s_4", TaleOfBiomesModBlocks.TILLED_SOIL_W_0_S_4, TilledSoilW0S4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> KILN_FURNACE_ON = register("kiln_furnace_on", TaleOfBiomesModBlocks.KILN_FURNACE_ON, KilnFurnaceOnBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> KILN_LADDER = register("kiln_ladder", TaleOfBiomesModBlocks.KILN_LADDER, KilnLadderBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> KILN_BLOCK_CORNER_BOTTOM = register("kiln_block_corner_bottom", TaleOfBiomesModBlocks.KILN_BLOCK_CORNER_BOTTOM, KilnBlockCornerBottomBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> KILN_BLOCK_CORNER_CENTER = register("kiln_block_corner_center", TaleOfBiomesModBlocks.KILN_BLOCK_CORNER_CENTER, KilnBlockCornerCenterBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> KILN_BLOCK_CORNER_TOP = register("kiln_block_corner_top", TaleOfBiomesModBlocks.KILN_BLOCK_CORNER_TOP, KilnBlockCornerTopBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> KILN_BLOCK_MIDDLE_BOTTOM = register("kiln_block_middle_bottom", TaleOfBiomesModBlocks.KILN_BLOCK_MIDDLE_BOTTOM, KilnBlockMiddleBottomBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> KILN_BLOCK_MIDDLE_CENTER = register("kiln_block_middle_center", TaleOfBiomesModBlocks.KILN_BLOCK_MIDDLE_CENTER, KilnBlockMiddleCenterBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> KILN_BLOCK_MIDDLE_TOP = register("kiln_block_middle_top", TaleOfBiomesModBlocks.KILN_BLOCK_MIDDLE_TOP, KilnBlockMiddleTopBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> KILN_BLOCK_FOUNDATION = register("kiln_block_foundation", TaleOfBiomesModBlocks.KILN_BLOCK_FOUNDATION, KilnBlockFoundationBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RICE_CROP_0 = register("rice_crop_0", TaleOfBiomesModBlocks.RICE_CROP_0, RiceCrop0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RICE_CROP_1 = register("rice_crop_1", TaleOfBiomesModBlocks.RICE_CROP_1, RiceCrop1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RICE_CROP_2 = register("rice_crop_2", TaleOfBiomesModBlocks.RICE_CROP_2, RiceCrop2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RICE_CROP_3 = register("rice_crop_3", TaleOfBiomesModBlocks.RICE_CROP_3, RiceCrop3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RICE_CROP_4 = register("rice_crop_4", TaleOfBiomesModBlocks.RICE_CROP_4, RiceCrop4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RICE_CROP_5 = register("rice_crop_5", TaleOfBiomesModBlocks.RICE_CROP_5, RiceCrop5BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RICE_CROP_6 = register("rice_crop_6", TaleOfBiomesModBlocks.RICE_CROP_6, RiceCrop6BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RICE_CROP_7 = register("rice_crop_7", TaleOfBiomesModBlocks.RICE_CROP_7, RiceCrop7BlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
