package net.pdotudotsdot.cumulonimbus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.pdotudotsdot.cumulonimbus.blocks.ModBlocks;
import net.pdotudotsdot.cumulonimbus.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        List<ItemConvertible> SMELT_INTO_SKY_RUBY = List.of(ModBlocks.SKY_RUBY_ORE, ModBlocks.DEEPSLATE_SKY_RUBY_ORE);

        offerSmelting(recipeExporter, SMELT_INTO_SKY_RUBY, RecipeCategory.MISC, ModItems.SKY_RUBY, 0.7f, 200, "sky_ruby");
        offerBlasting(recipeExporter, SMELT_INTO_SKY_RUBY, RecipeCategory.MISC, ModItems.SKY_RUBY, 0.7f, 100, "sky_ruby");

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SKY_RUBY, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SKY_RUBY_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CLOUD_BLOCK, 8)
                .pattern("11 ")
                .pattern("11 ")
                .pattern("   ")
                .input('1', ModItems.SKY_RUBY)
                .criterion(hasItem(ModItems.SKY_RUBY), conditionsFromItem(ModItems.SKY_RUBY))
                .offerTo(recipeExporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CLOUDS_IN_A_BOTTLE)
                .pattern(" 2 ")
                .pattern("131")
                .pattern("111")
                .input('1', ModItems.SKY_RUBY)
                .input('2', ModBlocks.CLOUD_BLOCK)
                .input('3', Items.GLASS_BOTTLE)
                .criterion(hasItem(ModBlocks.CLOUD_BLOCK), conditionsFromItem(ModBlocks.CLOUD_BLOCK))
                .offerTo(recipeExporter);

        //Sky Ruby Armor
        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, ModItems.SKY_RUBY_BOOTS)
                .pattern("   ")
                .pattern("1 1")
                .pattern("1 1")
                .input('1', ModItems.SKY_RUBY)
                .criterion(hasItem(ModItems.SKY_RUBY), conditionsFromItem(ModItems.SKY_RUBY))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, ModItems.SKY_RUBY_LEGGINGS)
                .pattern("111")
                .pattern("1 1")
                .pattern("1 1")
                .input('1', ModItems.SKY_RUBY)
                .criterion(hasItem(ModItems.SKY_RUBY), conditionsFromItem(ModItems.SKY_RUBY))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, ModItems.SKY_RUBY_CHESTPLATE)
                .pattern("1 1")
                .pattern("111")
                .pattern("111")
                .input('1', ModItems.SKY_RUBY)
                .criterion(hasItem(ModItems.SKY_RUBY), conditionsFromItem(ModItems.SKY_RUBY))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, ModItems.SKY_RUBY_HELMET)
                .pattern("   ")
                .pattern("111")
                .pattern("1 1")
                .input('1', ModItems.SKY_RUBY)
                .criterion(hasItem(ModItems.SKY_RUBY), conditionsFromItem(ModItems.SKY_RUBY))
                .offerTo(recipeExporter);

        //Chrysanthemums
        offerShapelessRecipe(recipeExporter, Items.GREEN_DYE, ModBlocks.GREEN_CHRYSANTHEMUM, String.valueOf(RecipeCategory.DECORATIONS), 1);
        offerShapelessRecipe(recipeExporter, Items.RED_DYE, ModBlocks.RED_CHRYSANTHEMUM, String.valueOf(RecipeCategory.DECORATIONS), 1);
        offerShapelessRecipe(recipeExporter, Items.ORANGE_DYE, ModBlocks.ORANGE_CHRYSANTHEMUM, String.valueOf(RecipeCategory.DECORATIONS), 1);
        offerShapelessRecipe(recipeExporter, Items.YELLOW_DYE, ModBlocks.YELLOW_CHRYSANTHEMUM, String.valueOf(RecipeCategory.DECORATIONS), 1);
        offerShapelessRecipe(recipeExporter, Items.WHITE_DYE, ModBlocks.WHITE_CHRYSANTHEMUM, String.valueOf(RecipeCategory.DECORATIONS), 1);

    }
}
