
package net.mcreator.eternal.world.features.ores;

public class LimestoneFeature extends OreFeature {

	public static LimestoneFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new LimestoneFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("eternal:limestone", FEATURE, new OreConfiguration(List.of(OreConfiguration
				.target(new BlockStateMatchTest(Blocks.STONE.defaultBlockState()), EternalModBlocks.LIMESTONE.get().defaultBlockState())), 24));
		PLACED_FEATURE = PlacementUtils.register("eternal:limestone", CONFIGURED_FEATURE, List.of(CountPlacement.of(16), InSquarePlacement.spread(),
				HeightRangePlacement.triangle(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(128)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public LimestoneFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

}
