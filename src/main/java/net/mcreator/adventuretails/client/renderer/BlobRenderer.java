
package net.mcreator.adventuretails.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.mcreator.adventuretails.entity.BlobEntity;

public class BlobRenderer extends MobRenderer<BlobEntity, ChickenModel<BlobEntity>> {
	public BlobRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BlobEntity entity) {
		return new ResourceLocation("adventure_tails:textures/entities/magma-chicken-on-planetminecraft-com.png");
	}
}
