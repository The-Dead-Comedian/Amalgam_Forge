package com.dead_comedian.amalgam.event;



import com.dead_comedian.amalgam.Amalgam;
import com.dead_comedian.amalgam.entity.living.PodlingEntity;
import com.dead_comedian.amalgam.entity.living.PufferEntity;
import com.dead_comedian.amalgam.entity.living.SpreaderEntity;
import com.dead_comedian.amalgam.registry.AmalgamEntities;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Amalgam.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AmalgamEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(AmalgamEntities.PUFFER.get(), PufferEntity.createPufferAttributes().build());
        event.put(AmalgamEntities.PODLING.get(), PodlingEntity.createPodlingAttributes().build());
        event.put(AmalgamEntities.SPREADER.get(), SpreaderEntity.createAttributes().build());
    }
}