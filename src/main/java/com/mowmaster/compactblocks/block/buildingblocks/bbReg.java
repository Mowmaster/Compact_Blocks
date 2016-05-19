package com.mowmaster.compactblocks.block.buildingblocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;




public class bbReg
{
    public static Block cbblockscc = new cbCompressedCobble();
    public static Block cbblockscs = new cbCompressedSand();

    public static void bbGameReg()
    {
        GameRegistry.register(cbblockscc);
        GameRegistry.register(new cbBlocks(cbblockscc, cbCompressedCobble.types,true));

        GameRegistry.register(cbblockscs);
        GameRegistry.register(new cbBlocks(cbblockscs, cbCompressedSand.types,true));
    }
}
