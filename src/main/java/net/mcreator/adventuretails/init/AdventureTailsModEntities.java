
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.adventuretails.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.adventuretails.entity.FireBallEntity;
import net.mcreator.adventuretails.entity.FIREGOlemEntity;
import net.mcreator.adventuretails.entity.BlueWaterbossEntity;
import net.mcreator.adventuretails.entity.BlobEntity;
import net.mcreator.adventuretails.AdventureTailsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AdventureTailsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, AdventureTailsMod.MODID);
	public static final RegistryObject<EntityType<FIREGOlemEntity>> FIREG_OLEM = register("fireg_olem",
			EntityType.Builder.<FIREGOlemEntity>of(FIREGOlemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(999).setUpdateInterval(3).setCustomClientFactory(FIREGOlemEntity::new).fireImmune().sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<FireBallEntity>> FIRE_BALL = register("projectile_fire_ball",
			EntityType.Builder.<FireBallEntity>of(FireBallEntity::new, MobCategory.MISC).setCustomClientFactory(FireBallEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BlobEntity>> BLOB = register("blob",
			EntityType.Builder.<BlobEntity>of(BlobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(BlobEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<BlueWaterbossEntity>> BLUE_WATERBOSS = register("blue_waterboss",
			EntityType.Builder.<BlueWaterbossEntity>of(BlueWaterbossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlueWaterbossEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			FIREGOlemEntity.init();
			BlobEntity.init();
			BlueWaterbossEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(FIREG_OLEM.get(), FIREGOlemEntity.createAttributes().build());
		event.put(BLOB.get(), BlobEntity.createAttributes().build());
		event.put(BLUE_WATERBOSS.get(), BlueWaterbossEntity.createAttributes().build());
	}
}
