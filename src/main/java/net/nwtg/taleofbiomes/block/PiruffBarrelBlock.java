
package net.nwtg.taleofbiomes.block;

import net.nwtg.taleofbiomes.world.inventory.PiruffBarrelInventoryMenu;
import net.nwtg.taleofbiomes.procedures.BarrelOnTickUpdateProcedure;
import net.nwtg.taleofbiomes.block.entity.PiruffBarrelBlockEntity;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.Containers;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import io.netty.buffer.Unpooled;

public class PiruffBarrelBlock extends Block implements SimpleWaterloggedBlock, EntityBlock {
	public static final DirectionProperty FACING = DirectionalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public PiruffBarrelBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(2.5f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
	}

	@Override
	public boolean shouldDisplayFluidOverlay(BlockState state, BlockAndTintGetter world, BlockPos pos, FluidState fluidstate) {
		return true;
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return state.getFluidState().isEmpty();
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
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(1, 1, 0, 2, 15, 16), box(2, 14, 0, 14, 15, 16), box(2, 1, 0, 14, 2, 16), box(2, 2, 14, 14, 14, 15), box(2, 2, 1, 14, 14, 2), box(14, 1, 0, 15, 15, 16), box(0, 0, 11, 16, 1, 13), box(0, 15, 3, 16, 16, 5),
					box(0, 0, 3, 16, 1, 5), box(0, 15, 11, 16, 16, 13), box(15, 1, 11, 16, 15, 13), box(0, 1, 11, 1, 15, 13), box(0, 1, 3, 1, 15, 5), box(15, 1, 3, 16, 15, 5));
			case NORTH -> Shapes.or(box(14, 1, 0, 15, 15, 16), box(2, 14, 0, 14, 15, 16), box(2, 1, 0, 14, 2, 16), box(2, 2, 1, 14, 14, 2), box(2, 2, 14, 14, 14, 15), box(1, 1, 0, 2, 15, 16), box(0, 0, 3, 16, 1, 5), box(0, 15, 11, 16, 16, 13),
					box(0, 0, 11, 16, 1, 13), box(0, 15, 3, 16, 16, 5), box(0, 1, 3, 1, 15, 5), box(15, 1, 3, 16, 15, 5), box(15, 1, 11, 16, 15, 13), box(0, 1, 11, 1, 15, 13));
			case EAST -> Shapes.or(box(0, 1, 14, 16, 15, 15), box(0, 14, 2, 16, 15, 14), box(0, 1, 2, 16, 2, 14), box(14, 2, 2, 15, 14, 14), box(1, 2, 2, 2, 14, 14), box(0, 1, 1, 16, 15, 2), box(11, 0, 0, 13, 1, 16), box(3, 15, 0, 5, 16, 16),
					box(3, 0, 0, 5, 1, 16), box(11, 15, 0, 13, 16, 16), box(11, 1, 0, 13, 15, 1), box(11, 1, 15, 13, 15, 16), box(3, 1, 15, 5, 15, 16), box(3, 1, 0, 5, 15, 1));
			case WEST -> Shapes.or(box(0, 1, 1, 16, 15, 2), box(0, 14, 2, 16, 15, 14), box(0, 1, 2, 16, 2, 14), box(1, 2, 2, 2, 14, 14), box(14, 2, 2, 15, 14, 14), box(0, 1, 14, 16, 15, 15), box(3, 0, 0, 5, 1, 16), box(11, 15, 0, 13, 16, 16),
					box(11, 0, 0, 13, 1, 16), box(3, 15, 0, 5, 16, 16), box(3, 1, 15, 5, 15, 16), box(3, 1, 0, 5, 15, 1), box(11, 1, 0, 13, 15, 1), box(11, 1, 15, 13, 15, 16));
			case UP -> Shapes.or(box(14, 0, 1, 15, 16, 15), box(2, 0, 14, 14, 16, 15), box(2, 0, 1, 14, 16, 2), box(2, 14, 2, 14, 15, 14), box(2, 1, 2, 14, 2, 14), box(1, 0, 1, 2, 16, 15), box(0, 11, 0, 16, 13, 1), box(0, 3, 15, 16, 5, 16),
					box(0, 3, 0, 16, 5, 1), box(0, 11, 15, 16, 13, 16), box(0, 11, 1, 1, 13, 15), box(15, 11, 1, 16, 13, 15), box(15, 3, 1, 16, 5, 15), box(0, 3, 1, 1, 5, 15));
			case DOWN -> Shapes.or(box(14, 0, 1, 15, 16, 15), box(2, 0, 1, 14, 16, 2), box(2, 0, 14, 14, 16, 15), box(2, 1, 2, 14, 2, 14), box(2, 14, 2, 14, 15, 14), box(1, 0, 1, 2, 16, 15), box(0, 3, 15, 16, 5, 16), box(0, 11, 0, 16, 13, 1),
					box(0, 11, 15, 16, 13, 16), box(0, 3, 0, 16, 5, 1), box(0, 3, 1, 1, 5, 15), box(15, 3, 1, 16, 5, 15), box(15, 11, 1, 16, 13, 15), box(0, 11, 1, 1, 13, 15));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, WATERLOGGED);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		return super.getStateForPlacement(context).setValue(FACING, context.getNearestLookingDirection().getOpposite()).setValue(WATERLOGGED, flag);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
		if (state.getValue(WATERLOGGED)) {
			world.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
		}
		return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 1);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		BarrelOnTickUpdateProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		world.scheduleTick(pos, this, 1);
	}

	@Override
	public InteractionResult useWithoutItem(BlockState blockstate, Level world, BlockPos pos, Player entity, BlockHitResult hit) {
		super.useWithoutItem(blockstate, world, pos, entity, hit);
		if (entity instanceof ServerPlayer player) {
			player.openMenu(new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return Component.literal("Piruff Barrel");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new PiruffBarrelInventoryMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(pos));
				}
			}, pos);
		}
		return InteractionResult.SUCCESS;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new PiruffBarrelBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof PiruffBarrelBlockEntity be) {
				Containers.dropContents(world, pos, be);
				world.updateNeighbourForOutputSignal(pos, this);
			}
			super.onRemove(state, world, pos, newState, isMoving);
		}
	}

	@Override
	public boolean hasAnalogOutputSignal(BlockState state) {
		return true;
	}

	@Override
	public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
		BlockEntity tileentity = world.getBlockEntity(pos);
		if (tileentity instanceof PiruffBarrelBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}
