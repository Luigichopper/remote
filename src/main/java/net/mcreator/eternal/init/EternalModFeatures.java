
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.eternal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.eternal.world.features.plants.WildPotatoPlantFeature;
import net.mcreator.eternal.world.features.plants.WildLettusPlantFeature;
import net.mcreator.eternal.world.features.plants.WildCarrotPlantFeature;
import net.mcreator.eternal.world.features.plants.WildBeetrootPlantFeature;
import net.mcreator.eternal.world.features.ores.WalnutWalnutLeavesFeature;
import net.mcreator.eternal.world.features.ores.TinOreFeature;
import net.mcreator.eternal.world.features.ores.BlossomedCherryLeavesFeature;
import net.mcreator.eternal.world.features.ores.AlternateStone2Feature;
import net.mcreator.eternal.world.features.ores.AlternateStone1Feature;
import net.mcreator.eternal.world.features.ores.AlternateOakWoodFeature;
import net.mcreator.eternal.world.features.ores.AlternateDirt4Feature;
import net.mcreator.eternal.world.features.ores.AlternateDirt3Feature;
import net.mcreator.eternal.world.features.ores.AlternateDirt2Feature;
import net.mcreator.eternal.world.features.ores.AlternateDirt1Feature;
import net.mcreator.eternal.EternalMod;

@Mod.EventBusSubscriber
public class EternalModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, EternalMod.MODID);
	public static final RegistryObject<Feature<?>> TIN_ORE = REGISTRY.register("tin_ore", TinOreFeature::feature);
	public static final RegistryObject<Feature<?>> BLOSSOMED_CHERRY_LEAVES = REGISTRY.register("blossomed_cherry_leaves",
			BlossomedCherryLeavesFeature::feature);
	public static final RegistryObject<Feature<?>> ALTERNATE_STONE_1 = REGISTRY.register("alternate_stone_1", AlternateStone1Feature::feature);
	public static final RegistryObject<Feature<?>> ALTERNATE_STONE_2 = REGISTRY.register("alternate_stone_2", AlternateStone2Feature::feature);
	public static final RegistryObject<Feature<?>> ALTERNATE_DIRT_1 = REGISTRY.register("alternate_dirt_1", AlternateDirt1Feature::feature);
	public static final RegistryObject<Feature<?>> ALTERNATE_DIRT_2 = REGISTRY.register("alternate_dirt_2", AlternateDirt2Feature::feature);
	public static final RegistryObject<Feature<?>> ALTERNATE_DIRT_3 = REGISTRY.register("alternate_dirt_3", AlternateDirt3Feature::feature);
	public static final RegistryObject<Feature<?>> ALTERNATE_OAK_WOOD = REGISTRY.register("alternate_oak_wood", AlternateOakWoodFeature::feature);
	public static final RegistryObject<Feature<?>> WALNUT_WALNUT_LEAVES = REGISTRY.register("walnut_walnut_leaves",
			WalnutWalnutLeavesFeature::feature);
	public static final RegistryObject<Feature<?>> ALTERNATE_DIRT_4 = REGISTRY.register("alternate_dirt_4", AlternateDirt4Feature::feature);
	public static final RegistryObject<Feature<?>> WILD_CARROT_PLANT = REGISTRY.register("wild_carrot_plant", WildCarrotPlantFeature::feature);
	public static final RegistryObject<Feature<?>> WILD_POTATO_PLANT = REGISTRY.register("wild_potato_plant", WildPotatoPlantFeature::feature);
	public static final RegistryObject<Feature<?>> WILD_BEETROOT_PLANT = REGISTRY.register("wild_beetroot_plant", WildBeetrootPlantFeature::feature);
	public static final RegistryObject<Feature<?>> WILD_LETTUS_PLANT = REGISTRY.register("wild_lettus_plant", WildLettusPlantFeature::feature);
}
