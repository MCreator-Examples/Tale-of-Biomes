package net.nwtg.taleofbiomes.procedures;

import org.checkerframework.checker.units.qual.s;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class SetBlockTemperatureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double nTemperature = 0;
		double nX = 0;
		double nY = 0;
		double nZ = 0;
		double temperature = 0;
		Entity ePlayer = null;
		if (!world.isClientSide()) {
			nX = x;
			nY = y;
			nZ = z;
			nTemperature = TaleOfBiomesModVariables.WorldVariables.get(world).worldTemperatureC + new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(nX, nY, nZ), "tobBiomeTemperature") + new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(nX, nY, nZ), "tobHeightTemperature");
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(nX, nY, nZ);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("tobTemperatureC", new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(new java.text.DecimalFormat("##.#").format(nTemperature)));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(nX, nY, nZ);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("tobTemperatureF", new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(new java.text.DecimalFormat("##.#").format(nTemperature * 1.8 + 32)));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}
