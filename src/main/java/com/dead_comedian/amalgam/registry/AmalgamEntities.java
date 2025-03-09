package com.dead_comedian.amalgam.registry;



import com.dead_comedian.amalgam.Amalgam;
import com.dead_comedian.amalgam.entity.living.PodlingEntity;
import com.dead_comedian.amalgam.entity.living.PufferEntity;
import com.dead_comedian.amalgam.entity.living.SpreaderEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class AmalgamEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Amalgam.MOD_ID);





    //    MOBS
    public static final RegistryObject<EntityType<PufferEntity>> PUFFER =
            ENTITY_TYPES.register("puffer", () -> EntityType.Builder.of(PufferEntity::new, MobCategory.CREATURE)
                    .sized(0.8f, 0.4f).build("puffer"));

    public static final RegistryObject<EntityType<PodlingEntity>> PODLING =
            ENTITY_TYPES.register("podling", () -> EntityType.Builder.of(PodlingEntity::new, MobCategory.CREATURE)
                    .sized(0.8f, 0.4f).build("podling"));

    public static final RegistryObject<EntityType<SpreaderEntity>> SPREADER =
            ENTITY_TYPES.register("spreader", () -> EntityType.Builder.of(SpreaderEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 2f).build("spreader"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}