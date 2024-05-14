package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class KilnScreenItemTakenFromSlot9Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double posX = 0;
		double posY = 0;
		double posZ = 0;
		posX = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosX;
		posY = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosY;
		posZ = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosZ;
		if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection((world.getBlockState(BlockPos.containing(posX, posY, posZ))))) == Direction.NORTH) {
			posX = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosX - 1;
			posZ = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosZ + 1;
			for (int index0 = 0; index0 < 4; index0++) {
				for (int index1 = 0; index1 < 3; index1++) {
					for (int index2 = 0; index2 < 3; index2++) {
						world.setBlock(BlockPos.containing(posX, posY, posZ), Blocks.AIR.defaultBlockState(), 3);
						posZ = posZ + 1;
					}
					posZ = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosZ + 1;
					posX = posX + 1;
				}
				posX = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosX - 1;
				posY = posY + 1;
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
			posX = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosX - 3;
			posZ = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosZ - 1;
			for (int index3 = 0; index3 < 4; index3++) {
				for (int index4 = 0; index4 < 3; index4++) {
					for (int index5 = 0; index5 < 3; index5++) {
						world.setBlock(BlockPos.containing(posX, posY, posZ), Blocks.AIR.defaultBlockState(), 3);
						posZ = posZ + 1;
					}
					posZ = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosZ - 1;
					posX = posX + 1;
				}
				posX = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosX - 3;
				posY = posY + 1;
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
			posX = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosX - 1;
			posZ = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosZ - 3;
			for (int index6 = 0; index6 < 4; index6++) {
				for (int index7 = 0; index7 < 3; index7++) {
					for (int index8 = 0; index8 < 3; index8++) {
						world.setBlock(BlockPos.containing(posX, posY, posZ), Blocks.AIR.defaultBlockState(), 3);
						posZ = posZ + 1;
					}
					posZ = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosZ - 3;
					posX = posX + 1;
				}
				posX = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosX - 1;
				posY = posY + 1;
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
			posX = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosX + 1;
			posZ = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosZ - 1;
			for (int index9 = 0; index9 < 4; index9++) {
				for (int index10 = 0; index10 < 3; index10++) {
					for (int index11 = 0; index11 < 3; index11++) {
						world.setBlock(BlockPos.containing(posX, posY, posZ), Blocks.AIR.defaultBlockState(), 3);
						posZ = posZ + 1;
					}
					posZ = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosZ - 1;
					posX = posX + 1;
				}
				posX = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosX + 1;
				posY = posY + 1;
			}
		}
	}
}
