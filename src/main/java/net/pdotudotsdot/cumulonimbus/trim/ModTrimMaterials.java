package net.pdotudotsdot.cumulonimbus.trim;

import net.minecraft.item.Item;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.pdotudotsdot.cumulonimbus.Cumulonimbus;
import net.pdotudotsdot.cumulonimbus.item.ModItems;

import java.util.Map;

public class ModTrimMaterials {
    public static final RegistryKey<ArmorTrimMaterial> SKY_RUBY = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(Cumulonimbus.MOD_ID, "sky_ruby"));

    public static void bootstrap(Registerable<ArmorTrimMaterial> registerable) {
        register(registerable, SKY_RUBY, Registries.ITEM.getEntry(ModItems.SKY_RUBY),
                Style.EMPTY.withColor(TextColor.parse("#fff925").getOrThrow()), 0.6f);
    }


    private static void register(Registerable<ArmorTrimMaterial> registerable, RegistryKey<ArmorTrimMaterial>
            armorTrimMaterialRegistryKey, RegistryEntry<Item> item, Style style, float itemModelIndex){
        ArmorTrimMaterial trimMaterial = new ArmorTrimMaterial(armorTrimMaterialRegistryKey.getValue().getPath(),
                item, itemModelIndex, Map.of(), Text.translatable(Util.createTranslationKey("trim_material",
                armorTrimMaterialRegistryKey.getValue())).fillStyle(style));
        registerable.register(armorTrimMaterialRegistryKey, trimMaterial);
    }
}
