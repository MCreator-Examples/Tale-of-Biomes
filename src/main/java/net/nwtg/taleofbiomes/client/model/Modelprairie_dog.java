package net.nwtg.taleofbiomes.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelprairie_dog<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("tale_of_biomes", "modelprairie_dog"), "main");
	public final ModelPart normal_head;
	public final ModelPart normal_body;
	public final ModelPart normal_arm_r;
	public final ModelPart normal_arm_l;
	public final ModelPart normal_leg_r;
	public final ModelPart normal_leg_l;

	public Modelprairie_dog(ModelPart root) {
		this.normal_head = root.getChild("normal_head");
		this.normal_body = root.getChild("normal_body");
		this.normal_arm_r = root.getChild("normal_arm_r");
		this.normal_arm_l = root.getChild("normal_arm_l");
		this.normal_leg_r = root.getChild("normal_leg_r");
		this.normal_leg_l = root.getChild("normal_leg_l");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition normal_head = partdefinition.addOrReplaceChild("normal_head",
				CubeListBuilder.create().texOffs(0, 12).addBox(-2.0F, -2.5F, -4.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(19, 12).addBox(-1.0F, -0.5F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.1F, 19.5F, -3.0F));
		PartDefinition normal_body = partdefinition.addOrReplaceChild("normal_body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -5.0F, -4.0F, 5.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(12, 16).addBox(-0.5F, -5.0F, 5.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition normal_arm_r = partdefinition.addOrReplaceChild("normal_arm_r", CubeListBuilder.create().texOffs(0, 4).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 22.0F, -3.0F));
		PartDefinition normal_arm_l = partdefinition.addOrReplaceChild("normal_arm_l", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 22.0F, -3.0F));
		PartDefinition normal_leg_r = partdefinition.addOrReplaceChild("normal_leg_r",
				CubeListBuilder.create().texOffs(12, 12).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(19, 4).addBox(-1.0F, 1.0F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 22.0F, 3.5F));
		PartDefinition normal_leg_l = partdefinition.addOrReplaceChild("normal_leg_l",
				CubeListBuilder.create().texOffs(18, 16).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(19, 0).addBox(-1.0F, 1.0F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 22.0F, 3.5F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		normal_head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		normal_body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		normal_arm_r.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		normal_arm_l.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		normal_leg_r.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		normal_leg_l.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.normal_arm_l.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.normal_head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.normal_head.xRot = headPitch / (180F / (float) Math.PI);
		this.normal_leg_l.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.normal_arm_r.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.normal_leg_r.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
