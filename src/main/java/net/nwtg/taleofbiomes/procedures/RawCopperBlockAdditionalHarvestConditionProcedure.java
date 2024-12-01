package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

public class RawCopperBlockAdditionalHarvestConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		ItemStack mainHand = ItemStack.EMPTY;
		mainHand = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
		return mainHand.getItem() instanceof PickaxeItem && mainHand.is(ItemTags.create(ResourceLocation.parse("mo_tool_tiers:normal_stone")));
	}
}
