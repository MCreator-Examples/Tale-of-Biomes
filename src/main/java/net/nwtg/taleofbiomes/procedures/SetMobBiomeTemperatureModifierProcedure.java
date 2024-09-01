package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class SetMobBiomeTemperatureModifierProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double nX = 0;
		double nY = 0;
		double nZ = 0;
		Entity eEntity = null;
		if (!world.isClientSide()) {
			eEntity = entity;
			nX = eEntity.getX();
			nY = eEntity.getY();
			nZ = eEntity.getZ();
			if (world.getBiome(BlockPos.containing(nX, nY, nZ)).is(TagKey.create(Registries.BIOME, new ResourceLocation("tale_of_biomes:temperature/hot")))
					|| world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f > 1.6 && world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f <= 2) {
				eEntity.getPersistentData().putDouble("tobBiomeTemperature", 15);
			} else if (world.getBiome(BlockPos.containing(nX, nY, nZ)).is(TagKey.create(Registries.BIOME, new ResourceLocation("tale_of_biomes:temperature/toasty")))
					|| world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f > 0.8 && world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f <= 1.6) {
				eEntity.getPersistentData().putDouble("tobBiomeTemperature", 10);
			} else if (world.getBiome(BlockPos.containing(nX, nY, nZ)).is(TagKey.create(Registries.BIOME, new ResourceLocation("tale_of_biomes:temperature/chilly")))
					|| world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f < -0.8 && world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f >= -1.6) {
				eEntity.getPersistentData().putDouble("tobBiomeTemperature", 0);
			} else if (world.getBiome(BlockPos.containing(nX, nY, nZ)).is(TagKey.create(Registries.BIOME, new ResourceLocation("tale_of_biomes:temperature/cold")))
					|| world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f < -1.6 && world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f >= -2) {
				eEntity.getPersistentData().putDouble("tobBiomeTemperature", (-5));
			} else {
				eEntity.getPersistentData().putDouble("tobBiomeTemperature", 5);
			}
		}
	}
}
