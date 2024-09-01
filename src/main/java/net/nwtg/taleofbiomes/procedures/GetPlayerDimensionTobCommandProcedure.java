package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class GetPlayerDimensionTobCommandProcedure {
	public static String execute(CommandContext<CommandSourceStack> arguments) {
		String sKey = "";
		double nSubstring = 0;
		boolean bCropped = false;
		sKey = "" + (new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "player");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()).level().dimension();
		if (!(sKey).isEmpty() && (sKey).length() > 2) {
			nSubstring = 0;
			for (int index0 = 0; index0 < (int) (sKey).length(); index0++) {
				if (nSubstring + 2 <= (sKey).length()) {
					if ((sKey.substring((int) nSubstring, (int) (nSubstring + 2))).equals("/ ")) {
						sKey = (sKey.substring((int) (nSubstring + 2), (int) (sKey).length())).replace("]", "");
						bCropped = true;
						break;
					} else {
						nSubstring = nSubstring + 1;
					}
				} else {
					break;
				}
			}
		}
		if (!bCropped) {
			sKey = "";
		}
		return sKey;
	}
}
