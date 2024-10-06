package net.nwtg.taleofbiomes.client.gui;

import net.nwtg.taleofbiomes.world.inventory.PiruffBarrelInventoryMenu;
import net.nwtg.taleofbiomes.procedures.BarrelStorageAmountDisplayTextProcedure;
import net.nwtg.taleofbiomes.procedures.BarrelStorageAmountDisplay3Procedure;
import net.nwtg.taleofbiomes.procedures.BarrelStorageAmountDisplay2Procedure;
import net.nwtg.taleofbiomes.procedures.BarrelStorageAmountDisplay1Procedure;
import net.nwtg.taleofbiomes.procedures.BarrelStorageAmountDisplay0Procedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class PiruffBarrelInventoryScreen extends AbstractContainerScreen<PiruffBarrelInventoryMenu> {
	private final static HashMap<String, Object> guistate = PiruffBarrelInventoryMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public PiruffBarrelInventoryScreen(PiruffBarrelInventoryMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("tale_of_biomes:textures/screens/piruff_barrel_inventory.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.tale_of_biomes.piruff_barrel_inventory.label_piruff_barrel"), 7, 8, -12829636, false);
		if (BarrelStorageAmountDisplay3Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					BarrelStorageAmountDisplayTextProcedure.execute(entity), 146, 8, -12829636, false);
		if (BarrelStorageAmountDisplay2Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					BarrelStorageAmountDisplayTextProcedure.execute(entity), 152, 8, -12829636, false);
		if (BarrelStorageAmountDisplay1Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					BarrelStorageAmountDisplayTextProcedure.execute(entity), 157, 8, -12829636, false);
		if (BarrelStorageAmountDisplay0Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					BarrelStorageAmountDisplayTextProcedure.execute(entity), 162, 8, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
