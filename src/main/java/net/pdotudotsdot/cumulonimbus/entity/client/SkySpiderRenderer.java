package net.pdotudotsdot.cumulonimbus.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.pdotudotsdot.cumulonimbus.Cumulonimbus;
import net.pdotudotsdot.cumulonimbus.entity.custom.SkySpiderEntity;

public class SkySpiderRenderer extends MobEntityRenderer<SkySpiderEntity, SkySpiderModel<SkySpiderEntity>> {


    public SkySpiderRenderer(EntityRendererFactory.Context context) {
        super(context, new SkySpiderModel<>(context.getPart(SkySpiderModel.SKY_SPIDER)), 0.8f);
    }

    @Override
    public Identifier getTexture(SkySpiderEntity entity) {
        return Identifier.of(Cumulonimbus.MOD_ID, "textures/entity/sky_spider/sky_spider.png");
    }

    @Override
    public void render(SkySpiderEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.scale(1f, 1f, 1f);
        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
