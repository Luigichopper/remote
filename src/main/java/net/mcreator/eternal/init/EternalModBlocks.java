
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

import net.mcreator.eternal.block.YellowConcreteStairsBlock;
import net.mcreator.eternal.block.YellowConcreteSlabBlock;
import net.mcreator.eternal.block.WildPotatoPlantBlock;
import net.mcreator.eternal.block.WildLettusPlantBlock;
import net.mcreator.eternal.block.WildCarrotPlantBlock;
import net.mcreator.eternal.block.WildBeetrootPlantBlock;
import net.mcreator.eternal.block.WhiteConcreteStairsBlock;
import net.mcreator.eternal.block.WhiteConcreteSlabBlock;
import net.mcreator.eternal.block.TinOreBlock;
import net.mcreator.eternal.block.SoulGlassPaneBlock;
import net.mcreator.eternal.block.SoulGlassBlock;
import net.mcreator.eternal.block.SlimeBlock;
import net.mcreator.eternal.block.RedConcreteStairsBlock;
import net.mcreator.eternal.block.RedConcreteSlabBlock;
import net.mcreator.eternal.block.PurpleConcreteStairsBlock;
import net.mcreator.eternal.block.PurpleConcreteSlabBlock;
import net.mcreator.eternal.block.PolishedLimestoneBlock;
import net.mcreator.eternal.block.PinkConcreteStairsBlock;
import net.mcreator.eternal.block.PinkConcreteSlabBlock;
import net.mcreator.eternal.block.OrangeConcreteStairsBlock;
import net.mcreator.eternal.block.OrangeConcreteSlabBlock;
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
import net.mcreator.eternal.block.MagentaConcreteStairsBlock;
import net.mcreator.eternal.block.MagentaConcreteSlabBlock;
import net.mcreator.eternal.block.LimestoneWallBlock;
import net.mcreator.eternal.block.LimestoneStairsBlock;
import net.mcreator.eternal.block.LimestoneSlabBlock;
import net.mcreator.eternal.block.LimestoneBlock;
import net.mcreator.eternal.block.LimeConcreteStairsBlock;
import net.mcreator.eternal.block.LimeConcreteSlabBlock;
import net.mcreator.eternal.block.LightGrayConcreteStairsBlock;
import net.mcreator.eternal.block.LightGrayConcreteSlabBlock;
import net.mcreator.eternal.block.LightBlueConcreteStairsBlock;
import net.mcreator.eternal.block.LightBlueConcreteSlabBlock;
import net.mcreator.eternal.block.LettucePlantStage2Block;
import net.mcreator.eternal.block.LettucePlantStage1Block;
import net.mcreator.eternal.block.LettucePlantStage0Block;
import net.mcreator.eternal.block.GreenConcreteStairsBlock;
import net.mcreator.eternal.block.GreenConcreteSlabBlock;
import net.mcreator.eternal.block.GrayConcreteStairsBlock;
import net.mcreator.eternal.block.GrayConcreteSlabBlock;
import net.mcreator.eternal.block.CyanConcreteStairsBlock;
import net.mcreator.eternal.block.CyanConcreteSlabBlock;
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
import net.mcreator.eternal.block.BrownConcreteStairsBlock;
import net.mcreator.eternal.block.BrownConcreteSlabBlock;
import net.mcreator.eternal.block.BronzeBlockBlock;
import net.mcreator.eternal.block.BlueConcreteStairsBlock;
import net.mcreator.eternal.block.BlueConcreteSlabBlock;
import net.mcreator.eternal.block.BlossomedCherryLeavesBlock;
import net.mcreator.eternal.block.BlockOfSteelBlock;
import net.mcreator.eternal.block.BlackConcreteStairsBlock;
import net.mcreator.eternal.block.BlackConcreteSlabBlock;
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
	public static final RegistryObject<Block> ALTERNATE_DIRT_4 = REGISTRY.register("alternate_dirt_4", () -> new AlternateDirt4Block());
	public static final RegistryObject<Block> WILD_CARROT_PLANT = REGISTRY.register("wild_carrot_plant", () -> new WildCarrotPlantBlock());
	public static final RegistryObject<Block> WILD_POTATO_PLANT = REGISTRY.register("wild_potato_plant", () -> new WildPotatoPlantBlock());
	public static final RegistryObject<Block> WILD_BEETROOT_PLANT = REGISTRY.register("wild_beetroot_plant", () -> new WildBeetrootPlantBlock());
	public static final RegistryObject<Block> WILD_LETTUS_PLANT = REGISTRY.register("wild_lettus_plant", () -> new WildLettusPlantBlock());
	public static final RegistryObject<Block> LIMESTONE = REGISTRY.register("limestone", () -> new LimestoneBlock());
	public static final RegistryObject<Block> LIMESTONE_SLAB = REGISTRY.register("limestone_slab", () -> new LimestoneSlabBlock());
	public static final RegistryObject<Block> LIMESTONE_STAIRS = REGISTRY.register("limestone_stairs", () -> new LimestoneStairsBlock());
	public static final RegistryObject<Block> LIMESTONE_WALL = REGISTRY.register("limestone_wall", () -> new LimestoneWallBlock());
	public static final RegistryObject<Block> POLISHED_LIMESTONE = REGISTRY.register("polished_limestone", () -> new PolishedLimestoneBlock());
	public static final RegistryObject<Block> BRONZE_BLOCK = REGISTRY.register("bronze_block", () -> new BronzeBlockBlock());
	public static final RegistryObject<Block> LETTUCE_PLANT_STAGE_0 = REGISTRY.register("lettuce_plant_stage_0", () -> new LettucePlantStage0Block());
	public static final RegistryObject<Block> LETTUCE_PLANT_STAGE_1 = REGISTRY.register("lettuce_plant_stage_1", () -> new LettucePlantStage1Block());
	public static final RegistryObject<Block> LETTUCE_PLANT_STAGE_2 = REGISTRY.register("lettuce_plant_stage_2", () -> new LettucePlantStage2Block());
	public static final RegistryObject<Block> SLIME = REGISTRY.register("slime", () -> new SlimeBlock());
	public static final RegistryObject<Block> WHITE_CONCRETE_STAIRS = REGISTRY.register("white_concrete_stairs",
			() -> new WhiteConcreteStairsBlock());
	public static final RegistryObject<Block> ORANGE_CONCRETE_STAIRS = REGISTRY.register("orange_concrete_stairs",
			() -> new OrangeConcreteStairsBlock());
	public static final RegistryObject<Block> MAGENTA_CONCRETE_STAIRS = REGISTRY.register("magenta_concrete_stairs",
			() -> new MagentaConcreteStairsBlock());
	public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_STAIRS = REGISTRY.register("light_blue_concrete_stairs",
			() -> new LightBlueConcreteStairsBlock());
	public static final RegistryObject<Block> YELLOW_CONCRETE_STAIRS = REGISTRY.register("yellow_concrete_stairs",
			() -> new YellowConcreteStairsBlock());
	public static final RegistryObject<Block> LIME_CONCRETE_STAIRS = REGISTRY.register("lime_concrete_stairs", () -> new LimeConcreteStairsBlock());
	public static final RegistryObject<Block> PINK_CONCRETE_STAIRS = REGISTRY.register("pink_concrete_stairs", () -> new PinkConcreteStairsBlock());
	public static final RegistryObject<Block> GRAY_CONCRETE_STAIRS = REGISTRY.register("gray_concrete_stairs", () -> new GrayConcreteStairsBlock());
	public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_STAIRS = REGISTRY.register("light_gray_concrete_stairs",
			() -> new LightGrayConcreteStairsBlock());
	public static final RegistryObject<Block> CYAN_CONCRETE_STAIRS = REGISTRY.register("cyan_concrete_stairs", () -> new CyanConcreteStairsBlock());
	public static final RegistryObject<Block> PURPLE_CONCRETE_STAIRS = REGISTRY.register("purple_concrete_stairs",
			() -> new PurpleConcreteStairsBlock());
	public static final RegistryObject<Block> BLUE_CONCRETE_STAIRS = REGISTRY.register("blue_concrete_stairs", () -> new BlueConcreteStairsBlock());
	public static final RegistryObject<Block> BROWN_CONCRETE_STAIRS = REGISTRY.register("brown_concrete_stairs",
			() -> new BrownConcreteStairsBlock());
	public static final RegistryObject<Block> GREEN_CONCRETE_STAIRS = REGISTRY.register("green_concrete_stairs",
			() -> new GreenConcreteStairsBlock());
	public static final RegistryObject<Block> RED_CONCRETE_STAIRS = REGISTRY.register("red_concrete_stairs", () -> new RedConcreteStairsBlock());
	public static final RegistryObject<Block> BLACK_CONCRETE_STAIRS = REGISTRY.register("black_concrete_stairs",
			() -> new BlackConcreteStairsBlock());
	public static final RegistryObject<Block> SOUL_GLASS = REGISTRY.register("soul_glass", () -> new SoulGlassBlock());
	public static final RegistryObject<Block> SOUL_GLASS_PANE = REGISTRY.register("soul_glass_pane", () -> new SoulGlassPaneBlock());
	public static final RegistryObject<Block> BLOCK_OF_STEEL = REGISTRY.register("block_of_steel", () -> new BlockOfSteelBlock());
	public static final RegistryObject<Block> WHITE_CONCRETE_SLAB = REGISTRY.register("white_concrete_slab", () -> new WhiteConcreteSlabBlock());
	public static final RegistryObject<Block> ORANGE_CONCRETE_SLAB = REGISTRY.register("orange_concrete_slab", () -> new OrangeConcreteSlabBlock());
	public static final RegistryObject<Block> MAGENTA_CONCRETE_SLAB = REGISTRY.register("magenta_concrete_slab",
			() -> new MagentaConcreteSlabBlock());
	public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SLAB = REGISTRY.register("light_blue_concrete_slab",
			() -> new LightBlueConcreteSlabBlock());
	public static final RegistryObject<Block> YELLOW_CONCRETE_SLAB = REGISTRY.register("yellow_concrete_slab", () -> new YellowConcreteSlabBlock());
	public static final RegistryObject<Block> LIME_CONCRETE_SLAB = REGISTRY.register("lime_concrete_slab", () -> new LimeConcreteSlabBlock());
	public static final RegistryObject<Block> PINK_CONCRETE_SLAB = REGISTRY.register("pink_concrete_slab", () -> new PinkConcreteSlabBlock());
	public static final RegistryObject<Block> GRAY_CONCRETE_SLAB = REGISTRY.register("gray_concrete_slab", () -> new GrayConcreteSlabBlock());
	public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SLAB = REGISTRY.register("light_gray_concrete_slab",
			() -> new LightGrayConcreteSlabBlock());
	public static final RegistryObject<Block> CYAN_CONCRETE_SLAB = REGISTRY.register("cyan_concrete_slab", () -> new CyanConcreteSlabBlock());
	public static final RegistryObject<Block> PURPLE_CONCRETE_SLAB = REGISTRY.register("purple_concrete_slab", () -> new PurpleConcreteSlabBlock());
	public static final RegistryObject<Block> BLUE_CONCRETE_SLAB = REGISTRY.register("blue_concrete_slab", () -> new BlueConcreteSlabBlock());
	public static final RegistryObject<Block> BROWN_CONCRETE_SLAB = REGISTRY.register("brown_concrete_slab", () -> new BrownConcreteSlabBlock());
	public static final RegistryObject<Block> GREEN_CONCRETE_SLAB = REGISTRY.register("green_concrete_slab", () -> new GreenConcreteSlabBlock());
	public static final RegistryObject<Block> RED_CONCRETE_SLAB = REGISTRY.register("red_concrete_slab", () -> new RedConcreteSlabBlock());
	public static final RegistryObject<Block> BLACK_CONCRETE_SLAB = REGISTRY.register("black_concrete_slab", () -> new BlackConcreteSlabBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			MapleLeavesBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
			MapleLeavesBlock.itemColorLoad(event);
		}
	}
}
