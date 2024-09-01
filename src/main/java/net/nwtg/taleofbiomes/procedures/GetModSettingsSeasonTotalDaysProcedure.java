package net.nwtg.taleofbiomes.procedures;

import java.io.File;

public class GetModSettingsSeasonTotalDaysProcedure {
	public static double execute() {
		File fmFile = new File("");
		com.google.gson.JsonObject fmObjRoot = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmObjSeasons = new com.google.gson.JsonObject();
		double nSetting = 0;
		fmFile = new File(RootConfigFileFolderProcedure.execute(), File.separator + "settings.json");
		nSetting = 28;
		if (fmFile.exists()) {
			if (fmObjRoot.has("seasons") && fmObjRoot.get("seasons").isJsonObject()) {
				fmObjSeasons = fmObjRoot.get("seasons").getAsJsonObject();
				if (fmObjSeasons.has("total_days") && (fmObjSeasons.get("total_days").isJsonPrimitive() ? fmObjSeasons.get("total_days").getAsJsonPrimitive().isNumber() : false)) {
					nSetting = fmObjSeasons.get("total_days").getAsDouble();
				}
			}
		}
		return nSetting;
	}
}
