package com.mowmaster.compactblocks.proxies;

import com.mowmaster.compactblocks.block.buildingblocks.cbCompressedCobble;
import com.mowmaster.compactblocks.compactblocks;
import com.mowmaster.compactblocks.reference.reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;


public class ClientProxy extends CommonProxy
{
    public void preInit()
    {
        final Item item = Item.getItemFromBlock(compactblocks.cbblockscc);

        for (int meta = 0; meta < 8; meta++)
            ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation("compactblocks:"+ cbCompressedCobble.types[meta], "inventory"));

        MinecraftForge.EVENT_BUS.register(this);
    }
}
