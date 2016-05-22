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


public class cbCompressedDirt extends Block
{
    public static String[] types = new String[] { "compressed_dirt", "compressed_dirt_double", "compressed_dirt_tripple", "compressed_dirt_quadrupple", "compressed_dirt_quintupple", "compressed_dirt_sixtupple", "compressed_dirt_septupple", "compressed_dirt_octupple" };
    public static final PropertyEnum<cbCompressedDirt.EnumType> VARIANT = PropertyEnum.<cbCompressedDirt.EnumType> create("variant", cbCompressedDirt.EnumType.class);

    public cbCompressedDirt() {

        super(Material.sand);
        this.setUnlocalizedName("compressed_dirt");
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, cbCompressedDirt.EnumType.COMPRESSED));
        this.setRegistryName("compressed_dirt");
        this.setHardness(1.5f);
        this.setHarvestLevel("spade", 1);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    @Override
    public IBlockState getStateFromMeta (int meta) {

        return this.getDefaultState().withProperty(VARIANT, cbCompressedDirt.EnumType.byMetadata(meta));
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

        COMPRESSED(0, "dirt"),
        DOUBLE(1, "dirt_double"),
        TRIPPLE(2, "dirt_tripple"),
        QUADRUPPLE(3, "dirt_quadrupple"),
        QUINTUPPLE(4, "dirt_quintupple"),
        SIXTUPPLE(5,"dirt_sixtupple"),
        SEPTUPPLE(6, "dirt_septupple"),
        OCTUPPLE(7, "dirt_octupple");

        private static final cbCompressedDirt.EnumType[] META_LOOKUP = new cbCompressedDirt.EnumType[values().length];
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

        public static cbCompressedDirt.EnumType byMetadata (int meta) {

            if (meta < 0 || meta >= META_LOOKUP.length)
                meta = 0;

            return META_LOOKUP[meta];
        }

        @Override
        public String getName () {

            return this.name;
        }

        static {

            for (final cbCompressedDirt.EnumType type : values())
                META_LOOKUP[type.getMetadata()] = type;
        }
    }
}
