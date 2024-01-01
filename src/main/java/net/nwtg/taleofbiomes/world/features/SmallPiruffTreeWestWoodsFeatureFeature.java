
package net.nwtg.taleofbiomes.world.features;

import net.nwtg.taleofbiomes.world.features.configurations.StructureFeatureConfiguration;
import net.nwtg.taleofbiomes.procedures.SmallPiruffTreeAdditionalGenerationConditionProcedure;

import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

public class SmallPiruffTreeWestWoodsFeatureFeature extends StructureFeature {
	public SmallPiruffTreeWestWoodsFeatureFeature() {
		super(StructureFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<StructureFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!SmallPiruffTreeAdditionalGenerationConditionProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
