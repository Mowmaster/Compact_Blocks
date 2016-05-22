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


public class cbCompressedGrass extends Block
{
    public static String[] types = new String[] { "compressed_grass", "compressed_grass_double", "compressed_grass_tripple", "compressed_grass_quadrupple", "compressed_grass_quintupple", "compressed_grass_sixtupple", "compressed_grass_septupple", "compressed_grass_octupple" };
    public static final PropertyEnum<cbCompressedGrass.EnumType> VARIANT = PropertyEnum.<cbCompressedGrass.EnumType> create("variant", cbCompressedGrass.EnumType.class);

    public cbCompressedGrass() {

        super(Material.sand);
        this.setUnlocalizedName("compressed_grass");
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, cbCompressedGrass.EnumType.COMPRESSED));
        this.setRegistryName("compressed_grass");
        this.setHardness(1.5f);
        this.setHarvestLevel("spade", 1);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    @Override
    public IBlockState getStateFromMeta (int meta) {

        return this.getDefaultState().withProperty(VARIANT, cbCompressedGrass.EnumType.byMetadata(meta));
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

        COMPRESSED(0, "grass"),
        DOUBLE(1, "grass_double"),
        TRIPPLE(2, "grass_tripple"),
        QUADRUPPLE(3, "grass_quadrupple"),
        QUINTUPPLE(4, "grass_quintupple"),
        SIXTUPPLE(5,"grass_sixtupple"),
        SEPTUPPLE(6, "grass_septupple"),
        OCTUPPLE(7, "grass_octupple");

        private static final cbCompressedGrass.EnumType[] META_LOOKUP = new cbCompressedGrass.EnumType[values().length];
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

        public static cbCompressedGrass.EnumType byMetadata (int meta) {

            if (meta < 0 || meta >= META_LOOKUP.length)
                meta = 0;

            return META_LOOKUP[meta];
        }

        @Override
        public String getName () {

            return this.name;
        }

        static {

            for (final cbCompressedGrass.EnumType type : values())
                META_LOOKUP[type.getMetadata()] = type;
        }
    }
}
