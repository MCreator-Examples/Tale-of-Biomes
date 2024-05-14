package net.nwtg.taleofbiomes.procedures;

import org.checkerframework.checker.units.qual.min;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModItems;
import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import java.util.Map;

public class GhostBushOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double min = 0;
		double max = 0;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TaleOfBiomesModBlocks.GHOST_BUSH_2.get()) {
			min = 2;
			max = 3;
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TaleOfBiomesModBlocks.GHOST_BUSH_3.get()) {
			min = 3;
			max = 5;
		}
		for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), (int) min, (int) max); index0++) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TaleOfBiomesModItems.GHOST_BERRIES.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = TaleOfBiomesModBlocks.GHOST_BUSH_1.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}
