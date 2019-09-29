package net.mcreator.minerustaddonsmod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

public class MCreatorGeologicalcharge extends minerustaddonsmod.ModElement {

	@GameRegistry.ObjectHolder("minerustaddonsmod:geologicalcharge")
	public static final Item block = null;

	public MCreatorGeologicalcharge(minerustaddonsmod instance) {
		super(instance);
		instance.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("minerustaddonsmod:geologicalcharge", "inventory"));
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 1;
			setUnlocalizedName("geologicalcharge");
			setRegistryName("geologicalcharge");
			setCreativeTab(MCreatorOtherTab.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack par1ItemStack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}
	}
}
