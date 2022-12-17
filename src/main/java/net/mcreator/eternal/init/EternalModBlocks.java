
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.eternal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.eternal.block.WildPotatoPlantBlock;
import net.mcreator.eternal.block.WildLettusPlantBlock;
import net.mcreator.eternal.block.WildCarrotPlantBlock;
import net.mcreator.eternal.block.WildBeetrootPlantBlock;
import net.mcreator.eternal.block.WalnutWoodBlock;
import net.mcreator.eternal.block.WalnutWalnutLeavesBlock;
import net.mcreator.eternal.block.WalnutStairsBlock;
import net.mcreator.eternal.block.WalnutSlabBlock;
import net.mcreator.eternal.block.WalnutPressurePlateBlock;
import net.mcreator.eternal.block.WalnutPlanksBlock;
import net.mcreator.eternal.block.WalnutLogBlock;
import net.mcreator.eternal.block.WalnutLeavesBlock;
import net.mcreator.eternal.block.WalnutFenceGateBlock;
import net.mcreator.eternal.block.WalnutFenceBlock;
import net.mcreator.eternal.block.WalnutButtonBlock;
import net.mcreator.eternal.block.TinOreBlock;
import net.mcreator.eternal.block.PolishedDuskstoneBricksBlock;
import net.mcreator.eternal.block.PolishedDuskstoneBlock;
import net.mcreator.eternal.block.MapleWoodBlock;
import net.mcreator.eternal.block.MapleStairsBlock;
import net.mcreator.eternal.block.MapleSlabBlock;
import net.mcreator.eternal.block.MaplePressurePlateBlock;
import net.mcreator.eternal.block.MaplePlanksBlock;
import net.mcreator.eternal.block.MapleLogBlock;
import net.mcreator.eternal.block.MapleLeavesBlock;
import net.mcreator.eternal.block.MapleFenceGateBlock;
import net.mcreator.eternal.block.MapleFenceBlock;
import net.mcreator.eternal.block.MapleButtonBlock;
import net.mcreator.eternal.block.DuskstoneWallBlock;
import net.mcreator.eternal.block.DuskstoneStairsBlock;
import net.mcreator.eternal.block.DuskstoneSlabBlock;
import net.mcreator.eternal.block.DuskstoneBlock;
import net.mcreator.eternal.block.CherryWoodBlock;
import net.mcreator.eternal.block.CherryStairsBlock;
import net.mcreator.eternal.block.CherrySlabBlock;
import net.mcreator.eternal.block.CherryPressurePlateBlock;
import net.mcreator.eternal.block.CherryPlanksBlock;
import net.mcreator.eternal.block.CherryLogBlock;
import net.mcreator.eternal.block.CherryLeavesBlock;
import net.mcreator.eternal.block.CherryFenceGateBlock;
import net.mcreator.eternal.block.CherryFenceBlock;
import net.mcreator.eternal.block.CherryButtonBlock;
import net.mcreator.eternal.block.BlossomedCherryLeavesBlock;
import net.mcreator.eternal.block.AshWoodBlock;
import net.mcreator.eternal.block.AshStairsBlock;
import net.mcreator.eternal.block.AshSlabBlock;
import net.mcreator.eternal.block.AshPressurePlateBlock;
import net.mcreator.eternal.block.AshPlanksBlock;
import net.mcreator.eternal.block.AshLogBlock;
import net.mcreator.eternal.block.AshLeavesBlock;
import net.mcreator.eternal.block.AshFenceGateBlock;
import net.mcreator.eternal.block.AshFenceBlock;
import net.mcreator.eternal.block.AshButtonBlock;
import net.mcreator.eternal.block.AlternateStone2Block;
import net.mcreator.eternal.block.AlternateStone1Block;
import net.mcreator.eternal.block.AlternateOakWoodBlock;
import net.mcreator.eternal.block.AlternateDirt4Block;
import net.mcreator.eternal.block.AlternateDirt3Block;
import net.mcreator.eternal.block.AlternateDirt2Block;
import net.mcreator.eternal.block.AlternateDirt1Block;
import net.mcreator.eternal.EternalMod;

public class EternalModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EternalMod.MODID);
	public static final RegistryObject<Block> DUSKSTONE = REGISTRY.register("duskstone", () -> new DuskstoneBlock());
	public static final RegistryObject<Block> DUSKSTONE_SLAB = REGISTRY.register("duskstone_slab", () -> new DuskstoneSlabBlock());
	public static final RegistryObject<Block> DUSKSTONE_STAIRS = REGISTRY.register("duskstone_stairs", () -> new DuskstoneStairsBlock());
	public static final RegistryObject<Block> DUSKSTONE_WALL = REGISTRY.register("duskstone_wall", () -> new DuskstoneWallBlock());
	public static final RegistryObject<Block> POLISHED_DUSKSTONE = REGISTRY.register("polished_duskstone", () -> new PolishedDuskstoneBlock());
	public static final RegistryObject<Block> POLISHED_DUSKSTONE_BRICKS = REGISTRY.register("polished_duskstone_bricks",
			() -> new PolishedDuskstoneBricksBlock());
	public static final RegistryObject<Block> TIN_ORE = REGISTRY.register("tin_ore", () -> new TinOreBlock());
	public static final RegistryObject<Block> MAPLE_WOOD = REGISTRY.register("maple_wood", () -> new MapleWoodBlock());
	public static final RegistryObject<Block> MAPLE_LOG = REGISTRY.register("maple_log", () -> new MapleLogBlock());
	public static final RegistryObject<Block> MAPLE_PLANKS = REGISTRY.register("maple_planks", () -> new MaplePlanksBlock());
	public static final RegistryObject<Block> MAPLE_LEAVES = REGISTRY.register("maple_leaves", () -> new MapleLeavesBlock());
	public static final RegistryObject<Block> MAPLE_STAIRS = REGISTRY.register("maple_stairs", () -> new MapleStairsBlock());
	public static final RegistryObject<Block> MAPLE_SLAB = REGISTRY.register("maple_slab", () -> new MapleSlabBlock());
	public static final RegistryObject<Block> MAPLE_FENCE = REGISTRY.register("maple_fence", () -> new MapleFenceBlock());
	public static final RegistryObject<Block> MAPLE_FENCE_GATE = REGISTRY.register("maple_fence_gate", () -> new MapleFenceGateBlock());
	public static final RegistryObject<Block> MAPLE_PRESSURE_PLATE = REGISTRY.register("maple_pressure_plate", () -> new MaplePressurePlateBlock());
	public static final RegistryObject<Block> MAPLE_BUTTON = REGISTRY.register("maple_button", () -> new MapleButtonBlock());
	public static final RegistryObject<Block> WALNUT_WOOD = REGISTRY.register("walnut_wood", () -> new WalnutWoodBlock());
	public static final RegistryObject<Block> WALNUT_LOG = REGISTRY.register("walnut_log", () -> new WalnutLogBlock());
	public static final RegistryObject<Block> WALNUT_PLANKS = REGISTRY.register("walnut_planks", () -> new WalnutPlanksBlock());
	public static final RegistryObject<Block> WALNUT_LEAVES = REGISTRY.register("walnut_leaves", () -> new WalnutLeavesBlock());
	public static final RegistryObject<Block> WALNUT_STAIRS = REGISTRY.register("walnut_stairs", () -> new WalnutStairsBlock());
	public static final RegistryObject<Block> WALNUT_SLAB = REGISTRY.register("walnut_slab", () -> new WalnutSlabBlock());
	public static final RegistryObject<Block> WALNUT_FENCE = REGISTRY.register("walnut_fence", () -> new WalnutFenceBlock());
	public static final RegistryObject<Block> WALNUT_FENCE_GATE = REGISTRY.register("walnut_fence_gate", () -> new WalnutFenceGateBlock());
	public static final RegistryObject<Block> WALNUT_PRESSURE_PLATE = REGISTRY.register("walnut_pressure_plate",
			() -> new WalnutPressurePlateBlock());
	public static final RegistryObject<Block> WALNUT_BUTTON = REGISTRY.register("walnut_button", () -> new WalnutButtonBlock());
	public static final RegistryObject<Block> ASH_WOOD = REGISTRY.register("ash_wood", () -> new AshWoodBlock());
	public static final RegistryObject<Block> ASH_LOG = REGISTRY.register("ash_log", () -> new AshLogBlock());
	public static final RegistryObject<Block> ASH_PLANKS = REGISTRY.register("ash_planks", () -> new AshPlanksBlock());
	public static final RegistryObject<Block> ASH_LEAVES = REGISTRY.register("ash_leaves", () -> new AshLeavesBlock());
	public static final RegistryObject<Block> ASH_STAIRS = REGISTRY.register("ash_stairs", () -> new AshStairsBlock());
	public static final RegistryObject<Block> ASH_SLAB = REGISTRY.register("ash_slab", () -> new AshSlabBlock());
	public static final RegistryObject<Block> ASH_FENCE = REGISTRY.register("ash_fence", () -> new AshFenceBlock());
	public static final RegistryObject<Block> ASH_FENCE_GATE = REGISTRY.register("ash_fence_gate", () -> new AshFenceGateBlock());
	public static final RegistryObject<Block> ASH_PRESSURE_PLATE = REGISTRY.register("ash_pressure_plate", () -> new AshPressurePlateBlock());
	public static final RegistryObject<Block> ASH_BUTTON = REGISTRY.register("ash_button", () -> new AshButtonBlock());
	public static final RegistryObject<Block> CHERRY_WOOD = REGISTRY.register("cherry_wood", () -> new CherryWoodBlock());
	public static final RegistryObject<Block> CHERRY_LOG = REGISTRY.register("cherry_log", () -> new CherryLogBlock());
	public static final RegistryObject<Block> CHERRY_PLANKS = REGISTRY.register("cherry_planks", () -> new CherryPlanksBlock());
	public static final RegistryObject<Block> CHERRY_LEAVES = REGISTRY.register("cherry_leaves", () -> new CherryLeavesBlock());
	public static final RegistryObject<Block> CHERRY_STAIRS = REGISTRY.register("cherry_stairs", () -> new CherryStairsBlock());
	public static final RegistryObject<Block> CHERRY_SLAB = REGISTRY.register("cherry_slab", () -> new CherrySlabBlock());
	public static final RegistryObject<Block> CHERRY_FENCE = REGISTRY.register("cherry_fence", () -> new CherryFenceBlock());
	public static final RegistryObject<Block> CHERRY_FENCE_GATE = REGISTRY.register("cherry_fence_gate", () -> new CherryFenceGateBlock());
	public static final RegistryObject<Block> CHERRY_PRESSURE_PLATE = REGISTRY.register("cherry_pressure_plate",
			() -> new CherryPressurePlateBlock());
	public static final RegistryObject<Block> CHERRY_BUTTON = REGISTRY.register("cherry_button", () -> new CherryButtonBlock());
	public static final RegistryObject<Block> BLOSSOMED_CHERRY_LEAVES = REGISTRY.register("blossomed_cherry_leaves",
			() -> new BlossomedCherryLeavesBlock());
	public static final RegistryObject<Block> ALTERNATE_STONE_1 = REGISTRY.register("alternate_stone_1", () -> new AlternateStone1Block());
	public static final RegistryObject<Block> ALTERNATE_STONE_2 = REGISTRY.register("alternate_stone_2", () -> new AlternateStone2Block());
	public static final RegistryObject<Block> ALTERNATE_DIRT_1 = REGISTRY.register("alternate_dirt_1", () -> new AlternateDirt1Block());
	public static final RegistryObject<Block> ALTERNATE_DIRT_2 = REGISTRY.register("alternate_dirt_2", () -> new AlternateDirt2Block());
	public static final RegistryObject<Block> ALTERNATE_DIRT_3 = REGISTRY.register("alternate_dirt_3", () -> new AlternateDirt3Block());
	public static final RegistryObject<Block> ALTERNATE_OAK_WOOD = REGISTRY.register("alternate_oak_wood", () -> new AlternateOakWoodBlock());
	public static final RegistryObject<Block> WALNUT_WALNUT_LEAVES = REGISTRY.register("walnut_walnut_leaves", () -> new WalnutWalnutLeavesBlock());
	public static final RegistryObject<Block> ALTERNATE_DIRT_4 = REGISTRY.register("alternate_dirt_4", () -> new AlternateDirt4Block());
	public static final RegistryObject<Block> WILD_CARROT_PLANT = REGISTRY.register("wild_carrot_plant", () -> new WildCarrotPlantBlock());
	public static final RegistryObject<Block> WILD_POTATO_PLANT = REGISTRY.register("wild_potato_plant", () -> new WildPotatoPlantBlock());
	public static final RegistryObject<Block> WILD_BEETROOT_PLANT = REGISTRY.register("wild_beetroot_plant", () -> new WildBeetrootPlantBlock());
	public static final RegistryObject<Block> WILD_LETTUS_PLANT = REGISTRY.register("wild_lettus_plant", () -> new WildLettusPlantBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			MapleLeavesBlock.blockColorLoad(event);
			WalnutLeavesBlock.blockColorLoad(event);
			WalnutWalnutLeavesBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
			MapleLeavesBlock.itemColorLoad(event);
			WalnutLeavesBlock.itemColorLoad(event);
			WalnutWalnutLeavesBlock.itemColorLoad(event);
		}
	}
}
