package net.pdotudotsdot.cumulonimbus;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.pdotudotsdot.cumulonimbus.blocks.ModBlocks;
import net.pdotudotsdot.cumulonimbus.entity.ModEntities;
import net.pdotudotsdot.cumulonimbus.entity.client.SkySpiderModel;
import net.pdotudotsdot.cumulonimbus.entity.client.SkySpiderRenderer;

public class CumulonimbusClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.GREEN_CHRYSANTHEMUM,
                ModBlocks.POTTED_GREEN_CHRYSANTHEMUM, ModBlocks.RED_CHRYSANTHEMUM, ModBlocks.POTTED_RED_CHRYSANTHEMUM,
                ModBlocks.POTTED_ORANGE_CHRYSANTHEMUM, ModBlocks.ORANGE_CHRYSANTHEMUM, ModBlocks.POTTED_YELLOW_CHRYSANTHEMUM,
                ModBlocks.YELLOW_CHRYSANTHEMUM, ModBlocks.POTTED_WHITE_CHRYSANTHEMUM, ModBlocks.WHITE_CHRYSANTHEMUM);

        EntityModelLayerRegistry.registerModelLayer(SkySpiderModel.SKY_SPIDER, SkySpiderModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.SKY_SPIDER, SkySpiderRenderer::new);
    }
}
