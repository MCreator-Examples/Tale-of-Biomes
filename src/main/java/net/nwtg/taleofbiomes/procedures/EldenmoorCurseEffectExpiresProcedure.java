package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.entity.Entity;

public class EldenmoorCurseEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).CanTravelToEldenmoor) {
			{
				TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
				_vars.CanTravelToEldenmoor = true;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
