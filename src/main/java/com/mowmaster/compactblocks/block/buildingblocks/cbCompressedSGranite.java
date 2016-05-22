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

public class cbCompressedSGranite extends Block
{
    public static String[] types = new String[] { "compressed_sgranite", "compressed_sgranite_double", "compressed_sgranite_tripple", "compressed_sgranite_quadrupple", "compressed_sgranite_quintupple", "compressed_sgranite_sixtupple", "compressed_sgranite_septupple", "compressed_sgranite_octupple" };
    public static final PropertyEnum<EnumType> VARIANT = PropertyEnum.<EnumType> create("variant", EnumType.class);

    public cbCompressedSGranite() {

        super(Material.rock);
        this.setUnlocalizedName("compressed_sgranite");
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumType.COMPRESSED));
        this.setRegistryName("compressed_sgranite");
        this.setHardness(1.5f);
        this.setHarvestLevel("pickaxe", 1);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    @Override
    public IBlockState getStateFromMeta (int meta) {

        return this.getDefaultState().withProperty(VARIANT, EnumType.byMetadata(meta));
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

        COMPRESSED(0, "sgranite"),
        DOUBLE(1, "sgranite_double"),
        TRIPPLE(2, "sgranite_tripple"),
        QUADRUPPLE(3, "sgranite_quadrupple"),
        QUINTUPPLE(4, "sgranite_quintupple"),
        SIXTUPPLE(5,"sgranite_sixtupple"),
        SEPTUPPLE(6, "sgranite_septupple"),
        OCTUPPLE(7, "sgranite_octupple");

        private static final EnumType[] META_LOOKUP = new EnumType[values().length];
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

        public static EnumType byMetadata (int meta) {

            if (meta < 0 || meta >= META_LOOKUP.length)
                meta = 0;

            return META_LOOKUP[meta];
        }

        @Override
        public String getName () {

            return this.name;
        }

        static {

            for (final EnumType type : values())
                META_LOOKUP[type.getMetadata()] = type;
        }
    }
}
