package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class GetGUIBlockLocalizationProcedure {
	public static String execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return "";
		double nSubstring = 0;
		String sRegistry = "";
		String sCrop = "";
		sRegistry = BuiltInRegistries.BLOCK.getKey((world.getBlockState(
				BlockPos.containing(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosX, entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosY, entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosZ)))
				.getBlock()).toString();
		sRegistry = sRegistry.replace(":", ".");
		return Component.translatable(("block" + "." + sRegistry)).getString();
	}
}
