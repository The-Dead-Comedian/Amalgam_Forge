package com.dead_comedian.amalgam.client.renderer.living;

import com.dead_comedian.amalgam.Amalgam;
import com.dead_comedian.amalgam.client.model.living.PodlingModel;
import com.dead_comedian.amalgam.client.model.living.SpreaderModel;
import com.dead_comedian.amalgam.entity.living.PodlingEntity;
import com.dead_comedian.amalgam.entity.living.SpreaderEntity;
import com.dead_comedian.amalgam.registry.AmalgamModelLayers;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SpreaderRenderer extends MobRenderer<SpreaderEntity, SpreaderModel<SpreaderEntity>> {
    public SpreaderRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new SpreaderModel<>(pContext.bakeLayer(AmalgamModelLayers.SPREADER)), 0.75f);

    }

    @Override
    public ResourceLocation getTextureLocation(SpreaderEntity pEntity) {
        return ResourceLocation.fromNamespaceAndPath(Amalgam.MOD_ID, "textures/entity/spreader.png");
    }


    @Override
    public void render(SpreaderEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}