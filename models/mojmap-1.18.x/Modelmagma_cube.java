// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmagma_cube<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "magma_cube"), "main");
	private final ModelPart segment1;
	private final ModelPart segment2;
	private final ModelPart segment3;
	private final ModelPart segment4;
	private final ModelPart segment5;
	private final ModelPart segment6;
	private final ModelPart segment7;
	private final ModelPart segment8;
	private final ModelPart core;
	private final ModelPart bb_main;

	public Modelmagma_cube(ModelPart root) {
		this.segment1 = root.getChild("segment1");
		this.segment2 = root.getChild("segment2");
		this.segment3 = root.getChild("segment3");
		this.segment4 = root.getChild("segment4");
		this.segment5 = root.getChild("segment5");
		this.segment6 = root.getChild("segment6");
		this.segment7 = root.getChild("segment7");
		this.segment8 = root.getChild("segment8");
		this.core = root.getChild("core");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition segment1 = partdefinition.addOrReplaceChild("segment1", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, 16.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition segment2 = partdefinition.addOrReplaceChild("segment2",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(-4.0F, 17.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, 14.0F, 2.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition segment3 = partdefinition.addOrReplaceChild("segment3",
				CubeListBuilder.create().texOffs(24, 10)
						.addBox(-4.0F, 18.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.0F, 12.0F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition segment4 = partdefinition.addOrReplaceChild("segment4",
				CubeListBuilder.create().texOffs(24, 19)
						.addBox(-4.0F, 19.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 12.0F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition segment5 = partdefinition.addOrReplaceChild("segment5", CubeListBuilder.create().texOffs(0, 4)
				.addBox(-4.0F, 20.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition segment6 = partdefinition.addOrReplaceChild("segment6", CubeListBuilder.create().texOffs(0, 5)
				.addBox(-4.0F, 21.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition segment7 = partdefinition.addOrReplaceChild("segment7", CubeListBuilder.create().texOffs(0, 6)
				.addBox(-4.0F, 22.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition segment8 = partdefinition.addOrReplaceChild("segment8", CubeListBuilder.create().texOffs(0, 7)
				.addBox(-4.0F, 23.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition core = partdefinition.addOrReplaceChild("core",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-4.0F, 16.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(2.0F, 16.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -12.0F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -1.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-4.0F, -8.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -1.0F, -7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -1.0F, 5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, -1.0F, 5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, -1.0F, -9.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -1.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		segment1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		segment2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		segment3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		segment4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		segment5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		segment6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		segment7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		segment8.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		core.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.core.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.bb_main.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.segment8.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.segment7.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}