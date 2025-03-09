package com.dead_comedian.amalgam.client.renderer.living;

import com.dead_comedian.amalgam.Amalgam;
import com.dead_comedian.amalgam.client.model.living.PufferModel;
import com.dead_comedian.amalgam.client.renderer.feature.PufferGlowRenderer;
import com.dead_comedian.amalgam.entity.living.PufferEntity;
import com.dead_comedian.amalgam.registry.AmalgamModelLayers;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class PufferRenderer extends MobRenderer<PufferEntity, PufferModel<PufferEntity>> {
    public PufferRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new PufferModel<>(pContext.bakeLayer(AmalgamModelLayers.PUFFER)), 0.75f);
        this.addLayer(new PufferGlowRenderer<>(this));

    }

    @Override
    public ResourceLocation getTextureLocation(PufferEntity pEntity) {
        return ResourceLocation.fromNamespaceAndPath(Amalgam.MOD_ID, "textures/entity/puffer.png");
    }


    @Override
    public void render(PufferEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}