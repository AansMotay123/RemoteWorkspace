// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart head;
	private final ModelPart left_tendril;
	private final ModelPart right_tendril;
	private final ModelPart torso;
	private final ModelPart left_ribcage;
	private final ModelPart right_ribcage;
	private final ModelPart left_arm;
	private final ModelPart right_arm;
	private final ModelPart left_leg;
	private final ModelPart right_leg;

	public Modelcustom_model(ModelPart root) {
		this.head = root.getChild("head");
		this.left_tendril = root.getChild("left_tendril");
		this.right_tendril = root.getChild("right_tendril");
		this.torso = root.getChild("torso");
		this.left_ribcage = root.getChild("left_ribcage");
		this.right_ribcage = root.getChild("right_ribcage");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 32)
						.addBox(-8.0F, -16.0F, -5.0F, 16.0F, 16.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, -4.0F, -4.0F, 7.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-16.0F, -4.0F, -4.0F, 7.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -10.0F, -1.0F));

		PartDefinition left_tendril = partdefinition.addOrReplaceChild("left_tendril",
				CubeListBuilder.create().texOffs(58, 0)
						.addBox(-1.0F, -4.0F, -6.0F, 11.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(4.0F, -11.0F, -6.0F, 3.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(-24.0F, -11.0F, -6.0F, 3.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(-24.0F, -4.0F, -6.0F, 11.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(-15.0F, -4.0F, -7.0F, 13.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(-13.0F, 9.0F, -7.0F, 11.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(-5.0F, 9.0F, -7.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(-13.0F, 9.0F, -7.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(-13.0F, 11.0F, -7.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(-15.0F, 2.0F, -7.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(-5.0F, 2.0F, -7.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(-15.0F, -4.0F, 4.0F, 13.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, -22.0F, 0.0F));

		PartDefinition right_tendril = partdefinition.addOrReplaceChild("right_tendril", CubeListBuilder.create(),
				PartPose.offset(-8.0F, -22.0F, 0.0F));

		PartDefinition torso = partdefinition.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-9.0F, -13.0F, -4.0F, 18.0F, 21.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -11.0F, 7.0F, 14.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.0F, -1.0F));

		PartDefinition left_ribcage = partdefinition.addOrReplaceChild("left_ribcage",
				CubeListBuilder.create().texOffs(90, 11).mirror()
						.addBox(-7.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(7.0F, 1.0F, -5.0F));

		PartDefinition right_ribcage = partdefinition.addOrReplaceChild("right_ribcage", CubeListBuilder.create()
				.texOffs(90, 11).addBox(-2.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.0F, 1.0F, -5.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(0, 58)
				.addBox(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(13.0F, -10.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create()
				.texOffs(44, 50).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.0F, -10.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(76, 76)
				.addBox(-2.9F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 11.0F, -1.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create()
				.texOffs(76, 48).addBox(-3.1F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, 11.0F, -1.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_tendril.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_tendril.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_ribcage.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_ribcage.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.right_arm.zRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_leg.zRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_arm.zRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_leg.zRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}