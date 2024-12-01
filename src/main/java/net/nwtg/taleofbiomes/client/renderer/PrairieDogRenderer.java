
package net.nwtg.taleofbiomes.client.renderer;

import net.nwtg.taleofbiomes.procedures.PrairieDogStandingDisplayConditionProcedure;
import net.nwtg.taleofbiomes.procedures.PrairieDogNormalDisplayConditionProcedure;
import net.nwtg.taleofbiomes.entity.PrairieDogEntity;
import net.nwtg.taleofbiomes.client.model.Modelprairie_dog_standing;
import net.nwtg.taleofbiomes.client.model.Modelprairie_dog;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PrairieDogRenderer extends MobRenderer<PrairieDogEntity, Modelprairie_dog<PrairieDogEntity>> {
	public PrairieDogRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelprairie_dog(context.bakeLayer(Modelprairie_dog.LAYER_LOCATION)), 0.6f);
		this.addLayer(new RenderLayer<PrairieDogEntity, Modelprairie_dog<PrairieDogEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("tale_of_biomes:textures/entities/prairie_dog.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PrairieDogEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (PrairieDogNormalDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelprairie_dog(Minecraft.getInstance().getEntityModels().bakeLayer(Modelprairie_dog.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
		this.addLayer(new RenderLayer<PrairieDogEntity, Modelprairie_dog<PrairieDogEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("tale_of_biomes:textures/entities/prairie_dog.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PrairieDogEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (PrairieDogStandingDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelprairie_dog_standing(Minecraft.getInstance().getEntityModels().bakeLayer(Modelprairie_dog_standing.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(PrairieDogEntity entity) {
		return ResourceLocation.parse("tale_of_biomes:textures/entities/prairie_dog_empty.png");
	}
}
