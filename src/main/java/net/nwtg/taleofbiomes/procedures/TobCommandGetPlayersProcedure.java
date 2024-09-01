package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class TobCommandGetPlayersProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("\u00A76" + "#####" + " \u00A7e" + "TOB GET PLAYERS" + " \u00A76" + "#####")), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("\u00A7a" + "<Player Name>" + "\u00A7f - " + "The name of the player.")), false);
	}
}
