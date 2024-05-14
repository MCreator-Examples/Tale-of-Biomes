package net.nwtg.taleofbiomes.procedures;

import org.checkerframework.checker.units.qual.s;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class SetWorldSeasonScriptProcedure {
	public static void execute(LevelAccessor world) {
		double randomDirection = 0;
		if (world.dayTime() % 24000 == new Object() {
			double convert(String s) {
				try {
					return Double.parseDouble(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert(new java.text.DecimalFormat("##").format(Mth.nextInt(RandomSource.create(), 1, 20)))) {
			TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonDay = TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonDay + 1;
			TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
			if (TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonDay > TaleOfBiomesModVariables.WorldVariables.get(world).worldMaxSeasonDay) {
				TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonDay = 1;
				TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				if ((TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName).equals("Spring")) {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonTemperature = 15;
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
					TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName = "Summer";
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				} else if ((TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName).equals("Summer")) {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonTemperature = 0;
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
					TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName = "Autumn";
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				} else if ((TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName).equals("Autumn")) {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonTemperature = -15;
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
					TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName = "Winter";
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				} else {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonTemperature = 0;
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
					TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName = "Spring";
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				}
			}
		}
	}
}
