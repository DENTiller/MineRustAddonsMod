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

public class MCreatorUpinmhq extends minerustaddonsmod.ModElement {

	@GameRegistry.ObjectHolder("minerustaddonsmod:upinmhq")
	public static final Item block = null;

	public MCreatorUpinmhq(minerustaddonsmod instance) {
		super(instance);
		instance.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("minerustaddonsmod:upinmhq", "inventory"));
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 1;
			setUnlocalizedName("upinmhq");
			setRegistryName("upinmhq");
			setCreativeTab(MCreatorGameplayTAB.tab);
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
