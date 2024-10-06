package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class SleepingEffect4DisplayOverlayIngameProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		return entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).playerIsSleeping && TaleOfBiomesModVariables.MapVariables.get(world).isPlayerSleeping && TaleOfBiomesModVariables.MapVariables.get(world).playerSleepTimer >= 37
				&& TaleOfBiomesModVariables.MapVariables.get(world).playerSleepTimer <= 48;
	}
}
