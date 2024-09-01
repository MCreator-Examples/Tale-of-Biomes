package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class SetPlayerBiomeTemperatureModifierProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		Entity ePlayer = null;
		double nX = 0;
		double nY = 0;
		double nZ = 0;
		ePlayer = entity;
		nX = ePlayer.getX();
		nY = ePlayer.getY();
		nZ = ePlayer.getZ();
		if (world.getBiome(BlockPos.containing(nX, nY, nZ)).is(TagKey.create(Registries.BIOME, new ResourceLocation("tale_of_biomes:temperature/hot")))
				|| world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f > 1.6 && world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f <= 2) {
			{
				TaleOfBiomesModVariables.PlayerVariables _vars = ePlayer.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
				_vars.playerBiomeTemperature = 15;
				_vars.syncPlayerVariables(ePlayer);
			}
		} else if (world.getBiome(BlockPos.containing(nX, nY, nZ)).is(TagKey.create(Registries.BIOME, new ResourceLocation("tale_of_biomes:temperature/toasty")))
				|| world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f > 0.8 && world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f <= 1.6) {
			{
				TaleOfBiomesModVariables.PlayerVariables _vars = ePlayer.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
				_vars.playerBiomeTemperature = 10;
				_vars.syncPlayerVariables(ePlayer);
			}
		} else if (world.getBiome(BlockPos.containing(nX, nY, nZ)).is(TagKey.create(Registries.BIOME, new ResourceLocation("tale_of_biomes:temperature/chilly")))
				|| world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f >= -1.6 && world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f < -0.8) {
			{
				TaleOfBiomesModVariables.PlayerVariables _vars = ePlayer.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
				_vars.playerBiomeTemperature = 0;
				_vars.syncPlayerVariables(ePlayer);
			}
		} else if (world.getBiome(BlockPos.containing(nX, nY, nZ)).is(TagKey.create(Registries.BIOME, new ResourceLocation("tale_of_biomes:temperature/cold")))
				|| world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f >= -2 && world.getBiome(BlockPos.containing(nX, nY, nZ)).value().getBaseTemperature() * 100f < -1.6) {
			{
				TaleOfBiomesModVariables.PlayerVariables _vars = ePlayer.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
				_vars.playerBiomeTemperature = -5;
				_vars.syncPlayerVariables(ePlayer);
			}
		} else {
			{
				TaleOfBiomesModVariables.PlayerVariables _vars = ePlayer.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
				_vars.playerBiomeTemperature = 5;
				_vars.syncPlayerVariables(ePlayer);
			}
		}
	}
}
