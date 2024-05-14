package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

public class SeasonDeviceRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (itemstack.getOrCreateTag().getDouble("loreDisplay") < 5) {
				itemstack.getOrCreateTag().putDouble("loreDisplay", (itemstack.getOrCreateTag().getDouble("loreDisplay") + 1));
			} else {
				itemstack.getOrCreateTag().putDouble("loreDisplay", 1);
			}
			if (itemstack.getOrCreateTag().getDouble("loreDisplay") == 1) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A79" + "Season name: " + "\u00A7f" + TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName)), true);
			} else if (itemstack.getOrCreateTag().getDouble("loreDisplay") == 2) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A79" + "Season day: " + "\u00A7f" + TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonDay)), true);
			} else if (itemstack.getOrCreateTag().getDouble("loreDisplay") == 3) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A79" + "Last season day: " + "\u00A7f" + TaleOfBiomesModVariables.WorldVariables.get(world).worldMaxSeasonDay)), true);
			} else if (itemstack.getOrCreateTag().getDouble("loreDisplay") == 4) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A79" + "Temperatre: " + "\u00A7f" + new java.text.DecimalFormat("##.#").format(TaleOfBiomesModVariables.WorldVariables.get(world).worldTemperatureC) + "C | "
							+ new java.text.DecimalFormat("##.#").format(TaleOfBiomesModVariables.WorldVariables.get(world).worldTemperatureF) + "F")), true);
			} else if (itemstack.getOrCreateTag().getDouble("loreDisplay") == 5) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A79" + "Wind speed: " + "\u00A7f" + TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed)), true);
			}
		}
	}
}
