
package net.mcreator.eternal.world.features.ores;

public class BronzeOreFeature extends OreFeature {

	public static BronzeOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new BronzeOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("eternal:bronze_ore", FEATURE, new OreConfiguration(List.of(OreConfiguration
				.target(new BlockStateMatchTest(Blocks.STONE.defaultBlockState()), EternalModBlocks.BRONZE_ORE.get().defaultBlockState())), 7));
		PLACED_FEATURE = PlacementUtils.register("eternal:bronze_ore", CONFIGURED_FEATURE, List.of(CountPlacement.of(11), InSquarePlacement.spread(),
				HeightRangePlacement.uniform(VerticalAnchor.absolute(1), VerticalAnchor.absolute(63)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public BronzeOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

}
