package com.mowmaster.compactblocks.Vanilla.buildingblocks;

import com.mowmaster.compactblocks.reference.reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.SideOnly;
import scala.collection.parallel.ParIterableLike;


public final class cbBlocks
{
    public static Block CompressedCobble;

    public static void cbBlocksRegistry()
    {
        GameRegistry.register(CompressedCobble = new cbCompressedCobble("compressed_cobble"));
    }

    public static void regBlocks()
    {
        reg(CompressedCobble);
    }

    public static void reg(Block block)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block),0,new ModelResourceLocation("compressedblocks:vanilla/textures/models" + block.getUnlocalizedName().substring(5),"inventory"));
    }
}
