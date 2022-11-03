
package net.mcreator.adventuretails.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.adventuretails.entity.FIREGOlemEntity;
import net.mcreator.adventuretails.client.model.Modelcustom_model;

public class FIREGOlemRenderer extends MobRenderer<FIREGOlemEntity, Modelcustom_model<FIREGOlemEntity>> {
	public FIREGOlemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FIREGOlemEntity entity) {
		return new ResourceLocation("adventure_tails:textures/entities/warden.png");
	}
}
