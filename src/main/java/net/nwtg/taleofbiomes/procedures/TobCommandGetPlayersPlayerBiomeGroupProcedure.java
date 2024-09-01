package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.TaleOfBiomesMod;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import com.mojang.brigadier.context.CommandContext;

public class TobCommandGetPlayersPlayerBiomeGroupProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		String sDimension = "";
		sDimension = GetPlayerDimensionTobCommandProcedure.execute(arguments);
		TaleOfBiomesMod.LOGGER.info("\"" + "" + sDimension + "\"");
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
								_ent.level().getServer(), _ent),
						("execute in " + sDimension + " " + "if biome ~ ~ ~ " + "#tale_of_biomes:temperature/hot" + " " + "run tellraw @p "
								+ ("[" + "{\"color\":\"blue\",\"text\":\"Biome group: \"}" + "," + "{\"color\":\"white\",\"text\":\"Hot\"}" + "]")));
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
								_ent.level().getServer(), _ent),
						("execute in " + sDimension + " " + "if biome ~ ~ ~ " + "#tale_of_biomes:temperature/toasty" + " " + "run tellraw @p "
								+ ("[" + "{\"color\":\"blue\",\"text\":\"Biome group: \"}" + "," + "{\"color\":\"white\",\"text\":\"Toasty\"}" + "]")));
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
								_ent.level().getServer(), _ent),
						("execute in " + sDimension + " " + "if biome ~ ~ ~ " + "#tale_of_biomes:temperature/warm" + " " + "run tellraw @p "
								+ ("[" + "{\"color\":\"blue\",\"text\":\"Biome group: \"}" + "," + "{\"color\":\"white\",\"text\":\"Warm\"}" + "]")));
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
								_ent.level().getServer(), _ent),
						("execute in " + sDimension + " " + "if biome ~ ~ ~ " + "#tale_of_biomes:temperature/chilly" + " " + "run tellraw @p "
								+ ("[" + "{\"color\":\"blue\",\"text\":\"Biome group: \"}" + "," + "{\"color\":\"white\",\"text\":\"Chilly\"}" + "]")));
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
								_ent.level().getServer(), _ent),
						("execute in " + sDimension + " " + "if biome ~ ~ ~ " + "#tale_of_biomes:temperature/cold" + " " + "run tellraw @p "
								+ ("[" + "{\"color\":\"blue\",\"text\":\"Biome group: \"}" + "," + "{\"color\":\"white\",\"text\":\"Cold\"}" + "]")));
			}
		}
	}
}
