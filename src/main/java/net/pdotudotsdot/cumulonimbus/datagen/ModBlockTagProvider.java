package net.pdotudotsdot.cumulonimbus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.pdotudotsdot.cumulonimbus.blocks.ModBlocks;

import java.util.concurrent.CompletableFuture;


public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SKY_RUBY_BLOCK)
                .add(ModBlocks.SKY_RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_SKY_RUBY_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SKY_RUBY_BLOCK)
                .add(ModBlocks.SKY_RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_SKY_RUBY_ORE);
    }
}
