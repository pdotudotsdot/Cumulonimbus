package net.pdotudotsdot.cumulonimbus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.pdotudotsdot.cumulonimbus.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.SKY_RUBY_BOOTS)
                .add(ModItems.SKY_RUBY_LEGGINGS)
                .add(ModItems.SKY_RUBY_CHESTPLATE)
                .add(ModItems.SKY_RUBY_HELMET);

        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.SKY_RUBY);
    }
}
