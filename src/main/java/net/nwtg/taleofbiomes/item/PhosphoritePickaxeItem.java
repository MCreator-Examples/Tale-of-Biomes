
package net.nwtg.taleofbiomes.item;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class PhosphoritePickaxeItem extends PickaxeItem {
	public PhosphoritePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1500;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 3f;
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
		}, 1, -2.8f, new Item.Properties());
	}
}
