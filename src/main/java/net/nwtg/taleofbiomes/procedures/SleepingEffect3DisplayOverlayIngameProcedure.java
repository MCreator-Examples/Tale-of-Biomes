package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.entity.Entity;

public class SleepingEffect3DisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getPersistentData().getBoolean("isPlayerSleeping") && entity.getPersistentData().getDouble("playerSleepTimer") >= 25 && entity.getPersistentData().getDouble("playerSleepTimer") <= 36;
	}
}
