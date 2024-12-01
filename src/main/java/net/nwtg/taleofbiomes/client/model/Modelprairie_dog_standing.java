package net.nwtg.taleofbiomes.client.model;

import net.minecraft.world.entity.Entity;
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
public class Modelprairie_dog_standing<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("tale_of_biomes", "modelprairie_dog_standing"), "main");
	public final ModelPart standing_head;
	public final ModelPart standing_body;
	public final ModelPart standing_arm_r;
	public final ModelPart standing_arm_l;
	public final ModelPart standing_leg_r;
	public final ModelPart standing_leg_l;

	public Modelprairie_dog_standing(ModelPart root) {
		this.standing_head = root.getChild("standing_head");
		this.standing_body = root.getChild("standing_body");
		this.standing_arm_r = root.getChild("standing_arm_r");
		this.standing_arm_l = root.getChild("standing_arm_l");
		this.standing_leg_r = root.getChild("standing_leg_r");
		this.standing_leg_l = root.getChild("standing_leg_l");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition standing_head = partdefinition.addOrReplaceChild("standing_head",
				CubeListBuilder.create().texOffs(0, 12).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(19, 12).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 13.0F, 0.0F));
		PartDefinition standing_body = partdefinition.addOrReplaceChild("standing_body", CubeListBuilder.create().texOffs(12, 16).addBox(-0.5F, -1.0F, 2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 0.0F));
		PartDefinition standing_chest_r1 = standing_body.addOrReplaceChild("standing_chest_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -1.5F, -4.5F, 5.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.5F, 0.5F, -1.5708F, 0.0F, 0.0F));
		PartDefinition standing_arm_r = partdefinition.addOrReplaceChild("standing_arm_r", CubeListBuilder.create(), PartPose.offset(-1.5F, 15.0F, -1.0F));
		PartDefinition standing_r_arm_r1 = standing_arm_r.addOrReplaceChild("standing_r_arm_r1", CubeListBuilder.create().texOffs(0, 4).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition standing_arm_l = partdefinition.addOrReplaceChild("standing_arm_l", CubeListBuilder.create(), PartPose.offset(1.5F, 15.0F, -1.0F));
		PartDefinition standing_l_arm_r1 = standing_arm_l.addOrReplaceChild("standing_l_arm_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition standing_leg_r = partdefinition.addOrReplaceChild("standing_leg_r",
				CubeListBuilder.create().texOffs(12, 12).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(19, 4).addBox(-1.0F, 1.0F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 22.0F, 0.5F));
		PartDefinition standing_leg_l = partdefinition.addOrReplaceChild("standing_leg_l",
				CubeListBuilder.create().texOffs(18, 16).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(19, 0).addBox(-1.0F, 1.0F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 22.0F, 0.5F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		standing_head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		standing_body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		standing_arm_r.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		standing_arm_l.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		standing_leg_r.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		standing_leg_l.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.standing_head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.standing_head.xRot = headPitch / (180F / (float) Math.PI);
	}
}
