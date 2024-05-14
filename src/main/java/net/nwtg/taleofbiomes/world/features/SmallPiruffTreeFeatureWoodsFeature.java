
package net.nwtg.taleofbiomes.world.features;

import net.nwtg.taleofbiomes.procedures.SmallPiruffTreeFeatureAdditionalGenerationConditionProcedure;

import net.minecraft.world.level.levelgen.feature.configurations.SimpleRandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.SimpleRandomSelectorFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

public class SmallPiruffTreeFeatureWoodsFeature extends SimpleRandomSelectorFeature {
	public SmallPiruffTreeFeatureWoodsFeature() {
		super(SimpleRandomFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<SimpleRandomFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!SmallPiruffTreeFeatureAdditionalGenerationConditionProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
