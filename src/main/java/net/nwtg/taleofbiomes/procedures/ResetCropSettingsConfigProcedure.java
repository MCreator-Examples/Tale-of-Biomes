package net.nwtg.taleofbiomes.procedures;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

public class ResetCropSettingsConfigProcedure {
	public static void execute() {
		File fmFile = new File("");
		com.google.gson.JsonObject fmMain = new com.google.gson.JsonObject();
		fmFile = new File(RootConfigFileFolderProcedure.execute(), File.separator + "crop_settings.json");
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
					fmMain.addProperty("reset", true);
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
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
