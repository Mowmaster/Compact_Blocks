package com.mowmaster.compactblocks.proxies;

import com.mowmaster.compactblocks.block.buildingblocks.*;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;

import static com.mowmaster.compactblocks.block.buildingblocks.bbReg.*;


public class ClientProxy extends CommonProxy
{
    public void preInit()
    {
        final Item itemcobble = Item.getItemFromBlock(cbblockscc);
        final Item itemsand = Item.getItemFromBlock(cbblockscs);

        final Item itemstone = Item.getItemFromBlock(cbblockscstone);
        final Item itemgranite = Item.getItemFromBlock(cbblockscgranite);
        final Item itemsgranite = Item.getItemFromBlock(cbblockscsgranite);
        final Item itemdiorite = Item.getItemFromBlock(cbblockscdiorite);
        final Item itemsdiorite = Item.getItemFromBlock(cbblockscsdiorite);
        final Item itemandesite = Item.getItemFromBlock(cbblockscandesite);
        final Item itemsandesite = Item.getItemFromBlock(cbblockscsandesite);
        final Item itemgrass = Item.getItemFromBlock(cbblockscgrass);
        final Item itemdirt = Item.getItemFromBlock(cbblockscdirt);

        for (int meta = 0; meta < 8; meta++) {
            ModelLoader.setCustomModelResourceLocation(itemcobble, meta, new ModelResourceLocation("compactblocks:cobble/" + cbCompressedCobble.types[meta], "inventory"));
            ModelLoader.setCustomModelResourceLocation(itemsand, meta, new ModelResourceLocation("compactblocks:sand/" + cbCompressedSand.types[meta], "inventory"));

            ModelLoader.setCustomModelResourceLocation(itemstone, meta, new ModelResourceLocation("compactblocks:stone/" + cbCompressedStone.types[meta], "inventory"));
            ModelLoader.setCustomModelResourceLocation(itemgranite, meta, new ModelResourceLocation("compactblocks:granite/" + cbCompressedGranite.types[meta], "inventory"));
            ModelLoader.setCustomModelResourceLocation(itemsgranite, meta, new ModelResourceLocation("compactblocks:sgranite/" + cbCompressedSGranite.types[meta], "inventory"));
            ModelLoader.setCustomModelResourceLocation(itemdiorite, meta, new ModelResourceLocation("compactblocks:diorite/" + cbCompressedDiorite.types[meta], "inventory"));
            ModelLoader.setCustomModelResourceLocation(itemsdiorite, meta, new ModelResourceLocation("compactblocks:sdiorite/" + cbCompressedSDiorite.types[meta], "inventory"));
            ModelLoader.setCustomModelResourceLocation(itemandesite, meta, new ModelResourceLocation("compactblocks:andesite/" + cbCompressedAndesite.types[meta], "inventory"));
            ModelLoader.setCustomModelResourceLocation(itemsandesite, meta, new ModelResourceLocation("compactblocks:sandesite/" + cbCompressedSAndesite.types[meta], "inventory"));
            ModelLoader.setCustomModelResourceLocation(itemgrass, meta, new ModelResourceLocation("compactblocks:grass/" + cbCompressedGrass.types[meta], "inventory"));
            ModelLoader.setCustomModelResourceLocation(itemdirt, meta, new ModelResourceLocation("compactblocks:dirt/" + cbCompressedDirt.types[meta], "inventory"));
        }
        MinecraftForge.EVENT_BUS.register(this);
    }
}
