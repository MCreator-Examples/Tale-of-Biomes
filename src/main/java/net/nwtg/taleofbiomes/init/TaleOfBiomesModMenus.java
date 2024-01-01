
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.nwtg.taleofbiomes.init;

import net.nwtg.taleofbiomes.world.inventory.KilnScreenMenu;
import net.nwtg.taleofbiomes.TaleOfBiomesMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class TaleOfBiomesModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TaleOfBiomesMod.MODID);
	public static final RegistryObject<MenuType<KilnScreenMenu>> KILN_SCREEN = REGISTRY.register("kiln_screen", () -> IForgeMenuType.create(KilnScreenMenu::new));
}
