package com.dead_comedian.amalgam.registry;


import com.dead_comedian.amalgam.Amalgam;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class AmalgamCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Amalgam.MOD_ID);

    public static final RegistryObject<CreativeModeTab> AMALGAM_TAB = CREATIVE_MODE_TABS.register("amalgam_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(AmalgamItems.PUFFER_SPAWN_EGG.get()))
                    .title(Component.translatable("creativetab.amalgam.tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(AmalgamItems.PUFFER_SPAWN_EGG.get());
                        pOutput.accept(AmalgamItems.PODLING_SPAWN_EGG.get());
                        pOutput.accept(AmalgamItems.SPREADER_SPAWN_EGG.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
