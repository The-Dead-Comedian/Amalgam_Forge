package com.dead_comedian.amalgam.client.renderer.feature;

import com.dead_comedian.amalgam.Amalgam;
import com.dead_comedian.amalgam.client.model.living.PufferModel;
import com.dead_comedian.amalgam.entity.living.PufferEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;

public class PufferGlowRenderer<T extends PufferEntity> extends EyesLayer<T, PufferModel<T>> {
    public PufferGlowRenderer(RenderLayerParent<T, PufferModel<T>> renderLayerParent) {
        super(renderLayerParent);
    }

    @Override
    public @NotNull RenderType renderType() {
        return RenderType.eyes(ResourceLocation.fromNamespaceAndPath(Amalgam.MOD_ID, "textures/entity/puffer_glow.png"));
    }
}