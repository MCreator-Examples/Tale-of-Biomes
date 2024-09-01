package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class TobCommandGetWorldProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("\u00A76" + "#####" + " \u00A7e" + "TOB GET WORLD" + " \u00A76" + "#####")), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("\u00A7a" + "season" + "\u00A7f - " + "Gets information about the world season.")), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("\u00A7a" + "temperature" + "\u00A7f - " + "Gets the total world temperature.")), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("\u00A7a" + "time" + "\u00A7f - " + "Gets information about the world time.")), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("\u00A7a" + "weather" + "\u00A7f - " + "Gets information about the world weather.")), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("\u00A7a" + "wind" + "\u00A7f - " + "Gets information about the world wind.")), false);
	}
}
