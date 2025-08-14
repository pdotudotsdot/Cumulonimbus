package net.pdotudotsdot.cumulonimbus.world;

import net.minecraft.world.gen.placementmodifier.*;


import java.util.List;


public class ModOrePlacement {

    //This is the same as in OrePlacedFeatures but those are private so I needed to copy them and make them public
    public static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heighModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heighModifier, BiomePlacementModifier.of());
    }

    public static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    public static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
