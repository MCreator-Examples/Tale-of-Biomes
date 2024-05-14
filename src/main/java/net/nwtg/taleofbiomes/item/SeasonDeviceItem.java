
package net.nwtg.taleofbiomes.item;

import net.nwtg.taleofbiomes.procedures.SeasonDeviceSpecialInformationProcedure;
import net.nwtg.taleofbiomes.procedures.SeasonDeviceRightclickedProcedure;
import net.nwtg.taleofbiomes.procedures.SeasonDeviceItemInInventoryTickProcedure;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import java.util.List;

public class SeasonDeviceItem extends Item {
	public SeasonDeviceItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		Entity entity = itemstack.getEntityRepresentation();
		list.add(Component.literal(SeasonDeviceSpecialInformationProcedure.execute(level instanceof Level ? (LevelAccessor) level : null, itemstack)));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		SeasonDeviceRightclickedProcedure.execute(world, entity, ar.getObject());
		return ar;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		SeasonDeviceItemInInventoryTickProcedure.execute(world, entity);
	}
}
