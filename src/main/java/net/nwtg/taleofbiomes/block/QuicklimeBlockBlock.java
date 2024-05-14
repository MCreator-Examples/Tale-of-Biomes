
package net.nwtg.taleofbiomes.block;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Mob;
import net.minecraft.core.BlockPos;

import com.mojang.serialization.MapCodec;

public class QuicklimeBlockBlock extends FallingBlock {
	public static final MapCodec<QuicklimeBlockBlock> CODEC = simpleCodec(QuicklimeBlockBlock::new);

	public MapCodec<QuicklimeBlockBlock> codec() {
		return CODEC;
	}

	public QuicklimeBlockBlock(BlockBehaviour.Properties ignored) {
		this();
	}

	public QuicklimeBlockBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.STONE).strength(2f, 6f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public BlockPathTypes getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return BlockPathTypes.BLOCKED;
	}
}
