package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModItems;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import java.util.function.Supplier;
import java.util.Map;

public class BasicToolTableMenuWhileThisGUIIsOpenTick1Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (BasicToolTableMenuPiruffHeadAxeConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_AXE_HEAD.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicToolTableMenuPiruffHeadHoeConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_HOE_HEAD.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicToolTableMenuPiruffHeadPickaxeConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_PICKAXE_HEAD.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicToolTableMenuPiruffHeadShovelConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_SHOVEL_HEAD.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicToolTableMenuPiruffHeadSickleConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_SICKLE_HEAD.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicToolTableMenuPiruffHeadSwordConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_SWORD_HEAD.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicToolTableMenuPiruffAxeConditionProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_AXE.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicToolTableMenuPiruffHoeConditionProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_HOE.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicToolTableMenuPiruffPickaxeConditionProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_PICKAXE.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicToolTableMenuPiruffShovelConditionProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_SHOVEL.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicToolTableMenuPiruffSickleConditionProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_SICKLE.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicToolTableMenuPiruffSwordConditionProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_SWORD.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicToolTableMenuPiruffCupConditionProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_CUP.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
