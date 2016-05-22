package com.mowmaster.compactblocks.recipies;

import com.mowmaster.compactblocks.compactblocks;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.mowmaster.compactblocks.block.buildingblocks.bbReg.*;


public class buildingblockRecipies
{
    public static void bbR()
    {
        for (int meta = 0; meta <=6; meta++) {

            //Compressed Stone Recipies
            GameRegistry.addShapedRecipe(new ItemStack(cbblockscstone, 1, meta), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(Blocks.stone,1,0)});
            GameRegistry.addShapedRecipe(new ItemStack(cbblockscstone, 1, meta + 1), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(cbblockscstone, 1, meta)});
            //Compressed Granite Recipies
            GameRegistry.addShapedRecipe(new ItemStack(cbblockscgranite, 1, meta), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(Blocks.stone,1,1)});
            GameRegistry.addShapedRecipe(new ItemStack(cbblockscgranite, 1, meta + 1), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(cbblockscgranite, 1, meta)});
            //Compressed SGranite Recipies
            GameRegistry.addShapedRecipe(new ItemStack(cbblockscsgranite, 1, meta), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(Blocks.stone,1,2)});
            GameRegistry.addShapedRecipe(new ItemStack(cbblockscsgranite, 1, meta + 1), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(cbblockscsgranite, 1, meta)});
            //Compressed Diorite Recipies
            GameRegistry.addShapedRecipe(new ItemStack(cbblockscdiorite, 1, meta), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(Blocks.stone,1,3)});
            GameRegistry.addShapedRecipe(new ItemStack(cbblockscdiorite, 1, meta + 1), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(cbblockscdiorite, 1, meta)});
            //Compressed SDiorite Recipies
            GameRegistry.addShapedRecipe(new ItemStack(cbblockscsdiorite, 1, meta), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(Blocks.stone,1,4)});
            GameRegistry.addShapedRecipe(new ItemStack(cbblockscsdiorite, 1, meta + 1), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(cbblockscsdiorite, 1, meta)});
            //Compressed Andesite Recipies
            GameRegistry.addShapedRecipe(new ItemStack(cbblockscandesite, 1, meta), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(Blocks.stone,1,5)});
            GameRegistry.addShapedRecipe(new ItemStack(cbblockscandesite, 1, meta + 1), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(cbblockscandesite, 1, meta)});
            //Compressed SAndesite Recipies
            GameRegistry.addShapedRecipe(new ItemStack(cbblockscsandesite, 1, meta), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(Blocks.stone,1,6)});
            GameRegistry.addShapedRecipe(new ItemStack(cbblockscsandesite, 1, meta + 1), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(cbblockscsandesite, 1, meta)});
            //Compressed Grass Recipies
            GameRegistry.addShapedRecipe(new ItemStack(cbblockscgrass, 1, meta), new Object[]{"XXX", "XXX", "XXX", 'X', Blocks.grass});
            GameRegistry.addShapedRecipe(new ItemStack(cbblockscgrass, 1, meta + 1), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(cbblockscgrass, 1, meta)});
            //Compressed Dirt Recipies
            GameRegistry.addShapedRecipe(new ItemStack(cbblockscdirt, 1, meta), new Object[]{"XXX", "XXX", "XXX", 'X', Blocks.dirt});
            GameRegistry.addShapedRecipe(new ItemStack(cbblockscdirt, 1, meta + 1), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(cbblockscdirt, 1, meta)});



            //Compressed Cobblestone Recipies
            GameRegistry.addShapedRecipe(new ItemStack(cbblockscc, 1, meta), new Object[]{"XXX", "XXX", "XXX", 'X', Blocks.cobblestone});
            GameRegistry.addShapedRecipe(new ItemStack(cbblockscc, 1, meta + 1), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(cbblockscc, 1, meta)});
            //Compressed Sand Recipies
            GameRegistry.addShapedRecipe(new ItemStack(cbblockscs, 1, meta), new Object[]{"XXX", "XXX", "XXX", 'X', Blocks.sand});
            GameRegistry.addShapedRecipe(new ItemStack(cbblockscs, 1, meta + 1), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(cbblockscs, 1, meta)});


        }
        for (int meta = 1; meta <=7; meta++) {

            //Compressed Stone Recipies
            GameRegistry.addShapelessRecipe(new ItemStack(cbblockscstone, 9, meta - 1), new ItemStack(cbblockscstone, 1, meta));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stone, 9,0), new ItemStack(cbblockscstone, 1, 0));
            //Compressed Granite Recipies
            GameRegistry.addShapelessRecipe(new ItemStack(cbblockscgranite, 9, meta - 1), new ItemStack(cbblockscgranite, 1, meta));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stone, 9, 1), new ItemStack(cbblockscgranite, 1, 0));
            //Compressed SGranite Recipies
            GameRegistry.addShapelessRecipe(new ItemStack(cbblockscsgranite, 9, meta - 1), new ItemStack(cbblockscsgranite, 1, meta));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stone, 9, 2), new ItemStack(cbblockscsgranite, 1, 0));
            //Compressed Diorite Recipies
            GameRegistry.addShapelessRecipe(new ItemStack(cbblockscdiorite, 9, meta - 1), new ItemStack(cbblockscdiorite, 1, meta));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stone, 9, 3), new ItemStack(cbblockscdiorite, 1, 0));
            //Compressed SDiorite Recipies
            GameRegistry.addShapelessRecipe(new ItemStack(cbblockscsdiorite, 9, meta - 1), new ItemStack(cbblockscsdiorite, 1, meta));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stone, 9, 4), new ItemStack(cbblockscsdiorite, 1, 0));
            //Compressed Andesite Recipies
            GameRegistry.addShapelessRecipe(new ItemStack(cbblockscandesite, 9, meta - 1), new ItemStack(cbblockscandesite, 1, meta));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stone, 9, 5), new ItemStack(cbblockscandesite, 1, 0));
            //Compressed SAndesite Recipies
            GameRegistry.addShapelessRecipe(new ItemStack(cbblockscsandesite, 9, meta - 1), new ItemStack(cbblockscsandesite, 1, meta));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stone, 9, 6), new ItemStack(cbblockscsandesite, 1, 0));
            //Compressed Grass Recipies
            GameRegistry.addShapelessRecipe(new ItemStack(cbblockscgrass, 9, meta - 1), new ItemStack(cbblockscgrass, 1, meta));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.grass, 9), new ItemStack(cbblockscgrass, 1, 0));
            //Compressed Grass Recipies
            GameRegistry.addShapelessRecipe(new ItemStack(cbblockscdirt, 9, meta - 1), new ItemStack(cbblockscdirt, 1, meta));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.dirt, 9), new ItemStack(cbblockscdirt, 1, 0));



            //Compressed Cobblestone Recipies
            GameRegistry.addShapelessRecipe(new ItemStack(cbblockscc, 9, meta - 1), new ItemStack(cbblockscc, 1, meta));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 9), new ItemStack(cbblockscc, 1, 0));
            //Compressed Sand Recipies
            GameRegistry.addShapelessRecipe(new ItemStack(cbblockscs, 9, meta - 1), new ItemStack(cbblockscs, 1, meta));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sand, 9), new ItemStack(cbblockscs, 1, 0));
        }

    }
}
