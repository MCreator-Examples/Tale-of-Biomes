package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class TobCommandGetWorldTemperatureProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(
					Component.literal(("\u00A79World temperature: \u00A7f" + TaleOfBiomesModVariables.WorldVariables.get(world).worldTemperatureC + "C | " + TaleOfBiomesModVariables.WorldVariables.get(world).worldTemperatureF + "F")), false);
	}
}
