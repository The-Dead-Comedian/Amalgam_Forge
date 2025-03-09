package com.dead_comedian.amalgam.registry;


import com.dead_comedian.amalgam.Amalgam;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class AmalgamModelLayers {



    public static final ModelLayerLocation PUFFER =
            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Amalgam.MOD_ID, "puffer"), "main");
    public static final ModelLayerLocation PODLING =
            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Amalgam.MOD_ID, "podling"), "main");
    public static final ModelLayerLocation SPREADER =
            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Amalgam.MOD_ID, "spreader"), "main");

}