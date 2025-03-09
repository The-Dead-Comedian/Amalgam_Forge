package com.dead_comedian.amalgam.client.renderer.living;

import com.dead_comedian.amalgam.Amalgam;
import com.dead_comedian.amalgam.client.model.living.PodlingModel;
import com.dead_comedian.amalgam.client.model.living.PufferModel;
import com.dead_comedian.amalgam.client.renderer.feature.PufferGlowRenderer;
import com.dead_comedian.amalgam.entity.living.PodlingEntity;
import com.dead_comedian.amalgam.entity.living.PufferEntity;
import com.dead_comedian.amalgam.registry.AmalgamModelLayers;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class PodlingRenderer extends MobRenderer<PodlingEntity, PodlingModel<PodlingEntity>> {
    public PodlingRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new PodlingModel<>(pContext.bakeLayer(AmalgamModelLayers.PODLING)), 0.75f);

    }

    @Override
    public ResourceLocation getTextureLocation(PodlingEntity pEntity) {
        return ResourceLocation.fromNamespaceAndPath(Amalgam.MOD_ID, "textures/entity/podling.png");
    }


    @Override
    public void render(PodlingEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}