
package net.mcreator.eternal.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.eternal.init.EternalModItems;
import net.mcreator.eternal.init.EternalModFluids;
import net.mcreator.eternal.init.EternalModFluidTypes;
import net.mcreator.eternal.init.EternalModBlocks;

public abstract class SlimeFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> EternalModFluidTypes.SLIME_TYPE.get(),
			() -> EternalModFluids.SLIME.get(), () -> EternalModFluids.FLOWING_SLIME.get()).explosionResistance(164f).tickRate(3)
			.bucket(() -> EternalModItems.SLIME_BUCKET.get()).block(() -> (LiquidBlock) EternalModBlocks.SLIME.get());

	private SlimeFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.ITEM_SLIME;
	}

	public static class Source extends SlimeFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SlimeFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
