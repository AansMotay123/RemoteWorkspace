package net.mcreator.adventuretails.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class GlitchArmourHelmetTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, (int) Double.POSITIVE_INFINITY, (int) Double.POSITIVE_INFINITY));
	}
}
