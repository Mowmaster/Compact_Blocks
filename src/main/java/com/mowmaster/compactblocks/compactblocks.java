package com.mowmaster.compactblocks;

import com.mowmaster.compactblocks.events.ModEvents;
import com.mowmaster.compactblocks.proxies.CommonProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import com.mowmaster.compactblocks.reference.reference;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = reference.MODID, name = reference.MODNAME, version = reference.VERSION)
public class compactblocks
{
    @Mod.Instance(reference.MODID)
    public static compactblocks instance;

    @SidedProxy(clientSide = reference.CLIENTSIDE, serverSide = reference.SERVERSIDE)
    public static CommonProxy proxy;

    public static Configuration config;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

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
