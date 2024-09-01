
package net.nwtg.taleofbiomes.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.nwtg.taleofbiomes.procedures.PlayerTemperatureTextFProcedure;
import net.nwtg.taleofbiomes.procedures.PlayerTemperatureTextCProcedure;
import net.nwtg.taleofbiomes.procedures.PlayerTemperatureDisplayOverlayIngameProcedure;

import net.neoforged.neoforge.client.event.RenderGuiEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;

@EventBusSubscriber({Dist.CLIENT})
public class PlayerTemperatureOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getGuiGraphics().guiWidth();
		int h = event.getGuiGraphics().guiHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (PlayerTemperatureDisplayOverlayIngameProcedure.execute(entity)) {
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					PlayerTemperatureTextCProcedure.execute(entity), 1, 1, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					PlayerTemperatureTextFProcedure.execute(entity), 1, 11, -1, false);
		}
	}
}
