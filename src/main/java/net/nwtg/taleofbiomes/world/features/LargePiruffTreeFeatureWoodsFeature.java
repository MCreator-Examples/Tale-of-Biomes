
package net.nwtg.taleofbiomes.world.features;

import net.nwtg.taleofbiomes.procedures.LargePiruffTreeFeatureAdditionalGenerationConditionProcedure;

import net.minecraft.world.level.levelgen.feature.configurations.SimpleRandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.SimpleRandomSelectorFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

public class LargePiruffTreeFeatureWoodsFeature extends SimpleRandomSelectorFeature {
	public LargePiruffTreeFeatureWoodsFeature() {
		super(SimpleRandomFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<SimpleRandomFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!LargePiruffTreeFeatureAdditionalGenerationConditionProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
