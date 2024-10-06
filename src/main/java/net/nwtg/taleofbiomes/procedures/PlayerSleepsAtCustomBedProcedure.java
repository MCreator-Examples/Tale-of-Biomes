package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;

public class PlayerSleepsAtCustomBedProcedure {
	public static void execute(LevelAccessor world) {
		if (TaleOfBiomesModVariables.MapVariables.get(world).isPlayerSleeping) {
			if (TaleOfBiomesModVariables.MapVariables.get(world).playerSleepTimer < 70) {
				TaleOfBiomesModVariables.MapVariables.get(world).playerSleepTimer = TaleOfBiomesModVariables.MapVariables.get(world).playerSleepTimer + 1;
				TaleOfBiomesModVariables.MapVariables.get(world).syncData(world);
			} else {
				TaleOfBiomesModVariables.MapVariables.get(world).playerSleepTimer = 0;
				TaleOfBiomesModVariables.MapVariables.get(world).syncData(world);
				TaleOfBiomesModVariables.MapVariables.get(world).isPlayerSleeping = false;
				TaleOfBiomesModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
