package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import javax.annotation.Nullable;

@EventBusSubscriber
public class ChangeWindDirectionProcedure {
	@SubscribeEvent
	public static void onWorldTick(LevelTickEvent.Post event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		double nTime = 0;
		double nRandom = 0;
		if (world.dayTime() % 12000 == 1) {
			if ((TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection).equals("North")) {
				nRandom = Mth.nextInt(RandomSource.create(), 1, 2);
				if (nRandom == 1) {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection = "East";
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				} else if (nRandom == 2) {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection = "West";
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				}
			} else if ((TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection).equals("East")) {
				nRandom = Mth.nextInt(RandomSource.create(), 1, 2);
				if (nRandom == 1) {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection = "South";
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				} else if (nRandom == 2) {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection = "North";
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				}
			} else if ((TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection).equals("South")) {
				nRandom = Mth.nextInt(RandomSource.create(), 1, 2);
				if (nRandom == 1) {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection = "West";
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				} else if (nRandom == 2) {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection = "East";
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				}
			} else if ((TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection).equals("West")) {
				nRandom = Mth.nextInt(RandomSource.create(), 1, 2);
				if (nRandom == 1) {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection = "North";
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				} else if (nRandom == 2) {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection = "South";
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				}
			} else {
				nRandom = Mth.nextInt(RandomSource.create(), 1, 4);
				if (nRandom == 1) {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection = "North";
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				} else if (nRandom == 2) {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection = "East";
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				} else if (nRandom == 3) {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection = "South";
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				} else if (nRandom == 4) {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection = "West";
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				}
			}
		}
	}
}
