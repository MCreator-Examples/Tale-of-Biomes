
package net.nwtg.taleofbiomes.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class StoneSwordHeadItem extends Item {
	public StoneSwordHeadItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
