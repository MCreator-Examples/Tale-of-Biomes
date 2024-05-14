package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.neoforged.neoforge.event.TickEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TravelToEldenmoorProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double yaw = 0;
		double pitch = 0;
		if (!((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("tale_of_biomes:eldenmoor"))) && entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).CanTravelToEldenmoor) {
			yaw = entity.getYRot();
			pitch = entity.getXRot();
			InventorySaveNormalScriptProcedure.execute(entity);
			InventoryReplaceEldenmoorScriptProcedure.execute(entity);
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("execute in " + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "eldenmoor run forceload add ~-1 ~-1 ~1 ~1"));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("execute in " + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "eldenmoor run fill ~-1 ~-1 ~-1 ~1 ~3 ~1 minecraft:air destroy"));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("execute in " + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "eldenmoor run fill ~-1 ~-1 ~-1 ~1 ~-1 ~1 minecraft:oak_planks replace minecraft:air"));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("execute in " + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "eldenmoor run forceload remove ~-1 ~-1 ~1 ~1"));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("execute in " + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "eldenmoor run tp @p ~ ~ ~"));
			{
				Entity _ent = entity;
				_ent.setYRot((float) yaw);
				_ent.setXRot((float) pitch);
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
		}
	}
}
