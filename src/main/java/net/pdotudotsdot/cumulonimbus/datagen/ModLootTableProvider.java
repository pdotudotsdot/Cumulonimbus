package net.pdotudotsdot.cumulonimbus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.data.server.loottable.LootTableGenerator;
import net.minecraft.loot.LootTable;
import net.minecraft.registry.RegistryWrapper;
import net.pdotudotsdot.cumulonimbus.blocks.ModBlocks;
import net.pdotudotsdot.cumulonimbus.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SKY_RUBY_BLOCK);
        addDrop(ModBlocks.SKY_RUBY_ORE, oreDrops(ModBlocks.SKY_RUBY_ORE, ModItems.SKY_RUBY));
        addDrop(ModBlocks.DEEPSLATE_SKY_RUBY_ORE, oreDrops(ModBlocks.SKY_RUBY_ORE, ModItems.SKY_RUBY));

        //Chrysanthemums
        addDrop(ModBlocks.GREEN_CHRYSANTHEMUM);
        addDrop(ModBlocks.RED_CHRYSANTHEMUM);
        addDrop(ModBlocks.ORANGE_CHRYSANTHEMUM);
        addDrop(ModBlocks.YELLOW_CHRYSANTHEMUM);
        addDrop(ModBlocks.WHITE_CHRYSANTHEMUM);
        addDrop(ModBlocks.POTTED_GREEN_CHRYSANTHEMUM, pottedPlantDrops(ModBlocks.GREEN_CHRYSANTHEMUM));
        addDrop(ModBlocks.POTTED_RED_CHRYSANTHEMUM, pottedPlantDrops(ModBlocks.RED_CHRYSANTHEMUM));
        addDrop(ModBlocks.POTTED_ORANGE_CHRYSANTHEMUM, pottedPlantDrops(ModBlocks.ORANGE_CHRYSANTHEMUM));
        addDrop(ModBlocks.POTTED_YELLOW_CHRYSANTHEMUM, pottedPlantDrops(ModBlocks.YELLOW_CHRYSANTHEMUM));
        addDrop(ModBlocks.POTTED_WHITE_CHRYSANTHEMUM, pottedPlantDrops(ModBlocks.WHITE_CHRYSANTHEMUM));
    }
}
