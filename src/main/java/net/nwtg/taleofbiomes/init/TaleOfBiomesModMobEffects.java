
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.nwtg.taleofbiomes.init;

import net.nwtg.taleofbiomes.procedures.EldenmoorCurseEffectExpiresProcedure;
import net.nwtg.taleofbiomes.potion.EldenmoorCurseMobEffect;
import net.nwtg.taleofbiomes.TaleOfBiomesMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber
public class TaleOfBiomesModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, TaleOfBiomesMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> ELDENMOOR_CURSE = REGISTRY.register("eldenmoor_curse", () -> new EldenmoorCurseMobEffect());

	@SubscribeEvent
	public static void onEffectRemoved(MobEffectEvent.Remove event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	@SubscribeEvent
	public static void onEffectExpired(MobEffectEvent.Expired event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	private static void expireEffects(Entity entity, MobEffectInstance effectInstance) {
		MobEffect effect = effectInstance.getEffect();
		if (effect == ELDENMOOR_CURSE.get()) {
			EldenmoorCurseEffectExpiresProcedure.execute(entity);
		}
	}
}
