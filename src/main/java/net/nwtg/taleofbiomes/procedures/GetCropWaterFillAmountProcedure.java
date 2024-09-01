package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

public class GetCropWaterFillAmountProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z) {
		File fmFile = new File("");
		String sBlockRegistry = "";
		double nValue = 0;
		com.google.gson.JsonObject fmObjRoot = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmObjCrops = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmObjCropsRoot = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmObjCropsRootGroup = new com.google.gson.JsonObject();
		fmFile = new File(RootConfigFileFolderProcedure.execute(), File.separator + "crop_settings.json");
		sBlockRegistry = BuiltInRegistries.BLOCK.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString();
		nValue = 2;
		if (fmFile.exists()) {
			{
				try {
					BufferedReader bufferedReader = new BufferedReader(new FileReader(fmFile));
					StringBuilder jsonstringbuilder = new StringBuilder();
					String line;
					while ((line = bufferedReader.readLine()) != null) {
						jsonstringbuilder.append(line);
					}
					bufferedReader.close();
					fmObjRoot = new com.google.gson.Gson().fromJson(jsonstringbuilder.toString(), com.google.gson.JsonObject.class);
					if (fmObjRoot.has("crops") && fmObjRoot.get("crops").isJsonObject()) {
						fmObjCrops = fmObjRoot.get("crops").getAsJsonObject();
						if (fmObjCrops.has(sBlockRegistry) && fmObjCrops.get(sBlockRegistry).isJsonObject()) {
							fmObjCropsRoot = fmObjCrops.get(sBlockRegistry).getAsJsonObject();
							if (fmObjCropsRoot.has("water") && fmObjCropsRoot.get("water").isJsonObject()) {
								fmObjCropsRootGroup = fmObjCropsRoot.get("water").getAsJsonObject();
								if (fmObjCropsRootGroup.has("fill_amount") && (fmObjCropsRootGroup.get("fill_amount").isJsonPrimitive() ? fmObjCropsRootGroup.get("fill_amount").getAsJsonPrimitive().isNumber() : false)) {
									nValue = fmObjCropsRootGroup.get("fill_amount").getAsDouble();
								}
							}
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return nValue;
	}
}
