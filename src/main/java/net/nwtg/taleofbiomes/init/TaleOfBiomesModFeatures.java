
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.nwtg.taleofbiomes.init;

import net.nwtg.taleofbiomes.world.features.SmallPiruffTreeWestWoodsFeatureFeature;
import net.nwtg.taleofbiomes.world.features.SmallPiruffTreeWestForestFeatureFeature;
import net.nwtg.taleofbiomes.world.features.SmallPiruffTreeWestFeatureFeature;
import net.nwtg.taleofbiomes.world.features.SmallPiruffTreeSouthWoodsFeatureFeature;
import net.nwtg.taleofbiomes.world.features.SmallPiruffTreeSouthForestFeatureFeature;
import net.nwtg.taleofbiomes.world.features.SmallPiruffTreeSouthFeatureFeature;
import net.nwtg.taleofbiomes.world.features.SmallPiruffTreeNorthWoodsFeatureFeature;
import net.nwtg.taleofbiomes.world.features.SmallPiruffTreeNorthForestFeatureFeature;
import net.nwtg.taleofbiomes.world.features.SmallPiruffTreeNorthFeatureFeature;
import net.nwtg.taleofbiomes.world.features.SmallPiruffTreeEastWoodsFeatureFeature;
import net.nwtg.taleofbiomes.world.features.SmallPiruffTreeEastForestFeatureFeature;
import net.nwtg.taleofbiomes.world.features.SmallPiruffTreeEastFeatureFeature;
import net.nwtg.taleofbiomes.world.features.RoseShrubPlant2FeatureFeature;
import net.nwtg.taleofbiomes.world.features.RoseShrubPlant1FeatureFeature;
import net.nwtg.taleofbiomes.world.features.PiruffTreeWestWoodsFeatureFeature;
import net.nwtg.taleofbiomes.world.features.PiruffTreeWestFeatureFeature;
import net.nwtg.taleofbiomes.world.features.PiruffTreeSouthWoodsFeatureFeature;
import net.nwtg.taleofbiomes.world.features.PiruffTreeSouthFeatureFeature;
import net.nwtg.taleofbiomes.world.features.PiruffTreeNorthWoodsFeatureFeature;
import net.nwtg.taleofbiomes.world.features.PiruffTreeNorthFeatureFeature;
import net.nwtg.taleofbiomes.world.features.PiruffTreeEastWoodsFeatureFeature;
import net.nwtg.taleofbiomes.world.features.PiruffTreeEastFeatureFeature;
import net.nwtg.taleofbiomes.world.features.PhosphoriteCrystalSmallFeatureFeature;
import net.nwtg.taleofbiomes.world.features.PhosphoriteCrystalLaregeFeatureFeature;
import net.nwtg.taleofbiomes.world.features.IvyShrubPlant2FeatureFeature;
import net.nwtg.taleofbiomes.world.features.IvyShrubPlant1FeatureFeature;
import net.nwtg.taleofbiomes.world.features.ClayBlockFeatureFeature;
import net.nwtg.taleofbiomes.TaleOfBiomesMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class TaleOfBiomesModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TaleOfBiomesMod.MODID);
	public static final RegistryObject<Feature<?>> IVY_SHRUB_PLANT_1_FEATURE = REGISTRY.register("ivy_shrub_plant_1_feature", IvyShrubPlant1FeatureFeature::new);
	public static final RegistryObject<Feature<?>> IVY_SHRUB_PLANT_2_FEATURE = REGISTRY.register("ivy_shrub_plant_2_feature", IvyShrubPlant2FeatureFeature::new);
	public static final RegistryObject<Feature<?>> ROSE_SHRUB_PLANT_1_FEATURE = REGISTRY.register("rose_shrub_plant_1_feature", RoseShrubPlant1FeatureFeature::new);
	public static final RegistryObject<Feature<?>> ROSE_SHRUB_PLANT_2_FEATURE = REGISTRY.register("rose_shrub_plant_2_feature", RoseShrubPlant2FeatureFeature::new);
	public static final RegistryObject<Feature<?>> PHOSPHORITE_CRYSTAL_LAREGE_FEATURE = REGISTRY.register("phosphorite_crystal_larege_feature", PhosphoriteCrystalLaregeFeatureFeature::new);
	public static final RegistryObject<Feature<?>> PHOSPHORITE_CRYSTAL_SMALL_FEATURE = REGISTRY.register("phosphorite_crystal_small_feature", PhosphoriteCrystalSmallFeatureFeature::new);
	public static final RegistryObject<Feature<?>> PIRUFF_TREE_EAST_FEATURE = REGISTRY.register("piruff_tree_east_feature", PiruffTreeEastFeatureFeature::new);
	public static final RegistryObject<Feature<?>> PIRUFF_TREE_NORTH_FEATURE = REGISTRY.register("piruff_tree_north_feature", PiruffTreeNorthFeatureFeature::new);
	public static final RegistryObject<Feature<?>> PIRUFF_TREE_SOUTH_FEATURE = REGISTRY.register("piruff_tree_south_feature", PiruffTreeSouthFeatureFeature::new);
	public static final RegistryObject<Feature<?>> PIRUFF_TREE_WEST_FEATURE = REGISTRY.register("piruff_tree_west_feature", PiruffTreeWestFeatureFeature::new);
	public static final RegistryObject<Feature<?>> SMALL_PIRUFF_TREE_EAST_FEATURE = REGISTRY.register("small_piruff_tree_east_feature", SmallPiruffTreeEastFeatureFeature::new);
	public static final RegistryObject<Feature<?>> SMALL_PIRUFF_TREE_NORTH_FEATURE = REGISTRY.register("small_piruff_tree_north_feature", SmallPiruffTreeNorthFeatureFeature::new);
	public static final RegistryObject<Feature<?>> SMALL_PIRUFF_TREE_SOUTH_FEATURE = REGISTRY.register("small_piruff_tree_south_feature", SmallPiruffTreeSouthFeatureFeature::new);
	public static final RegistryObject<Feature<?>> SMALL_PIRUFF_TREE_WEST_FEATURE = REGISTRY.register("small_piruff_tree_west_feature", SmallPiruffTreeWestFeatureFeature::new);
	public static final RegistryObject<Feature<?>> PIRUFF_TREE_WEST_WOODS_FEATURE = REGISTRY.register("piruff_tree_west_woods_feature", PiruffTreeWestWoodsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> PIRUFF_TREE_SOUTH_WOODS_FEATURE = REGISTRY.register("piruff_tree_south_woods_feature", PiruffTreeSouthWoodsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> PIRUFF_TREE_NORTH_WOODS_FEATURE = REGISTRY.register("piruff_tree_north_woods_feature", PiruffTreeNorthWoodsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> PIRUFF_TREE_EAST_WOODS_FEATURE = REGISTRY.register("piruff_tree_east_woods_feature", PiruffTreeEastWoodsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> SMALL_PIRUFF_TREE_EAST_WOODS_FEATURE = REGISTRY.register("small_piruff_tree_east_woods_feature", SmallPiruffTreeEastWoodsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> SMALL_PIRUFF_TREE_NORTH_WOODS_FEATURE = REGISTRY.register("small_piruff_tree_north_woods_feature", SmallPiruffTreeNorthWoodsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> SMALL_PIRUFF_TREE_SOUTH_WOODS_FEATURE = REGISTRY.register("small_piruff_tree_south_woods_feature", SmallPiruffTreeSouthWoodsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> SMALL_PIRUFF_TREE_WEST_WOODS_FEATURE = REGISTRY.register("small_piruff_tree_west_woods_feature", SmallPiruffTreeWestWoodsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> SMALL_PIRUFF_TREE_EAST_FOREST_FEATURE = REGISTRY.register("small_piruff_tree_east_forest_feature", SmallPiruffTreeEastForestFeatureFeature::new);
	public static final RegistryObject<Feature<?>> SMALL_PIRUFF_TREE_NORTH_FOREST_FEATURE = REGISTRY.register("small_piruff_tree_north_forest_feature", SmallPiruffTreeNorthForestFeatureFeature::new);
	public static final RegistryObject<Feature<?>> SMALL_PIRUFF_TREE_SOUTH_FOREST_FEATURE = REGISTRY.register("small_piruff_tree_south_forest_feature", SmallPiruffTreeSouthForestFeatureFeature::new);
	public static final RegistryObject<Feature<?>> SMALL_PIRUFF_TREE_WEST_FOREST_FEATURE = REGISTRY.register("small_piruff_tree_west_forest_feature", SmallPiruffTreeWestForestFeatureFeature::new);
	public static final RegistryObject<Feature<?>> CLAY_BLOCK_FEATURE = REGISTRY.register("clay_block_feature", ClayBlockFeatureFeature::new);
}
