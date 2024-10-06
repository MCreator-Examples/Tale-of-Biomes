package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.minecraft.core.registries.BuiltInRegistries;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

public class RiceCropGenerateConfigSettingsProcedure {
	public static void execute() {
		File fmFile = new File("");
		String sBlockRegistry = "";
		com.google.gson.JsonObject fmObjRoot = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmObjCrops = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmObjCropsRoot = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmObjWater = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmObjLight = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmObjTemperature = new com.google.gson.JsonObject();
		fmFile = new File(RootConfigFileFolderProcedure.execute(), File.separator + "crop_settings.json");
		sBlockRegistry = BuiltInRegistries.BLOCK.getKey(TaleOfBiomesModBlocks.RICE_CROP.get()).toString();
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
						if (!fmObjCrops.has(sBlockRegistry)) {
							fmObjCropsRoot.addProperty("growth_time", 24000);
							fmObjCropsRoot.addProperty("max_health", 3600);
							fmObjCropsRoot.addProperty("damage_time", 20);
							fmObjWater.addProperty("damage", 1);
							fmObjWater.addProperty("storage", 1200);
							fmObjWater.addProperty("drain_amount", 1);
							fmObjWater.addProperty("fill_amount", 2);
							fmObjCropsRoot.add("water", fmObjWater);
							fmObjLight.addProperty("damage", 1);
							fmObjLight.addProperty("storage", 30000);
							fmObjLight.addProperty("min_light", 8000);
							fmObjLight.addProperty("min_light_level", 9);
							fmObjLight.addProperty("min_light_time", 24000);
							fmObjLight.addProperty("drain_amount", 1);
							fmObjCropsRoot.add("light", fmObjLight);
							fmObjTemperature.addProperty("damage", 1);
							fmObjTemperature.addProperty("min_critical_time", 24000);
							fmObjTemperature.addProperty("min_critical_temperature", 15);
							fmObjTemperature.addProperty("max_critical_temperature", 40);
							fmObjTemperature.addProperty("min_growth_temperature", 20);
							fmObjTemperature.addProperty("max_growth_temperature", 35);
							fmObjCropsRoot.add("temperature", fmObjTemperature);
							fmObjCrops.add(sBlockRegistry, fmObjCropsRoot);
							fmObjRoot.add("crops", fmObjCrops);
							{
								com.google.gson.Gson mainGSONBuilderVariable = new com.google.gson.GsonBuilder().setPrettyPrinting().create();
								try {
									FileWriter fileWriter = new FileWriter(fmFile);
									fileWriter.write(mainGSONBuilderVariable.toJson(fmObjRoot));
									fileWriter.close();
								} catch (IOException exception) {
									exception.printStackTrace();
								}
							}
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
