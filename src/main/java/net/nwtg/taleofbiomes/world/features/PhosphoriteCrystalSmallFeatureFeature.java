
package net.nwtg.taleofbiomes.world.features;

import net.nwtg.taleofbiomes.world.features.configurations.StructureFeatureConfiguration;
import net.nwtg.taleofbiomes.procedures.PhosphoriteCrystalSmallAdditionalGenerationConditionProcedure;

import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

public class PhosphoriteCrystalSmallFeatureFeature extends StructureFeature {
	public PhosphoriteCrystalSmallFeatureFeature() {
		super(StructureFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<StructureFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!PhosphoriteCrystalSmallAdditionalGenerationConditionProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
