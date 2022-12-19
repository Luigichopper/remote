
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.eternal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.eternal.item.WalnutItem;
import net.mcreator.eternal.item.TinNuggetItem;
import net.mcreator.eternal.item.TinIngotItem;
import net.mcreator.eternal.item.SteelIngotItem;
import net.mcreator.eternal.item.SlimeItem;
import net.mcreator.eternal.item.SlimeBottleItem;
import net.mcreator.eternal.item.RawTinItem;
import net.mcreator.eternal.item.LimeItem;
import net.mcreator.eternal.item.LettuceSeedsItem;
import net.mcreator.eternal.item.LettuceItem;
import net.mcreator.eternal.item.LemonPieItem;
import net.mcreator.eternal.item.LemonJuiceItem;
import net.mcreator.eternal.item.LemonItem;
import net.mcreator.eternal.item.IronBowItem;
import net.mcreator.eternal.item.GoldBowItem;
import net.mcreator.eternal.item.FleshItem;
import net.mcreator.eternal.item.CrystallizedSlimeItem;
import net.mcreator.eternal.item.CrystallizedHoneyItem;
import net.mcreator.eternal.item.ClosedWalnutItem;
import net.mcreator.eternal.item.CherryItem;
import net.mcreator.eternal.item.BronzeSwordItem;
import net.mcreator.eternal.item.BronzeShovelItem;
import net.mcreator.eternal.item.BronzePickaxeItem;
import net.mcreator.eternal.item.BronzeIngotItem;
import net.mcreator.eternal.item.BronzeHoeItem;
import net.mcreator.eternal.item.BronzeAxeItem;
import net.mcreator.eternal.item.BronzeArmorItem;
import net.mcreator.eternal.item.ApplePieItem;
import net.mcreator.eternal.item.AppleJuiceItem;
import net.mcreator.eternal.EternalMod;

public class EternalModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EternalMod.MODID);
	public static final RegistryObject<Item> TIN_INGOT = REGISTRY.register("tin_ingot", () -> new TinIngotItem());
	public static final RegistryObject<Item> TIN_NUGGET = REGISTRY.register("tin_nugget", () -> new TinNuggetItem());
	public static final RegistryObject<Item> TIN_ORE = block(EternalModBlocks.TIN_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MAPLE_WOOD = block(EternalModBlocks.MAPLE_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MAPLE_LOG = block(EternalModBlocks.MAPLE_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MAPLE_PLANKS = block(EternalModBlocks.MAPLE_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MAPLE_LEAVES = block(EternalModBlocks.MAPLE_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MAPLE_STAIRS = block(EternalModBlocks.MAPLE_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MAPLE_SLAB = block(EternalModBlocks.MAPLE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MAPLE_FENCE = block(EternalModBlocks.MAPLE_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MAPLE_FENCE_GATE = block(EternalModBlocks.MAPLE_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> MAPLE_PRESSURE_PLATE = block(EternalModBlocks.MAPLE_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> MAPLE_BUTTON = block(EternalModBlocks.MAPLE_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CHERRY_WOOD = block(EternalModBlocks.CHERRY_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CHERRY_LOG = block(EternalModBlocks.CHERRY_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CHERRY_PLANKS = block(EternalModBlocks.CHERRY_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CHERRY_LEAVES = block(EternalModBlocks.CHERRY_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> CHERRY_STAIRS = block(EternalModBlocks.CHERRY_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CHERRY_SLAB = block(EternalModBlocks.CHERRY_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CHERRY_FENCE = block(EternalModBlocks.CHERRY_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> CHERRY_FENCE_GATE = block(EternalModBlocks.CHERRY_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> CHERRY_PRESSURE_PLATE = block(EternalModBlocks.CHERRY_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> CHERRY_BUTTON = block(EternalModBlocks.CHERRY_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLOSSOMED_CHERRY_LEAVES = block(EternalModBlocks.BLOSSOMED_CHERRY_LEAVES,
			CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ALTERNATE_STONE_1 = block(EternalModBlocks.ALTERNATE_STONE_1, null);
	public static final RegistryObject<Item> ALTERNATE_STONE_2 = block(EternalModBlocks.ALTERNATE_STONE_2, null);
	public static final RegistryObject<Item> ALTERNATE_DIRT_1 = block(EternalModBlocks.ALTERNATE_DIRT_1, null);
	public static final RegistryObject<Item> ALTERNATE_DIRT_2 = block(EternalModBlocks.ALTERNATE_DIRT_2, null);
	public static final RegistryObject<Item> ALTERNATE_DIRT_3 = block(EternalModBlocks.ALTERNATE_DIRT_3, null);
	public static final RegistryObject<Item> ALTERNATE_OAK_WOOD = block(EternalModBlocks.ALTERNATE_OAK_WOOD, null);
	public static final RegistryObject<Item> WALNUT = REGISTRY.register("walnut", () -> new WalnutItem());
	public static final RegistryObject<Item> CLOSED_WALNUT = REGISTRY.register("closed_walnut", () -> new ClosedWalnutItem());
	public static final RegistryObject<Item> ALTERNATE_DIRT_4 = block(EternalModBlocks.ALTERNATE_DIRT_4, null);
	public static final RegistryObject<Item> CHERRY = REGISTRY.register("cherry", () -> new CherryItem());
	public static final RegistryObject<Item> RAW_TIN = REGISTRY.register("raw_tin", () -> new RawTinItem());
	public static final RegistryObject<Item> WILD_CARROT_PLANT = block(EternalModBlocks.WILD_CARROT_PLANT, null);
	public static final RegistryObject<Item> WILD_POTATO_PLANT = block(EternalModBlocks.WILD_POTATO_PLANT, null);
	public static final RegistryObject<Item> WILD_BEETROOT_PLANT = block(EternalModBlocks.WILD_BEETROOT_PLANT, null);
	public static final RegistryObject<Item> WILD_LETTUS_PLANT = block(EternalModBlocks.WILD_LETTUS_PLANT, null);
	public static final RegistryObject<Item> LIMESTONE = block(EternalModBlocks.LIMESTONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LIMESTONE_SLAB = block(EternalModBlocks.LIMESTONE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LIMESTONE_STAIRS = block(EternalModBlocks.LIMESTONE_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LIMESTONE_WALL = block(EternalModBlocks.LIMESTONE_WALL, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> POLISHED_LIMESTONE = block(EternalModBlocks.POLISHED_LIMESTONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LIME = REGISTRY.register("lime", () -> new LimeItem());
	public static final RegistryObject<Item> LETTUCE = REGISTRY.register("lettuce", () -> new LettuceItem());
	public static final RegistryObject<Item> LEMON = REGISTRY.register("lemon", () -> new LemonItem());
	public static final RegistryObject<Item> BRONZE_INGOT = REGISTRY.register("bronze_ingot", () -> new BronzeIngotItem());
	public static final RegistryObject<Item> BRONZE_BLOCK = block(EternalModBlocks.BRONZE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BRONZE_PICKAXE = REGISTRY.register("bronze_pickaxe", () -> new BronzePickaxeItem());
	public static final RegistryObject<Item> BRONZE_AXE = REGISTRY.register("bronze_axe", () -> new BronzeAxeItem());
	public static final RegistryObject<Item> BRONZE_SWORD = REGISTRY.register("bronze_sword", () -> new BronzeSwordItem());
	public static final RegistryObject<Item> BRONZE_SHOVEL = REGISTRY.register("bronze_shovel", () -> new BronzeShovelItem());
	public static final RegistryObject<Item> BRONZE_HOE = REGISTRY.register("bronze_hoe", () -> new BronzeHoeItem());
	public static final RegistryObject<Item> BRONZE_ARMOR_HELMET = REGISTRY.register("bronze_armor_helmet", () -> new BronzeArmorItem.Helmet());
	public static final RegistryObject<Item> BRONZE_ARMOR_CHESTPLATE = REGISTRY.register("bronze_armor_chestplate",
			() -> new BronzeArmorItem.Chestplate());
	public static final RegistryObject<Item> BRONZE_ARMOR_LEGGINGS = REGISTRY.register("bronze_armor_leggings", () -> new BronzeArmorItem.Leggings());
	public static final RegistryObject<Item> BRONZE_ARMOR_BOOTS = REGISTRY.register("bronze_armor_boots", () -> new BronzeArmorItem.Boots());
	public static final RegistryObject<Item> LETTUCE_PLANT_STAGE_0 = block(EternalModBlocks.LETTUCE_PLANT_STAGE_0, null);
	public static final RegistryObject<Item> LETTUCE_PLANT_STAGE_1 = block(EternalModBlocks.LETTUCE_PLANT_STAGE_1, null);
	public static final RegistryObject<Item> LETTUCE_PLANT_STAGE_2 = block(EternalModBlocks.LETTUCE_PLANT_STAGE_2, null);
	public static final RegistryObject<Item> LETTUCE_SEEDS = REGISTRY.register("lettuce_seeds", () -> new LettuceSeedsItem());
	public static final RegistryObject<Item> SLIME_BOTTLE = REGISTRY.register("slime_bottle", () -> new SlimeBottleItem());
	public static final RegistryObject<Item> CRYSTALLIZED_SLIME = REGISTRY.register("crystallized_slime", () -> new CrystallizedSlimeItem());
	public static final RegistryObject<Item> CRYSTALLIZED_HONEY = REGISTRY.register("crystallized_honey", () -> new CrystallizedHoneyItem());
	public static final RegistryObject<Item> SLIME_BUCKET = REGISTRY.register("slime_bucket", () -> new SlimeItem());
	public static final RegistryObject<Item> ZOMBIE_ARCHER = REGISTRY.register("zombie_archer_spawn_egg",
			() -> new ForgeSpawnEggItem(EternalModEntities.ZOMBIE_ARCHER, -14130157, -15722173, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> WHITE_CONCRETE_STAIRS = block(EternalModBlocks.WHITE_CONCRETE_STAIRS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ORANGE_CONCRETE_STAIRS = block(EternalModBlocks.ORANGE_CONCRETE_STAIRS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MAGENTA_CONCRETE_STAIRS = block(EternalModBlocks.MAGENTA_CONCRETE_STAIRS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_STAIRS = block(EternalModBlocks.LIGHT_BLUE_CONCRETE_STAIRS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> YELLOW_CONCRETE_STAIRS = block(EternalModBlocks.YELLOW_CONCRETE_STAIRS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LIME_CONCRETE_STAIRS = block(EternalModBlocks.LIME_CONCRETE_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PINK_CONCRETE_STAIRS = block(EternalModBlocks.PINK_CONCRETE_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GRAY_CONCRETE_STAIRS = block(EternalModBlocks.GRAY_CONCRETE_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_STAIRS = block(EternalModBlocks.LIGHT_GRAY_CONCRETE_STAIRS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CYAN_CONCRETE_STAIRS = block(EternalModBlocks.CYAN_CONCRETE_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PURPLE_CONCRETE_STAIRS = block(EternalModBlocks.PURPLE_CONCRETE_STAIRS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLUE_CONCRETE_STAIRS = block(EternalModBlocks.BLUE_CONCRETE_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BROWN_CONCRETE_STAIRS = block(EternalModBlocks.BROWN_CONCRETE_STAIRS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GREEN_CONCRETE_STAIRS = block(EternalModBlocks.GREEN_CONCRETE_STAIRS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RED_CONCRETE_STAIRS = block(EternalModBlocks.RED_CONCRETE_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLACK_CONCRETE_STAIRS = block(EternalModBlocks.BLACK_CONCRETE_STAIRS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SOUL_GLASS = block(EternalModBlocks.SOUL_GLASS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SOUL_GLASS_PANE = block(EternalModBlocks.SOUL_GLASS_PANE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> BLOCK_OF_STEEL = block(EternalModBlocks.BLOCK_OF_STEEL, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> APPLE_JUICE = REGISTRY.register("apple_juice", () -> new AppleJuiceItem());
	public static final RegistryObject<Item> APPLE_PIE = REGISTRY.register("apple_pie", () -> new ApplePieItem());
	public static final RegistryObject<Item> LEMON_JUICE = REGISTRY.register("lemon_juice", () -> new LemonJuiceItem());
	public static final RegistryObject<Item> LEMON_PIE = REGISTRY.register("lemon_pie", () -> new LemonPieItem());
	public static final RegistryObject<Item> FLESH = REGISTRY.register("flesh", () -> new FleshItem());
	public static final RegistryObject<Item> WHITE_CONCRETE_SLAB = block(EternalModBlocks.WHITE_CONCRETE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ORANGE_CONCRETE_SLAB = block(EternalModBlocks.ORANGE_CONCRETE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MAGENTA_CONCRETE_SLAB = block(EternalModBlocks.MAGENTA_CONCRETE_SLAB,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_SLAB = block(EternalModBlocks.LIGHT_BLUE_CONCRETE_SLAB,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> YELLOW_CONCRETE_SLAB = block(EternalModBlocks.YELLOW_CONCRETE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LIME_CONCRETE_SLAB = block(EternalModBlocks.LIME_CONCRETE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PINK_CONCRETE_SLAB = block(EternalModBlocks.PINK_CONCRETE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GRAY_CONCRETE_SLAB = block(EternalModBlocks.GRAY_CONCRETE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_SLAB = block(EternalModBlocks.LIGHT_GRAY_CONCRETE_SLAB,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CYAN_CONCRETE_SLAB = block(EternalModBlocks.CYAN_CONCRETE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PURPLE_CONCRETE_SLAB = block(EternalModBlocks.PURPLE_CONCRETE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLUE_CONCRETE_SLAB = block(EternalModBlocks.BLUE_CONCRETE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BROWN_CONCRETE_SLAB = block(EternalModBlocks.BROWN_CONCRETE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GREEN_CONCRETE_SLAB = block(EternalModBlocks.GREEN_CONCRETE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RED_CONCRETE_SLAB = block(EternalModBlocks.RED_CONCRETE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLACK_CONCRETE_SLAB = block(EternalModBlocks.BLACK_CONCRETE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> IRON_BOW = REGISTRY.register("iron_bow", () -> new IronBowItem());
	public static final RegistryObject<Item> GOLD_BOW = REGISTRY.register("gold_bow", () -> new GoldBowItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
