package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

import java.util.function.Supplier;
import java.util.Map;

public class BasicToolTableMenuRecipeHelperCupProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		ItemStack iMaterial = ItemStack.EMPTY;
		String sMaterial = "";
		if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 13) {
			if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipeHelperUpdateTimer == 0) {
				sMaterial = TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "basic_tool_table/material_cup";
				iMaterial = new ItemStack((BuiltInRegistries.ITEM.getOrCreateTag(ItemTags.create(new ResourceLocation((sMaterial).toLowerCase(java.util.Locale.ENGLISH)))).getRandomElement(RandomSource.create())
						.orElseGet(() -> BuiltInRegistries.ITEM.wrapAsHolder(Items.AIR)).value()));
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
					ItemStack _setstack = iMaterial.copy();
					_setstack.setCount(1);
					((Slot) _slots.get(13)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get(14)).set(ItemStack.EMPTY);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = iMaterial.copy();
					_setstack.setCount(1);
					((Slot) _slots.get(15)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = iMaterial.copy();
					_setstack.setCount(1);
					((Slot) _slots.get(16)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = iMaterial.copy();
					_setstack.setCount(1);
					((Slot) _slots.get(17)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = iMaterial.copy();
					_setstack.setCount(1);
					((Slot) _slots.get(18)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				{
					TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
					_vars.recipeHelperUpdateTimer = 20;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
					_vars.recipeHelperUpdateTimer = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipeHelperUpdateTimer - 1;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}
