
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.eternal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.eternal.fluid.SlimeFluid;
import net.mcreator.eternal.EternalMod;

public class EternalModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, EternalMod.MODID);
	public static final RegistryObject<FlowingFluid> SLIME = REGISTRY.register("slime", () -> new SlimeFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_SLIME = REGISTRY.register("flowing_slime", () -> new SlimeFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(SLIME.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SLIME.get(), RenderType.translucent());
		}
	}
}
