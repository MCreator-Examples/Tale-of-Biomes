package net.nwtg.taleofbiomes.procedures;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import javax.annotation.Nullable;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class GenerateUpdateConfigProcedure {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		execute();
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		File fmFile = new File("");
		com.google.gson.JsonObject fmMain = new com.google.gson.JsonObject();
		String build = "";
		String latest = "";
		boolean bAutoUpdates = false;
		fmFile = new File(RootConfigFileFolderProcedure.execute(), File.separator + "update.json");
		if (!fmFile.exists()) {
			try {
				fmFile.getParentFile().mkdirs();
				fmFile.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			fmMain.addProperty("auto_updates", true);
			fmMain.addProperty("build", LatestModVersionProcedure.execute());
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
					bAutoUpdates = fmMain.get("auto_updates").getAsBoolean();
					build = fmMain.get("build").getAsString();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bAutoUpdates) {
				latest = LatestModVersionProcedure.execute();
				if (!(build).equals(latest)) {
					ResetCropSettingsConfigProcedure.execute();
					ResetKilnRecipeConfigProcedure.execute();
					ResetModSettingsConfigProcedure.execute();
					ResetItemEffectsConfigProcedure.execute();
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
							fmMain.addProperty("build", latest);
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
		CropSettingsGeneratorProcedure.execute();
		GenerateKilnRecipeFileProcedure.execute();
		GenerateModSettingsProcedure.execute();
		GenerateItemEffectsConfigProcedure.execute();
	}
}
