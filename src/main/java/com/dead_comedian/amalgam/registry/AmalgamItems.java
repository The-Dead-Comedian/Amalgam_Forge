package com.dead_comedian.amalgam.registry;



import com.dead_comedian.amalgam.Amalgam;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class AmalgamItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Amalgam.MOD_ID);


    public static final RegistryObject<Item> PUFFER_SPAWN_EGG = ITEMS.register("puffer_spawn_egg",
            () ->new ForgeSpawnEggItem(AmalgamEntities.PUFFER, 0x382f53, 0xc3c736,new Item.Properties()));

    public static final RegistryObject<Item> PODLING_SPAWN_EGG = ITEMS.register("podling_spawn_egg",
            () ->new ForgeSpawnEggItem(AmalgamEntities.PODLING, 0x96b74e, 0x388634,new Item.Properties()));

    public static final RegistryObject<Item> SPREADER_SPAWN_EGG = ITEMS.register("spreader_spawn_egg",
            () ->new ForgeSpawnEggItem(AmalgamEntities.SPREADER, 0x712b44, 0x382f53,new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}