package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;

public class SeasonDeviceSpecialInformationProcedure {
	public static String execute(LevelAccessor world, ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("loreDisplay") == 1) {
			return "\u00A79" + "Season name: " + "\u00A7f" + TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonName;
		} else if (itemstack.getOrCreateTag().getDouble("loreDisplay") == 2) {
			return "\u00A79" + "Season day: " + "\u00A7f" + TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonDay;
		} else if (itemstack.getOrCreateTag().getDouble("loreDisplay") == 3) {
			return "\u00A79" + "Last season day: " + "\u00A7f" + TaleOfBiomesModVariables.WorldVariables.get(world).worldMaxSeasonDay;
		} else if (itemstack.getOrCreateTag().getDouble("loreDisplay") == 4) {
			return "\u00A79" + "Temperature: " + "\u00A7f" + new java.text.DecimalFormat("##.#").format(TaleOfBiomesModVariables.WorldVariables.get(world).worldTemperatureC) + "C | "
					+ new java.text.DecimalFormat("##.#").format(TaleOfBiomesModVariables.WorldVariables.get(world).worldTemperatureF) + "F";
		} else if (itemstack.getOrCreateTag().getDouble("loreDisplay") == 5) {
			return "\u00A79" + "Wind speed: " + "\u00A7f" + TaleOfBiomesModVariables.WorldVariables.get(world).worldWindSpeed;
		}
		return "\u00A7a" + "Right-click item when in main-hand!";
	}
}
