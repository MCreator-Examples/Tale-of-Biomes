package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class SetMobHeightTemperatureModifierProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double nlevel = 0;
		double nTemperature = 0;
		double nX = 0;
		double nY = 0;
		double nZ = 0;
		boolean bAbove = false;
		boolean bMid = false;
		Entity eEntity = null;
		if (!world.isClientSide()) {
			eEntity = entity;
			nX = eEntity.getX();
			nY = eEntity.getY();
			nZ = eEntity.getZ();
			nTemperature = 0;
			nlevel = 63;
			for (int index0 = 0; index0 < 10; index0++) {
				if (nY >= nlevel && nY < nlevel + 30) {
					bAbove = true;
					break;
				}
				nlevel = nlevel + 30;
				nTemperature = nTemperature - 1;
			}
			if (!bAbove) {
				nTemperature = 0;
				nlevel = 62;
				for (int index1 = 0; index1 < 2; index1++) {
					if (nY >= nlevel && nY < nlevel + 30) {
						bMid = true;
						break;
					}
					nlevel = nlevel - 30;
					nTemperature = nTemperature - 1;
				}
			}
			if (!bAbove && !bMid) {
				nTemperature = -3;
				nlevel = 1;
				for (int index2 = 0; index2 < 4; index2++) {
					if (nY >= nlevel && nY < nlevel + 30) {
						break;
					}
					nlevel = nlevel - 30;
					nTemperature = nTemperature + 1;
				}
			}
			if (nTemperature > 10) {
				nTemperature = 10;
			} else if (nTemperature < -10) {
				nTemperature = -10;
			}
			if (world.getLevelData().isRaining() && (nY >= -64 && world.getBiome(BlockPos.containing(nX, nY, nZ)).is(TagKey.create(Registries.BIOME, new ResourceLocation("tale_of_biomes:temperature/cold")))
					|| nY >= 133 && world.getBiome(BlockPos.containing(nX, nY, nZ)).is(TagKey.create(Registries.BIOME, new ResourceLocation("tale_of_biomes:temperature/chilly")))
					|| nY >= 153 && world.getBiome(BlockPos.containing(nX, nY, nZ)).is(TagKey.create(Registries.BIOME, new ResourceLocation("tale_of_biomes:temperature/warm")))
					|| nY >= 193 && world.getBiome(BlockPos.containing(nX, nY, nZ)).is(TagKey.create(Registries.BIOME, new ResourceLocation("tale_of_biomes:temperature/toasty")))
					|| nY >= 320 && world.getBiome(BlockPos.containing(nX, nY, nZ)).is(TagKey.create(Registries.BIOME, new ResourceLocation("tale_of_biomes:temperature/hot")))
					|| nY >= -64 && world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f < -1.6
					|| nY >= 133 && world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f >= -1.6 && world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f < -0.8
					|| nY >= 153 && world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f >= -0.8 && world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f <= 0.8
					|| nY >= 193 && world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f > 0.8 && world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f <= 1.6
					|| nY >= 320 && world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f > 1.6)) {
				nTemperature = nTemperature - 1;
			}
			eEntity.getPersistentData().putDouble("tobHeightTemperature", nTemperature);
		}
	}
}
