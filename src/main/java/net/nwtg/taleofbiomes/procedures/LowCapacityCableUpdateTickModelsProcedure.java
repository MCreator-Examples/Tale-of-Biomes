package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class LowCapacityCableUpdateTickModelsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide()) {
			if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_N.get())) {
				LowCapacityCableUpdateTickModelsNProcedure.execute(world, x, y, z);
			}
			if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_E.get())) {
				LowCapacityCableUpdateTickModelsEProcedure.execute(world, x, y, z);
			}
			if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_I.get())) {
				LowCapacityCableUpdateTickModelsIProcedure.execute(world, x, y, z);
			}
			if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_L.get())) {
				LowCapacityCableUpdateTickModelsLProcedure.execute(world, x, y, z);
			}
			if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_LC.get())) {
				LowCapacityCableUpdateTickModelsLCProcedure.execute(world, x, y, z);
			}
			if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_LCC.get())) {
				LowCapacityCableUpdateTickModelsLCCProcedure.execute(world, x, y, z);
			}
			if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_LT.get())) {
				LowCapacityCableUpdateTickModelsLTProcedure.execute(world, x, y, z);
			}
			if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_LTC.get())) {
				LowCapacityCableUpdateTickModelsLTCProcedure.execute(world, x, y, z);
			}
			if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_T.get())) {
				LowCapacityCableUpdateTickModelsTProcedure.execute(world, x, y, z);
			}
			if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_TC.get())) {
				LowCapacityCableUpdateTickModelsTCProcedure.execute(world, x, y, z);
			}
			if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_TX.get())) {
				LowCapacityCableUpdateTickModelsTXProcedure.execute(world, x, y, z);
			}
			if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_TXC.get())) {
				LowCapacityCableUpdateTickModelsTXCProcedure.execute(world, x, y, z);
			}
			if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_TXCC.get())) {
				LowCapacityCableUpdateTickModelsTXCCProcedure.execute(world, x, y, z);
			}
			if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_X.get())) {
				LowCapacityCableUpdateTickModelsXProcedure.execute(world, x, y, z);
			}
			if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_XC.get())) {
				LowCapacityCableUpdateTickModelsXCProcedure.execute(world, x, y, z);
			}
			if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_F.get())) {
				LowCapacityCableUpdateTickModelsFProcedure.execute(world, x, y, z);
			}
			if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_S.get())) {
				LowCapacityCableUpdateTickModelsSProcedure.execute(world, x, y, z);
			}
		}
	}
}
