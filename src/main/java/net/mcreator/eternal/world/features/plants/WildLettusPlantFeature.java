
package net.mcreator.eternal.world.features.plants;

import com.mojang.serialization.Codec;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class WildLettusPlantFeature extends RandomPatchFeature {

	public static WildLettusPlantFeature FEATURE = null;
	public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new WildLettusPlantFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("eternal:wild_lettus_plant", FEATURE, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
				new SimpleBlockConfiguration(BlockStateProvider.simple(EternalModBlocks.WILD_LETTUS_PLANT.get())), List.of(), 8));
		PLACED_FEATURE = PlacementUtils.register("eternal:wild_lettus_plant", CONFIGURED_FEATURE, List.of(CountPlacement.of(1),
				RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public WildLettusPlantFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}
}
