
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.eternal.init;

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

import net.mcreator.eternal.entity.ZombieArcherEntity;
import net.mcreator.eternal.entity.IronBowEntity;
import net.mcreator.eternal.entity.GoldBowEntity;
import net.mcreator.eternal.EternalMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EternalModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, EternalMod.MODID);
	public static final RegistryObject<EntityType<ZombieArcherEntity>> ZOMBIE_ARCHER = register("zombie_archer",
			EntityType.Builder.<ZombieArcherEntity>of(ZombieArcherEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZombieArcherEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<IronBowEntity>> IRON_BOW = register("projectile_iron_bow",
			EntityType.Builder.<IronBowEntity>of(IronBowEntity::new, MobCategory.MISC).setCustomClientFactory(IronBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GoldBowEntity>> GOLD_BOW = register("projectile_gold_bow",
			EntityType.Builder.<GoldBowEntity>of(GoldBowEntity::new, MobCategory.MISC).setCustomClientFactory(GoldBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ZombieArcherEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ZOMBIE_ARCHER.get(), ZombieArcherEntity.createAttributes().build());
	}
}
