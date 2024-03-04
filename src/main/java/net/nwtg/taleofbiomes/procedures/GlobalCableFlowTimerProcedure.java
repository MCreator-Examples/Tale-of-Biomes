package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

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
