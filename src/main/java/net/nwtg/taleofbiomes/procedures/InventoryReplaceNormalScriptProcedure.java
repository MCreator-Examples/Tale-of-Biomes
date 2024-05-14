package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

public class InventoryReplaceNormalScriptProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot0.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot0.getCount());
			_modHandlerEntSetSlot.setStackInSlot(0, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot1.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot1.getCount());
			_modHandlerEntSetSlot.setStackInSlot(1, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot2.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot2.getCount());
			_modHandlerEntSetSlot.setStackInSlot(2, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot3.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot3.getCount());
			_modHandlerEntSetSlot.setStackInSlot(3, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot4.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot4.getCount());
			_modHandlerEntSetSlot.setStackInSlot(4, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot5.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot5.getCount());
			_modHandlerEntSetSlot.setStackInSlot(5, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot6.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot6.getCount());
			_modHandlerEntSetSlot.setStackInSlot(6, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot7.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot7.getCount());
			_modHandlerEntSetSlot.setStackInSlot(7, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot8.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot8.getCount());
			_modHandlerEntSetSlot.setStackInSlot(8, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot9.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot9.getCount());
			_modHandlerEntSetSlot.setStackInSlot(9, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot10.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot10.getCount());
			_modHandlerEntSetSlot.setStackInSlot(10, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot11.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot11.getCount());
			_modHandlerEntSetSlot.setStackInSlot(11, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot12.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot12.getCount());
			_modHandlerEntSetSlot.setStackInSlot(12, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot13.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot13.getCount());
			_modHandlerEntSetSlot.setStackInSlot(13, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot14.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot14.getCount());
			_modHandlerEntSetSlot.setStackInSlot(14, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot15.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot15.getCount());
			_modHandlerEntSetSlot.setStackInSlot(15, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot16.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot16.getCount());
			_modHandlerEntSetSlot.setStackInSlot(16, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot17.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot17.getCount());
			_modHandlerEntSetSlot.setStackInSlot(17, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot18.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot18.getCount());
			_modHandlerEntSetSlot.setStackInSlot(18, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot19.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot19.getCount());
			_modHandlerEntSetSlot.setStackInSlot(19, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot20.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot20.getCount());
			_modHandlerEntSetSlot.setStackInSlot(20, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot21.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot21.getCount());
			_modHandlerEntSetSlot.setStackInSlot(21, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot22.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot22.getCount());
			_modHandlerEntSetSlot.setStackInSlot(22, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot23.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot23.getCount());
			_modHandlerEntSetSlot.setStackInSlot(23, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot24.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot24.getCount());
			_modHandlerEntSetSlot.setStackInSlot(24, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot25.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot25.getCount());
			_modHandlerEntSetSlot.setStackInSlot(25, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot26.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot26.getCount());
			_modHandlerEntSetSlot.setStackInSlot(26, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot27.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot27.getCount());
			_modHandlerEntSetSlot.setStackInSlot(27, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot28.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot28.getCount());
			_modHandlerEntSetSlot.setStackInSlot(28, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot29.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot29.getCount());
			_modHandlerEntSetSlot.setStackInSlot(29, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot30.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot30.getCount());
			_modHandlerEntSetSlot.setStackInSlot(30, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot31.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot31.getCount());
			_modHandlerEntSetSlot.setStackInSlot(31, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot32.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot32.getCount());
			_modHandlerEntSetSlot.setStackInSlot(32, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot33.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot33.getCount());
			_modHandlerEntSetSlot.setStackInSlot(33, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot34.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot34.getCount());
			_modHandlerEntSetSlot.setStackInSlot(34, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot35.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot35.getCount());
			_modHandlerEntSetSlot.setStackInSlot(35, _setstack);
		}
		if (entity instanceof LivingEntity _entity) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot36.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot36.getCount());
			_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
			if (_entity instanceof Player _player)
				_player.getInventory().setChanged();
		}
		{
			Entity _entity = entity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(0, entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot37);
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.FEET, entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot37);
			}
		}
		{
			Entity _entity = entity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(1, entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot38);
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.LEGS, entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot38);
			}
		}
		{
			Entity _entity = entity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(2, entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot39);
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.CHEST, entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot39);
			}
		}
		{
			Entity _entity = entity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(3, entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot40);
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.HEAD, entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).normalSlot40);
			}
		}
	}
}
