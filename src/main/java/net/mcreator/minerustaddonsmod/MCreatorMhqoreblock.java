package net.mcreator.minerustaddonsmod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.IBlockAccess;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.NonNullList;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

public class MCreatorMhqoreblock extends minerustaddonsmod.ModElement {

	@GameRegistry.ObjectHolder("minerustaddonsmod:mhqoreblock")
	public static final Block block = null;

	public MCreatorMhqoreblock(minerustaddonsmod instance) {
		super(instance);
		instance.blocks.add(() -> new BlockCustom());
		instance.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("minerustaddonsmod:mhqoreblock",
				"inventory"));
	}

	public static class BlockCustom extends Block {

		public BlockCustom() {
			super(Material.ROCK);
			setRegistryName("mhqoreblock");
			setUnlocalizedName("mhqoreblock");
			setSoundType(SoundType.STONE);
			setHarvestLevel("pickaxe", 1);
			setHardness(85F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(MCreatorGameplayTAB.tab);
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getBlockLayer() {
			return BlockRenderLayer.SOLID;
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			drops.add(new ItemStack(MCreatorMhqore.block, (int) (1)));
		}
	}
}
