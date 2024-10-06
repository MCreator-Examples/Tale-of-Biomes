package net.nwtg.taleofbiomes.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import java.util.function.Supplier;
import java.util.Map;

public class ItemTakenFromGUICraftingOutputSlotShiftProcedure {
	public static void execute(Entity entity, double amount) {
		if (entity == null)
			return;
		double nAmount = 0;
		double nTestSlotCount = 0;
		double nSlot5 = 0;
		double nSlot4 = 0;
		double nSlot7 = 0;
		double nSlot6 = 0;
		double nSlot8 = 0;
		double nCount = 0;
		double nTestSlot = 0;
		double nSlot1 = 0;
		double nSlot0 = 0;
		double nSlot3 = 0;
		double nSlot2 = 0;
		double nAddAmount = 0;
		double nRemoveAmount = 0;
		nCount = 64;
		nAmount = amount;
		nSlot0 = new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(0);
		nSlot1 = new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(1);
		nSlot2 = new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(2);
		nSlot3 = new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(3);
		nSlot4 = new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(4);
		nSlot5 = new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(5);
		nSlot6 = new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(6);
		nSlot7 = new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(7);
		nSlot8 = new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(8);
		for (int index0 = 0; index0 < 9; index0++) {
			if (nTestSlotCount == 0) {
				nTestSlot = nSlot0;
			} else if (nTestSlotCount == 1) {
				nTestSlot = nSlot1;
			} else if (nTestSlotCount == 2) {
				nTestSlot = nSlot2;
			} else if (nTestSlotCount == 3) {
				nTestSlot = nSlot3;
			} else if (nTestSlotCount == 4) {
				nTestSlot = nSlot4;
			} else if (nTestSlotCount == 5) {
				nTestSlot = nSlot5;
			} else if (nTestSlotCount == 6) {
				nTestSlot = nSlot6;
			} else if (nTestSlotCount == 7) {
				nTestSlot = nSlot7;
			} else if (nTestSlotCount == 8) {
				nTestSlot = nSlot8;
			}
			if (nTestSlot > 0 && nTestSlot < nCount) {
				nCount = nTestSlot;
			}
			nTestSlotCount = nTestSlotCount + 1;
		}
		nRemoveAmount = nCount * nAmount;
		nAddAmount = nRemoveAmount - nAmount;
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(0)).remove((int) nRemoveAmount);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(1)).remove((int) nRemoveAmount);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(2)).remove((int) nRemoveAmount);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(3)).remove((int) nRemoveAmount);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(4)).remove((int) nRemoveAmount);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(5)).remove((int) nRemoveAmount);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(6)).remove((int) nRemoveAmount);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(7)).remove((int) nRemoveAmount);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(8)).remove((int) nRemoveAmount);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(9)).getItem() : ItemStack.EMPTY).copy();
			_setstack.setCount((int) nAddAmount);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
	}
}
