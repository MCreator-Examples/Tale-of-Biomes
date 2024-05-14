package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class SetWorldWindScriptProcedure {
	public static void execute(LevelAccessor world) {
		double randomNum = 0;
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
			randomNum = Mth.nextInt(RandomSource.create(), 0, 1);
			if (randomNum == 1) {
				if (TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed > 0) {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed = TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed - 1;
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				} else if (TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed < 5) {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed = TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed + 1;
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				}
			} else {
				if (TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed < 5) {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed = TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed + 1;
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				} else if (TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed > 0) {
					TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed = TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed - 1;
					TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				}
			}
			TaleOfBiomesModVariables.WorldVariables.get(world).worldWindTemperature = 0 - TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed;
			TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
