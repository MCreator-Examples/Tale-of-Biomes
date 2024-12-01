package net.nwtg.taleofbiomes.procedures;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

public class GenerateKilnRecipe4Procedure {
	public static void execute() {
		File fmFile = new File("");
		com.google.gson.JsonObject fmMain = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmRecipes = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmRecipe1 = new com.google.gson.JsonObject();
		double nRandom = 0;
		fmFile = new File(RootConfigFileFolderProcedure.execute(), File.separator + "kiln_recipes.json");
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
					fmMain = new com.google.gson.Gson().fromJson(jsonstringbuilder.toString(), com.google.gson.JsonObject.class);
					if (fmMain.has("recipes") && fmMain.get("recipes").isJsonObject()) {
						fmRecipes = fmMain.get("recipes").getAsJsonObject();
						fmRecipe1.addProperty("layer_1", "minecraft:coal_block");
						fmRecipe1.addProperty("layer_2", "tale_of_biomes:mixed_copper_dust_block");
						fmRecipe1.addProperty("layer_3", "tale_of_biomes:mixed_copper_dust_block");
						fmRecipe1.addProperty("layer_4", "tale_of_biomes:mixed_copper_dust_block");
						fmRecipe1.addProperty("display", "tale_of_biomes:mixed_copper_dust_block");
						fmRecipe1.addProperty("output", "minecraft:copper_block");
						fmRecipe1.addProperty("min_temperature", 1085);
						fmRecipe1.addProperty("max_temperature", 1285);
						fmRecipe1.addProperty("amount", 44);
						fmRecipes.add((new java.text.DecimalFormat("##").format(fmRecipes.size() + 1)), fmRecipe1);
						fmMain.add("recipes", fmRecipes);
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
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
