package net.pdotudotsdot.cumulonimbus;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.pdotudotsdot.cumulonimbus.blocks.ModBlocks;
import net.pdotudotsdot.cumulonimbus.item.ModItems;

public class ModItemGroups {

    public static final ItemGroup CUMULONIMBUS_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Cumulonimbus.MOD_ID, "cumulonimbus_item_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SKY_RUBY))
                    .displayName(Text.translatable("itemgroup.cumulonimbus.items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CLOUD_BLOCK);
                        entries.add(ModBlocks.SKY_RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SKY_RUBY_ORE);
                        entries.add(ModItems.SKY_RUBY);
                        entries.add(ModBlocks.SKY_RUBY_BLOCK);
                        entries.add(ModItems.CLOUDS_IN_A_BOTTLE);

                        //Sky Ruby Armor
                        entries.add(ModItems.SKY_RUBY_HELMET);
                        entries.add(ModItems.SKY_RUBY_CHESTPLATE);
                        entries.add(ModItems.SKY_RUBY_LEGGINGS);
                        entries.add(ModItems.SKY_RUBY_BOOTS);

                        //Chrysanthemums
                        entries.add(ModBlocks.GREEN_CHRYSANTHEMUM);
                        entries.add(ModBlocks.RED_CHRYSANTHEMUM);
                        entries.add(ModBlocks.ORANGE_CHRYSANTHEMUM);
                        entries.add(ModBlocks.YELLOW_CHRYSANTHEMUM);
                        entries.add(ModBlocks.WHITE_CHRYSANTHEMUM);

                        entries.add(ModItems.SKY_SPIDER_SPAWN_EGG);

                    }).build());



    public static void registerItemGroups() {

    }


}
