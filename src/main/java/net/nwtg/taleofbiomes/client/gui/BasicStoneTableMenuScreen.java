package net.nwtg.taleofbiomes.client.gui;

import net.nwtg.taleofbiomes.world.inventory.BasicStoneTableMenuMenu;
import net.nwtg.taleofbiomes.network.BasicStoneTableMenuButtonMessage;

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

public class BasicStoneTableMenuScreen extends AbstractContainerScreen<BasicStoneTableMenuMenu> {
	private final static HashMap<String, Object> guistate = BasicStoneTableMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_kiln_light_off;

	public BasicStoneTableMenuScreen(BasicStoneTableMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("tale_of_biomes:textures/screens/basic_stone_table_menu.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.tale_of_biomes.basic_stone_table_menu.label_basic_tool_table"), 7, 6, -12566464, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tale_of_biomes.basic_stone_table_menu.label_inventory"), 7, 73, -12566464, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_kiln_light_off = new ImageButton(this.leftPos + 11, this.topPos + 39, 8, 8,
				new WidgetSprites(new ResourceLocation("tale_of_biomes:textures/screens/kiln_light_off.png"), new ResourceLocation("tale_of_biomes:textures/screens/kiln_light_on.png")), e -> {
					if (true) {
						PacketDistributor.SERVER.noArg().send(new BasicStoneTableMenuButtonMessage(0, x, y, z));
						BasicStoneTableMenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_kiln_light_off", imagebutton_kiln_light_off);
		this.addRenderableWidget(imagebutton_kiln_light_off);
	}
}
