
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.nwtg.taleofbiomes.init;

import net.nwtg.taleofbiomes.potion.EldenmoorCurseMobEffect;
import net.nwtg.taleofbiomes.TaleOfBiomesMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class TaleOfBiomesModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, TaleOfBiomesMod.MODID);
	public static final RegistryObject<MobEffect> ELDENMOOR_CURSE = REGISTRY.register("eldenmoor_curse", () -> new EldenmoorCurseMobEffect());
}
