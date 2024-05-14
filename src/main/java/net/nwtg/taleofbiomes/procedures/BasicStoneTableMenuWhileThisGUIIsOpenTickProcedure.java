package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import java.util.function.Supplier;
import java.util.Map;

public class BasicStoneTableMenuWhileThisGUIIsOpenTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (BasicStoneTableMenuMarbleStairsConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MARBLE_STAIRS.get()).copy();
				_setstack.setCount(6);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuMarbleSlabConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MARBLE_SLAB.get()).copy();
				_setstack.setCount(6);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuMarbleWallConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MARBLE_WALL.get()).copy();
				_setstack.setCount(6);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMarblePressurePlateConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MARBLE_PRESSURE_PLATE.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuMarbleButtonConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MARBLE_BUTTON.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuCobbledMarbleConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.COBBLED_MARBLE.get()).copy();
				_setstack.setCount(4);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuPolishedMarbleConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.POLISHED_MARBLE.get()).copy();
				_setstack.setCount(9);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuCobbledMarbleStairsConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.COBBLED_MARBLE_STAIRS.get()).copy();
				_setstack.setCount(6);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuCobbledMarbleSlabConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.COBBLED_MARBLE_SLAB.get()).copy();
				_setstack.setCount(6);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuCobbledMarbleWallConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.COBBLED_MARBLE_WALL.get()).copy();
				_setstack.setCount(6);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuMossyCobbledMableConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MOSSY_COBBLED_MARBLE.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuMossyCobbledMarbleStairsConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MOSSY_COBBLED_MARBLE_STAIRS.get()).copy();
				_setstack.setCount(6);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuMossyCobbledMarbleSlabConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MOSSY_COBBLED_MARBLE_SLAB.get()).copy();
				_setstack.setCount(6);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuMossyCobbledMarbleWallConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MOSSY_COBBLED_MARBLE_WALL.get()).copy();
				_setstack.setCount(6);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuPolishedMarbleStairsConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.POLISHED_MARBLE_STAIRS.get()).copy();
				_setstack.setCount(6);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuPolishedMarbleSlabConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.POLISHED_MARBLE_SLAB.get()).copy();
				_setstack.setCount(6);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuPolishedMarbleWallConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.POLISHED_MARBLE_WALL.get()).copy();
				_setstack.setCount(6);
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
