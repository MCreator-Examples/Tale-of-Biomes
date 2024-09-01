package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class TobaCommandSetSeasonMsgProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("\u00A76" + "#####" + " \u00A7e" + "TOBA SET SEASON" + " \u00A76" + "#####")), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("\u00A7a" + "spring" + "\u00A7f - " + "Sets the world season to spring.")), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("\u00A7a" + "summer" + "\u00A7f - " + "Sets the world season to summer.")), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("\u00A7a" + "autumn" + "\u00A7f - " + "Sets the world season to autumn.")), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("\u00A7a" + "winter" + "\u00A7f - " + "Sets the world season to winter.")), false);
	}
}
