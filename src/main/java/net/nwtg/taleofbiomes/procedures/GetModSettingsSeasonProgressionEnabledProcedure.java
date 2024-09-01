package net.nwtg.taleofbiomes.procedures;

import java.io.File;

public class GetModSettingsSeasonProgressionEnabledProcedure {
	public static boolean execute() {
		File fmFile = new File("");
		com.google.gson.JsonObject fmObjRoot = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmObjSeasons = new com.google.gson.JsonObject();
		boolean bSetting = false;
		fmFile = new File(RootConfigFileFolderProcedure.execute(), File.separator + "settings.json");
		bSetting = true;
		if (fmFile.exists()) {
			if (fmObjRoot.has("seasons") && fmObjRoot.get("seasons").isJsonObject()) {
				fmObjSeasons = fmObjRoot.get("seasons").getAsJsonObject();
				if (fmObjSeasons.has("progression_enabled") && (fmObjSeasons.get("progression_enabled").isJsonPrimitive() ? fmObjSeasons.get("progression_enabled").getAsJsonPrimitive().isBoolean() : false)) {
					bSetting = fmObjSeasons.get("progression_enabled").getAsBoolean();
				}
			}
		}
		return bSetting;
	}
}
