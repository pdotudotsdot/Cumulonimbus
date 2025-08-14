package net.pdotudotsdot.cumulonimbus.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.pdotudotsdot.cumulonimbus.Cumulonimbus;
import net.pdotudotsdot.cumulonimbus.blocks.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> SKY_RUBY_ORE_KEY = registryKey("sky_ruby_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> SkyRubyOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.SKY_RUBY_ORE.getDefaultState()),
        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_SKY_RUBY_ORE.getDefaultState()));

        register(context, SKY_RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(SkyRubyOres, 9));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Cumulonimbus.MOD_ID, name));
    }


    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<? , ?>> context,
                                                                                  RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }


}
