
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.nwtg.taleofbiomes.init;

import net.nwtg.taleofbiomes.world.features.SmallPiruffTreeFeatureWoodsFeature;
import net.nwtg.taleofbiomes.world.features.SmallPiruffTreeFeaturePlainsFeature;
import net.nwtg.taleofbiomes.world.features.SmallPiruffTreeFeatureForestFeature;
import net.nwtg.taleofbiomes.world.features.RoseShrubPlant2FeatureFeature;
import net.nwtg.taleofbiomes.world.features.RoseShrubPlant1FeatureFeature;
import net.nwtg.taleofbiomes.world.features.MediumPiruffTreeFeatureWoodsFeature;
import net.nwtg.taleofbiomes.world.features.MediumPiruffTreeFeatureForestFeature;
import net.nwtg.taleofbiomes.world.features.LargePiruffTreeFeatureWoodsFeature;
import net.nwtg.taleofbiomes.world.features.IvyShrubPlant2FeatureFeature;
import net.nwtg.taleofbiomes.world.features.IvyShrubPlant1FeatureFeature;
import net.nwtg.taleofbiomes.world.features.ClayBlockFeatureFeature;
import net.nwtg.taleofbiomes.TaleOfBiomesMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.core.registries.Registries;

public class TaleOfBiomesModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(Registries.FEATURE, TaleOfBiomesMod.MODID);
	public static final DeferredHolder<Feature<?>, Feature<?>> IVY_SHRUB_PLANT_1_FEATURE = REGISTRY.register("ivy_shrub_plant_1_feature", IvyShrubPlant1FeatureFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> IVY_SHRUB_PLANT_2_FEATURE = REGISTRY.register("ivy_shrub_plant_2_feature", IvyShrubPlant2FeatureFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> ROSE_SHRUB_PLANT_1_FEATURE = REGISTRY.register("rose_shrub_plant_1_feature", RoseShrubPlant1FeatureFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> ROSE_SHRUB_PLANT_2_FEATURE = REGISTRY.register("rose_shrub_plant_2_feature", RoseShrubPlant2FeatureFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> CLAY_BLOCK_FEATURE = REGISTRY.register("clay_block_feature", ClayBlockFeatureFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> SMALL_PIRUFF_TREE_FEATURE_FOREST = REGISTRY.register("small_piruff_tree_feature_forest", SmallPiruffTreeFeatureForestFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> MEDIUM_PIRUFF_TREE_FEATURE_FOREST = REGISTRY.register("medium_piruff_tree_feature_forest", MediumPiruffTreeFeatureForestFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> MEDIUM_PIRUFF_TREE_FEATURE_WOODS = REGISTRY.register("medium_piruff_tree_feature_woods", MediumPiruffTreeFeatureWoodsFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> SMALL_PIRUFF_TREE_FEATURE_WOODS = REGISTRY.register("small_piruff_tree_feature_woods", SmallPiruffTreeFeatureWoodsFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> SMALL_PIRUFF_TREE_FEATURE_PLAINS = REGISTRY.register("small_piruff_tree_feature_plains", SmallPiruffTreeFeaturePlainsFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> LARGE_PIRUFF_TREE_FEATURE_WOODS = REGISTRY.register("large_piruff_tree_feature_woods", LargePiruffTreeFeatureWoodsFeature::new);
}
