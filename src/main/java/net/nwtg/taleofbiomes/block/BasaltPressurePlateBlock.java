
package net.nwtg.taleofbiomes.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.PressurePlateBlock;

public class BasaltPressurePlateBlock extends PressurePlateBlock {
	public BasaltPressurePlateBlock() {
		super(BlockSetType.IRON, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_GRAY).sound(SoundType.STONE).strength(0.5f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn());
	}
}
