package com.mowmaster.compactblocks.Vanilla.buildingblocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;

public class cbCompressedCobble extends Block
{
    // String unloc = unlocalized name
// Material material = block material
// float hardness = time to mine
// float resistance = anti creeper damage (explosion proofness)
    public cbCompressedCobble(String unlocalizedName, Material material, float hardness, float resistance)
    {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setHarvestLevel("pickaxe", 1);

    }

    public cbCompressedCobble(String unlocalizedName, float hardness, float resistance)
    {
        this(unlocalizedName, Material.rock, hardness, resistance);
    }

    public cbCompressedCobble(String unlocalizedName)
    {
        // 50 and 2000 are obsidian level
        this(unlocalizedName, 10.0f, 5.0f);
    }
}
