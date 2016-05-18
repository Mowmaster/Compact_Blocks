package com.mowmaster.compactblocks.Vanilla.buildingblocks;

import com.mowmaster.compactblocks.reference.reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.SideOnly;
import scala.collection.parallel.ParIterableLike;


public final class cbBlocks extends ItemBlock
{
    public final String[] names;

    public cbBlocks(Block block, String[] names) {

        this(block, names, false);
    }

    public cbBlocks(Block block, String[] names, boolean selfRegister) {

        super(block);
        this.names = names;
        this.setMaxDamage(0);
        this.setHasSubtypes(true);

        if (selfRegister)
            this.setRegistryName(block.getRegistryName());
    }

    @Override
    public int getMetadata (int damage) {

        return damage;
    }

    @Override
    public String getUnlocalizedName (ItemStack stack) {

        if (stack.getMetadata() > this.names.length)
            return super.getUnlocalizedName() + "." + this.names[0];

        return super.getUnlocalizedName() + "." + this.names[stack.getMetadata()];
    }

    @Override
    public Block getBlock () {

        return this.block;
    }
}
