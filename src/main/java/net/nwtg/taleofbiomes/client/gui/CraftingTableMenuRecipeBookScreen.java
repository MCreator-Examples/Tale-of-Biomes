package net.nwtg.taleofbiomes.client.gui;

import net.nwtg.taleofbiomes.world.inventory.CraftingTableMenuRecipeBookMenu;
import net.nwtg.taleofbiomes.procedures.GetGUIBlockLocalizationProcedure;
import net.nwtg.taleofbiomes.network.CraftingTableMenuRecipeBookButtonMessage;

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

public class CraftingTableMenuRecipeBookScreen extends AbstractContainerScreen<CraftingTableMenuRecipeBookMenu> {
	private final static HashMap<String, Object> guistate = CraftingTableMenuRecipeBookMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_button_left;
	ImageButton imagebutton_button_right;
	ImageButton imagebutton_recipe_helper_button;

	public CraftingTableMenuRecipeBookScreen(CraftingTableMenuRecipeBookMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

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

		guiGraphics.blit(ResourceLocation.parse("tale_of_biomes:textures/screens/crafting_station_gui.png"), this.leftPos + 97, this.topPos + 0, 0, 0, 176, 166, 176, 166);

		guiGraphics.blit(ResourceLocation.parse("tale_of_biomes:textures/screens/crafting_station_gui_helper.png"), this.leftPos + -97, this.topPos + 0, 0, 0, 176, 108, 176, 108);

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
		guiGraphics.drawString(this.font,

				GetGUIBlockLocalizationProcedure.execute(world, entity), 104, 5, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tale_of_biomes.crafting_table_menu_recipe_book.label_recipe_helper"), -90, 5, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_button_left = new ImageButton(this.leftPos + -72, this.topPos + 83, 27, 18,
				new WidgetSprites(ResourceLocation.parse("tale_of_biomes:textures/screens/button_left.png"), ResourceLocation.parse("tale_of_biomes:textures/screens/button_left_hover.png")), e -> {
					if (true) {
						PacketDistributor.sendToServer(new CraftingTableMenuRecipeBookButtonMessage(0, x, y, z));
						CraftingTableMenuRecipeBookButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_button_left", imagebutton_button_left);
		this.addRenderableWidget(imagebutton_button_left);
		imagebutton_button_right = new ImageButton(this.leftPos + -45, this.topPos + 83, 27, 18,
				new WidgetSprites(ResourceLocation.parse("tale_of_biomes:textures/screens/button_right.png"), ResourceLocation.parse("tale_of_biomes:textures/screens/button_right_hover.png")), e -> {
					if (true) {
						PacketDistributor.sendToServer(new CraftingTableMenuRecipeBookButtonMessage(1, x, y, z));
						CraftingTableMenuRecipeBookButtonMessage.handleButtonAction(entity, 1, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_button_right", imagebutton_button_right);
		this.addRenderableWidget(imagebutton_button_right);
		imagebutton_recipe_helper_button = new ImageButton(this.leftPos + 101, this.topPos + 41, 18, 18,
				new WidgetSprites(ResourceLocation.parse("tale_of_biomes:textures/screens/recipe_helper_button.png"), ResourceLocation.parse("tale_of_biomes:textures/screens/recipe_helper_hover_button.png")), e -> {
					if (true) {
						PacketDistributor.sendToServer(new CraftingTableMenuRecipeBookButtonMessage(2, x, y, z));
						CraftingTableMenuRecipeBookButtonMessage.handleButtonAction(entity, 2, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_recipe_helper_button", imagebutton_recipe_helper_button);
		this.addRenderableWidget(imagebutton_recipe_helper_button);
	}
}
