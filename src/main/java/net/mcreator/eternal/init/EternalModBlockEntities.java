
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.eternal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.eternal.block.entity.LettucePlantStage2BlockEntity;
import net.mcreator.eternal.block.entity.LettucePlantStage1BlockEntity;
import net.mcreator.eternal.block.entity.LettucePlantStage0BlockEntity;
import net.mcreator.eternal.EternalMod;

public class EternalModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, EternalMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> LETTUCE_PLANT_STAGE_0 = register("lettuce_plant_stage_0",
			EternalModBlocks.LETTUCE_PLANT_STAGE_0, LettucePlantStage0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LETTUCE_PLANT_STAGE_1 = register("lettuce_plant_stage_1",
			EternalModBlocks.LETTUCE_PLANT_STAGE_1, LettucePlantStage1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LETTUCE_PLANT_STAGE_2 = register("lettuce_plant_stage_2",
			EternalModBlocks.LETTUCE_PLANT_STAGE_2, LettucePlantStage2BlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
