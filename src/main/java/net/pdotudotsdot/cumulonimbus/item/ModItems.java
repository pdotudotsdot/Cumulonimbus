package net.pdotudotsdot.cumulonimbus.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.pdotudotsdot.cumulonimbus.Cumulonimbus;
import net.pdotudotsdot.cumulonimbus.entity.ModEntities;
import net.pdotudotsdot.cumulonimbus.item.custom.CloudsInABottleItem;
import net.pdotudotsdot.cumulonimbus.item.custom.ModArmorItem;
import net.pdotudotsdot.cumulonimbus.item.custom.ModArmorMaterials;

public class ModItems {

    public static final Item CLOUDS_IN_A_BOTTLE = registerItem("clouds_in_a_bottle",
            new CloudsInABottleItem(new Item.Settings().maxCount(1).rarity(Rarity.UNCOMMON)));

    public static final Item SKY_SPIDER_SPAWN_EGG =registerItem("sky_spider_spawn_egg", new SpawnEggItem(ModEntities.SKY_SPIDER, 0x2A231C, 0x7d6800, new Item.Settings()));

    public static final Item SKY_RUBY = registerItem("sky_ruby", new Item(new Item.Settings()));

    //Sky Ruby Armor
    public static final Item SKY_RUBY_HELMET = registerItem("sky_ruby_helmet",
            new ModArmorItem(ModArmorMaterials.SKY_RUBY_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item SKY_RUBY_CHESTPLATE = registerItem("sky_ruby_chestplate",
            new ArmorItem(ModArmorMaterials.SKY_RUBY_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item SKY_RUBY_LEGGINGS = registerItem("sky_ruby_leggings",
            new ArmorItem(ModArmorMaterials.SKY_RUBY_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item SKY_RUBY_BOOTS = registerItem("sky_ruby_boots",
            new ArmorItem(ModArmorMaterials.SKY_RUBY_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BODY.getMaxDamage(15))));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Cumulonimbus.MOD_ID, name), item);
    }

    public static void registerModItems(){

    }

}
