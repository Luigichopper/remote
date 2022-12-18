
package net.mcreator.eternal.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.eternal.procedures.SlimedOnEffectActiveTickProcedure;

public class SlimedMobEffect extends MobEffect {
	public SlimedMobEffect() {
		super(MobEffectCategory.HARMFUL, -15164135);
	}

	@Override
	public String getDescriptionId() {
		return "effect.eternal.slimed";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SlimedOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
