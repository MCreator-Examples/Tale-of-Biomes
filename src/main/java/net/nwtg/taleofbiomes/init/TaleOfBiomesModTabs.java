
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.nwtg.taleofbiomes.init;

import net.nwtg.taleofbiomes.TaleOfBiomesMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class TaleOfBiomesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TaleOfBiomesMod.MODID);
	public static final RegistryObject<CreativeModeTab> TALES_OF_BIOMES_TAB = REGISTRY.register("tales_of_biomes_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.tale_of_biomes.tales_of_biomes_tab")).icon(() -> new ItemStack(TaleOfBiomesModBlocks.GOLDENROD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TaleOfBiomesModItems.PHOSPHORITE_SWORD.get());
				tabData.accept(TaleOfBiomesModItems.PHOSPHORITE_PICKAXE.get());
				tabData.accept(TaleOfBiomesModItems.PHOSPHORITE_AXE.get());
				tabData.accept(TaleOfBiomesModItems.PHOSPHORITE_SHOVEL.get());
				tabData.accept(TaleOfBiomesModItems.PHOSPHORITE_HOE.get());
				tabData.accept(TaleOfBiomesModItems.RICE_SEEDS.get());
				tabData.accept(TaleOfBiomesModBlocks.BLUE_ASTER.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PURPLE_ASTER.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.MAGENTA_ASTER.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.GOLDENROD.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.WILD_INDIGO.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.TALL_GRASS_0.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.TALL_GRASS_1.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.TALL_GRASS_2.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.HAY_GRASS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.HAY_STRAW.get().asItem());
				tabData.accept(TaleOfBiomesModItems.STRAW.get());
				tabData.accept(TaleOfBiomesModItems.CLAY.get());
				tabData.accept(TaleOfBiomesModItems.QUICKLIME.get());
				tabData.accept(TaleOfBiomesModItems.PHOSPHORITE_GEMSTONE.get());
				tabData.accept(TaleOfBiomesModBlocks.IVY_SHRUB.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.ROSE_SHRUB.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PIRUFF_LEAVES.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.GRASS_BLOCK.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.DIRT.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.FERTILE_SOIL.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.TILLED_SOIL.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.SAND.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.GRAVEL.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.CLAY_BLOCK.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PIRUFF_LOG.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.STRIPPED_PIRUFF_LOG.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.PIRUFF_WOOD.get().asItem());
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
				tabData.accept(TaleOfBiomesModBlocks.PURE_COAL_ORE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.KILN_FURNACE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.BRICKS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.LARGE_BRICKS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.BRICK_STAIRS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.LARGE_BIRCK_STAIRS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.BRICK_SLAB.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.LARGE_BRICK_SLABS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.BRICK_WALL.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.LARGE_BRICK_WALL.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.BRICK_PRESSURE_PLATE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.LARGE_BRICK_PRESSURE_PLATE.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.BRICK_BUTTON.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.LARGE_BRICK_BUTTON.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.THATCH_BLOCK.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.THATCH_STAIRS.get().asItem());
				tabData.accept(TaleOfBiomesModBlocks.THATCH_SLAB.get().asItem());
			})

					.build());
}
