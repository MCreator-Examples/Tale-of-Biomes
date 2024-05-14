package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import java.io.File;

public class KilnScreenWhileThisGUIIsOpenTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		com.google.gson.JsonObject mainObject = new com.google.gson.JsonObject();
		com.google.gson.JsonObject subObject = new com.google.gson.JsonObject();
		ItemStack display = ItemStack.EMPTY;
		ItemStack output = ItemStack.EMPTY;
		File file = new File("");
		String fileLayer1 = "";
		String fileLayer2 = "";
		String fileLayer3 = "";
		String fileLayer4 = "";
		BlockState layer3 = Blocks.AIR.defaultBlockState();
		BlockState layer4 = Blocks.AIR.defaultBlockState();
		BlockState layer1 = Blocks.AIR.defaultBlockState();
		BlockState layer2 = Blocks.AIR.defaultBlockState();
		double objectNumber = 0;
		double slot = 0;
		double posX = 0;
		double posY = 0;
		double posZ = 0;
		double offsetPosX = 0;
		double offsetPosZ = 0;
		posX = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosX;
		posY = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosY;
		posZ = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).blockPosZ;
	}
}
