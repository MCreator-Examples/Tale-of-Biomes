package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class TobCommandGetWorldWeatherCurrentProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().isRaining() && world.getLevelData().isThundering()) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Weather: " + "\u00A7f" + "Raining & Thundering")), false);
		} else if (!world.getLevelData().isRaining() && world.getLevelData().isThundering()) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Weather: " + "\u00A7f" + "Thundering")), false);
		} else if (world.getLevelData().isRaining() && !world.getLevelData().isThundering()) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Weather: " + "\u00A7f" + "Raining")), false);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A76" + "Weather: " + "\u00A7f" + "Clear")), false);
		}
	}
}
