package net.pdotudotsdot.cumulonimbus.item.custom;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.pdotudotsdot.cumulonimbus.Cumulonimbus;
import net.pdotudotsdot.cumulonimbus.item.ModItems;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> SKY_RUBY_ARMOR_MATERIAL = registerArmorMaterial("sky_ruby",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 5);
            }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.SKY_RUBY),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Cumulonimbus.MOD_ID, "sky_ruby"))), 0, 0));


    public static RegistryEntry<ArmorMaterial> registerArmorMaterial (String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(Cumulonimbus.MOD_ID, name), material.get());
    }
}
