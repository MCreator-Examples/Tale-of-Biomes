package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.neoforged.neoforge.event.TickEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GlobalCableFlowTimerProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (!world.isClientSide()) {
			if (TaleOfBiomesModVariables.MapVariables.get(world).forgeFlow == 0) {
				TaleOfBiomesModVariables.MapVariables.get(world).forgeFlow = 300;
				TaleOfBiomesModVariables.MapVariables.get(world).syncData(world);
			} else {
				TaleOfBiomesModVariables.MapVariables.get(world).forgeFlow = TaleOfBiomesModVariables.MapVariables.get(world).forgeFlow - 1;
				TaleOfBiomesModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
