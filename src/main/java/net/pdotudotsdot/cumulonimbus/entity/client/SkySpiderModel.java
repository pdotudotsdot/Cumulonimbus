package net.pdotudotsdot.cumulonimbus.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.pdotudotsdot.cumulonimbus.Cumulonimbus;
import net.pdotudotsdot.cumulonimbus.entity.custom.SkySpiderEntity;

public class SkySpiderModel <T extends SkySpiderEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer SKY_SPIDER = new EntityModelLayer(Identifier.of(Cumulonimbus.MOD_ID, "sky_spider"), "main");

    // Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
    private final ModelPart body0;
    private final ModelPart head;
    private final ModelPart body1;
    private final ModelPart leg0;
    private final ModelPart leg1;
    private final ModelPart leg6;
    private final ModelPart leg7;
    private final ModelPart leg2;
    private final ModelPart secondlegpart2;
    private final ModelPart leg3;
    private final ModelPart secondlegpart3;
    public SkySpiderModel(ModelPart root) {
        this.body0 = root.getChild("body0");
        this.head = this.body0.getChild("head");
        this.body1 = this.body0.getChild("body1");
        this.leg0 = this.body0.getChild("leg0");
        this.leg1 = this.body0.getChild("leg1");
        this.leg6 = this.body0.getChild("leg6");
        this.leg7 = this.body0.getChild("leg7");
        this.leg3 = this.head.getChild("leg3");
        this.leg2 = this.head.getChild("leg2");
        this.secondlegpart2 = this.leg2.getChild("secondlegpart2");
        this.secondlegpart3 = this.leg3.getChild("secondlegpart3");

    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData body0 = modelPartData.addChild("body0", ModelPartBuilder.create().uv(0, 0).cuboid(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 15.0F, 0.0F));

        ModelPartData head = body0.addChild("head", ModelPartBuilder.create().uv(32, 4).cuboid(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -3.0F));

        ModelPartData body1 = body0.addChild("body1", ModelPartBuilder.create().uv(0, 12).cuboid(-5.0F, -4.0F, -6.0F, 10.0F, 8.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 9.0F));

        ModelPartData leg0 = body0.addChild("leg0", ModelPartBuilder.create().uv(18, 0).cuboid(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(54, 24).cuboid(-16.0F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 0.0F, 2.0F, 0.0F, 0.7854F, -0.7854F));

        ModelPartData leg1 = body0.addChild("leg1", ModelPartBuilder.create().uv(18, 0).cuboid(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(54, 24).cuboid(15.0F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, 0.0F, 2.0F, 0.0F, -0.7854F, 0.7854F));

        ModelPartData leg6 = body0.addChild("leg6", ModelPartBuilder.create().uv(18, 0).cuboid(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(54, 24).cuboid(-16.0F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 0.0F, -1.0F, 0.0F, -0.48F, -0.7854F));

        ModelPartData leg7 = body0.addChild("leg7", ModelPartBuilder.create().uv(18, 0).cuboid(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(54, 24).cuboid(15.0F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, 0.0F, -1.0F, 0.0F, 0.48F, 0.7854F));

        ModelPartData leg2 = head.addChild("leg2", ModelPartBuilder.create().uv(18, 0).cuboid(0.0F, -1.0F, -1.0F, 7.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, 0.0F, -7.0F, -0.9425F, 1.0297F, 0.7505F));

        ModelPartData secondlegpart2 = leg2.addChild("secondlegpart2", ModelPartBuilder.create(), ModelTransform.pivot(12.0F, 9.0F, 7.0F));

        ModelPartData secondleg2_r1 = secondlegpart2.addChild("secondleg2_r1", ModelPartBuilder.create().uv(18, 0).cuboid(-3.5F, -1.0F, -1.0F, 7.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-3.5F, -9.0F, -5.0F, 0.0597F, -0.8644F, -0.1348F));

        ModelPartData leg3 = head.addChild("leg3", ModelPartBuilder.create().uv(18, 0).cuboid(0.0F, -1.0F, -1.0F, 7.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, 0.0F, -7.0F, 0.8378F, 1.0996F, 2.4958F));

        ModelPartData secondlegpart3 = leg3.addChild("secondlegpart3", ModelPartBuilder.create(), ModelTransform.pivot(3.0F, 9.0F, 7.0F));

        ModelPartData secondleg3_r1 = secondlegpart3.addChild("secondleg3_r1", ModelPartBuilder.create().uv(18, 0).cuboid(-3.0F, -1.0F, -1.0F, 7.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -9.0F, -5.0F, -0.2347F, -1.048F, 0.1761F));
        return TexturedModelData.of(modelData, 64, 32);
    }
    @Override
    public void setAngles(SkySpiderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(netHeadYaw, headPitch);

        this.animateMovement(SkySpiderAnimations.SKY_SPIDER_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.updateAnimation(entity.idleAnimationState, SkySpiderAnimations.SKY_SPIDER_IDLE, ageInTicks, 1f);
    }

    private void setHeadAngles(float headYaw, float headPitch){
        this.head.yaw = headYaw * (float) (Math.PI / 180.0);
        this.head.pitch = headPitch * (float) (Math.PI / 180.0);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        body0.render(matrices, vertexConsumer, light, overlay, color);
    }

    @Override
    public ModelPart getPart() {
        return body0;
    }
}