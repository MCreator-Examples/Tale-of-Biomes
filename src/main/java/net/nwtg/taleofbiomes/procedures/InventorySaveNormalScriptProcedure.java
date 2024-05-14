package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

public class InventorySaveNormalScriptProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.normalSlot0 = (new Object() {
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
			_vars.normalSlot1 = (new Object() {
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
			_vars.normalSlot2 = (new Object() {
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
			_vars.normalSlot3 = (new Object() {
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
			_vars.normalSlot4 = (new Object() {
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
			_vars.normalSlot5 = (new Object() {
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
			_vars.normalSlot6 = (new Object() {
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
			_vars.normalSlot7 = (new Object() {
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
			_vars.normalSlot8 = (new Object() {
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
			_vars.normalSlot9 = (new Object() {
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
			_vars.normalSlot10 = (new Object() {
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
			_vars.normalSlot11 = (new Object() {
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
			_vars.normalSlot12 = (new Object() {
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
			_vars.normalSlot13 = (new Object() {
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
			_vars.normalSlot14 = (new Object() {
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
			_vars.normalSlot15 = (new Object() {
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
			_vars.normalSlot16 = (new Object() {
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
			_vars.normalSlot17 = (new Object() {
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
			_vars.normalSlot18 = (new Object() {
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
			_vars.normalSlot19 = (new Object() {
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
			_vars.normalSlot20 = (new Object() {
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
			_vars.normalSlot21 = (new Object() {
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
			_vars.normalSlot22 = (new Object() {
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
			_vars.normalSlot23 = (new Object() {
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
			_vars.normalSlot24 = (new Object() {
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
			_vars.normalSlot25 = (new Object() {
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
			_vars.normalSlot26 = (new Object() {
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
			_vars.normalSlot27 = (new Object() {
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
			_vars.normalSlot28 = (new Object() {
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
			_vars.normalSlot29 = (new Object() {
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
			_vars.normalSlot30 = (new Object() {
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
			_vars.normalSlot31 = (new Object() {
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
			_vars.normalSlot32 = (new Object() {
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
			_vars.normalSlot33 = (new Object() {
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
			_vars.normalSlot34 = (new Object() {
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
			_vars.normalSlot35 = (new Object() {
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
			_vars.normalSlot36 = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.normalSlot37 = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY);
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.normalSlot38 = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY);
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.normalSlot39 = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY);
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.normalSlot40 = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY);
			_vars.syncPlayerVariables(entity);
		}
	}
}
