package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class BasicStoneTablePolishedShaleStairsConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		ItemStack iSlot0 = ItemStack.EMPTY;
		ItemStack iSlot1 = ItemStack.EMPTY;
		ItemStack iSlot2 = ItemStack.EMPTY;
		ItemStack iSlot3 = ItemStack.EMPTY;
		ItemStack iSlot4 = ItemStack.EMPTY;
		ItemStack iSlot5 = ItemStack.EMPTY;
		ItemStack iSlot6 = ItemStack.EMPTY;
		ItemStack iSlot7 = ItemStack.EMPTY;
		ItemStack iSlot8 = ItemStack.EMPTY;
		String sTag0 = "";
		sTag0 = TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "recipes/polished_shale";
		iSlot0 = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				if (world instanceof ILevelExtension _ext) {
					IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(slotid).copy();
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 0));
		iSlot1 = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				if (world instanceof ILevelExtension _ext) {
					IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(slotid).copy();
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 1));
		iSlot2 = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				if (world instanceof ILevelExtension _ext) {
					IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(slotid).copy();
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 2));
		iSlot3 = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				if (world instanceof ILevelExtension _ext) {
					IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(slotid).copy();
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 3));
		iSlot4 = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				if (world instanceof ILevelExtension _ext) {
					IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(slotid).copy();
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 4));
		iSlot5 = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				if (world instanceof ILevelExtension _ext) {
					IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(slotid).copy();
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 5));
		iSlot6 = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				if (world instanceof ILevelExtension _ext) {
					IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(slotid).copy();
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 6));
		iSlot7 = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				if (world instanceof ILevelExtension _ext) {
					IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(slotid).copy();
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 7));
		iSlot8 = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				if (world instanceof ILevelExtension _ext) {
					IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(slotid).copy();
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 8));
		return iSlot0.is(ItemTags.create(new ResourceLocation((sTag0).toLowerCase(java.util.Locale.ENGLISH)))) && iSlot1.getItem() == ItemStack.EMPTY.getItem() && iSlot2.getItem() == ItemStack.EMPTY.getItem()
				&& iSlot3.is(ItemTags.create(new ResourceLocation((sTag0).toLowerCase(java.util.Locale.ENGLISH)))) && iSlot4.is(ItemTags.create(new ResourceLocation((sTag0).toLowerCase(java.util.Locale.ENGLISH))))
				&& iSlot5.getItem() == ItemStack.EMPTY.getItem() && iSlot6.is(ItemTags.create(new ResourceLocation((sTag0).toLowerCase(java.util.Locale.ENGLISH))))
				&& iSlot7.is(ItemTags.create(new ResourceLocation((sTag0).toLowerCase(java.util.Locale.ENGLISH)))) && iSlot8.is(ItemTags.create(new ResourceLocation((sTag0).toLowerCase(java.util.Locale.ENGLISH))))
				|| iSlot0.getItem() == ItemStack.EMPTY.getItem() && iSlot1.getItem() == ItemStack.EMPTY.getItem() && iSlot2.is(ItemTags.create(new ResourceLocation((sTag0).toLowerCase(java.util.Locale.ENGLISH))))
						&& iSlot3.getItem() == ItemStack.EMPTY.getItem() && iSlot4.is(ItemTags.create(new ResourceLocation((sTag0).toLowerCase(java.util.Locale.ENGLISH))))
						&& iSlot5.is(ItemTags.create(new ResourceLocation((sTag0).toLowerCase(java.util.Locale.ENGLISH)))) && iSlot6.is(ItemTags.create(new ResourceLocation((sTag0).toLowerCase(java.util.Locale.ENGLISH))))
						&& iSlot7.is(ItemTags.create(new ResourceLocation((sTag0).toLowerCase(java.util.Locale.ENGLISH)))) && iSlot8.is(ItemTags.create(new ResourceLocation((sTag0).toLowerCase(java.util.Locale.ENGLISH))));
	}
}
