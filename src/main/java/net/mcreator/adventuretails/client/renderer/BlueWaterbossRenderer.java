
package net.mcreator.adventuretails.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.adventuretails.entity.BlueWaterbossEntity;
import net.mcreator.adventuretails.client.model.Modelmagma_cube;

public class BlueWaterbossRenderer extends MobRenderer<BlueWaterbossEntity, Modelmagma_cube<BlueWaterbossEntity>> {
	public BlueWaterbossRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmagma_cube(context.bakeLayer(Modelmagma_cube.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BlueWaterbossEntity entity) {
		return new ResourceLocation("adventure_tails:textures/entities/magma_cube_1.png");
	}
}
