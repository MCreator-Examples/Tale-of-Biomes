package net.nwtg.taleofbiomes.procedures;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

public class GenerateModSettingsProcedure {
	public static void execute() {
		File fmFile = new File("");
		com.google.gson.JsonObject fmObjRoot = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmObjSeasons = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmObjSettings = new com.google.gson.JsonObject();
		boolean bReset = false;
		fmFile = new File(RootConfigFileFolderProcedure.execute(), File.separator + "settings.json");
		if (!fmFile.exists()) {
			try {
				fmFile.getParentFile().mkdirs();
				fmFile.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			fmObjRoot.addProperty("reset", false);
			fmObjSeasons.addProperty("progression_enabled", true);
			fmObjSeasons.addProperty("start_season", 2);
			fmObjSeasons.addProperty("total_days", 28);
			fmObjSettings.add("seasons", fmObjSeasons);
			fmObjRoot.add("settings", fmObjSettings);
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
		} else {
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
					if (fmObjRoot.has("reset") && (fmObjRoot.get("reset").isJsonPrimitive() ? fmObjRoot.get("reset").getAsJsonPrimitive().isBoolean() : false)) {
						bReset = fmObjRoot.get("reset").getAsBoolean();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bReset) {
				fmObjRoot.addProperty("reset", false);
				fmObjRoot.remove("settings");
				fmObjSeasons.addProperty("progression_enabled", true);
				fmObjSeasons.addProperty("start_season", 2);
				fmObjSeasons.addProperty("total_days", 28);
				fmObjSettings.add("seasons", fmObjSeasons);
				fmObjRoot.add("settings", fmObjSettings);
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
	}
}
