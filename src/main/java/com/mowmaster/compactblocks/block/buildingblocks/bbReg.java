package com.mowmaster.compactblocks.block.buildingblocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;




public class bbReg
{
    public static Block cbblockscstone = new cbCompressedStone();
    public static Block cbblockscgranite = new cbCompressedGranite();
    public static Block cbblockscsgranite = new cbCompressedSGranite();
    public static Block cbblockscdiorite = new cbCompressedDiorite();
    public static Block cbblockscsdiorite = new cbCompressedSDiorite();
    public static Block cbblockscandesite = new cbCompressedAndesite();
    public static Block cbblockscsandesite = new cbCompressedSAndesite();
    public static Block cbblockscgrass = new cbCompressedGrass();
    public static Block cbblockscdirt = new cbCompressedDirt();

    public static Block cbblockscc = new cbCompressedCobble();
    public static Block cbblockscs = new cbCompressedSand();

    public static void bbGameReg()
    {
        GameRegistry.register(cbblockscstone);
        GameRegistry.register(new cbBlocks(cbblockscstone, cbCompressedStone.types,true));
        GameRegistry.register(cbblockscgranite);
        GameRegistry.register(new cbBlocks(cbblockscgranite, cbCompressedGranite.types,true));
        GameRegistry.register(cbblockscsgranite);
        GameRegistry.register(new cbBlocks(cbblockscsgranite, cbCompressedSGranite.types,true));
        GameRegistry.register(cbblockscdiorite);
        GameRegistry.register(new cbBlocks(cbblockscdiorite, cbCompressedDiorite.types,true));
        GameRegistry.register(cbblockscsdiorite);
        GameRegistry.register(new cbBlocks(cbblockscsdiorite, cbCompressedSDiorite.types,true));
        GameRegistry.register(cbblockscandesite);
        GameRegistry.register(new cbBlocks(cbblockscandesite, cbCompressedAndesite.types,true));
        GameRegistry.register(cbblockscsandesite);
        GameRegistry.register(new cbBlocks(cbblockscsandesite, cbCompressedSAndesite.types,true));
        GameRegistry.register(cbblockscgrass);
        GameRegistry.register(new cbBlocks(cbblockscgrass, cbCompressedGrass.types,true));
        GameRegistry.register(cbblockscdirt);
        GameRegistry.register(new cbBlocks(cbblockscdirt, cbCompressedDirt.types,true));

        GameRegistry.register(cbblockscc);
        GameRegistry.register(new cbBlocks(cbblockscc, cbCompressedCobble.types,true));
        GameRegistry.register(cbblockscs);
        GameRegistry.register(new cbBlocks(cbblockscs, cbCompressedSand.types,true));

    }
}
