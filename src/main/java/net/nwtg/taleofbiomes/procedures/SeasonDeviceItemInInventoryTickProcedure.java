package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class SeasonDeviceItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName).equals("Summer")) {
			{
				TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
				_vars.playerSeasonName = "Summer";
				_vars.syncPlayerVariables(entity);
			}
		} else if ((TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName).equals("Autumn")) {
			{
				TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
				_vars.playerSeasonName = "Autumn";
				_vars.syncPlayerVariables(entity);
			}
		} else if ((TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName).equals("Winter")) {
			{
				TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
				_vars.playerSeasonName = "Winter";
				_vars.syncPlayerVariables(entity);
			}
		} else {
			{
				TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
				_vars.playerSeasonName = "Spring";
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
