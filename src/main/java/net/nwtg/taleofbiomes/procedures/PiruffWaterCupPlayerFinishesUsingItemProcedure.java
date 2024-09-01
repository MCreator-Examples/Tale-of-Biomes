package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.entity.Entity;

public class PiruffWaterCupPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.playerFluid = 20;
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.playerFluidDamageTime = 0;
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.playerFluidSaturation = 3000;
			_vars.syncPlayerVariables(entity);
		}
	}
}
