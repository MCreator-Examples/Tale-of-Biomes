package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;
import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import java.util.function.Supplier;
import java.util.Map;

public class BasicStoneTableRecipeHelperMossyCobbledBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ItemStack iSet1 = ItemStack.EMPTY;
		ItemStack iSet0 = ItemStack.EMPTY;
		ItemStack iSlot2 = ItemStack.EMPTY;
		if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipeTimer <= 0) {
			{
				TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
				_vars.recipeTimer = 20;
				_vars.syncPlayerVariables(entity);
			}
			if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipeGroup < 5) {
				{
					TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
					_vars.recipeGroup = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipeGroup + 1;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
					_vars.recipeGroup = 0;
					_vars.syncPlayerVariables(entity);
				}
			}
		} else {
			{
				TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
				_vars.recipeTimer = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipeTimer - 1;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipeGroup == 0) {
			iSet0 = new ItemStack(TaleOfBiomesModBlocks.MOSS_CARPET.get());
			iSet1 = new ItemStack(TaleOfBiomesModBlocks.COBBLED_SHALE.get());
			iSlot2 = new ItemStack(TaleOfBiomesModBlocks.MOSSY_COBBLED_SHALE.get());
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipeGroup == 1) {
			iSet0 = new ItemStack(TaleOfBiomesModBlocks.MOSS_BLOCK.get());
			iSet1 = new ItemStack(TaleOfBiomesModBlocks.COBBLED_BASALT.get());
			iSlot2 = new ItemStack(TaleOfBiomesModBlocks.MOSSY_COBBLED_BASALT.get());
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipeGroup == 2) {
			iSet0 = new ItemStack(TaleOfBiomesModBlocks.MOSS_BLOCK.get());
			iSet1 = new ItemStack(TaleOfBiomesModBlocks.COBBLED_MARBLE.get());
			iSlot2 = new ItemStack(TaleOfBiomesModBlocks.MOSSY_COBBLED_MARBLE.get());
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipeGroup == 3) {
			iSet0 = new ItemStack(TaleOfBiomesModBlocks.MOSS_BLOCK.get());
			iSet1 = new ItemStack(TaleOfBiomesModBlocks.COBBLED_SHALE.get());
			iSlot2 = new ItemStack(TaleOfBiomesModBlocks.MOSSY_COBBLED_SHALE.get());
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipeGroup == 4) {
			iSet0 = new ItemStack(TaleOfBiomesModBlocks.MOSS_CARPET.get());
			iSet1 = new ItemStack(TaleOfBiomesModBlocks.COBBLED_BASALT.get());
			iSlot2 = new ItemStack(TaleOfBiomesModBlocks.MOSSY_COBBLED_BASALT.get());
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipeGroup == 5) {
			iSet0 = new ItemStack(TaleOfBiomesModBlocks.MOSS_CARPET.get());
			iSet1 = new ItemStack(TaleOfBiomesModBlocks.COBBLED_MARBLE.get());
			iSlot2 = new ItemStack(TaleOfBiomesModBlocks.MOSSY_COBBLED_MARBLE.get());
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(10)).set(ItemStack.EMPTY);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(11)).set(ItemStack.EMPTY);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(12)).set(ItemStack.EMPTY);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = iSet0.copy();
			_setstack.setCount(1);
			((Slot) _slots.get(13)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = iSet0.copy();
			_setstack.setCount(1);
			((Slot) _slots.get(14)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(15)).set(ItemStack.EMPTY);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = iSet1.copy();
			_setstack.setCount(1);
			((Slot) _slots.get(16)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = iSet1.copy();
			_setstack.setCount(1);
			((Slot) _slots.get(17)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(18)).set(ItemStack.EMPTY);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = iSlot2.copy();
			_setstack.setCount(2);
			((Slot) _slots.get(19)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
	}
}
