package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class TobCommandGetWorldTimeCurrentProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double nTime = 0;
		nTime = world.dayTime() % 24000;
		if (nTime >= 0 && nTime < 1000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Current time: " + "\u00A7f" + "6 am")), false);
		} else if (nTime >= 1000 && nTime < 2000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Current time: " + "\u00A7f" + "7 am")), false);
		} else if (nTime >= 2000 && nTime < 3000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Current time: " + "\u00A7f" + "8 am")), false);
		} else if (nTime >= 3000 && nTime < 4000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Current time: " + "\u00A7f" + "9 am")), false);
		} else if (nTime >= 4000 && nTime < 5000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Current time: " + "\u00A7f" + "10 am")), false);
		} else if (nTime >= 5000 && nTime < 6000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Current time: " + "\u00A7f" + "11 am")), false);
		} else if (nTime >= 6000 && nTime < 7000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Current time: " + "\u00A7f" + "12 pm")), false);
		} else if (nTime >= 7000 && nTime < 8000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Current time: " + "\u00A7f" + "1 pm")), false);
		} else if (nTime >= 8000 && nTime < 9000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Current time: " + "\u00A7f" + "2 pm")), false);
		} else if (nTime >= 9000 && nTime < 10000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Current time: " + "\u00A7f" + "3 pm")), false);
		} else if (nTime >= 10000 && nTime < 11000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Current time: " + "\u00A7f" + "4 pm")), false);
		} else if (nTime >= 11000 && nTime < 12000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Current time: " + "\u00A7f" + "5 pm")), false);
		} else if (nTime >= 12000 && nTime < 13000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Current time: " + "\u00A7f" + "6 pm")), false);
		} else if (nTime >= 13000 && nTime < 14000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Current time: " + "\u00A7f" + "7 pm")), false);
		} else if (nTime >= 14000 && nTime < 15000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Current time: " + "\u00A7f" + "8 pm")), false);
		} else if (nTime >= 15000 && nTime < 16000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Current time: " + "\u00A7f" + "9 pm")), false);
		} else if (nTime >= 16000 && nTime < 17000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Current time: " + "\u00A7f" + "10 pm")), false);
		} else if (nTime >= 17000 && nTime < 18000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Current time: " + "\u00A7f" + "11 pm")), false);
		} else if (nTime >= 18000 && nTime < 19000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Current time: " + "\u00A7f" + "12 am")), false);
		} else if (nTime >= 19000 && nTime < 20000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Current time: " + "\u00A7f" + "1 am")), false);
		} else if (nTime >= 20000 && nTime < 21000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Current time: " + "\u00A7f" + "2 am")), false);
		} else if (nTime >= 21000 && nTime < 22000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Current time: " + "\u00A7f" + "3 am")), false);
		} else if (nTime >= 22000 && nTime < 23000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Current time: " + "\u00A7f" + "4 am")), false);
		} else if (nTime >= 23000 && nTime < 24000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A79" + "Current time: " + "\u00A7f" + "5 am")), false);
		}
	}
}
