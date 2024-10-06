
package net.nwtg.taleofbiomes.block;

import org.checkerframework.checker.units.qual.s;

import net.nwtg.taleofbiomes.procedures.RiceCropOnTickUpdateProcedure;
import net.nwtg.taleofbiomes.procedures.RiceCropBlockAddedProcedure;
import net.nwtg.taleofbiomes.init.TaleOfBiomesModItems;
import net.nwtg.taleofbiomes.block.entity.RiceCropBlockEntity;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.MenuProvider;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class RiceCropBlock extends Block implements EntityBlock, BonemealableBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 48);

	public RiceCropBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().mapColor(MapColor.NONE).sound(SoundType.GRASS).instabreak().lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 0;
				if (s.getValue(BLOCKSTATE) == 2)
					return 0;
				if (s.getValue(BLOCKSTATE) == 3)
					return 0;
				if (s.getValue(BLOCKSTATE) == 4)
					return 0;
				if (s.getValue(BLOCKSTATE) == 5)
					return 0;
				if (s.getValue(BLOCKSTATE) == 6)
					return 0;
				if (s.getValue(BLOCKSTATE) == 7)
					return 0;
				if (s.getValue(BLOCKSTATE) == 8)
					return 0;
				if (s.getValue(BLOCKSTATE) == 9)
					return 0;
				if (s.getValue(BLOCKSTATE) == 10)
					return 0;
				if (s.getValue(BLOCKSTATE) == 11)
					return 0;
				if (s.getValue(BLOCKSTATE) == 12)
					return 0;
				if (s.getValue(BLOCKSTATE) == 13)
					return 0;
				if (s.getValue(BLOCKSTATE) == 14)
					return 0;
				if (s.getValue(BLOCKSTATE) == 15)
					return 0;
				if (s.getValue(BLOCKSTATE) == 16)
					return 0;
				if (s.getValue(BLOCKSTATE) == 17)
					return 0;
				if (s.getValue(BLOCKSTATE) == 18)
					return 0;
				if (s.getValue(BLOCKSTATE) == 19)
					return 0;
				if (s.getValue(BLOCKSTATE) == 20)
					return 0;
				if (s.getValue(BLOCKSTATE) == 21)
					return 0;
				if (s.getValue(BLOCKSTATE) == 22)
					return 0;
				if (s.getValue(BLOCKSTATE) == 23)
					return 0;
				if (s.getValue(BLOCKSTATE) == 24)
					return 0;
				if (s.getValue(BLOCKSTATE) == 25)
					return 0;
				if (s.getValue(BLOCKSTATE) == 26)
					return 0;
				if (s.getValue(BLOCKSTATE) == 27)
					return 0;
				if (s.getValue(BLOCKSTATE) == 28)
					return 0;
				if (s.getValue(BLOCKSTATE) == 29)
					return 0;
				if (s.getValue(BLOCKSTATE) == 30)
					return 0;
				if (s.getValue(BLOCKSTATE) == 31)
					return 0;
				if (s.getValue(BLOCKSTATE) == 32)
					return 0;
				if (s.getValue(BLOCKSTATE) == 33)
					return 0;
				if (s.getValue(BLOCKSTATE) == 34)
					return 0;
				if (s.getValue(BLOCKSTATE) == 35)
					return 0;
				if (s.getValue(BLOCKSTATE) == 36)
					return 0;
				if (s.getValue(BLOCKSTATE) == 37)
					return 0;
				if (s.getValue(BLOCKSTATE) == 38)
					return 0;
				if (s.getValue(BLOCKSTATE) == 39)
					return 0;
				if (s.getValue(BLOCKSTATE) == 40)
					return 0;
				if (s.getValue(BLOCKSTATE) == 41)
					return 0;
				if (s.getValue(BLOCKSTATE) == 42)
					return 0;
				if (s.getValue(BLOCKSTATE) == 43)
					return 0;
				if (s.getValue(BLOCKSTATE) == 44)
					return 0;
				if (s.getValue(BLOCKSTATE) == 45)
					return 0;
				if (s.getValue(BLOCKSTATE) == 46)
					return 0;
				if (s.getValue(BLOCKSTATE) == 47)
					return 0;
				if (s.getValue(BLOCKSTATE) == 48)
					return 0;
				return 0;
			}
		}.getLightLevel())).noCollission().noOcclusion().pushReaction(PushReaction.DESTROY).isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		if (state.getValue(BLOCKSTATE) == 1) {
			return box(0, -4, 0, 16, -1, 16);
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return box(0, -4, 0, 16, 9, 16);
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return box(0, -4, 0, 16, -1, 16);
		}
		if (state.getValue(BLOCKSTATE) == 4) {
			return box(0, -4, 0, 16, 9, 16);
		}
		if (state.getValue(BLOCKSTATE) == 5) {
			return box(0, -4, 0, 16, 2, 16);
		}
		if (state.getValue(BLOCKSTATE) == 6) {
			return box(0, -4, 0, 16, 9, 16);
		}
		if (state.getValue(BLOCKSTATE) == 7) {
			return box(0, -4, 0, 16, 2, 16);
		}
		if (state.getValue(BLOCKSTATE) == 8) {
			return box(0, -4, 0, 16, 9, 16);
		}
		if (state.getValue(BLOCKSTATE) == 9) {
			return box(0, -4, 0, 16, 5, 16);
		}
		if (state.getValue(BLOCKSTATE) == 10) {
			return box(0, -4, 0, 16, 9, 16);
		}
		if (state.getValue(BLOCKSTATE) == 11) {
			return box(0, -4, 0, 16, 5, 16);
		}
		if (state.getValue(BLOCKSTATE) == 12) {
			return box(0, -4, 0, 16, 9, 16);
		}
		if (state.getValue(BLOCKSTATE) == 13) {
			return box(0, -4, 0, 16, 7, 16);
		}
		if (state.getValue(BLOCKSTATE) == 14) {
			return box(0, -4, 0, 16, 9, 16);
		}
		if (state.getValue(BLOCKSTATE) == 15) {
			return box(0, -4, 0, 16, 7, 16);
		}
		if (state.getValue(BLOCKSTATE) == 16) {
			return box(0, -4, 0, 16, 9, 16);
		}
		if (state.getValue(BLOCKSTATE) == 17) {
			return box(0, -4, 0, 16, 12, 16);
		}
		if (state.getValue(BLOCKSTATE) == 18) {
			return box(0, -4, 0, 16, 12, 16);
		}
		if (state.getValue(BLOCKSTATE) == 19) {
			return box(0, -4, 0, 16, 12, 16);
		}
		if (state.getValue(BLOCKSTATE) == 20) {
			return box(0, -4, 0, 16, 12, 16);
		}
		if (state.getValue(BLOCKSTATE) == 21) {
			return box(0, -4, 0, 16, 12, 16);
		}
		if (state.getValue(BLOCKSTATE) == 22) {
			return box(0, -4, 0, 16, 12, 16);
		}
		if (state.getValue(BLOCKSTATE) == 23) {
			return box(0, -4, 0, 16, 12, 16);
		}
		if (state.getValue(BLOCKSTATE) == 24) {
			return box(0, -4, 0, 16, 12, 16);
		}
		if (state.getValue(BLOCKSTATE) == 25) {
			return box(0, -4, 0, 16, -1, 16);
		}
		if (state.getValue(BLOCKSTATE) == 26) {
			return box(0, -4, 0, 16, 9, 16);
		}
		if (state.getValue(BLOCKSTATE) == 27) {
			return box(0, -4, 0, 16, -1, 16);
		}
		if (state.getValue(BLOCKSTATE) == 28) {
			return box(0, -4, 0, 16, 9, 16);
		}
		if (state.getValue(BLOCKSTATE) == 29) {
			return box(0, -4, 0, 16, 1, 16);
		}
		if (state.getValue(BLOCKSTATE) == 30) {
			return box(0, -4, 0, 16, 9, 16);
		}
		if (state.getValue(BLOCKSTATE) == 31) {
			return box(0, -4, 0, 16, 1, 16);
		}
		if (state.getValue(BLOCKSTATE) == 32) {
			return box(0, -4, 0, 16, 9, 16);
		}
		if (state.getValue(BLOCKSTATE) == 33) {
			return box(0, -4, 0, 16, 4, 16);
		}
		if (state.getValue(BLOCKSTATE) == 34) {
			return box(0, -4, 0, 16, 9, 16);
		}
		if (state.getValue(BLOCKSTATE) == 35) {
			return box(0, -4, 0, 16, 4, 16);
		}
		if (state.getValue(BLOCKSTATE) == 36) {
			return box(0, -4, 0, 16, 9, 16);
		}
		if (state.getValue(BLOCKSTATE) == 37) {
			return box(0, -4, 0, 16, 7, 16);
		}
		if (state.getValue(BLOCKSTATE) == 38) {
			return box(0, -4, 0, 16, 9, 16);
		}
		if (state.getValue(BLOCKSTATE) == 39) {
			return box(0, -4, 0, 16, 7, 16);
		}
		if (state.getValue(BLOCKSTATE) == 40) {
			return box(0, -4, 0, 16, 9, 16);
		}
		if (state.getValue(BLOCKSTATE) == 41) {
			return box(0, -4, 0, 16, 9, 16);
		}
		if (state.getValue(BLOCKSTATE) == 42) {
			return box(0, -4, 0, 16, 9, 16);
		}
		if (state.getValue(BLOCKSTATE) == 43) {
			return box(0, -4, 0, 16, 9, 16);
		}
		if (state.getValue(BLOCKSTATE) == 44) {
			return box(0, -4, 0, 16, 9, 16);
		}
		if (state.getValue(BLOCKSTATE) == 45) {
			return box(0, -4, 0, 16, 9, 16);
		}
		if (state.getValue(BLOCKSTATE) == 46) {
			return box(0, -4, 0, 16, 9, 16);
		}
		if (state.getValue(BLOCKSTATE) == 47) {
			return box(0, -4, 0, 16, 9, 16);
		}
		if (state.getValue(BLOCKSTATE) == 48) {
			return box(0, -4, 0, 16, 9, 16);
		}
		return box(0, -4, 0, 16, 2, 16);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(BLOCKSTATE);
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public ItemStack getCloneItemStack(LevelReader level, BlockPos pos, BlockState state) {
		return new ItemStack(TaleOfBiomesModItems.RICE_SEEDS.get());
	}

	@Override
	public PathType getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return PathType.WALKABLE;
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 1);
		RiceCropBlockAddedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		RiceCropOnTickUpdateProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		world.scheduleTick(pos, this, 1);
	}

	@Override
	public boolean isValidBonemealTarget(LevelReader worldIn, BlockPos pos, BlockState blockstate) {
		return true;
	}

	@Override
	public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState blockstate) {
		return true;
	}

	@Override
	public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState blockstate) {
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new RiceCropBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}
}
