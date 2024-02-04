
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.nwtg.taleofbiomes.init;

import net.nwtg.taleofbiomes.procedures.SeasonDevicePropertyValueProviderProcedure;
import net.nwtg.taleofbiomes.item.StrawItem;
import net.nwtg.taleofbiomes.item.StoneSwordHeadItem;
import net.nwtg.taleofbiomes.item.StoneShovelHeadItem;
import net.nwtg.taleofbiomes.item.StonePickaxeHeadItem;
import net.nwtg.taleofbiomes.item.StoneHoeHeadItem;
import net.nwtg.taleofbiomes.item.StoneAxeHeadItem;
import net.nwtg.taleofbiomes.item.SeasonDeviceItem;
import net.nwtg.taleofbiomes.item.RiceSeedsItem;
import net.nwtg.taleofbiomes.item.QuicklimeItem;
import net.nwtg.taleofbiomes.item.PiruffStoneSwordItem;
import net.nwtg.taleofbiomes.item.PiruffStoneShovelItem;
import net.nwtg.taleofbiomes.item.PiruffStonePickaxeItem;
import net.nwtg.taleofbiomes.item.PiruffStoneHoeItem;
import net.nwtg.taleofbiomes.item.PiruffStoneAxeItem;
import net.nwtg.taleofbiomes.item.PiruffGripItem;
import net.nwtg.taleofbiomes.item.PhosphoriteSwordItem;
import net.nwtg.taleofbiomes.item.PhosphoriteShovelItem;
import net.nwtg.taleofbiomes.item.PhosphoritePickaxeItem;
import net.nwtg.taleofbiomes.item.PhosphoriteHoeItem;
import net.nwtg.taleofbiomes.item.PhosphoriteGemstoneItem;
import net.nwtg.taleofbiomes.item.PhosphoriteAxeItem;
import net.nwtg.taleofbiomes.item.ClayItem;
import net.nwtg.taleofbiomes.TaleOfBiomesMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TaleOfBiomesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TaleOfBiomesMod.MODID);
	public static final RegistryObject<Item> SEASON_DEVICE = REGISTRY.register("season_device", () -> new SeasonDeviceItem());
	public static final RegistryObject<Item> PHOSPHORITE_AXE = REGISTRY.register("phosphorite_axe", () -> new PhosphoriteAxeItem());
	public static final RegistryObject<Item> PHOSPHORITE_HOE = REGISTRY.register("phosphorite_hoe", () -> new PhosphoriteHoeItem());
	public static final RegistryObject<Item> PHOSPHORITE_PICKAXE = REGISTRY.register("phosphorite_pickaxe", () -> new PhosphoritePickaxeItem());
	public static final RegistryObject<Item> PHOSPHORITE_SHOVEL = REGISTRY.register("phosphorite_shovel", () -> new PhosphoriteShovelItem());
	public static final RegistryObject<Item> PHOSPHORITE_SWORD = REGISTRY.register("phosphorite_sword", () -> new PhosphoriteSwordItem());
	public static final RegistryObject<Item> PIRUFF_STONE_AXE = REGISTRY.register("piruff_stone_axe", () -> new PiruffStoneAxeItem());
	public static final RegistryObject<Item> PIRUFF_STONE_HOE = REGISTRY.register("piruff_stone_hoe", () -> new PiruffStoneHoeItem());
	public static final RegistryObject<Item> PIRUFF_STONE_PICKAXE = REGISTRY.register("piruff_stone_pickaxe", () -> new PiruffStonePickaxeItem());
	public static final RegistryObject<Item> PIRUFF_STONE_SHOVEL = REGISTRY.register("piruff_stone_shovel", () -> new PiruffStoneShovelItem());
	public static final RegistryObject<Item> PIRUFF_STONE_SWORD = REGISTRY.register("piruff_stone_sword", () -> new PiruffStoneSwordItem());
	public static final RegistryObject<Item> PIRUFF_GRIP = REGISTRY.register("piruff_grip", () -> new PiruffGripItem());
	public static final RegistryObject<Item> STONE_AXE_HEAD = REGISTRY.register("stone_axe_head", () -> new StoneAxeHeadItem());
	public static final RegistryObject<Item> STONE_HOE_HEAD = REGISTRY.register("stone_hoe_head", () -> new StoneHoeHeadItem());
	public static final RegistryObject<Item> STONE_PICKAXE_HEAD = REGISTRY.register("stone_pickaxe_head", () -> new StonePickaxeHeadItem());
	public static final RegistryObject<Item> STONE_SHOVEL_HEAD = REGISTRY.register("stone_shovel_head", () -> new StoneShovelHeadItem());
	public static final RegistryObject<Item> STONE_SWORD_HEAD = REGISTRY.register("stone_sword_head", () -> new StoneSwordHeadItem());
	public static final RegistryObject<Item> RICE_SEEDS = REGISTRY.register("rice_seeds", () -> new RiceSeedsItem());
	public static final RegistryObject<Item> STRAW = REGISTRY.register("straw", () -> new StrawItem());
	public static final RegistryObject<Item> CLAY = REGISTRY.register("clay", () -> new ClayItem());
	public static final RegistryObject<Item> QUICKLIME = REGISTRY.register("quicklime", () -> new QuicklimeItem());
	public static final RegistryObject<Item> PHOSPHORITE_GEMSTONE = REGISTRY.register("phosphorite_gemstone", () -> new PhosphoriteGemstoneItem());
	public static final RegistryObject<Item> WALL_BLUEPRINT = block(TaleOfBiomesModBlocks.WALL_BLUEPRINT);
	public static final RegistryObject<Item> PLOT_BLUEPRINT = block(TaleOfBiomesModBlocks.PLOT_BLUEPRINT);
	public static final RegistryObject<Item> WINDOW_BLUEPRINT = block(TaleOfBiomesModBlocks.WINDOW_BLUEPRINT);
	public static final RegistryObject<Item> DOOR_BLUEPRINT = block(TaleOfBiomesModBlocks.DOOR_BLUEPRINT);
	public static final RegistryObject<Item> BASIC_TOOL_TABLE = block(TaleOfBiomesModBlocks.BASIC_TOOL_TABLE);
	public static final RegistryObject<Item> KILN_FURNACE = block(TaleOfBiomesModBlocks.KILN_FURNACE);
	public static final RegistryObject<Item> BLUE_ASTER = block(TaleOfBiomesModBlocks.BLUE_ASTER);
	public static final RegistryObject<Item> PURPLE_ASTER = block(TaleOfBiomesModBlocks.PURPLE_ASTER);
	public static final RegistryObject<Item> MAGENTA_ASTER = block(TaleOfBiomesModBlocks.MAGENTA_ASTER);
	public static final RegistryObject<Item> GOLDENROD = block(TaleOfBiomesModBlocks.GOLDENROD);
	public static final RegistryObject<Item> WILD_INDIGO = block(TaleOfBiomesModBlocks.WILD_INDIGO);
	public static final RegistryObject<Item> TALL_GRASS_0 = block(TaleOfBiomesModBlocks.TALL_GRASS_0);
	public static final RegistryObject<Item> TALL_GRASS_1 = block(TaleOfBiomesModBlocks.TALL_GRASS_1);
	public static final RegistryObject<Item> TALL_GRASS_2 = block(TaleOfBiomesModBlocks.TALL_GRASS_2);
	public static final RegistryObject<Item> HAY_GRASS = block(TaleOfBiomesModBlocks.HAY_GRASS);
	public static final RegistryObject<Item> HAY_STRAW = block(TaleOfBiomesModBlocks.HAY_STRAW);
	public static final RegistryObject<Item> IVY_SHRUB = block(TaleOfBiomesModBlocks.IVY_SHRUB);
	public static final RegistryObject<Item> ROSE_SHRUB = block(TaleOfBiomesModBlocks.ROSE_SHRUB);
	public static final RegistryObject<Item> PIRUFF_LEAVES = block(TaleOfBiomesModBlocks.PIRUFF_LEAVES);
	public static final RegistryObject<Item> THATCH_BLOCK = block(TaleOfBiomesModBlocks.THATCH_BLOCK);
	public static final RegistryObject<Item> THATCH_STAIRS = block(TaleOfBiomesModBlocks.THATCH_STAIRS);
	public static final RegistryObject<Item> THATCH_SLAB = block(TaleOfBiomesModBlocks.THATCH_SLAB);
	public static final RegistryObject<Item> GRASS_BLOCK = block(TaleOfBiomesModBlocks.GRASS_BLOCK);
	public static final RegistryObject<Item> DIRT = block(TaleOfBiomesModBlocks.DIRT);
	public static final RegistryObject<Item> PACKED_DIRT = block(TaleOfBiomesModBlocks.PACKED_DIRT);
	public static final RegistryObject<Item> FERTILE_SOIL = block(TaleOfBiomesModBlocks.FERTILE_SOIL);
	public static final RegistryObject<Item> TILLED_SOIL = block(TaleOfBiomesModBlocks.TILLED_SOIL);
	public static final RegistryObject<Item> CLAY_BLOCK = block(TaleOfBiomesModBlocks.CLAY_BLOCK);
	public static final RegistryObject<Item> SAND = block(TaleOfBiomesModBlocks.SAND);
	public static final RegistryObject<Item> GRAVEL = block(TaleOfBiomesModBlocks.GRAVEL);
	public static final RegistryObject<Item> PIRUFF_LOG = block(TaleOfBiomesModBlocks.PIRUFF_LOG);
	public static final RegistryObject<Item> PIRUFF_WOOD = block(TaleOfBiomesModBlocks.PIRUFF_WOOD);
	public static final RegistryObject<Item> STRIPPED_PIRUFF_LOG = block(TaleOfBiomesModBlocks.STRIPPED_PIRUFF_LOG);
	public static final RegistryObject<Item> STRIPPED_PIRUFF_WOOD = block(TaleOfBiomesModBlocks.STRIPPED_PIRUFF_WOOD);
	public static final RegistryObject<Item> PIRUFF_PLANKS = block(TaleOfBiomesModBlocks.PIRUFF_PLANKS);
	public static final RegistryObject<Item> PIRUFF_STAIRS = block(TaleOfBiomesModBlocks.PIRUFF_STAIRS);
	public static final RegistryObject<Item> PIRUFF_SLAB = block(TaleOfBiomesModBlocks.PIRUFF_SLAB);
	public static final RegistryObject<Item> PIRUFF_FENCE = block(TaleOfBiomesModBlocks.PIRUFF_FENCE);
	public static final RegistryObject<Item> PIRUFF_FENCE_GATE = block(TaleOfBiomesModBlocks.PIRUFF_FENCE_GATE);
	public static final RegistryObject<Item> PIRUFF_DOOR = doubleBlock(TaleOfBiomesModBlocks.PIRUFF_DOOR);
	public static final RegistryObject<Item> PIRUFF_TRAPDOOR = block(TaleOfBiomesModBlocks.PIRUFF_TRAPDOOR);
	public static final RegistryObject<Item> PIRUFF_PRESSURE_PLATE = block(TaleOfBiomesModBlocks.PIRUFF_PRESSURE_PLATE);
	public static final RegistryObject<Item> PIRUFF_BUTTON = block(TaleOfBiomesModBlocks.PIRUFF_BUTTON);
	public static final RegistryObject<Item> LIMESTONE = block(TaleOfBiomesModBlocks.LIMESTONE);
	public static final RegistryObject<Item> COBBLED_LIMESTONE = block(TaleOfBiomesModBlocks.COBBLED_LIMESTONE);
	public static final RegistryObject<Item> QUICKLIME_BLOCK = block(TaleOfBiomesModBlocks.QUICKLIME_BLOCK);
	public static final RegistryObject<Item> PHOSPHORITE_STONE = block(TaleOfBiomesModBlocks.PHOSPHORITE_STONE);
	public static final RegistryObject<Item> PHOSPHORITE_CRYSTAL = block(TaleOfBiomesModBlocks.PHOSPHORITE_CRYSTAL);
	public static final RegistryObject<Item> PHOSPHORITE_CRYSTAL_BOTTOM = block(TaleOfBiomesModBlocks.PHOSPHORITE_CRYSTAL_BOTTOM);
	public static final RegistryObject<Item> PHOSPHORITE_CRYSTAL_TOP = block(TaleOfBiomesModBlocks.PHOSPHORITE_CRYSTAL_TOP);
	public static final RegistryObject<Item> STONE = block(TaleOfBiomesModBlocks.STONE);
	public static final RegistryObject<Item> PURE_COAL_ORE = block(TaleOfBiomesModBlocks.PURE_COAL_ORE);
	public static final RegistryObject<Item> BRICKS = block(TaleOfBiomesModBlocks.BRICKS);
	public static final RegistryObject<Item> BRICK_STAIRS = block(TaleOfBiomesModBlocks.BRICK_STAIRS);
	public static final RegistryObject<Item> BRICK_SLAB = block(TaleOfBiomesModBlocks.BRICK_SLAB);
	public static final RegistryObject<Item> BRICK_WALL = block(TaleOfBiomesModBlocks.BRICK_WALL);
	public static final RegistryObject<Item> BRICK_PRESSURE_PLATE = block(TaleOfBiomesModBlocks.BRICK_PRESSURE_PLATE);
	public static final RegistryObject<Item> BRICK_BUTTON = block(TaleOfBiomesModBlocks.BRICK_BUTTON);
	public static final RegistryObject<Item> LARGE_BRICKS = block(TaleOfBiomesModBlocks.LARGE_BRICKS);
	public static final RegistryObject<Item> LARGE_BRICK_STAIRS = block(TaleOfBiomesModBlocks.LARGE_BRICK_STAIRS);
	public static final RegistryObject<Item> LARGE_BRICK_SLAB = block(TaleOfBiomesModBlocks.LARGE_BRICK_SLAB);
	public static final RegistryObject<Item> LARGE_BRICK_WALL = block(TaleOfBiomesModBlocks.LARGE_BRICK_WALL);
	public static final RegistryObject<Item> LARGE_BRICK_PRESSURE_PLATE = block(TaleOfBiomesModBlocks.LARGE_BRICK_PRESSURE_PLATE);
	public static final RegistryObject<Item> LARGE_BRICK_BUTTON = block(TaleOfBiomesModBlocks.LARGE_BRICK_BUTTON);
	public static final RegistryObject<Item> GROUND_LANTERN = block(TaleOfBiomesModBlocks.GROUND_LANTERN);
	public static final RegistryObject<Item> TOOL_HANDLE_BLOCK = block(TaleOfBiomesModBlocks.TOOL_HANDLE_BLOCK);
	public static final RegistryObject<Item> PHOSPHORITE_HOE_BLOCK = block(TaleOfBiomesModBlocks.PHOSPHORITE_HOE_BLOCK);
	public static final RegistryObject<Item> PHOSPHORITE_SHOVEL_BLOCK = block(TaleOfBiomesModBlocks.PHOSPHORITE_SHOVEL_BLOCK);
	public static final RegistryObject<Item> PHOSPHORITE_RAKE_BLOCK = block(TaleOfBiomesModBlocks.PHOSPHORITE_RAKE_BLOCK);
	public static final RegistryObject<Item> YELLOW_PIRUFF_BED = block(TaleOfBiomesModBlocks.YELLOW_PIRUFF_BED);
	public static final RegistryObject<Item> BLUE_PIRUFF_BED = block(TaleOfBiomesModBlocks.BLUE_PIRUFF_BED);
	public static final RegistryObject<Item> PURPLE_PIRUFF_BED = block(TaleOfBiomesModBlocks.PURPLE_PIRUFF_BED);
	public static final RegistryObject<Item> LIGHT_PURPLE_PIRUFF_BED = block(TaleOfBiomesModBlocks.LIGHT_PURPLE_PIRUFF_BED);
	public static final RegistryObject<Item> MAGENTA_PIRUFF_BED = block(TaleOfBiomesModBlocks.MAGENTA_PIRUFF_BED);
	public static final RegistryObject<Item> BLUE_ASTER_FLOWER_POT = block(TaleOfBiomesModBlocks.BLUE_ASTER_FLOWER_POT);
	public static final RegistryObject<Item> PURPLE_ASTER_FLOWER_POT = block(TaleOfBiomesModBlocks.PURPLE_ASTER_FLOWER_POT);
	public static final RegistryObject<Item> MAGENTA_ASTER_FLOWER_POT = block(TaleOfBiomesModBlocks.MAGENTA_ASTER_FLOWER_POT);
	public static final RegistryObject<Item> GOLDENROD_FLOWER_POT = block(TaleOfBiomesModBlocks.GOLDENROD_FLOWER_POT);
	public static final RegistryObject<Item> WILD_INDIGO_FLOWER_POT = block(TaleOfBiomesModBlocks.WILD_INDIGO_FLOWER_POT);
	public static final RegistryObject<Item> TILLED_SOIL_W_1_S_0 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_1_S_0);
	public static final RegistryObject<Item> TILLED_SOIL_W_1_S_1 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_1_S_1);
	public static final RegistryObject<Item> TILLED_SOIL_W_1_S_2 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_1_S_2);
	public static final RegistryObject<Item> TILLED_SOIL_W_1_S_3 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_1_S_3);
	public static final RegistryObject<Item> TILLED_SOIL_W_1_S_4 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_1_S_4);
	public static final RegistryObject<Item> TILLED_SOIL_W_2_S_0 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_2_S_0);
	public static final RegistryObject<Item> TILLED_SOIL_W_2_S_1 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_2_S_1);
	public static final RegistryObject<Item> TILLED_SOIL_W_2_S_2 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_2_S_2);
	public static final RegistryObject<Item> TILLED_SOIL_W_2_S_3 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_2_S_3);
	public static final RegistryObject<Item> TILLED_SOIL_W_2_S_4 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_2_S_4);
	public static final RegistryObject<Item> TILLED_SOIL_W_3_S_0 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_3_S_0);
	public static final RegistryObject<Item> TILLED_SOIL_W_3_S_1 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_3_S_1);
	public static final RegistryObject<Item> TILLED_SOIL_W_3_S_2 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_3_S_2);
	public static final RegistryObject<Item> TILLED_SOIL_W_3_S_3 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_3_S_3);
	public static final RegistryObject<Item> TILLED_SOIL_W_3_S_4 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_3_S_4);
	public static final RegistryObject<Item> TILLED_SOIL_W_4_S_0 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_4_S_0);
	public static final RegistryObject<Item> TILLED_SOIL_W_4_S_1 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_4_S_1);
	public static final RegistryObject<Item> TILLED_SOIL_W_4_S_2 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_4_S_2);
	public static final RegistryObject<Item> TILLED_SOIL_W_4_S_3 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_4_S_3);
	public static final RegistryObject<Item> TILLED_SOIL_W_4_S_4 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_4_S_4);
	public static final RegistryObject<Item> TILLED_SOIL_W_0_S_1 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_0_S_1);
	public static final RegistryObject<Item> TILLED_SOIL_W_0_S_2 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_0_S_2);
	public static final RegistryObject<Item> TILLED_SOIL_W_0_S_3 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_0_S_3);
	public static final RegistryObject<Item> TILLED_SOIL_W_0_S_4 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_0_S_4);
	public static final RegistryObject<Item> KILN_FURNACE_ON = block(TaleOfBiomesModBlocks.KILN_FURNACE_ON);
	public static final RegistryObject<Item> KILN_LADDER = block(TaleOfBiomesModBlocks.KILN_LADDER);
	public static final RegistryObject<Item> KILN_BLOCK_CORNER_BOTTOM = block(TaleOfBiomesModBlocks.KILN_BLOCK_CORNER_BOTTOM);
	public static final RegistryObject<Item> KILN_BLOCK_CORNER_CENTER = block(TaleOfBiomesModBlocks.KILN_BLOCK_CORNER_CENTER);
	public static final RegistryObject<Item> KILN_BLOCK_CORNER_TOP = block(TaleOfBiomesModBlocks.KILN_BLOCK_CORNER_TOP);
	public static final RegistryObject<Item> KILN_BLOCK_MIDDLE_BOTTOM = block(TaleOfBiomesModBlocks.KILN_BLOCK_MIDDLE_BOTTOM);
	public static final RegistryObject<Item> KILN_BLOCK_MIDDLE_CENTER = block(TaleOfBiomesModBlocks.KILN_BLOCK_MIDDLE_CENTER);
	public static final RegistryObject<Item> KILN_BLOCK_MIDDLE_TOP = block(TaleOfBiomesModBlocks.KILN_BLOCK_MIDDLE_TOP);
	public static final RegistryObject<Item> KILN_BLOCK_FOUNDATION = block(TaleOfBiomesModBlocks.KILN_BLOCK_FOUNDATION);
	public static final RegistryObject<Item> RICE_CROP_0 = block(TaleOfBiomesModBlocks.RICE_CROP_0);
	public static final RegistryObject<Item> RICE_CROP_1 = block(TaleOfBiomesModBlocks.RICE_CROP_1);
	public static final RegistryObject<Item> RICE_CROP_2 = block(TaleOfBiomesModBlocks.RICE_CROP_2);
	public static final RegistryObject<Item> RICE_CROP_3 = block(TaleOfBiomesModBlocks.RICE_CROP_3);
	public static final RegistryObject<Item> RICE_CROP_4 = block(TaleOfBiomesModBlocks.RICE_CROP_4);
	public static final RegistryObject<Item> RICE_CROP_5 = block(TaleOfBiomesModBlocks.RICE_CROP_5);
	public static final RegistryObject<Item> RICE_CROP_6 = block(TaleOfBiomesModBlocks.RICE_CROP_6);
	public static final RegistryObject<Item> RICE_CROP_7 = block(TaleOfBiomesModBlocks.RICE_CROP_7);
	public static final RegistryObject<Item> HANGING_LANTERN = block(TaleOfBiomesModBlocks.HANGING_LANTERN);
	public static final RegistryObject<Item> HANGING_LANTERN_ON = block(TaleOfBiomesModBlocks.HANGING_LANTERN_ON);
	public static final RegistryObject<Item> GROUND_LANTERN_ON = block(TaleOfBiomesModBlocks.GROUND_LANTERN_ON);
	public static final RegistryObject<Item> YELLOW_PIRUFF_BED_TOP = block(TaleOfBiomesModBlocks.YELLOW_PIRUFF_BED_TOP);
	public static final RegistryObject<Item> BLUE_PIRUFF_BED_TOP = block(TaleOfBiomesModBlocks.BLUE_PIRUFF_BED_TOP);
	public static final RegistryObject<Item> LIGHT_PURPLE_PIRUFF_BED_TOP = block(TaleOfBiomesModBlocks.LIGHT_PURPLE_PIRUFF_BED_TOP);
	public static final RegistryObject<Item> MAGENTA_PIRUFF_BED_TOP = block(TaleOfBiomesModBlocks.MAGENTA_PIRUFF_BED_TOP);
	public static final RegistryObject<Item> PURPLE_PIRUFF_BED_TOP = block(TaleOfBiomesModBlocks.PURPLE_PIRUFF_BED_TOP);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}

	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(SEASON_DEVICE.get(), new ResourceLocation("tale_of_biomes:season_device_season_id"), (itemStackToRender, clientWorld, entity, itemEntityId) -> (float) SeasonDevicePropertyValueProviderProcedure.execute(entity));
		});
	}
}
