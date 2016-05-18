package com.mowmaster.compactblocks.block.buildingblocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;


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
