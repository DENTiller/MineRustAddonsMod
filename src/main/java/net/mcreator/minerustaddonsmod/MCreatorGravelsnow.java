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
import net.minecraft.block.BlockFalling;
import net.minecraft.block.Block;

public class MCreatorGravelsnow extends minerustaddonsmod.ModElement {

	@GameRegistry.ObjectHolder("minerustaddonsmod:gravelsnow")
	public static final Block block = null;

	public MCreatorGravelsnow(minerustaddonsmod instance) {
		super(instance);
		instance.blocks.add(() -> new BlockCustom());
		instance.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("minerustaddonsmod:gravelsnow",
				"inventory"));
	}

	public static class BlockCustom extends BlockFalling {

		public BlockCustom() {
			super(Material.GROUND);
			setRegistryName("gravelsnow");
			setUnlocalizedName("gravelsnow");
			setSoundType(SoundType.GROUND);
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
