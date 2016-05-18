package com.mowmaster.compactblocks.Vanilla.buildingblocks;

import com.mowmaster.compactblocks.reference.reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBookshelf;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class cbCompressedCobble extends Block
{
    public static String[] types = new String[] { "compressed_cobblestone", "double_compressed_cobblestone", "tripple_compressed_cobblestone", "quadrupple_compressed_cobblestone", "quintupple_compressed_cobblestone", "sixtupple_compressed_cobblestone", "septupple_compressed_cobblestone", "octupple_compressed_cobblestone" };
    public static final PropertyEnum<EnumType> VARIANT = PropertyEnum.<EnumType> create("variant", EnumType.class);

    public cbCompressedCobble() {

        super(Material.rock);
        this.setUnlocalizedName(reference.MODID + ":" +"compressed_cobblestone");
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumType.COMPRESSED));
        this.setRegistryName("compressed_cobblestone");
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

        COMPRESSED(0, "compressed_cobblestone"),
        DOUBLE(1, "double_compressed_cobblestone"),
        TRIPPLE(2, "tripple_compressed_cobblestone"),
        QUADRUPPLE(3, "quadrupple_compressed_cobblestone"),
        QUINTUPPLE(4, "quintupple_compressed_cobblestone"),
        SIXTUPPLE(5,"sixtupple_compressed_cobblestone"),
        SEPTUPPLE(6, "septupple_compressed_cobblestone"),
        OCTUPPLE(7, "octupple_compressed_cobblestone");

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
