package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;

public class SetWorldTimeScriptProcedure {
	public static void execute(LevelAccessor world) {
		double temperature = 0;
		double time = 0;
		double value = 0;
		if (world.dayTime() % 24000 == 6001) {
			TaleOfBiomesModVariables.WorldVariables.get(world).worldTimeTemperature = 6;
			TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
		} else if (world.dayTime() % 24000 == 5001 || world.dayTime() % 24000 == 7001) {
			TaleOfBiomesModVariables.WorldVariables.get(world).worldTimeTemperature = 5;
			TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
		} else if (world.dayTime() % 24000 == 4001 || world.dayTime() % 24000 == 8001) {
			TaleOfBiomesModVariables.WorldVariables.get(world).worldTimeTemperature = 4;
			TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
		} else if (world.dayTime() % 24000 == 3001 || world.dayTime() % 24000 == 9001) {
			TaleOfBiomesModVariables.WorldVariables.get(world).worldTimeTemperature = 3;
			TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
		} else if (world.dayTime() % 24000 == 2001 || world.dayTime() % 24000 == 10001) {
			TaleOfBiomesModVariables.WorldVariables.get(world).worldTimeTemperature = 2;
			TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
		} else if (world.dayTime() % 24000 == 1001 || world.dayTime() % 24000 == 11001) {
			TaleOfBiomesModVariables.WorldVariables.get(world).worldTimeTemperature = 1;
			TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
		} else if (world.dayTime() % 24000 == 1 || world.dayTime() % 24000 == 12001) {
			TaleOfBiomesModVariables.WorldVariables.get(world).worldTimeTemperature = 0;
			TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
		} else if (world.dayTime() % 24000 == 23001 || world.dayTime() % 24000 == 13001) {
			TaleOfBiomesModVariables.WorldVariables.get(world).worldTimeTemperature = -1;
			TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
		} else if (world.dayTime() % 24000 == 22001 || world.dayTime() % 24000 == 14001) {
			TaleOfBiomesModVariables.WorldVariables.get(world).worldTimeTemperature = -2;
			TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
		} else if (world.dayTime() % 24000 == 21001 || world.dayTime() % 24000 == 15001) {
			TaleOfBiomesModVariables.WorldVariables.get(world).worldTimeTemperature = -3;
			TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
		} else if (world.dayTime() % 24000 == 20001 || world.dayTime() % 24000 == 16001) {
			TaleOfBiomesModVariables.WorldVariables.get(world).worldTimeTemperature = -4;
			TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
		} else if (world.dayTime() % 24000 == 19001 || world.dayTime() % 24000 == 17001) {
			TaleOfBiomesModVariables.WorldVariables.get(world).worldTimeTemperature = -5;
			TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
		} else if (world.dayTime() % 24000 == 18001) {
			TaleOfBiomesModVariables.WorldVariables.get(world).worldTimeTemperature = -6;
			TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
