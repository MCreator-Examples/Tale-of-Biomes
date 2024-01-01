
package net.nwtg.taleofbiomes.potion;

import net.nwtg.taleofbiomes.procedures.EldenmoorCurseEffectExpiresProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class EldenmoorCurseMobEffect extends MobEffect {
	public EldenmoorCurseMobEffect() {
		super(MobEffectCategory.HARMFUL, -5111553);
	}

	@Override
	public String getDescriptionId() {
		return "effect.tale_of_biomes.eldenmoor_curse";
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		EldenmoorCurseEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
