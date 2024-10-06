package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.entity.Entity;

public class BarrelStorageAmountDisplayTextProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "" + new java.text.DecimalFormat("##").format(GetBarrelFilledAmountProcedure.execute(entity));
	}
}
