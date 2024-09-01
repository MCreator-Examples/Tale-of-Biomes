package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class GrassBlockPlantGrowthMechanicsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double plantDelay = 0;
		double plantCount = 0;
		double posX = 0;
		double posY = 0;
		double posZ = 0;
		double randomBlock = 0;
		if (!world.isClientSide() && TaleOfBiomesModVariables.MapVariables.get(world).gnPlantTimer == 0 && (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:air")))) {
			posX = x - 2;
			posY = y - 2;
			posZ = z - 2;
			for (int index0 = 0; index0 < 5; index0++) {
				for (int index1 = 0; index1 < 5; index1++) {
					for (int index2 = 0; index2 < 5; index2++) {
						if ((world.getBlockState(BlockPos.containing(posX, posY, posZ)))
								.is(BlockTags.create(new ResourceLocation(((TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "grass_blocks")).toLowerCase(java.util.Locale.ENGLISH))))
								&& (world.getBlockState(BlockPos.containing(posX, posY + 1, posZ)))
										.is(BlockTags.create(new ResourceLocation(((TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "grass_plants")).toLowerCase(java.util.Locale.ENGLISH))))) {
							plantCount = plantCount + 1;
						}
						posZ = posZ + 1;
					}
					posZ = z - 2;
					posX = posX + 1;
				}
				posX = x - 2;
				posY = posY + 1;
			}
			if (IsInEldenmoorDimensionProcedure.execute(world)
					&& (world.getBiome(BlockPos.containing(x, y + 1, z))
							.is(TagKey.create(Registries.BIOME, new ResourceLocation(((TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "grass_growth/dense")).toLowerCase(java.util.Locale.ENGLISH)))) && plantCount <= 12
							|| world.getBiome(BlockPos.containing(x, y + 1, z))
									.is(TagKey.create(Registries.BIOME, new ResourceLocation(((TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "grass_growth/moderate")).toLowerCase(java.util.Locale.ENGLISH)))) && plantCount <= 6
							|| world.getBiome(BlockPos.containing(x, y + 1, z))
									.is(TagKey.create(Registries.BIOME, new ResourceLocation(((TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "grass_growth/light")).toLowerCase(java.util.Locale.ENGLISH)))) && plantCount <= 3)
					|| !IsInEldenmoorDimensionProcedure.execute(world) && plantCount <= 6) {
				if (world.getBiome(BlockPos.containing(x, y + 1, z))
						.is(TagKey.create(Registries.BIOME, new ResourceLocation(((TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "eldenmoor/flower_plains")).toLowerCase(java.util.Locale.ENGLISH))))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 1), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("execute if loaded ~ ~ ~ run setblock ~ ~ ~ " + BuiltInRegistries.BLOCK.getKey((BuiltInRegistries.BLOCK
										.getOrCreateTag(BlockTags.create(new ResourceLocation(((TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "grass_growth/flower_plains")).toLowerCase(java.util.Locale.ENGLISH))))
										.getRandomElement(RandomSource.create()).orElseGet(() -> BuiltInRegistries.BLOCK.wrapAsHolder(Blocks.AIR)).value())).toString() + " replace"));
				} else {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 1), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("execute if loaded ~ ~ ~ run setblock ~ ~ ~ " + BuiltInRegistries.BLOCK.getKey((BuiltInRegistries.BLOCK
										.getOrCreateTag(BlockTags.create(new ResourceLocation(((TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "grass_growth/defualt")).toLowerCase(java.util.Locale.ENGLISH))))
										.getRandomElement(RandomSource.create()).orElseGet(() -> BuiltInRegistries.BLOCK.wrapAsHolder(Blocks.AIR)).value())).toString() + " replace"));
				}
			}
		}
	}
}
