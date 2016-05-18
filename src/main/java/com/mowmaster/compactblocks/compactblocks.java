package com.mowmaster.compactblocks;

import com.mowmaster.compactblocks.block.buildingblocks.cbBlocks;
import com.mowmaster.compactblocks.block.buildingblocks.cbCompressedCobble;
import com.mowmaster.compactblocks.events.ModEvents;
import com.mowmaster.compactblocks.proxies.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import com.mowmaster.compactblocks.reference.reference;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = reference.MODID, name = reference.MODNAME, version = reference.VERSION)
public class compactblocks
{
    @Mod.Instance(reference.MODID)
    public static compactblocks instance;

    @SidedProxy(serverSide = reference.SERVERSIDE, clientSide = reference.CLIENTSIDE)
    public static CommonProxy proxy;

    public static Configuration config;

    public static Block cbblockscc = new cbCompressedCobble();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        GameRegistry.register(cbblockscc);
        GameRegistry.register(new cbBlocks(cbblockscc, cbCompressedCobble.types,true));

        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {


        ModEvents handler = new ModEvents();
        MinecraftForge.EVENT_BUS.register(handler);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }


}
