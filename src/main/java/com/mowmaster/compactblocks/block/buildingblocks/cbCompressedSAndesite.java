package com.mowmaster.compactblocks.block.buildingblocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;


public class cbCompressedSAndesite extends Block
{
    public static String[] types = new String[] { "compressed_sandesite", "compressed_sandesite_double", "compressed_sandesite_tripple", "compressed_sandesite_quadrupple", "compressed_sandesite_quintupple", "compressed_sandesite_sixtupple", "compressed_sandesite_septupple", "compressed_sandesite_octupple" };
    public static final PropertyEnum<cbCompressedSAndesite.EnumType> VARIANT = PropertyEnum.<cbCompressedSAndesite.EnumType> create("variant", cbCompressedSAndesite.EnumType.class);

    public cbCompressedSAndesite() {

        super(Material.sand);
        this.setUnlocalizedName("compressed_sandesite");
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, cbCompressedSAndesite.EnumType.COMPRESSED));
        this.setRegistryName("compressed_sandesite");
        this.setHardness(1.5f);
        this.setHarvestLevel("pickaxe", 1);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    @Override
    public IBlockState getStateFromMeta (int meta) {

        return this.getDefaultState().withProperty(VARIANT, cbCompressedSAndesite.EnumType.byMetadata(meta));
    }

    @Override
    public int getMetaFromState (IBlockState state) {

        return state.getValue(VARIANT).getMetadata();
    }

    @Override
    protected BlockStateContainer createBlockState () {

        return new BlockStateContainer(this, new IProperty[] { VARIANT });
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks (Item item, CreativeTabs tab, List<ItemStack> list) {

        for (int meta = 0; meta < 8; meta++)
            list.add(new ItemStack(item, 1, meta));
    }

    public enum EnumType implements IStringSerializable {

        COMPRESSED(0, "sandesite"),
        DOUBLE(1, "sandesite_double"),
        TRIPPLE(2, "sandesite_tripple"),
        QUADRUPPLE(3, "sandesite_quadrupple"),
        QUINTUPPLE(4, "sandesite_quintupple"),
        SIXTUPPLE(5,"sandesite_sixtupple"),
        SEPTUPPLE(6, "sandesite_septupple"),
        OCTUPPLE(7, "sandesite_octupple");

        private static final cbCompressedSAndesite.EnumType[] META_LOOKUP = new cbCompressedSAndesite.EnumType[values().length];
        private final int meta;
        private final String name;

        EnumType(int meta, String name) {

            this.meta = meta;
            this.name = name;
        }

        public int getMetadata () {

            return this.meta;
        }

        @Override
        public String toString () {

            return this.name;
        }

        public static cbCompressedSAndesite.EnumType byMetadata (int meta) {

            if (meta < 0 || meta >= META_LOOKUP.length)
                meta = 0;

            return META_LOOKUP[meta];
        }

        @Override
        public String getName () {

            return this.name;
        }

        static {

            for (final cbCompressedSAndesite.EnumType type : values())
                META_LOOKUP[type.getMetadata()] = type;
        }
    }
}
