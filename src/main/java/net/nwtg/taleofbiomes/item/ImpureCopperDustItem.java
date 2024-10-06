
package net.nwtg.taleofbiomes.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class ImpureCopperDustItem extends Item {
	public ImpureCopperDustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.literal("\u00A78A common mineral dust"));
		list.add(Component.literal("\u00A78found across Eldenmoor!"));
		list.add(Component.literal("\u00A7fThis resource is \u00A7cUNPURE\u00A7f!"));
	}
}
