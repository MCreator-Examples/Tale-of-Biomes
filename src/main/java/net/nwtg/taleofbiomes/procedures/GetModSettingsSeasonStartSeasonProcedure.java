package net.nwtg.taleofbiomes.procedures;

import java.io.File;

public class GetModSettingsSeasonStartSeasonProcedure {
	public static double execute() {
		File fmFile = new File("");
		com.google.gson.JsonObject fmObjRoot = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmObjSeasons = new com.google.gson.JsonObject();
		double nSetting = 0;
		fmFile = new File(RootConfigFileFolderProcedure.execute(), File.separator + "settings.json");
		nSetting = 1;
		if (fmFile.exists()) {
			if (fmObjRoot.has("seasons") && fmObjRoot.get("seasons").isJsonObject()) {
				fmObjSeasons = fmObjRoot.get("seasons").getAsJsonObject();
				if (fmObjSeasons.has("start_season") && (fmObjSeasons.get("start_season").isJsonPrimitive() ? fmObjSeasons.get("start_season").getAsJsonPrimitive().isNumber() : false)) {
					nSetting = fmObjSeasons.get("start_season").getAsDouble();
				}
			}
		}
		return nSetting;
	}
}
