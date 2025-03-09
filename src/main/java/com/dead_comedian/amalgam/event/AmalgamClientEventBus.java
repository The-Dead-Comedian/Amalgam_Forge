package com.dead_comedian.amalgam.event;

import com.dead_comedian.amalgam.Amalgam;
import com.dead_comedian.amalgam.client.model.living.PodlingModel;
import com.dead_comedian.amalgam.client.model.living.PufferModel;
import com.dead_comedian.amalgam.client.model.living.SpreaderModel;
import com.dead_comedian.amalgam.registry.AmalgamModelLayers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Amalgam.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AmalgamClientEventBus {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(AmalgamModelLayers.PUFFER, PufferModel::createBodyLayer);
        event.registerLayerDefinition(AmalgamModelLayers.PODLING, PodlingModel::createBodyLayer);
        event.registerLayerDefinition(AmalgamModelLayers.SPREADER, SpreaderModel::createBodyLayer);
    }
    @SubscribeEvent
    public static void registerParticleFactories(RegisterParticleProvidersEvent event) {
         }
}