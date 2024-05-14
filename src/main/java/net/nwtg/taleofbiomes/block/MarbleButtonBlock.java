
package net.nwtg.taleofbiomes.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.ButtonBlock;

public class MarbleButtonBlock extends ButtonBlock {
	public MarbleButtonBlock() {
		super(BlockSetType.STONE, 20, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.QUARTZ).sound(SoundType.STONE).strength(0.5f).requiresCorrectToolForDrops().dynamicShape());
	}
}
