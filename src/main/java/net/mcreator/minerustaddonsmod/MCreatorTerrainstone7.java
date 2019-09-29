package net.mcreator.minerustaddonsmod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.BlockRenderLayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

public class MCreatorTerrainstone7 extends minerustaddonsmod.ModElement {

	@GameRegistry.ObjectHolder("minerustaddonsmod:terrainstone7")
	public static final Block block = null;

	public MCreatorTerrainstone7(minerustaddonsmod instance) {
		super(instance);
		instance.blocks.add(() -> new BlockCustom());
		instance.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("minerustaddonsmod:terrainstone7",
				"inventory"));
	}

	public static class BlockCustom extends Block {

		public BlockCustom() {
			super(Material.ROCK);
			setRegistryName("terrainstone7");
			setUnlocalizedName("terrainstone7");
			setSoundType(SoundType.STONE);
			setHarvestLevel("pickaxe", 1);
			setHardness(2F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(MCreatorDecorationsTAB.tab);
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getBlockLayer() {
			return BlockRenderLayer.SOLID;
		}
	}
}
