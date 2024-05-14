// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelyellow_bed<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "yellow_bed"), "main");
	private final ModelPart bone;

	public Modelyellow_bed(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(8, 57)
						.addBox(-8.0F, -12.0F, -8.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 31)
						.addBox(-8.0F, -16.0F, 22.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(6.0F, -16.0F, 22.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 57)
						.addBox(6.0F, -12.0F, -8.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -6.0F, -6.0F, 16.0F, 3.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-6.0F, -10.0F, -8.0F, 12.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -14.0F, 22.0F, 12.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(-7.5F, -9.5F, -6.0F, 15.0F, 6.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(50, 31)
						.addBox(-7.0F, -9.0F, 14.0F, 14.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(50, 42)
						.addBox(-6.0F, -10.0F, 15.0F, 12.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}