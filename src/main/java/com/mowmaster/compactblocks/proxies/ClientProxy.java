package com.mowmaster.compactblocks.proxies;

import com.mowmaster.compactblocks.block.buildingblocks.cbCompressedCobble;
import com.mowmaster.compactblocks.block.buildingblocks.cbCompressedSand;
import com.mowmaster.compactblocks.compactblocks;
import com.mowmaster.compactblocks.reference.reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;

import static com.mowmaster.compactblocks.block.buildingblocks.bbReg.cbblockscc;
import static com.mowmaster.compactblocks.block.buildingblocks.bbReg.cbblockscs;


public class ClientProxy extends CommonProxy
{
    public void preInit()
    {
        final Item itemcobble = Item.getItemFromBlock(cbblockscc);

        final Item itemsand = Item.getItemFromBlock(cbblockscs);

        for (int meta = 0; meta < 8; meta++) {
            ModelLoader.setCustomModelResourceLocation(itemcobble, meta, new ModelResourceLocation("compactblocks:cobble/" + cbCompressedCobble.types[meta], "inventory"));
            ModelLoader.setCustomModelResourceLocation(itemsand, meta, new ModelResourceLocation("compactblocks:sand/" + cbCompressedSand.types[meta], "inventory"));
        }
        MinecraftForge.EVENT_BUS.register(this);
    }
}
