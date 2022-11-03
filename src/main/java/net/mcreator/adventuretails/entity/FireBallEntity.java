
package net.mcreator.adventuretails.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.adventuretails.init.AdventureTailsModItems;
import net.mcreator.adventuretails.init.AdventureTailsModEntities;

import java.util.Random;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class FireBallEntity extends AbstractArrow implements ItemSupplier {
	public FireBallEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(AdventureTailsModEntities.FIRE_BALL.get(), world);
	}

	public FireBallEntity(EntityType<? extends FireBallEntity> type, Level world) {
		super(type, world);
	}

	public FireBallEntity(EntityType<? extends FireBallEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public FireBallEntity(EntityType<? extends FireBallEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(AdventureTailsModItems.FIRE_BALL.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static FireBallEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		FireBallEntity entityarrow = new FireBallEntity(AdventureTailsModEntities.FIRE_BALL.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		entityarrow.setSecondsOnFire(100);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static FireBallEntity shoot(LivingEntity entity, LivingEntity target) {
		FireBallEntity entityarrow = new FireBallEntity(AdventureTailsModEntities.FIRE_BALL.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 5f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(15);
		entityarrow.setKnockback(7);
		entityarrow.setCritArrow(false);
		entityarrow.setSecondsOnFire(100);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.PLAYERS, 1,
				1f / (new Random().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
