package com.dead_comedian.amalgam;



import com.dead_comedian.amalgam.client.renderer.living.PodlingRenderer;
import com.dead_comedian.amalgam.client.renderer.living.PufferRenderer;
import com.dead_comedian.amalgam.client.renderer.living.SpreaderRenderer;
import com.dead_comedian.amalgam.entity.living.PodlingEntity;
import com.dead_comedian.amalgam.registry.AmalgamCreativeTab;
import com.dead_comedian.amalgam.registry.AmalgamEntities;
import com.dead_comedian.amalgam.registry.AmalgamItems;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Amalgam.MOD_ID)
public class Amalgam {

    public static final String MOD_ID = "amalgam";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Amalgam(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::registerLayerDefinitions);

        AmalgamEntities.register(modEventBus);
        AmalgamCreativeTab.register(modEventBus);
        AmalgamItems.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);



    }

    private void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
       }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(AmalgamEntities.PUFFER.get(), PufferRenderer::new);
            EntityRenderers.register(AmalgamEntities.PODLING.get(), PodlingRenderer::new);
            EntityRenderers.register(AmalgamEntities.SPREADER.get(), SpreaderRenderer::new);
        }
    }
}