package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SetWorldWindScriptProcedure {
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
		double randomNum = 0;
		double randomSpeed = 0;
		double windTemperature = 0;
		if (!world.isClientSide()) {
			if (world.dayTime() % 24000 == 1) {
				randomNum = Mth.nextInt(RandomSource.create(), 1, 2);
				if ((TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection).equals("North")) {
					if (randomNum == 1) {
						TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection = "West";
						TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
					} else {
						TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection = "East";
						TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
					}
				} else if ((TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection).equals("East")) {
					if (randomNum == 1) {
						TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection = "North";
						TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
					} else {
						TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection = "South";
						TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
					}
				} else if ((TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection).equals("South")) {
					if (randomNum == 1) {
						TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection = "East";
						TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
					} else {
						TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection = "West";
						TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
					}
				} else {
					if (randomNum == 1) {
						TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection = "South";
						TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
					} else {
						TaleOfBiomesModVariables.WorldVariables.get(world).worldWindDirection = "North";
						TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
					}
				}
			}
			if (world.dayTime() % 1000 == 1) {
				randomNum = Mth.nextInt(RandomSource.create(), 1, 3);
				randomSpeed = Mth.nextInt(RandomSource.create(), -1, 1);
				if (TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed <= 3) {
					if (randomNum <= 2) {
						TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed = TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed + 1 + randomSpeed;
						TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
					} else {
						TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed = TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed - 1 + randomSpeed;
						TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
					}
				} else if (TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed >= 7) {
					if (randomNum <= 2) {
						TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed = TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed - 1 + randomSpeed;
						TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
					} else {
						TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed = TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed + 1 + randomSpeed;
						TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
					}
				} else {
					randomNum = Mth.nextInt(RandomSource.create(), 1, 2);
					if (randomNum == 1) {
						TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed = TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed - 1 + randomSpeed;
						TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
					} else {
						TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed = TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed + 1 + randomSpeed;
						TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
					}
				}
				windTemperature = Math.floor(0 - TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed / 2);
				if (windTemperature > TaleOfBiomesModVariables.WorldVariables.get(world).worldMaxWindTemperature) {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldWindTemperature = TaleOfBiomesModVariables.WorldVariables.get(world).worldMaxWindTemperature;
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				} else if (windTemperature < TaleOfBiomesModVariables.WorldVariables.get(world).worldMinWindTemperature) {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldWindTemperature = TaleOfBiomesModVariables.WorldVariables.get(world).worldMinWindTemperature;
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				} else {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldWindTemperature = windTemperature;
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				}
			}
		}
	}
}
