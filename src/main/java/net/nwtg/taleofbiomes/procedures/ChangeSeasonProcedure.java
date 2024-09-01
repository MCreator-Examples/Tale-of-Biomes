package net.nwtg.taleofbiomes.procedures;

import org.checkerframework.checker.units.qual.s;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import javax.annotation.Nullable;

@EventBusSubscriber
public class ChangeSeasonProcedure {
	@SubscribeEvent
	public static void onWorldTick(LevelTickEvent.Post event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		double nTime = 0;
		double nSeasonTime = 0;
		if (GetModSettingsSeasonProgressionEnabledProcedure.execute()) {
			TaleOfBiomesModVariables.WorldVariables.get(world).worldMaxSeasonDay = GetModSettingsSeasonTotalDaysProcedure.execute();
			TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
			nSeasonTime = GetModSettingsSeasonTotalDaysProcedure.execute() * 24000;
			nTime = world.dayTime() % nSeasonTime;
			TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonDay = new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(new java.text.DecimalFormat("##").format((nTime / 1000) / 24 + 1));
			TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
			if (nTime == 1) {
				if ((TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName).equals("Spring")) {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName = "Summer";
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				} else if ((TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName).equals("Summer")) {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName = "Autumn";
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				} else if ((TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName).equals("Autumn")) {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName = "Winter";
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				} else {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName = "Spring";
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				}
				if (TaleOfBiomesModVariables.WorldVariables.get(world).setStartSeason) {
					SetStartSeasonProcedure.execute(world);
				}
			}
		}
	}
}
