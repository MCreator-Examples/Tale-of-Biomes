package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.entity.Entity;

public class BarrelStorageAmountDisplay3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (BarrelStorageAmountDisplayTextProcedure.execute(entity)).length() == 4;
	}
}
