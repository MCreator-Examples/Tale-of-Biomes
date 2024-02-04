package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;
import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class BuildKilnScriptWallsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String myBlockedBlocksTag = "";
		String myNamespace = "";
		String myPlacementTag = "";
		double offsetX = 0;
		double posX = 0;
		double posY = 0;
		double offsetZ = 0;
		double posZ = 0;
		double offsetY = 0;
		double counter = 0;
		myNamespace = TaleOfBiomesModVariables.MapVariables.get(world).modNamespace;
		myPlacementTag = "kiln";
		myBlockedBlocksTag = "kiln/blocked_blocks";
		offsetX = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "offsetX");
		offsetY = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "offsetY");
		offsetZ = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "offsetZ");
		posX = x - offsetX;
		posY = y - offsetY + 1;
		posZ = z - offsetZ + 1;
		counter = 1;
		for (int index0 = 0; index0 < 3; index0++) {
			for (int index1 = 0; index1 < 4; index1++) {
				if (!((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE.get())
						&& !((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE_ON.get()) && counter == 1) {
					world.setBlock(BlockPos.containing(posX, posY, posZ), TaleOfBiomesModBlocks.KILN_BLOCK_MIDDLE_BOTTOM.get().defaultBlockState(), 3);
					{
						Direction _dir = Direction.EAST;
						BlockPos _pos = BlockPos.containing(posX, posY, posZ);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
				} else if (!((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE.get())
						&& !((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE_ON.get()) && counter > 1 && counter < 4) {
					world.setBlock(BlockPos.containing(posX, posY, posZ), TaleOfBiomesModBlocks.KILN_BLOCK_MIDDLE_CENTER.get().defaultBlockState(), 3);
					{
						Direction _dir = Direction.EAST;
						BlockPos _pos = BlockPos.containing(posX, posY, posZ);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
				} else if (!((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE.get())
						&& !((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE_ON.get()) && counter == 4) {
					world.setBlock(BlockPos.containing(posX, posY, posZ), TaleOfBiomesModBlocks.KILN_BLOCK_MIDDLE_TOP.get().defaultBlockState(), 3);
					{
						Direction _dir = Direction.EAST;
						BlockPos _pos = BlockPos.containing(posX, posY, posZ);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
				}
				counter = counter + 1;
				posY = posY + 1;
			}
			counter = 1;
			posY = y - offsetY + 1;
			posZ = posZ + 1;
		}
		posX = x - offsetX + 4;
		posY = y - offsetY + 1;
		posZ = z - offsetZ + 1;
		counter = 1;
		for (int index2 = 0; index2 < 3; index2++) {
			for (int index3 = 0; index3 < 4; index3++) {
				if (!((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE.get())
						&& !((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE_ON.get()) && counter == 1) {
					world.setBlock(BlockPos.containing(posX, posY, posZ), TaleOfBiomesModBlocks.KILN_BLOCK_MIDDLE_BOTTOM.get().defaultBlockState(), 3);
					{
						Direction _dir = Direction.EAST;
						BlockPos _pos = BlockPos.containing(posX, posY, posZ);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
				} else if (!((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE.get())
						&& !((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE_ON.get()) && counter > 1 && counter < 4) {
					world.setBlock(BlockPos.containing(posX, posY, posZ), TaleOfBiomesModBlocks.KILN_BLOCK_MIDDLE_CENTER.get().defaultBlockState(), 3);
					{
						Direction _dir = Direction.EAST;
						BlockPos _pos = BlockPos.containing(posX, posY, posZ);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
				} else if (!((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE.get())
						&& !((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE_ON.get()) && counter == 4) {
					world.setBlock(BlockPos.containing(posX, posY, posZ), TaleOfBiomesModBlocks.KILN_BLOCK_MIDDLE_TOP.get().defaultBlockState(), 3);
					{
						Direction _dir = Direction.EAST;
						BlockPos _pos = BlockPos.containing(posX, posY, posZ);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
				}
				counter = counter + 1;
				posY = posY + 1;
			}
			counter = 1;
			posY = y - offsetY + 1;
			posZ = posZ + 1;
		}
		posX = x - offsetX + 1;
		posY = y - offsetY + 1;
		posZ = z - offsetZ;
		counter = 1;
		for (int index4 = 0; index4 < 3; index4++) {
			for (int index5 = 0; index5 < 4; index5++) {
				if (!((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE.get())
						&& !((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE_ON.get()) && counter == 1) {
					world.setBlock(BlockPos.containing(posX, posY, posZ), TaleOfBiomesModBlocks.KILN_BLOCK_MIDDLE_BOTTOM.get().defaultBlockState(), 3);
					{
						Direction _dir = Direction.NORTH;
						BlockPos _pos = BlockPos.containing(posX, posY, posZ);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
				} else if (!((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE.get())
						&& !((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE_ON.get()) && counter > 1 && counter < 4) {
					world.setBlock(BlockPos.containing(posX, posY, posZ), TaleOfBiomesModBlocks.KILN_BLOCK_MIDDLE_CENTER.get().defaultBlockState(), 3);
					{
						Direction _dir = Direction.NORTH;
						BlockPos _pos = BlockPos.containing(posX, posY, posZ);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
				} else if (!((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE.get())
						&& !((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE_ON.get()) && counter == 4) {
					world.setBlock(BlockPos.containing(posX, posY, posZ), TaleOfBiomesModBlocks.KILN_BLOCK_MIDDLE_TOP.get().defaultBlockState(), 3);
					{
						Direction _dir = Direction.NORTH;
						BlockPos _pos = BlockPos.containing(posX, posY, posZ);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
				}
				counter = counter + 1;
				posY = posY + 1;
			}
			counter = 1;
			posY = y - offsetY + 1;
			posX = posX + 1;
		}
		posX = x - offsetX + 1;
		posY = y - offsetY + 1;
		posZ = z - offsetZ + 4;
		counter = 1;
		for (int index6 = 0; index6 < 3; index6++) {
			for (int index7 = 0; index7 < 4; index7++) {
				if (!((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE.get())
						&& !((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE_ON.get()) && counter == 1) {
					world.setBlock(BlockPos.containing(posX, posY, posZ), TaleOfBiomesModBlocks.KILN_BLOCK_MIDDLE_BOTTOM.get().defaultBlockState(), 3);
					{
						Direction _dir = Direction.NORTH;
						BlockPos _pos = BlockPos.containing(posX, posY, posZ);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
				} else if (!((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE.get())
						&& !((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE_ON.get()) && counter > 1 && counter < 4) {
					world.setBlock(BlockPos.containing(posX, posY, posZ), TaleOfBiomesModBlocks.KILN_BLOCK_MIDDLE_CENTER.get().defaultBlockState(), 3);
					{
						Direction _dir = Direction.NORTH;
						BlockPos _pos = BlockPos.containing(posX, posY, posZ);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
				} else if (!((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE.get())
						&& !((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TaleOfBiomesModBlocks.KILN_FURNACE_ON.get()) && counter == 4) {
					world.setBlock(BlockPos.containing(posX, posY, posZ), TaleOfBiomesModBlocks.KILN_BLOCK_MIDDLE_TOP.get().defaultBlockState(), 3);
					{
						Direction _dir = Direction.NORTH;
						BlockPos _pos = BlockPos.containing(posX, posY, posZ);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
				}
				counter = counter + 1;
				posY = posY + 1;
			}
			counter = 1;
			posY = y - offsetY + 1;
			posX = posX + 1;
		}
	}
}
