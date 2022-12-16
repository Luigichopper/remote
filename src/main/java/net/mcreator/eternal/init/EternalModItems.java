
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.eternal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.eternal.item.WalnutItem;
import net.mcreator.eternal.item.TinNuggetItem;
import net.mcreator.eternal.item.TinIngotItem;
import net.mcreator.eternal.item.RawTinItem;
import net.mcreator.eternal.item.GrilledCarrotItem;
import net.mcreator.eternal.item.ClosedWalnutItem;
import net.mcreator.eternal.item.CherryItem;
import net.mcreator.eternal.EternalMod;

public class EternalModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EternalMod.MODID);
	public static final RegistryObject<Item> GRILLED_CARROT = REGISTRY.register("grilled_carrot", () -> new GrilledCarrotItem());
	public static final RegistryObject<Item> DUSKSTONE = block(EternalModBlocks.DUSKSTONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DUSKSTONE_SLAB = block(EternalModBlocks.DUSKSTONE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DUSKSTONE_STAIRS = block(EternalModBlocks.DUSKSTONE_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DUSKSTONE_WALL = block(EternalModBlocks.DUSKSTONE_WALL, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> POLISHED_DUSKSTONE = block(EternalModBlocks.POLISHED_DUSKSTONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> POLISHED_DUSKSTONE_BRICKS = block(EternalModBlocks.POLISHED_DUSKSTONE_BRICKS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
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
	public static final RegistryObject<Item> WALNUT_WOOD = block(EternalModBlocks.WALNUT_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> WALNUT_LOG = block(EternalModBlocks.WALNUT_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> WALNUT_PLANKS = block(EternalModBlocks.WALNUT_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> WALNUT_LEAVES = block(EternalModBlocks.WALNUT_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> WALNUT_STAIRS = block(EternalModBlocks.WALNUT_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> WALNUT_SLAB = block(EternalModBlocks.WALNUT_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> WALNUT_FENCE = block(EternalModBlocks.WALNUT_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> WALNUT_FENCE_GATE = block(EternalModBlocks.WALNUT_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> WALNUT_PRESSURE_PLATE = block(EternalModBlocks.WALNUT_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> WALNUT_BUTTON = block(EternalModBlocks.WALNUT_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ASH_WOOD = block(EternalModBlocks.ASH_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ASH_LOG = block(EternalModBlocks.ASH_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ASH_PLANKS = block(EternalModBlocks.ASH_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ASH_LEAVES = block(EternalModBlocks.ASH_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ASH_STAIRS = block(EternalModBlocks.ASH_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ASH_SLAB = block(EternalModBlocks.ASH_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ASH_FENCE = block(EternalModBlocks.ASH_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ASH_FENCE_GATE = block(EternalModBlocks.ASH_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> ASH_PRESSURE_PLATE = block(EternalModBlocks.ASH_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> ASH_BUTTON = block(EternalModBlocks.ASH_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
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
	public static final RegistryObject<Item> WALNUT_WALNUT_LEAVES = block(EternalModBlocks.WALNUT_WALNUT_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ALTERNATE_DIRT_4 = block(EternalModBlocks.ALTERNATE_DIRT_4, null);
	public static final RegistryObject<Item> CHERRY = REGISTRY.register("cherry", () -> new CherryItem());
	public static final RegistryObject<Item> RAW_TIN = REGISTRY.register("raw_tin", () -> new RawTinItem());
	public static final RegistryObject<Item> WILD_CARROT_PLANT = block(EternalModBlocks.WILD_CARROT_PLANT, null);
	public static final RegistryObject<Item> WILD_POTATO_PLANT = block(EternalModBlocks.WILD_POTATO_PLANT, null);
	public static final RegistryObject<Item> WILD_BEETROOT_PLANT = block(EternalModBlocks.WILD_BEETROOT_PLANT, null);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
