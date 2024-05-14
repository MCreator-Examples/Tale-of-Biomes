package net.nwtg.taleofbiomes.procedures;

import net.neoforged.fml.loading.FMLPaths;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;

import java.io.IOException;
import java.io.FileWriter;
import java.io.File;

@Mod.EventBusSubscriber
public class GenerateKilnRecipeFileProcedure {
	@SubscribeEvent
	public static void onWorldLoad(net.neoforged.neoforge.event.level.LevelEvent.Load event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		com.google.gson.JsonObject mainObject = new com.google.gson.JsonObject();
		com.google.gson.JsonObject subObject = new com.google.gson.JsonObject();
		File file = new File("");
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
			file = new File((FMLPaths.GAMEDIR.get().toString() + "/config/tale_of_biomes/recipes"), File.separator + "kiln.json");
			if (!file.exists()) {
				try {
					file.getParentFile().mkdirs();
					file.createNewFile();
				} catch (IOException exception) {
					exception.printStackTrace();
				}
				subObject.addProperty("layer_1", "minecraft:coal_block");
				subObject.addProperty("layer_2", "tale_of_biomes:cobbled_limestone");
				subObject.addProperty("layer_3", "tale_of_biomes:cobbled_limestone");
				subObject.addProperty("layer_4", "tale_of_biomes:cobbled_limestone");
				subObject.addProperty("display", "tale_of_biomes:cobbled_limestone");
				subObject.addProperty("output", "tale_of_biomes:quicklime_block");
				subObject.addProperty("min_temperature", 825);
				subObject.addProperty("max_temperature", 950);
				subObject.addProperty("amount", 27);
				mainObject.add("1", subObject);
				{
					com.google.gson.Gson mainGSONBuilderVariable = new com.google.gson.GsonBuilder().setPrettyPrinting().create();
					try {
						FileWriter fileWriter = new FileWriter(file);
						fileWriter.write(mainGSONBuilderVariable.toJson(mainObject));
						fileWriter.close();
					} catch (IOException exception) {
						exception.printStackTrace();
					}
				}
			}
		}
	}
}
