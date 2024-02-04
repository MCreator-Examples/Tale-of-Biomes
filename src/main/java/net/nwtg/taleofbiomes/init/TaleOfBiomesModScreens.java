
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.nwtg.taleofbiomes.init;

import net.nwtg.taleofbiomes.client.gui.KilnScreenScreen;
import net.nwtg.taleofbiomes.client.gui.BasicToolTableMenuScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TaleOfBiomesModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(TaleOfBiomesModMenus.KILN_SCREEN.get(), KilnScreenScreen::new);
			MenuScreens.register(TaleOfBiomesModMenus.BASIC_TOOL_TABLE_MENU.get(), BasicToolTableMenuScreen::new);
		});
	}
}
