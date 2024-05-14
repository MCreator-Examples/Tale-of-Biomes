package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.neoforged.neoforge.event.CommandEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerTravelsToADimensionProcedure {
	@SubscribeEvent
	public static void onCommand(CommandEvent event) {
		Entity entity = event.getParseResults().getContext().getSource().getEntity();
		if (entity != null) {
			execute(event, entity.level(), entity, event.getParseResults().getReader().getString());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, String command) {
		execute(null, world, entity, command);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, String command) {
		if (entity == null || command == null)
			return;
		String myCommand = "";
		if (entity instanceof Player || entity instanceof ServerPlayer) {
			myCommand = command;
			if (!((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("tale_of_biomes:eldenmoor")))
					&& myCommand.contains("in " + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "eldenmoor") && myCommand.contains("execute") && myCommand.contains("tp")) {
				InventorySaveNormalScriptProcedure.execute(entity);
				InventoryReplaceEldenmoorScriptProcedure.execute(entity);
			} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("tale_of_biomes:eldenmoor"))
					&& !myCommand.contains("in " + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "eldenmoor") && myCommand.contains("execute") && myCommand.contains("tp")) {
				InventorySaveEldenmoorScriptProcedure.execute(entity);
				InventoryReplaceNormalScriptProcedure.execute(entity);
			}
		}
	}
}
