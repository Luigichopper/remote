
package net.mcreator.eternal.block;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.eternal.procedures.SlimeMobplayerCollidesBlockProcedure;
import net.mcreator.eternal.init.EternalModFluids;

public class SlimeBlock extends LiquidBlock {
	public SlimeBlock() {
		super(() -> EternalModFluids.SLIME.get(),
				BlockBehaviour.Properties.of(Material.WATER, MaterialColor.COLOR_GREEN).strength(164f).noCollission().noLootTable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		SlimeMobplayerCollidesBlockProcedure.execute(entity);
	}
}
