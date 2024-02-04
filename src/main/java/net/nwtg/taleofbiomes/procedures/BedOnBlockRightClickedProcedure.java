package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.TaleOfBiomesMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

public class BedOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.dayTime() % 24000 >= 16000) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.setRespawnPosition(_serverPlayer.level().dimension(), BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), _serverPlayer.getYRot(), true, false);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A76[" + entity.getDisplayName().getString() + "]: \u00A7fGetting some sleep... Zzzz...")), true);
			entity.getPersistentData().putBoolean("isPlayerSleeping", true);
			entity.getPersistentData().putDouble("playerSleepTimer", 0);
			TaleOfBiomesMod.queueServerWork(45, () -> {
				if (world instanceof ServerLevel _level)
					_level.setDayTime(0);
			});
		}
	}
}
