
package net.nwtg.taleofbiomes.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class PiruffCarrotItem extends Item {
	public PiruffCarrotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(3).saturationModifier(0.3f).build()));
	}
}
