package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class TobCommandGetWorldSeasonTimeProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("\u00A79Season time: \u00A7f" + new java.text.DecimalFormat("##").format(world.dayTime() % (TaleOfBiomesModVariables.WorldVariables.get(world).worldMaxSeasonDay * 24000)) + "\u00A79/\u00A7f"
					+ new java.text.DecimalFormat("##").format(TaleOfBiomesModVariables.WorldVariables.get(world).worldMaxSeasonDay * 24000))), false);
	}
}
