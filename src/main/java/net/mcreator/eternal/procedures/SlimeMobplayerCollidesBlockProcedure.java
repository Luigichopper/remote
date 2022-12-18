package net.mcreator.eternal.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.eternal.init.EternalModMobEffects;

public class SlimeMobplayerCollidesBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(EternalModMobEffects.SLIMED.get(), 1, 1, (true), (true)));
	}
}
