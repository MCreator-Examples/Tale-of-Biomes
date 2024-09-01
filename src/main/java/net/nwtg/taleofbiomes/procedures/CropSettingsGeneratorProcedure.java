package net.nwtg.taleofbiomes.procedures;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

public class CropSettingsGeneratorProcedure {
	public static void execute() {
		File fmFile = new File("");
		boolean bReset = false;
		com.google.gson.JsonObject fmObjRoot = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmObjCrops = new com.google.gson.JsonObject();
		fmFile = new File(RootConfigFileFolderProcedure.execute(), File.separator + "crop_settings.json");
		if (!fmFile.exists()) {
			try {
				fmFile.getParentFile().mkdirs();
				fmFile.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			fmObjRoot.addProperty("reset", false);
			fmObjCrops.addProperty("temp", "temp");
			fmObjRoot.add("crops", fmObjCrops);
			fmObjCrops.remove("temp");
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
			RiceCropGenerateConfigSettingsProcedure.execute();
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
				fmObjCrops.remove("crops");
				fmObjCrops.addProperty("temp", "temp");
				fmObjRoot.add("crops", fmObjCrops);
				fmObjCrops.remove("temp");
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
				RiceCropGenerateConfigSettingsProcedure.execute();
			}
		}
	}
}
