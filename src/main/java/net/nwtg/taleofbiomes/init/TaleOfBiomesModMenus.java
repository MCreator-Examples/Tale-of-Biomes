
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.nwtg.taleofbiomes.init;

import net.nwtg.taleofbiomes.world.inventory.KilnScreenMenu;
import net.nwtg.taleofbiomes.world.inventory.BasicToolTableMenuRecipeBookMenu;
import net.nwtg.taleofbiomes.world.inventory.BasicToolTableMenuMenu;
import net.nwtg.taleofbiomes.world.inventory.BasicStoneTableMenuRecipeBookMenu;
import net.nwtg.taleofbiomes.world.inventory.BasicStoneTableMenuMenu;
import net.nwtg.taleofbiomes.TaleOfBiomesMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

public class TaleOfBiomesModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, TaleOfBiomesMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<KilnScreenMenu>> KILN_SCREEN = REGISTRY.register("kiln_screen", () -> IMenuTypeExtension.create(KilnScreenMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<BasicToolTableMenuMenu>> BASIC_TOOL_TABLE_MENU = REGISTRY.register("basic_tool_table_menu", () -> IMenuTypeExtension.create(BasicToolTableMenuMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<BasicToolTableMenuRecipeBookMenu>> BASIC_TOOL_TABLE_MENU_RECIPE_BOOK = REGISTRY.register("basic_tool_table_menu_recipe_book",
			() -> IMenuTypeExtension.create(BasicToolTableMenuRecipeBookMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<BasicStoneTableMenuMenu>> BASIC_STONE_TABLE_MENU = REGISTRY.register("basic_stone_table_menu", () -> IMenuTypeExtension.create(BasicStoneTableMenuMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<BasicStoneTableMenuRecipeBookMenu>> BASIC_STONE_TABLE_MENU_RECIPE_BOOK = REGISTRY.register("basic_stone_table_menu_recipe_book",
			() -> IMenuTypeExtension.create(BasicStoneTableMenuRecipeBookMenu::new));
}
