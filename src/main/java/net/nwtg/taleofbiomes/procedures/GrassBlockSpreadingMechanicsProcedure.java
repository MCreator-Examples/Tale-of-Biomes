package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class GrassBlockSpreadingMechanicsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double posX = 0;
		double posY = 0;
		double posZ = 0;
		boolean foundBlock = false;
		if (!world.isClientSide()) {
			posX = x - 1;
			posY = y - 2;
			posZ = z - 1;
			if (world instanceof Level _lvl1 && _lvl1.isDay()) {
				for (int index0 = 0; index0 < 5; index0++) {
					for (int index1 = 0; index1 < 3; index1++) {
						for (int index2 = 0; index2 < 3; index2++) {
							if ((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.DIRT.get()
									&& (world.getMaxLocalRawBrightness(BlockPos.containing(posX, posY + 1, posZ)) >= 8 || (world.getBlockState(BlockPos.containing(posX, posY + 1, posZ))).is(BlockTags.create(ResourceLocation.parse("minecraft:air")))
											|| !world.getBlockState(BlockPos.containing(posX, posY + 1, posZ)).isFaceSturdy(world, BlockPos.containing(posX, posY + 1, posZ), Direction.DOWN))) {
								foundBlock = true;
								break;
							}
							posZ = posZ + 1;
						}
						if (foundBlock) {
							break;
						}
						posZ = z - 1;
						posX = posX + 1;
					}
					if (foundBlock) {
						break;
					}
					posZ = z - 1;
					posX = x - 1;
					posY = posY + 1;
				}
				if (foundBlock) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(posX, posY, posZ), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute if loaded ~ ~ ~ run setblock ~ ~ ~ tale_of_biomes:grass_block replace");
				}
			}
			if (world instanceof Level _lvl9 && _lvl9.isDay() && !world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z)) && world.getMaxLocalRawBrightness(BlockPos.containing(x, y + 1, z)) < 8
					|| !(world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:air")))
							&& world.getBlockState(BlockPos.containing(x, y + 1, z)).isFaceSturdy(world, BlockPos.containing(x, y + 1, z), Direction.DOWN)) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"execute if loaded ~ ~ ~ run setblock ~ ~ ~ tale_of_biomes:dirt replace");
			}
		}
	}
}
