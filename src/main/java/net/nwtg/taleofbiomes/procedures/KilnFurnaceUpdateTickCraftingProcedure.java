package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;
import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.loading.FMLPaths;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

public class KilnFurnaceUpdateTickCraftingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		com.google.gson.JsonObject mainObject = new com.google.gson.JsonObject();
		com.google.gson.JsonObject subObject = new com.google.gson.JsonObject();
		ItemStack display = ItemStack.EMPTY;
		ItemStack output = ItemStack.EMPTY;
		File file = new File("");
		String fileLayer1 = "";
		String fileLayer2 = "";
		String fileLayer3 = "";
		String fileLayer4 = "";
		BlockState layer3 = Blocks.AIR.defaultBlockState();
		BlockState layer4 = Blocks.AIR.defaultBlockState();
		BlockState layer1 = Blocks.AIR.defaultBlockState();
		BlockState layer2 = Blocks.AIR.defaultBlockState();
		double objectNumber = 0;
		double slot = 0;
		double posX = 0;
		double posY = 0;
		double posZ = 0;
		double offsetPosX = 0;
		double offsetPosZ = 0;
		posX = x;
		posY = y;
		posZ = z;
		if ((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE_ON.get()) {
			file = new File((FMLPaths.GAMEDIR.get().toString() + "/config/" + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + "/recipes"), File.separator + "kiln.json");
			if (file.exists()) {
				{
					try {
						BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
						StringBuilder jsonstringbuilder = new StringBuilder();
						String line;
						while ((line = bufferedReader.readLine()) != null) {
							jsonstringbuilder.append(line);
						}
						bufferedReader.close();
						mainObject = new com.google.gson.Gson().fromJson(jsonstringbuilder.toString(), com.google.gson.JsonObject.class);
						objectNumber = 1;
						if ((new Object() {
							public Direction getDirection(BlockState _bs) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp)
									return _bs.getValue(_dp);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
										? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
										: Direction.NORTH;
							}
						}.getDirection((world.getBlockState(BlockPos.containing(posX, posY, posZ))))) == Direction.NORTH) {
							offsetPosX = posX - 1;
							offsetPosZ = posZ + 1;
						} else if ((new Object() {
							public Direction getDirection(BlockState _bs) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp)
									return _bs.getValue(_dp);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
										? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
										: Direction.NORTH;
							}
						}.getDirection((world.getBlockState(BlockPos.containing(posX, posY, posZ))))) == Direction.EAST) {
							offsetPosX = posX - 3;
							offsetPosZ = posZ - 1;
						} else if ((new Object() {
							public Direction getDirection(BlockState _bs) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp)
									return _bs.getValue(_dp);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
										? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
										: Direction.NORTH;
							}
						}.getDirection((world.getBlockState(BlockPos.containing(posX, posY, posZ))))) == Direction.SOUTH) {
							offsetPosX = posX - 1;
							offsetPosZ = posZ - 3;
						} else {
							offsetPosX = posX + 1;
							offsetPosZ = posZ - 1;
						}
						for (int index0 = 0; index0 < (int) mainObject.size(); index0++) {
							subObject = mainObject.get((new java.text.DecimalFormat("##").format(objectNumber))).getAsJsonObject();
							fileLayer1 = subObject.get("layer_1").getAsString();
							fileLayer2 = subObject.get("layer_2").getAsString();
							fileLayer3 = subObject.get("layer_3").getAsString();
							fileLayer4 = subObject.get("layer_4").getAsString();
							if ((world.getBlockState(BlockPos.containing(offsetPosX, posY, offsetPosZ))).getBlock() == BuiltInRegistries.BLOCK.get(new ResourceLocation((fileLayer1).toLowerCase(java.util.Locale.ENGLISH)))
									&& (world.getBlockState(BlockPos.containing(offsetPosX, posY + 1, offsetPosZ))).getBlock() == BuiltInRegistries.BLOCK.get(new ResourceLocation((fileLayer2).toLowerCase(java.util.Locale.ENGLISH)))
									&& (world.getBlockState(BlockPos.containing(offsetPosX, posY + 2, offsetPosZ))).getBlock() == BuiltInRegistries.BLOCK.get(new ResourceLocation((fileLayer3).toLowerCase(java.util.Locale.ENGLISH)))
									&& (world.getBlockState(BlockPos.containing(offsetPosX, posY + 3, offsetPosZ))).getBlock() == BuiltInRegistries.BLOCK.get(new ResourceLocation((fileLayer4).toLowerCase(java.util.Locale.ENGLISH)))) {
								if (!world.isClientSide()) {
									BlockPos _bp = BlockPos.containing(posX, posY, posZ);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putString("layer1", fileLayer1);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								if (!world.isClientSide()) {
									BlockPos _bp = BlockPos.containing(posX, posY, posZ);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putString("layer2", fileLayer2);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								if (!world.isClientSide()) {
									BlockPos _bp = BlockPos.containing(posX, posY, posZ);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putString("layer3", fileLayer3);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								if (!world.isClientSide()) {
									BlockPos _bp = BlockPos.containing(posX, posY, posZ);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putString("layer4", fileLayer4);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								if (!world.isClientSide()) {
									BlockPos _bp = BlockPos.containing(posX, posY, posZ);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putString("display", subObject.get("display").getAsString());
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								if (!world.isClientSide()) {
									BlockPos _bp = BlockPos.containing(posX, posY, posZ);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putString("output", subObject.get("output").getAsString());
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								if (!world.isClientSide()) {
									BlockPos _bp = BlockPos.containing(posX, posY, posZ);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putDouble("amount", subObject.get("amount").getAsDouble());
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								if (!world.isClientSide()) {
									BlockPos _bp = BlockPos.containing(posX, posY, posZ);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putDouble("minTemperature", subObject.get("min_temperature").getAsDouble());
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								if (!world.isClientSide()) {
									BlockPos _bp = BlockPos.containing(posX, posY, posZ);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putDouble("maxTemperature", subObject.get("max_temperature").getAsDouble());
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								break;
							}
							objectNumber = objectNumber + 1;
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			layer1 = BuiltInRegistries.BLOCK.get(new ResourceLocation(((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getString(tag);
					return "";
				}
			}.getValue(world, BlockPos.containing(posX, posY, posZ), "layer1"))).toLowerCase(java.util.Locale.ENGLISH))).defaultBlockState();
			layer2 = BuiltInRegistries.BLOCK.get(new ResourceLocation(((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getString(tag);
					return "";
				}
			}.getValue(world, BlockPos.containing(posX, posY, posZ), "layer2"))).toLowerCase(java.util.Locale.ENGLISH))).defaultBlockState();
			layer3 = BuiltInRegistries.BLOCK.get(new ResourceLocation(((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getString(tag);
					return "";
				}
			}.getValue(world, BlockPos.containing(posX, posY, posZ), "layer3"))).toLowerCase(java.util.Locale.ENGLISH))).defaultBlockState();
			layer4 = BuiltInRegistries.BLOCK.get(new ResourceLocation(((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getString(tag);
					return "";
				}
			}.getValue(world, BlockPos.containing(posX, posY, posZ), "layer4"))).toLowerCase(java.util.Locale.ENGLISH))).defaultBlockState();
			display = new ItemStack(BuiltInRegistries.ITEM.get(new ResourceLocation(((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getString(tag);
					return "";
				}
			}.getValue(world, BlockPos.containing(posX, posY, posZ), "display"))).toLowerCase(java.util.Locale.ENGLISH))));
			output = new ItemStack(BuiltInRegistries.ITEM.get(new ResourceLocation(((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getString(tag);
					return "";
				}
			}.getValue(world, BlockPos.containing(posX, posY, posZ), "output"))).toLowerCase(java.util.Locale.ENGLISH))));
			if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(posX, posY, posZ))))) == Direction.NORTH) {
				slot = 0;
				offsetPosX = posX - 1;
				offsetPosZ = posZ + 1;
				for (int index1 = 0; index1 < 3; index1++) {
					for (int index2 = 0; index2 < 3; index2++) {
						if ((world.getBlockState(BlockPos.containing(offsetPosX, posY, offsetPosZ))).getBlock() == layer1.getBlock() && (world.getBlockState(BlockPos.containing(offsetPosX, posY + 1, offsetPosZ))).getBlock() == layer2.getBlock()
								&& (world.getBlockState(BlockPos.containing(offsetPosX, posY + 2, offsetPosZ))).getBlock() == layer3.getBlock()
								&& (world.getBlockState(BlockPos.containing(offsetPosX, posY + 3, offsetPosZ))).getBlock() == layer4.getBlock()) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = display.copy();
								_setstack.setCount(1);
								_itemHandlerModifiable.setStackInSlot((int) slot, _setstack);
							}
						} else {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								int _slotid = (int) slot;
								ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
								_stk.shrink(1);
								_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
							}
						}
						slot = slot + 1;
						offsetPosZ = offsetPosZ + 1;
					}
					offsetPosZ = posZ + 1;
					offsetPosX = offsetPosX + 1;
				}
			} else if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(posX, posY, posZ))))) == Direction.EAST) {
				slot = 0;
				offsetPosX = posX - 3;
				offsetPosZ = posZ - 1;
				for (int index3 = 0; index3 < 3; index3++) {
					for (int index4 = 0; index4 < 3; index4++) {
						if ((world.getBlockState(BlockPos.containing(offsetPosX, posY, offsetPosZ))).getBlock() == layer1.getBlock() && (world.getBlockState(BlockPos.containing(offsetPosX, posY + 1, offsetPosZ))).getBlock() == layer2.getBlock()
								&& (world.getBlockState(BlockPos.containing(offsetPosX, posY + 2, offsetPosZ))).getBlock() == layer3.getBlock()
								&& (world.getBlockState(BlockPos.containing(offsetPosX, posY + 3, offsetPosZ))).getBlock() == layer4.getBlock()) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = display.copy();
								_setstack.setCount(1);
								_itemHandlerModifiable.setStackInSlot((int) slot, _setstack);
							}
						} else {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								int _slotid = (int) slot;
								ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
								_stk.shrink(1);
								_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
							}
						}
						slot = slot + 1;
						offsetPosZ = offsetPosZ + 1;
					}
					offsetPosZ = posZ - 1;
					offsetPosX = offsetPosX + 1;
				}
			} else if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(posX, posY, posZ))))) == Direction.SOUTH) {
				slot = 0;
				offsetPosX = posX - 1;
				offsetPosZ = posZ - 3;
				for (int index5 = 0; index5 < 3; index5++) {
					for (int index6 = 0; index6 < 3; index6++) {
						if ((world.getBlockState(BlockPos.containing(offsetPosX, posY, offsetPosZ))).getBlock() == layer1.getBlock() && (world.getBlockState(BlockPos.containing(offsetPosX, posY + 1, offsetPosZ))).getBlock() == layer2.getBlock()
								&& (world.getBlockState(BlockPos.containing(offsetPosX, posY + 2, offsetPosZ))).getBlock() == layer3.getBlock()
								&& (world.getBlockState(BlockPos.containing(offsetPosX, posY + 3, offsetPosZ))).getBlock() == layer4.getBlock()) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = display.copy();
								_setstack.setCount(1);
								_itemHandlerModifiable.setStackInSlot((int) slot, _setstack);
							}
						} else {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								int _slotid = (int) slot;
								ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
								_stk.shrink(1);
								_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
							}
						}
						slot = slot + 1;
						offsetPosZ = offsetPosZ + 1;
					}
					offsetPosZ = posZ - 3;
					offsetPosX = offsetPosX + 1;
				}
			} else if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(posX, posY, posZ))))) == Direction.WEST) {
				slot = 0;
				offsetPosX = posX + 1;
				offsetPosZ = posZ - 1;
				for (int index7 = 0; index7 < 3; index7++) {
					for (int index8 = 0; index8 < 3; index8++) {
						if ((world.getBlockState(BlockPos.containing(offsetPosX, posY, offsetPosZ))).getBlock() == layer1.getBlock() && (world.getBlockState(BlockPos.containing(offsetPosX, posY + 1, offsetPosZ))).getBlock() == layer2.getBlock()
								&& (world.getBlockState(BlockPos.containing(offsetPosX, posY + 2, offsetPosZ))).getBlock() == layer3.getBlock()
								&& (world.getBlockState(BlockPos.containing(offsetPosX, posY + 3, offsetPosZ))).getBlock() == layer4.getBlock()) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = display.copy();
								_setstack.setCount(1);
								_itemHandlerModifiable.setStackInSlot((int) slot, _setstack);
							}
						} else {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								int _slotid = (int) slot;
								ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
								_stk.shrink(1);
								_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
							}
						}
						slot = slot + 1;
						offsetPosZ = offsetPosZ + 1;
					}
					offsetPosZ = posZ - 1;
					offsetPosX = offsetPosX + 1;
				}
			}
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(posX, posY, posZ), "temperature") >= new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(posX, posY, posZ), "minTemperature") && new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(posX, posY, posZ), "temperature") <= new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(posX, posY, posZ), "maxTemperature") && (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 9)).getItem() == ItemStack.EMPTY.getItem() && (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() == display.getItem() && (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getItem() == display.getItem() && (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 2)).getItem() == display.getItem() && (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 3)).getItem() == display.getItem() && (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 4)).getItem() == display.getItem() && (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 5)).getItem() == display.getItem() && (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 6)).getItem() == display.getItem() && (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 7)).getItem() == display.getItem() && (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 8)).getItem() == display.getItem()) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = output.copy();
					_setstack.setCount((int) (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, BlockPos.containing(x, y, z), "amount")));
					_itemHandlerModifiable.setStackInSlot(9, _setstack);
				}
				if ((new Object() {
					public Direction getDirection(BlockState _bs) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp)
							return _bs.getValue(_dp);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
								? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
								: Direction.NORTH;
					}
				}.getDirection((world.getBlockState(BlockPos.containing(posX, posY, posZ))))) == Direction.NORTH) {
					posX = x - 1;
					posZ = z + 1;
					for (int index9 = 0; index9 < 4; index9++) {
						for (int index10 = 0; index10 < 3; index10++) {
							for (int index11 = 0; index11 < 3; index11++) {
								world.setBlock(BlockPos.containing(posX, posY, posZ), Blocks.AIR.defaultBlockState(), 3);
								posZ = posZ + 1;
							}
							posZ = z + 1;
							posX = posX + 1;
						}
						posX = x - 1;
						posY = posY + 1;
					}
				} else if ((new Object() {
					public Direction getDirection(BlockState _bs) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp)
							return _bs.getValue(_dp);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
								? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
								: Direction.NORTH;
					}
				}.getDirection((world.getBlockState(BlockPos.containing(posX, posY, posZ))))) == Direction.EAST) {
					posX = x - 3;
					posZ = z - 1;
					for (int index12 = 0; index12 < 4; index12++) {
						for (int index13 = 0; index13 < 3; index13++) {
							for (int index14 = 0; index14 < 3; index14++) {
								world.setBlock(BlockPos.containing(posX, posY, posZ), Blocks.AIR.defaultBlockState(), 3);
								posZ = posZ + 1;
							}
							posZ = z - 1;
							posX = posX + 1;
						}
						posX = x - 3;
						posY = posY + 1;
					}
				} else if ((new Object() {
					public Direction getDirection(BlockState _bs) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp)
							return _bs.getValue(_dp);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
								? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
								: Direction.NORTH;
					}
				}.getDirection((world.getBlockState(BlockPos.containing(posX, posY, posZ))))) == Direction.SOUTH) {
					posX = x - 1;
					posZ = z - 3;
					for (int index15 = 0; index15 < 4; index15++) {
						for (int index16 = 0; index16 < 3; index16++) {
							for (int index17 = 0; index17 < 3; index17++) {
								world.setBlock(BlockPos.containing(posX, posY, posZ), Blocks.AIR.defaultBlockState(), 3);
								posZ = posZ + 1;
							}
							posZ = z - 3;
							posX = posX + 1;
						}
						posX = x - 1;
						posY = posY + 1;
					}
				} else if ((new Object() {
					public Direction getDirection(BlockState _bs) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp)
							return _bs.getValue(_dp);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
								? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
								: Direction.NORTH;
					}
				}.getDirection((world.getBlockState(BlockPos.containing(posX, posY, posZ))))) == Direction.WEST) {
					posX = x + 1;
					posZ = z - 1;
					for (int index18 = 0; index18 < 4; index18++) {
						for (int index19 = 0; index19 < 3; index19++) {
							for (int index20 = 0; index20 < 3; index20++) {
								world.setBlock(BlockPos.containing(posX, posY, posZ), Blocks.AIR.defaultBlockState(), 3);
								posZ = posZ + 1;
							}
							posZ = z - 1;
							posX = posX + 1;
						}
						posX = x + 1;
						posY = posY + 1;
					}
				}
			}
		} else {
			slot = 0;
			for (int index21 = 0; index21 < 10; index21++) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable)
					_itemHandlerModifiable.setStackInSlot((int) slot, ItemStack.EMPTY);
				slot = slot + 1;
			}
		}
	}
}
