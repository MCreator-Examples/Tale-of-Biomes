
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.nwtg.taleofbiomes.init;

import net.nwtg.taleofbiomes.TaleOfBiomesMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class TaleOfBiomesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TaleOfBiomesMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TOB_RESOURCES_TAB = REGISTRY.register("tob_resources_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.tale_of_biomes.tob_resources_tab")).icon(() -> new ItemStack(TaleOfBiomesModItems.STRAW.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TaleOfBiomesModItems.RICE_SEEDS.get());
				tabData.accept(TaleOfBiomesModItems.STRAW.get());
				tabData.accept(TaleOfBiomesModItems.CLAY.get());
				tabData.accept(TaleOfBiomesModItems.QUICKLIME.get());
				tabData.accept(TaleOfBiomesModItems.PHOSPHORITE_GEMSTONE.get());
				tabData.accept(TaleOfBiomesModItems.GHOST_BERRIES.get());
			})

					.build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TOB_DECORATION_TAB = REGISTRY.register("tob_decoration_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.tale_of_biomes.tob_decoration_tab")).icon(() -> new ItemStack(TaleOfBiomesModBlocks.YELLOW_PIRUFF_BED.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TaleOfBiomesModBlocks.GROUND_LANTERN.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.TOOL_HANDLE_BLOCK.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PHOSPHORITE_HOE_BLOCK.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PHOSPHORITE_SHOVEL_BLOCK.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PHOSPHORITE_RAKE_BLOCK.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.YELLOW_PIRUFF_BED.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.BLUE_PIRUFF_BED.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PURPLE_PIRUFF_BED.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.LIGHT_PURPLE_PIRUFF_BED.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.MAGENTA_PIRUFF_BED.get().asItem());
			})

					.build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TOB_TOOL_TAB = REGISTRY.register("tob_tool_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.tale_of_biomes.tob_tool_tab")).icon(() -> new ItemStack(TaleOfBiomesModItems.PHOSPHORITE_PICKAXE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TaleOfBiomesModItems.SEASON_DEVICE.get());
				tabData.accept(TaleOfBiomesModItems.PHOSPHORITE_AXE.get());
				tabData.accept(TaleOfBiomesModItems.PHOSPHORITE_HOE.get());
				tabData.accept(TaleOfBiomesModItems.PHOSPHORITE_PICKAXE.get());
				tabData.accept(TaleOfBiomesModItems.PHOSPHORITE_SHOVEL.get());
				tabData.accept(TaleOfBiomesModItems.PHOSPHORITE_SWORD.get());
				tabData.accept(TaleOfBiomesModItems.PIRUFF_STONE_AXE.get());
				tabData.accept(TaleOfBiomesModItems.PIRUFF_STONE_HOE.get());
				tabData.accept(TaleOfBiomesModItems.PIRUFF_STONE_PICKAXE.get());
				tabData.accept(TaleOfBiomesModItems.PIRUFF_STONE_SHOVEL.get());
				tabData.accept(TaleOfBiomesModItems.PIRUFF_STONE_SICKLE.get());
				tabData.accept(TaleOfBiomesModItems.PIRUFF_STONE_SWORD.get());
				tabData.accept(TaleOfBiomesModItems.PIRUFF_GRIP.get());
				tabData.accept(TaleOfBiomesModItems.STONE_AXE_HEAD.get());
				tabData.accept(TaleOfBiomesModItems.STONE_HOE_HEAD.get());
				tabData.accept(TaleOfBiomesModItems.STONE_PICKAXE_HEAD.get());
				tabData.accept(TaleOfBiomesModItems.STONE_SHOVEL_HEAD.get());
				tabData.accept(TaleOfBiomesModItems.STONE_SICKLE_HEAD.get());
				tabData.accept(TaleOfBiomesModItems.STONE_SWORD_HEAD.get());
			})

					.build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TOB_BLOCKS_TAB = REGISTRY.register("tob_blocks_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.tale_of_biomes.tob_blocks_tab")).icon(() -> new ItemStack(TaleOfBiomesModBlocks.PIRUFF_LOG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_N.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.SOLAR_PANNEL.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.COPPER_BATTERY_0.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.DRILL.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.BASIC_TOOL_TABLE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.BASIC_STONE_TABLE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.KILN_FURNACE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.BLUE_ASTER.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PURPLE_ASTER.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.MAGENTA_ASTER.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.GOLDENROD.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.WILD_INDIGO.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PIRUFF_SAPLING.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.TALL_GRASS_0.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.TALL_GRASS_1.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.TALL_GRASS_2.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.HAY_GRASS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.HAY_STRAW.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.IVY_SHRUB.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.ROSE_SHRUB.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.MOSS_BLOCK.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.MOSS_CARPET.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PIRUFF_VINES.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PIRUFF_LEAVES.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.THATCH_BLOCK.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.THATCH_STAIRS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.THATCH_SLAB.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.GRASS_BLOCK.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.DIRT.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PACKED_DIRT.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.FERTILE_SOIL.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.TILLED_SOIL.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.CLAY_BLOCK.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.SAND.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.GRAVEL.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PIRUFF_LOG.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PIRUFF_WOOD.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.STRIPPED_PIRUFF_LOG.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.STRIPPED_PIRUFF_WOOD.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PIRUFF_PLANKS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PIRUFF_STAIRS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PIRUFF_SLAB.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PIRUFF_FENCE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PIRUFF_FENCE_GATE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PIRUFF_DOOR.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PIRUFF_TRAPDOOR.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PIRUFF_PRESSURE_PLATE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PIRUFF_BUTTON.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.LIMESTONE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.COBBLED_LIMESTONE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.QUICKLIME_BLOCK.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PHOSPHORITE_STONE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PHOSPHORITE_CRYSTAL.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PHOSPHORITE_CRYSTAL_BOTTOM.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PHOSPHORITE_CRYSTAL_TOP.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.STONE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.MARBLE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.MARBLE_STAIRS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.MARBLE_SLAB.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.MARBLE_WALL.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.MARBLE_PRESSURE_PLATE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.MARBLE_BUTTON.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.COBBLED_MARBLE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.COBBLED_MARBLE_STAIRS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.COBBLED_MARBLE_SLAB.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.COBBLED_MARBLE_WALL.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.MOSSY_COBBLED_MARBLE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.MOSSY_COBBLED_MARBLE_STAIRS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.MOSSY_COBBLED_MARBLE_SLAB.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.MOSSY_COBBLED_MARBLE_WALL.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.POLISHED_MARBLE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.POLISHED_MARBLE_STAIRS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.POLISHED_MARBLE_SLAB.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.POLISHED_MARBLE_WALL.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.BASALT.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.BASALT_STAIRS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.BASALT_SLAB.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.BASALT_WALL.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.BASALT_PRESSURE_PLATE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.BASALT_BUTTON.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.COBBLED_BASALT.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.COBBLED_BASALT_STAIRS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.COBBLED_BASALT_SLAB.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.COBBLED_BASALT_WALL.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.MOSSY_COBBLED_BASALT.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.MOSSY_COBBLED_BASALT_STAIRS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.MOSSY_COBBLED_BASALT_SLAB.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.MOSSY_COBBLED_BASALT_WALL.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.POLISHED_BASALT.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.POLISHED_BASALT_STAIRS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.POLISHED_BASALT_SLAB.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.POLISHED_BASALT_WALL.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.SHALE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.SHALE_FOSSIL.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.SHALE_STAIRS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.SHALE_SLAB.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.SHALE_WALL.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.SHALE_PRESSURE_PLATE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.SHALE_BUTTON.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.POLISHED_SHALE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.POLISHED_SHALE_STAIRS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.POLISHED_SHALE_SLAB.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.POLISHED_SHALE_WALL.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.COBBLED_SHALE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.COBBLED_SHALE_STAIRS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.COBBLED_SHALE_SLAB.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.COBBLED_SHALE_WALL.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.MOSSY_COBBLED_SHALE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.MOSSY_COBBLED_SHALE_STAIRS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.MOSSY_COBBLED_SHALE_SLAB.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.MOSSY_COBBLED_SHALE_WALL.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PURE_COAL_ORE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.BRICKS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.BRICK_STAIRS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.BRICK_SLAB.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.BRICK_WALL.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.BRICK_PRESSURE_PLATE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.BRICK_BUTTON.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.LARGE_BRICKS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.LARGE_BRICK_STAIRS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.LARGE_BRICK_SLAB.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.LARGE_BRICK_WALL.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.LARGE_BRICK_PRESSURE_PLATE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.LARGE_BRICK_BUTTON.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.WALL_BLUEPRINT.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PLOT_BLUEPRINT.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.DOOR_BLUEPRINT.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.WINDOW_BLUEPRINT.get().asItem());
			})

					.build());
}
