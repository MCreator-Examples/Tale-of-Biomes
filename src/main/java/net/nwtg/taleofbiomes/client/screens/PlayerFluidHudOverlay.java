
package net.nwtg.taleofbiomes.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.nwtg.taleofbiomes.procedures.PlayerFluidHudDisplayOverlayIngameProcedure;
import net.nwtg.taleofbiomes.procedures.PlayerFluidHudCondition9Procedure;
import net.nwtg.taleofbiomes.procedures.PlayerFluidHudCondition8Procedure;
import net.nwtg.taleofbiomes.procedures.PlayerFluidHudCondition7Procedure;
import net.nwtg.taleofbiomes.procedures.PlayerFluidHudCondition6Procedure;
import net.nwtg.taleofbiomes.procedures.PlayerFluidHudCondition5Procedure;
import net.nwtg.taleofbiomes.procedures.PlayerFluidHudCondition4Procedure;
import net.nwtg.taleofbiomes.procedures.PlayerFluidHudCondition3Procedure;
import net.nwtg.taleofbiomes.procedures.PlayerFluidHudCondition2Procedure;
import net.nwtg.taleofbiomes.procedures.PlayerFluidHudCondition20Procedure;
import net.nwtg.taleofbiomes.procedures.PlayerFluidHudCondition1Procedure;
import net.nwtg.taleofbiomes.procedures.PlayerFluidHudCondition19Procedure;
import net.nwtg.taleofbiomes.procedures.PlayerFluidHudCondition18Procedure;
import net.nwtg.taleofbiomes.procedures.PlayerFluidHudCondition17Procedure;
import net.nwtg.taleofbiomes.procedures.PlayerFluidHudCondition16Procedure;
import net.nwtg.taleofbiomes.procedures.PlayerFluidHudCondition15Procedure;
import net.nwtg.taleofbiomes.procedures.PlayerFluidHudCondition14Procedure;
import net.nwtg.taleofbiomes.procedures.PlayerFluidHudCondition13Procedure;
import net.nwtg.taleofbiomes.procedures.PlayerFluidHudCondition12Procedure;
import net.nwtg.taleofbiomes.procedures.PlayerFluidHudCondition11Procedure;
import net.nwtg.taleofbiomes.procedures.PlayerFluidHudCondition10Procedure;

import net.neoforged.neoforge.client.event.RenderGuiEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@EventBusSubscriber({Dist.CLIENT})
public class PlayerFluidHudOverlay {
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
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (PlayerFluidHudDisplayOverlayIngameProcedure.execute(entity)) {
			event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_empty.png"), w / 2 + 82, h - 59, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_empty.png"), w / 2 + 74, h - 59, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_empty.png"), w / 2 + 66, h - 59, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_empty.png"), w / 2 + 58, h - 59, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_empty.png"), w / 2 + 50, h - 59, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_empty.png"), w / 2 + 42, h - 59, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_empty.png"), w / 2 + 34, h - 59, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_empty.png"), w / 2 + 26, h - 59, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_empty.png"), w / 2 + 18, h - 59, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_empty.png"), w / 2 + 10, h - 59, 0, 0, 9, 9, 9, 9);

			if (PlayerFluidHudCondition19Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_half.png"), w / 2 + 82, h - 59, 0, 0, 9, 9, 9, 9);
			}
			if (PlayerFluidHudCondition17Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_half.png"), w / 2 + 74, h - 59, 0, 0, 9, 9, 9, 9);
			}
			if (PlayerFluidHudCondition15Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_half.png"), w / 2 + 66, h - 59, 0, 0, 9, 9, 9, 9);
			}
			if (PlayerFluidHudCondition13Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_half.png"), w / 2 + 58, h - 59, 0, 0, 9, 9, 9, 9);
			}
			if (PlayerFluidHudCondition11Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_half.png"), w / 2 + 50, h - 59, 0, 0, 9, 9, 9, 9);
			}
			if (PlayerFluidHudCondition9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_half.png"), w / 2 + 42, h - 59, 0, 0, 9, 9, 9, 9);
			}
			if (PlayerFluidHudCondition7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_half.png"), w / 2 + 34, h - 59, 0, 0, 9, 9, 9, 9);
			}
			if (PlayerFluidHudCondition5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_half.png"), w / 2 + 26, h - 59, 0, 0, 9, 9, 9, 9);
			}
			if (PlayerFluidHudCondition3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_half.png"), w / 2 + 18, h - 59, 0, 0, 9, 9, 9, 9);
			}
			if (PlayerFluidHudCondition1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_half.png"), w / 2 + 10, h - 59, 0, 0, 9, 9, 9, 9);
			}
			if (PlayerFluidHudCondition20Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_full.png"), w / 2 + 82, h - 59, 0, 0, 9, 9, 9, 9);
			}
			if (PlayerFluidHudCondition18Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_full.png"), w / 2 + 74, h - 59, 0, 0, 9, 9, 9, 9);
			}
			if (PlayerFluidHudCondition16Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_full.png"), w / 2 + 66, h - 59, 0, 0, 9, 9, 9, 9);
			}
			if (PlayerFluidHudCondition14Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_full.png"), w / 2 + 58, h - 59, 0, 0, 9, 9, 9, 9);
			}
			if (PlayerFluidHudCondition12Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_full.png"), w / 2 + 50, h - 59, 0, 0, 9, 9, 9, 9);
			}
			if (PlayerFluidHudCondition10Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_full.png"), w / 2 + 42, h - 59, 0, 0, 9, 9, 9, 9);
			}
			if (PlayerFluidHudCondition8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_full.png"), w / 2 + 34, h - 59, 0, 0, 9, 9, 9, 9);
			}
			if (PlayerFluidHudCondition6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_full.png"), w / 2 + 26, h - 59, 0, 0, 9, 9, 9, 9);
			}
			if (PlayerFluidHudCondition4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_full.png"), w / 2 + 18, h - 59, 0, 0, 9, 9, 9, 9);
			}
			if (PlayerFluidHudCondition2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tale_of_biomes:textures/screens/fluid_full.png"), w / 2 + 10, h - 59, 0, 0, 9, 9, 9, 9);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
