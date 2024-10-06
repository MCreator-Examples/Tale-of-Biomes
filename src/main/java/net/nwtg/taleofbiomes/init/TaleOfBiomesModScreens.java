
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.nwtg.taleofbiomes.init;

import net.nwtg.taleofbiomes.client.gui.PiruffBarrelInventoryScreen;
import net.nwtg.taleofbiomes.client.gui.KilnScreenScreen;
import net.nwtg.taleofbiomes.client.gui.CraftingTableMenuScreen;
import net.nwtg.taleofbiomes.client.gui.CraftingTableMenuRecipeBookScreen;
import net.nwtg.taleofbiomes.client.gui.BasicToolTableMenuScreen;
import net.nwtg.taleofbiomes.client.gui.BasicToolTableMenuRecipeBookScreen;
import net.nwtg.taleofbiomes.client.gui.BasicStoneTableMenuScreen;
import net.nwtg.taleofbiomes.client.gui.BasicStoneTableMenuRecipeBookScreen;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TaleOfBiomesModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(TaleOfBiomesModMenus.KILN_SCREEN.get(), KilnScreenScreen::new);
		event.register(TaleOfBiomesModMenus.BASIC_TOOL_TABLE_MENU.get(), BasicToolTableMenuScreen::new);
		event.register(TaleOfBiomesModMenus.BASIC_STONE_TABLE_MENU.get(), BasicStoneTableMenuScreen::new);
		event.register(TaleOfBiomesModMenus.BASIC_STONE_TABLE_MENU_RECIPE_BOOK.get(), BasicStoneTableMenuRecipeBookScreen::new);
		event.register(TaleOfBiomesModMenus.PIRUFF_BARREL_INVENTORY.get(), PiruffBarrelInventoryScreen::new);
		event.register(TaleOfBiomesModMenus.BASIC_TOOL_TABLE_MENU_RECIPE_BOOK.get(), BasicToolTableMenuRecipeBookScreen::new);
		event.register(TaleOfBiomesModMenus.CRAFTING_TABLE_MENU.get(), CraftingTableMenuScreen::new);
		event.register(TaleOfBiomesModMenus.CRAFTING_TABLE_MENU_RECIPE_BOOK.get(), CraftingTableMenuRecipeBookScreen::new);
	}
}
