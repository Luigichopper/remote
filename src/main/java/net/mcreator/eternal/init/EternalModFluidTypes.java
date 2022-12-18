
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.eternal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.eternal.fluid.types.SlimeFluidType;
import net.mcreator.eternal.EternalMod;

public class EternalModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, EternalMod.MODID);
	public static final RegistryObject<FluidType> SLIME_TYPE = REGISTRY.register("slime", () -> new SlimeFluidType());
}
