
package net.nwtg.taleofbiomes.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PiruffGripItem extends Item {
	public PiruffGripItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
