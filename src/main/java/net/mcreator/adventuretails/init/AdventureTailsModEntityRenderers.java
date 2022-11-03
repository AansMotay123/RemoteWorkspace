
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.adventuretails.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.adventuretails.client.renderer.FIREGOlemRenderer;
import net.mcreator.adventuretails.client.renderer.BlueWaterbossRenderer;
import net.mcreator.adventuretails.client.renderer.BlobRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AdventureTailsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AdventureTailsModEntities.FIREG_OLEM.get(), FIREGOlemRenderer::new);
		event.registerEntityRenderer(AdventureTailsModEntities.FIRE_BALL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AdventureTailsModEntities.BLOB.get(), BlobRenderer::new);
		event.registerEntityRenderer(AdventureTailsModEntities.BLUE_WATERBOSS.get(), BlueWaterbossRenderer::new);
	}
}
