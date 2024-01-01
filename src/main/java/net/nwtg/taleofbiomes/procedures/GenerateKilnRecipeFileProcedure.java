package net.nwtg.taleofbiomes.procedures;

import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;

import java.io.IOException;
import java.io.FileWriter;
import java.io.File;

import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

@Mod.EventBusSubscriber
public class GenerateKilnRecipeFileProcedure {
	@SubscribeEvent
	public static void onWorldLoad(net.minecraftforge.event.level.LevelEvent.Load event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		com.google.gson.JsonObject mainObject = new com.google.gson.JsonObject();
		com.google.gson.JsonObject subObject = new com.google.gson.JsonObject();
		File file = new File("");
		if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == Level.OVERWORLD) {
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
					Gson mainGSONBuilderVariable = new GsonBuilder().setPrettyPrinting().create();
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
