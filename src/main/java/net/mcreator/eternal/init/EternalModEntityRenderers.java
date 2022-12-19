
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.eternal.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.eternal.client.renderer.ZombieArcherRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EternalModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EternalModEntities.ZOMBIE_ARCHER.get(), ZombieArcherRenderer::new);
		event.registerEntityRenderer(EternalModEntities.IRON_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EternalModEntities.GOLD_BOW.get(), ThrownItemRenderer::new);
	}
}
