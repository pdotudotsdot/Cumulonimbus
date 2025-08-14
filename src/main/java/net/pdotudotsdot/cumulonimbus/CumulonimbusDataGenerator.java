package net.pdotudotsdot.cumulonimbus;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.pdotudotsdot.cumulonimbus.datagen.*;
import net.pdotudotsdot.cumulonimbus.trim.ModTrimMaterials;
import net.pdotudotsdot.cumulonimbus.world.ModConfiguredFeatures;
import net.pdotudotsdot.cumulonimbus.world.ModPlacedFeatures;

public class CumulonimbusDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
	FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

	pack.addProvider(ModBlockTagProvider::new);
	pack.addProvider(ModItemTagProvider::new);
	pack.addProvider(ModLootTableProvider::new);
	pack.addProvider(ModModelProvider::new);
	pack.addProvider(ModRecipeProvider::new);
	pack.addProvider(ModRegistryDataGenerator::new);

	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.TRIM_MATERIAL, ModTrimMaterials::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
	}
}
