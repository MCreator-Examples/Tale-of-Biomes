
package net.nwtg.taleofbiomes.item;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class PhosphoriteShovelItem extends ShovelItem {
	public PhosphoriteShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1500;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 0.75f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TaleOfBiomesModItems.PHOSPHORITE_GEMSTONE.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
