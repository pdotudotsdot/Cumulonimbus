package net.pdotudotsdot.cumulonimbus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;
import net.pdotudotsdot.cumulonimbus.blocks.ModBlocks;
import net.pdotudotsdot.cumulonimbus.item.ModItems;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLOUD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SKY_RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SKY_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SKY_RUBY_ORE);

        //Chrysanthemums
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.GREEN_CHRYSANTHEMUM, ModBlocks.POTTED_GREEN_CHRYSANTHEMUM, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.RED_CHRYSANTHEMUM, ModBlocks.POTTED_RED_CHRYSANTHEMUM, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ORANGE_CHRYSANTHEMUM, ModBlocks.POTTED_ORANGE_CHRYSANTHEMUM, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.YELLOW_CHRYSANTHEMUM, ModBlocks.POTTED_YELLOW_CHRYSANTHEMUM, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WHITE_CHRYSANTHEMUM, ModBlocks.POTTED_WHITE_CHRYSANTHEMUM, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SKY_RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.CLOUDS_IN_A_BOTTLE, Models.GENERATED);

        //Sky Ruby Armor
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SKY_RUBY_BOOTS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SKY_RUBY_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SKY_RUBY_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SKY_RUBY_HELMET);

        itemModelGenerator.register(ModItems.SKY_SPIDER_SPAWN_EGG,
                new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));

    }
}
