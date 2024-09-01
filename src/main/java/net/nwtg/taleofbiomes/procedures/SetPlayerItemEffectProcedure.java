package net.nwtg.taleofbiomes.procedures;

import net.neoforged.neoforge.event.entity.living.LivingEntityUseItemEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

@EventBusSubscriber
public class SetPlayerItemEffectProcedure {
	@SubscribeEvent
	public static void onUseItemFinish(LivingEntityUseItemEvent.Finish event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity(), event.getItem());
		}
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		File fmFile = new File("");
		com.google.gson.JsonObject fmMain = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmSettings = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmNamespace = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmFoods = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmDrinks = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmFood = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmDrink = new com.google.gson.JsonObject();
		double nNamespaceIndex = 0;
		double nFoodsIndex = 0;
		double nDrinksIndex = 0;
		String sNamespace = "";
		String sFood = "";
		String sDrink = "";
		fmFile = new File(RootConfigFileFolderProcedure.execute(), File.separator + "item_effects.json");
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
					if (fmMain.has("settings") && fmMain.get("settings").isJsonObject()) {
						fmSettings = fmMain.get("settings").getAsJsonObject();
						if (!(fmSettings.size() == 0)) {
							nNamespaceIndex = 0;
							for (int index0 = 0; index0 < (int) fmSettings.size(); index0++) {
								sNamespace = fmSettings.keySet().stream().toList().get((Mth.nextInt(RandomSource.create(), (int) nNamespaceIndex, (int) nNamespaceIndex)));
								if (fmSettings.has(sNamespace) && fmSettings.get(sNamespace).isJsonObject()) {
									fmNamespace = fmSettings.get(sNamespace).getAsJsonObject();
									if (fmNamespace.has("foods") && fmNamespace.get("foods").isJsonObject()) {
										fmFoods = fmNamespace.get("foods").getAsJsonObject();
										if (!(fmFoods.size() == 0)) {
											nFoodsIndex = 0;
											for (int index1 = 0; index1 < (int) fmFoods.size(); index1++) {
												sFood = fmFoods.keySet().stream().toList().get((Mth.nextInt(RandomSource.create(), (int) nFoodsIndex, (int) nFoodsIndex)));
												if (fmFoods.has(sFood) && fmFoods.get(sFood).isJsonObject()) {
													fmFood = fmFoods.get(sFood).getAsJsonObject();
													if (itemstack.getItem() == BuiltInRegistries.ITEM.get(new ResourceLocation(((sNamespace + ":" + fmFood.get("item_identifier").getAsString())).toLowerCase(java.util.Locale.ENGLISH)))) {
														{
															Entity _ent = entity;
															if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																_ent.getServer().getCommands().performPrefixedCommand(
																		new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																				_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																		("effect give @s " + (fmFood.get("effect_namespace").getAsString() + ":" + fmFood.get("effect_identifier").getAsString() + " ")
																				+ (new java.text.DecimalFormat("##").format(fmFood.get("effect_time").getAsDouble()) + " ")
																				+ (new java.text.DecimalFormat("##").format(fmFood.get("effect_amplifier").getAsDouble()) + " ") + fmFood.get("effect_particles").getAsBoolean()));
															}
														}
													}
												}
												nFoodsIndex = nFoodsIndex + 1;
											}
										}
									}
									if (fmNamespace.has("drinks") && fmNamespace.get("drinks").isJsonObject()) {
										fmDrinks = fmNamespace.get("drinks").getAsJsonObject();
										if (!(fmDrinks.size() == 0)) {
											nDrinksIndex = 0;
											for (int index2 = 0; index2 < (int) fmDrinks.size(); index2++) {
												sDrink = fmDrinks.keySet().stream().toList().get((Mth.nextInt(RandomSource.create(), (int) nDrinksIndex, (int) nDrinksIndex)));
												if (fmDrinks.has(sDrink) && fmDrinks.get(sDrink).isJsonObject()) {
													fmDrink = fmDrinks.get(sDrink).getAsJsonObject();
													if (itemstack.getItem() == BuiltInRegistries.ITEM.get(new ResourceLocation(((sNamespace + ":" + fmDrink.get("item_identifier").getAsString())).toLowerCase(java.util.Locale.ENGLISH)))) {
														{
															Entity _ent = entity;
															if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																_ent.getServer().getCommands().performPrefixedCommand(
																		new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																				_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																		("effect give @s " + (fmDrink.get("effect_namespace").getAsString() + ":" + fmDrink.get("effect_identifier").getAsString() + " ")
																				+ (new java.text.DecimalFormat("##").format(fmDrink.get("effect_time").getAsDouble()) + " ")
																				+ (new java.text.DecimalFormat("##").format(fmDrink.get("effect_amplifier").getAsDouble()) + " ") + fmDrink.get("effect_particles").getAsBoolean()));
															}
														}
													}
												}
												nDrinksIndex = nDrinksIndex + 1;
											}
										}
									}
								}
								nNamespaceIndex = nNamespaceIndex + 1;
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
