package net.nwtg.taleofbiomes.procedures;

import net.neoforged.neoforge.event.TickEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerSleepsAtCustomBedProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("isPlayerSleeping")) {
			if (entity.getPersistentData().getDouble("playerSleepTimer") < 70) {
				entity.getPersistentData().putDouble("playerSleepTimer", (entity.getPersistentData().getDouble("playerSleepTimer") + 1));
			} else {
				entity.getPersistentData().putBoolean("isPlayerSleeping", false);
			}
		}
	}
}
