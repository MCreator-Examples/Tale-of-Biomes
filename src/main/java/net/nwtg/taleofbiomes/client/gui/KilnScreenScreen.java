package net.nwtg.taleofbiomes.client.gui;

import net.nwtg.taleofbiomes.world.inventory.KilnScreenMenu;
import net.nwtg.taleofbiomes.procedures.KilnScreenLightOnConditionProcedure;
import net.nwtg.taleofbiomes.procedures.KilnScreenLightOffConditionProcedure;
import net.nwtg.taleofbiomes.network.KilnScreenButtonMessage;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.WidgetSprites;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class KilnScreenScreen extends AbstractContainerScreen<KilnScreenMenu> {
	private final static HashMap<String, Object> guistate = KilnScreenMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_kiln_power_button;

	public KilnScreenScreen(KilnScreenMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("tale_of_biomes:textures/screens/kiln_screen.png");

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
		if (KilnScreenLightOffConditionProcedure.execute(world, entity)) {
			guiGraphics.blit(new ResourceLocation("tale_of_biomes:textures/screens/kiln_tube_h_off.png"), this.leftPos + 78, this.topPos + 58, 0, 0, 36, 6, 36, 6);
		}
		if (KilnScreenLightOnConditionProcedure.execute(world, entity)) {
			guiGraphics.blit(new ResourceLocation("tale_of_biomes:textures/screens/kiln_tube_h.png"), this.leftPos + 78, this.topPos + 58, 0, 0, 36, 6, 36, 6);
		}
		if (KilnScreenLightOffConditionProcedure.execute(world, entity)) {
			guiGraphics.blit(new ResourceLocation("tale_of_biomes:textures/screens/kiln_tube_v_off.png"), this.leftPos + 120, this.topPos + 34, 0, 0, 6, 18, 6, 18);
		}
		if (KilnScreenLightOnConditionProcedure.execute(world, entity)) {
			guiGraphics.blit(new ResourceLocation("tale_of_biomes:textures/screens/kiln_tube_v.png"), this.leftPos + 120, this.topPos + 34, 0, 0, 6, 18, 6, 18);
		}
		if (KilnScreenLightOffConditionProcedure.execute(world, entity)) {
			guiGraphics.blit(new ResourceLocation("tale_of_biomes:textures/screens/kiln_light_off.png"), this.leftPos + 159, this.topPos + 7, 0, 0, 8, 8, 8, 8);
		}
		if (KilnScreenLightOnConditionProcedure.execute(world, entity)) {
			guiGraphics.blit(new ResourceLocation("tale_of_biomes:textures/screens/kiln_light_on.png"), this.leftPos + 159, this.topPos + 7, 0, 0, 8, 8, 8, 8);
		}
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
		guiGraphics.drawString(this.font, Component.translatable("gui.tale_of_biomes.kiln_screen.label_kiln_furnace"), 6, 6, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tale_of_biomes.kiln_screen.label_inventory"), 6, 73, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_kiln_power_button = new ImageButton(this.leftPos + 114, this.topPos + 52, 18, 18,
				new WidgetSprites(new ResourceLocation("tale_of_biomes:textures/screens/kiln_power_button.png"), new ResourceLocation("tale_of_biomes:textures/screens/kiln_power_button_hover.png")), e -> {
					if (true) {
						PacketDistributor.SERVER.noArg().send(new KilnScreenButtonMessage(0, x, y, z));
						KilnScreenButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_kiln_power_button", imagebutton_kiln_power_button);
		this.addRenderableWidget(imagebutton_kiln_power_button);
	}
}
