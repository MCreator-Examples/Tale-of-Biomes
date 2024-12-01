package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

public class PlayerFluidSaturationTimerProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		ItemStack iHead = ItemStack.EMPTY;
		ItemStack iChest = ItemStack.EMPTY;
		ItemStack iLegs = ItemStack.EMPTY;
		ItemStack iBoots = ItemStack.EMPTY;
		if (!(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity)) && !(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
				}
				return false;
			}
		}.checkGamemode(entity))) {
			if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).playerFluid > 0) {
				if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).playerFluidSaturation > 0) {
					{
						TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
						_vars.playerFluidSaturation = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).playerFluidSaturation - 1;
						_vars.syncPlayerVariables(entity);
					}
				} else {
					{
						TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
						_vars.playerFluid = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).playerFluid - 1;
						_vars.syncPlayerVariables(entity);
					}
					{
						TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
						_vars.playerFluidDamageTime = 100;
						_vars.syncPlayerVariables(entity);
					}
					if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).playerFluid > 0) {
						{
							TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
							_vars.playerFluidSaturation = 300;
							_vars.syncPlayerVariables(entity);
						}
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) > 0) {
				if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).playerFluidDamageTime > 0) {
					{
						TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
						_vars.playerFluidDamageTime = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).playerFluidDamageTime - 1;
						_vars.syncPlayerVariables(entity);
					}
				} else {
					{
						TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
						_vars.playerFluidDamageTime = 100;
						_vars.syncPlayerVariables(entity);
					}
					iHead.applyComponents((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getComponents());
					iChest.applyComponents((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getComponents());
					iLegs.applyComponents((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getComponents());
					iBoots.applyComponents((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getComponents());
					entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("tale_of_biomes:dehydration")))), 1);
					(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).setDamageValue(iHead.getDamageValue());
					(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).setDamageValue(iChest.getDamageValue());
					(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).setDamageValue(iLegs.getDamageValue());
					(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).setDamageValue(iBoots.getDamageValue());
				}
			}
		}
	}
}
