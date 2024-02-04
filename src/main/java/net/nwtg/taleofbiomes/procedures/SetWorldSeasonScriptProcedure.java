package net.nwtg.taleofbiomes.procedures;

import org.checkerframework.checker.units.qual.s;

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
public class SetWorldSeasonScriptProcedure {
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
			if (world.dayTime() % 24000 == new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(new java.text.DecimalFormat("##").format(Mth.nextInt(RandomSource.create(), 1, 20)))) {
				if (TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonDay >= TaleOfBiomesModVariables.WorldVariables.get(world).worldMaxSeasonDay) {
					if ((TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName).equals("Spring")) {
						TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName = "Summer";
						TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
						TaleOfBiomesModVariables.WorldVariables.get(world).worldMinSeasonTemperature = Mth.nextInt(RandomSource.create(), 0, 5);
						TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
					} else if ((TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName).equals("Summer")) {
						TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName = "Autumn";
						TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
						TaleOfBiomesModVariables.WorldVariables.get(world).worldMinSeasonTemperature = Mth.nextInt(RandomSource.create(), -5, 0);
						TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
					} else if ((TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName).equals("Autumn")) {
						TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName = "Winter";
						TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
						TaleOfBiomesModVariables.WorldVariables.get(world).worldMinSeasonTemperature = Mth.nextInt(RandomSource.create(), -10, -5);
						TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
					} else {
						TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName = "Spring";
						TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
						TaleOfBiomesModVariables.WorldVariables.get(world).worldMinSeasonTemperature = Mth.nextInt(RandomSource.create(), -5, 0);
						TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
					}
					TaleOfBiomesModVariables.WorldVariables.get(world).worldMaxSeasonTemperature = Mth.nextInt(RandomSource.create(), (int) (TaleOfBiomesModVariables.WorldVariables.get(world).worldMinSeasonTemperature + 1),
							(int) (TaleOfBiomesModVariables.WorldVariables.get(world).worldMinSeasonTemperature + 5));
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
					TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonTemperature = Mth.nextInt(RandomSource.create(), (int) TaleOfBiomesModVariables.WorldVariables.get(world).worldMinSeasonTemperature,
							(int) TaleOfBiomesModVariables.WorldVariables.get(world).worldMaxSeasonTemperature);
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
					TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonDay = 1;
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				} else {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonDay = TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonDay + 1;
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
					TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonTemperature = Mth.nextInt(RandomSource.create(), (int) TaleOfBiomesModVariables.WorldVariables.get(world).worldMinSeasonTemperature,
							(int) TaleOfBiomesModVariables.WorldVariables.get(world).worldMaxSeasonTemperature);
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				}
			}
		}
	}
}
