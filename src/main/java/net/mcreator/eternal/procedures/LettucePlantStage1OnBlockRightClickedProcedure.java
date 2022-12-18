package net.mcreator.eternal.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.eternal.init.EternalModBlocks;

public class LettucePlantStage1OnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		BlockState activeStage = Blocks.AIR.defaultBlockState();
		BlockState nextStage1 = Blocks.AIR.defaultBlockState();
		BlockState nextStage2 = Blocks.AIR.defaultBlockState();
		BlockState nextStage3 = Blocks.AIR.defaultBlockState();
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.is(ItemTags.create(new ResourceLocation("eternal:fertilizer")))) {
			activeStage = EternalModBlocks.LETTUCE_PLANT_STAGE_1.get().defaultBlockState();
			nextStage1 = EternalModBlocks.LETTUCE_PLANT_STAGE_2.get().defaultBlockState();
			random = Math.random();
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == activeStage.getBlock()) {
				if (nextStage1.canSurvive(world, new BlockPos(x, y, z))) {
					world.setBlock(new BlockPos(x, y, z), nextStage1, 3);
				}
			}
		}
	}
}
