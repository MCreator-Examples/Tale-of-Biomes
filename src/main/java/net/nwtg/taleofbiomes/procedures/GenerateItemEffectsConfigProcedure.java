package net.nwtg.taleofbiomes.procedures;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

public class GenerateItemEffectsConfigProcedure {
	public static void execute() {
		File fmFile = new File("");
		boolean lReset = false;
		com.google.gson.JsonObject fmMain = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmSettings = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmNamespace = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmDrinks = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmFoods = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmDrink = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmFood = new com.google.gson.JsonObject();
		fmFile = new File(RootConfigFileFolderProcedure.execute(), File.separator + "item_effects.json");
		if (!fmFile.exists()) {
			fmMain.addProperty("reset", false);
			fmFoods.addProperty("food", true);
			fmNamespace.add("foods", fmFoods);
			fmFoods.remove("food");
			fmDrink.addProperty("item_identifier", "piruff_water_cup");
			fmDrink.addProperty("effect_namespace", "minecraft");
			fmDrink.addProperty("effect_identifier", "regeneration");
			fmDrink.addProperty("effect_time", 15);
			fmDrink.addProperty("effect_amplifier", 0);
			fmDrink.addProperty("effect_particles", false);
			fmDrinks.add("piruff_water_cup_1", fmDrink);
			fmNamespace.add("drinks", fmDrinks);
			fmSettings.add("tale_of_biomes", fmNamespace);
			fmMain.add("settings", fmSettings);
			{
				com.google.gson.Gson mainGSONBuilderVariable = new com.google.gson.GsonBuilder().setPrettyPrinting().create();
				try {
					FileWriter fileWriter = new FileWriter(fmFile);
					fileWriter.write(mainGSONBuilderVariable.toJson(fmMain));
					fileWriter.close();
				} catch (IOException exception) {
					exception.printStackTrace();
				}
			}
		} else {
			lReset = false;
			{
				try {
					BufferedReader bufferedReader = new BufferedReader(new FileReader(fmFile));
					StringBuilder jsonstringbuilder = new StringBuilder();
					String line;
					while ((line = bufferedReader.readLine()) != null) {
						jsonstringbuilder.append(line);
					}
					bufferedReader.close();
					fmMain = new com.google.gson.Gson().fromJson(jsonstringbuilder.toString(), com.google.gson.JsonObject.class);
					if (fmMain.has("reset") && (fmMain.get("reset").isJsonPrimitive() ? fmMain.get("reset").getAsJsonPrimitive().isBoolean() : false)) {
						lReset = fmMain.get("reset").getAsBoolean();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (lReset) {
				fmMain.remove("settings");
				fmMain.addProperty("reset", false);
				fmFoods.addProperty("food", true);
				fmNamespace.add("foods", fmFoods);
				fmFoods.remove("food");
				fmDrink.addProperty("item_identifier", "piruff_water_cup");
				fmDrink.addProperty("effect_namespace", "minecraft");
				fmDrink.addProperty("effect_identifier", "regeneration");
				fmDrink.addProperty("effect_time", 15);
				fmDrink.addProperty("effect_amplifier", 0);
				fmDrink.addProperty("effect_particles", false);
				fmDrinks.add("piruff_water_cup_1", fmDrink);
				fmNamespace.add("drinks", fmDrinks);
				fmSettings.add("tale_of_biomes", fmNamespace);
				fmMain.add("settings", fmSettings);
				{
					com.google.gson.Gson mainGSONBuilderVariable = new com.google.gson.GsonBuilder().setPrettyPrinting().create();
					try {
						FileWriter fileWriter = new FileWriter(fmFile);
						fileWriter.write(mainGSONBuilderVariable.toJson(fmMain));
						fileWriter.close();
					} catch (IOException exception) {
						exception.printStackTrace();
					}
				}
			}
		}
	}
}
