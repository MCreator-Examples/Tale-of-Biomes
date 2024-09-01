package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class TobCommandGetWorldWindProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("\u00A76" + "#####" + " \u00A7e" + "TOB GET WORLD WIND" + " \u00A76" + "#####")), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("\u00A7a" + "direction" + "\u00A7f - " + "Get the wind direction.")), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("\u00A7a" + "speed" + "\u00A7f - " + "Get the wind speed.")), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("\u00A7a" + "temperature" + "\u00A7f - " + "Get the wind temperature modifier.")), false);
	}
}
