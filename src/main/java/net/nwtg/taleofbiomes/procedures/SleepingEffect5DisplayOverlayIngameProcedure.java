package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.entity.Entity;

public class SleepingEffect5DisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getPersistentData().getBoolean("isPlayerSleeping") && entity.getPersistentData().getDouble("playerSleepTimer") >= 49 && entity.getPersistentData().getDouble("playerSleepTimer") <= 70;
	}
}
