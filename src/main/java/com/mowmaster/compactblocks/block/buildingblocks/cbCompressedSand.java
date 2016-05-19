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


public class cbCompressedSand extends Block
{
    public static String[] types = new String[] { "compressed_sand", "compressed_sand_double", "compressed_sand_tripple", "compressed_sand_quadrupple", "compressed_sand_quintupple", "compressed_sand_sixtupple", "compressed_sand_septupple", "compressed_sand_octupple" };
    public static final PropertyEnum<cbCompressedSand.EnumType> VARIANT = PropertyEnum.<cbCompressedSand.EnumType> create("variant", cbCompressedSand.EnumType.class);

    public cbCompressedSand() {

        super(Material.sand);
        this.setUnlocalizedName("compressed_sand");
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, cbCompressedSand.EnumType.COMPRESSED));
        this.setRegistryName("compressed_sand");
        this.setHardness(1.5f);
        this.setHarvestLevel("spade", 1);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    @Override
    public IBlockState getStateFromMeta (int meta) {

        return this.getDefaultState().withProperty(VARIANT, cbCompressedSand.EnumType.byMetadata(meta));
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

        COMPRESSED(0, "sand"),
        DOUBLE(1, "sand_double"),
        TRIPPLE(2, "sand_tripple"),
        QUADRUPPLE(3, "sand_quadrupple"),
        QUINTUPPLE(4, "sand_quintupple"),
        SIXTUPPLE(5,"sand_sixtupple"),
        SEPTUPPLE(6, "sand_septupple"),
        OCTUPPLE(7, "sand_octupple");

        private static final cbCompressedSand.EnumType[] META_LOOKUP = new cbCompressedSand.EnumType[values().length];
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

        public static cbCompressedSand.EnumType byMetadata (int meta) {

            if (meta < 0 || meta >= META_LOOKUP.length)
                meta = 0;

            return META_LOOKUP[meta];
        }

        @Override
        public String getName () {

            return this.name;
        }

        static {

            for (final cbCompressedSand.EnumType type : values())
                META_LOOKUP[type.getMetadata()] = type;
        }
    }
}
