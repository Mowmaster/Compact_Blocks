package com.mowmaster.compactblocks.recipies;

import com.mowmaster.compactblocks.compactblocks;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.mowmaster.compactblocks.block.buildingblocks.bbReg.cbblockscc;
import static com.mowmaster.compactblocks.block.buildingblocks.bbReg.cbblockscs;


public class buildingblockRecipies
{
    public static void bbR()
    {
        for (int meta = 0; meta <=6; meta++) {

            //Compressed Cobblestone Recipies
            GameRegistry.addShapedRecipe(new ItemStack(cbblockscc, 1, meta), new Object[]{"XXX", "XXX", "XXX", 'X', Blocks.cobblestone});
            GameRegistry.addShapedRecipe(new ItemStack(cbblockscc, 1, meta + 1), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(cbblockscc, 1, meta)});
            //Compressed Sand Recipies
            GameRegistry.addShapedRecipe(new ItemStack(cbblockscs, 1, meta), new Object[]{"XXX", "XXX", "XXX", 'X', Blocks.sand});
            GameRegistry.addShapedRecipe(new ItemStack(cbblockscs, 1, meta + 1), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(cbblockscs, 1, meta)});
        }
        for (int meta = 1; meta <=7; meta++) {

            //Compressed Cobblestone Recipies
            GameRegistry.addShapelessRecipe(new ItemStack(cbblockscc, 9, meta - 1), new ItemStack(cbblockscc, 1, meta));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 9), new ItemStack(cbblockscc, 1, 0));
            //Compressed Sand Recipies
            GameRegistry.addShapelessRecipe(new ItemStack(cbblockscs, 9, meta - 1), new ItemStack(cbblockscs, 1, meta));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sand, 9), new ItemStack(cbblockscs, 1, 0));
        }

    }
}
