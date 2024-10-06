package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class RiceCropTemperatureScriptProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double nX = 0;
		double nY = 0;
		double nZ = 0;
		double nMinLightLevel = 0;
		double nStorage = 0;
		double nLightLevel = 0;
		double nDrainAmount = 0;
		double nLight = 0;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"toba run temperature block");
	}
}
