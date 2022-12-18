
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.eternal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.eternal.potion.SlimedMobEffect;
import net.mcreator.eternal.EternalMod;

public class EternalModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, EternalMod.MODID);
	public static final RegistryObject<MobEffect> SLIMED = REGISTRY.register("slimed", () -> new SlimedMobEffect());
}
