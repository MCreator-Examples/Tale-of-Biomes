
package net.nwtg.taleofbiomes.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class QuicklimeItem extends Item {
	public QuicklimeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
