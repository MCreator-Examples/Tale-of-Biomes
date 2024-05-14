package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

public class InventorySaveEldenmoorScriptProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot0 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(0, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot1 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(1, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot2 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(2, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot3 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(3, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot4 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(4, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot5 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(5, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot6 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(6, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot7 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(7, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot8 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(8, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot9 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(9, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot10 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(10, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot11 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(11, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot12 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(12, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot13 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(13, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot14 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(14, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot15 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(15, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot16 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(16, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot17 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(17, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot18 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(18, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot19 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(19, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot20 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(20, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot21 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(21, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot22 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(22, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot23 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(23, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot24 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(24, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot25 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(25, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot26 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(26, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot27 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(27, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot28 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(28, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot29 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(29, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot30 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(30, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot31 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(31, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot32 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(32, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot33 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(33, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot34 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(34, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot35 = (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
						return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(35, entity));
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot36 = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot37 = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY);
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot38 = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY);
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot39 = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY);
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.eldenmoorSlot40 = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY);
			_vars.syncPlayerVariables(entity);
		}
	}
}
