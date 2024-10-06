package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;
import net.nwtg.taleofbiomes.TaleOfBiomesMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.ArrayList;

public class BedBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().isThundering() || !world.getLevelData().isRaining() && world.dayTime() % 24000 >= 12542 && world.dayTime() % 24000 < 23459
				|| world.getLevelData().isRaining() && world.dayTime() % 24000 >= 12010 && world.dayTime() % 24000 < 23991) {
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), ("spawnpoint @s ~ ~ ~ " + new java.text.DecimalFormat("##.#").format(entity.getYRot())));
				}
			}
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if (entityiterator instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A76[" + entity.getDisplayName().getString() + "]: \u00A7fIs getting some sleep... Zzzz...")), true);
			}
			{
				TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
				_vars.playerIsSleeping = true;
				_vars.syncPlayerVariables(entity);
			}
			TaleOfBiomesModVariables.MapVariables.get(world).isPlayerSleeping = true;
			TaleOfBiomesModVariables.MapVariables.get(world).syncData(world);
			TaleOfBiomesModVariables.MapVariables.get(world).playerSleepTimer = 0;
			TaleOfBiomesModVariables.MapVariables.get(world).syncData(world);
			TaleOfBiomesMod.queueServerWork(45, () -> {
				if (world.dayTime() % 24000 >= 0 && world.dayTime() % 24000 < 1000) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute in minecraft:overworld run time add 24000t");
				} else if (world.dayTime() % 24000 >= 1000 && world.dayTime() % 24000 < 2000) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute in minecraft:overworld run time add 23000t");
				} else if (world.dayTime() % 24000 >= 2000 && world.dayTime() % 24000 < 3000) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute in minecraft:overworld run time add 22000t");
				} else if (world.dayTime() % 24000 >= 3000 && world.dayTime() % 24000 < 4000) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute in minecraft:overworld run time add 21000t");
				} else if (world.dayTime() % 24000 >= 4000 && world.dayTime() % 24000 < 5000) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute in minecraft:overworld run time add 20000t");
				} else if (world.dayTime() % 24000 >= 5000 && world.dayTime() % 24000 < 6000) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute in minecraft:overworld run time add 19000t");
				} else if (world.dayTime() % 24000 >= 6000 && world.dayTime() % 24000 < 7000) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute in minecraft:overworld run time add 18000t");
				} else if (world.dayTime() % 24000 >= 7000 && world.dayTime() % 24000 < 8000) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute in minecraft:overworld run time add 17000t");
				} else if (world.dayTime() % 24000 >= 8000 && world.dayTime() % 24000 < 9000) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute in minecraft:overworld run time add 16000t");
				} else if (world.dayTime() % 24000 >= 9000 && world.dayTime() % 24000 < 10000) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute in minecraft:overworld run time add 15000t");
				} else if (world.dayTime() % 24000 >= 10000 && world.dayTime() % 24000 < 11000) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute in minecraft:overworld run time add 14000t");
				} else if (world.dayTime() % 24000 >= 11000 && world.dayTime() % 24000 < 12000) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute in minecraft:overworld run time add 13000t");
				} else if (world.dayTime() % 24000 >= 12000 && world.dayTime() % 24000 < 13000) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute in minecraft:overworld run time add 12000t");
				} else if (world.dayTime() % 24000 >= 13000 && world.dayTime() % 24000 < 14000) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute in minecraft:overworld run time add 11000t");
				} else if (world.dayTime() % 24000 >= 14000 && world.dayTime() % 24000 < 15000) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute in minecraft:overworld run time add 10000t");
				} else if (world.dayTime() % 24000 >= 15000 && world.dayTime() % 24000 < 16000) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute in minecraft:overworld run time add 9000t");
				} else if (world.dayTime() % 24000 >= 16000 && world.dayTime() % 24000 < 17000) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute in minecraft:overworld run time add 8000t");
				} else if (world.dayTime() % 24000 >= 17000 && world.dayTime() % 24000 < 18000) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute in minecraft:overworld run time add 7000t");
				} else if (world.dayTime() % 24000 >= 18000 && world.dayTime() % 24000 < 19000) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute in minecraft:overworld run time add 6000t");
				} else if (world.dayTime() % 24000 >= 19000 && world.dayTime() % 24000 < 20000) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute in minecraft:overworld run time add 5000t");
				} else if (world.dayTime() % 24000 >= 20000 && world.dayTime() % 24000 < 21000) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute in minecraft:overworld run time add 4000t");
				} else if (world.dayTime() % 24000 >= 21000 && world.dayTime() % 24000 < 22000) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute in minecraft:overworld run time add 3000t");
				} else if (world.dayTime() % 24000 >= 22000 && world.dayTime() % 24000 < 23000) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute in minecraft:overworld run time add 2000t");
				} else if (world.dayTime() % 24000 >= 23000 && world.dayTime() % 24000 < 24000) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute in minecraft:overworld run time add 1000t");
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("execute in minecraft:overworld run weather clear " + new java.text.DecimalFormat("##").format(24000 * Mth.nextInt(RandomSource.create(), 1, 7)) + "t"));
			});
			TaleOfBiomesMod.queueServerWork(70, () -> {
				{
					TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
					_vars.playerIsSleeping = false;
					_vars.syncPlayerVariables(entity);
				}
			});
		} else {
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), ("spawnpoint @s ~ ~ ~ " + new java.text.DecimalFormat("##.#").format(entity.getYRot())));
				}
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A76[" + entity.getDisplayName().getString() + "]: \u00A7fSpawn point set!")), true);
		}
	}
}
