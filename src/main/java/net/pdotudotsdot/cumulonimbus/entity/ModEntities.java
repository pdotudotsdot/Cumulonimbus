package net.pdotudotsdot.cumulonimbus.entity;


import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pdotudotsdot.cumulonimbus.Cumulonimbus;
import net.pdotudotsdot.cumulonimbus.entity.custom.SkySpiderEntity;

public class ModEntities {
    public static EntityType<SkySpiderEntity> SKY_SPIDER = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Cumulonimbus.MOD_ID, "sky_spider"),
            EntityType.Builder.create(SkySpiderEntity::new, SpawnGroup.MONSTER)
                    .dimensions(1.4f, 0.9f).build());

    public static void registerModEntities() {

        FabricDefaultAttributeRegistry.register(ModEntities.SKY_SPIDER, SkySpiderEntity.createAttributes());

    }

}
