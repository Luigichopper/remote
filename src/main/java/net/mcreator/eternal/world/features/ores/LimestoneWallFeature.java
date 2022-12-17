
package net.mcreator.eternal.world.features.ores;

public class LimestoneWallFeature extends OreFeature {

	public static LimestoneWallFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new LimestoneWallFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("eternal:limestone_wall", FEATURE, new OreConfiguration(List.of(OreConfiguration
				.target(new BlockStateMatchTest(Blocks.STONE.defaultBlockState()), EternalModBlocks.LIMESTONE_WALL.get().defaultBlockState())), 24));
		PLACED_FEATURE = PlacementUtils.register("eternal:limestone_wall", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(16), InSquarePlacement.spread(),
						HeightRangePlacement.triangle(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(128)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public LimestoneWallFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

}
