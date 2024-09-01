package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;

public class GlobalPlantTimerProcedure {
	public static void execute(LevelAccessor world) {
		if (TaleOfBiomesModVariables.MapVariables.get(world).gnPlantTimer <= 0) {
			TaleOfBiomesModVariables.MapVariables.get(world).gnPlantTimer = 1200;
			TaleOfBiomesModVariables.MapVariables.get(world).syncData(world);
		} else {
			TaleOfBiomesModVariables.MapVariables.get(world).gnPlantTimer = TaleOfBiomesModVariables.MapVariables.get(world).gnPlantTimer - 1;
			TaleOfBiomesModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
