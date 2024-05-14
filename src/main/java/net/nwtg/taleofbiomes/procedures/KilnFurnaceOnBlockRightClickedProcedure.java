package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.entity.Entity;

public class KilnFurnaceOnBlockRightClickedProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.blockPosX = x;
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.blockPosY = y;
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.blockPosZ = z;
			_vars.syncPlayerVariables(entity);
		}
	}
}
