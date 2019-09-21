package net.mcreator.minerustaddonsmod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.init.MobEffects;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public class MCreatorLargemedkit extends minerustaddonsmod.ModElement {

	@GameRegistry.ObjectHolder("minerustaddonsmod:largemedkit")
	public static final Item block = null;

	public MCreatorLargemedkit(minerustaddonsmod instance) {
		super(instance);
		instance.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("minerustaddonsmod:largemedkit", "inventory"));
	}

	public static class ItemFoodCustom extends ItemFood {

		public ItemFoodCustom() {
			super(0, 0.3F, false);
			setUnlocalizedName("largemedkit");
			setRegistryName("largemedkit");
			setPotionEffect(new PotionEffect(MobEffects.REGENERATION, 80, 2), 1.0F);
			setCreativeTab(MCreatorMedicalsTAB.tab);
			setMaxStackSize(2);
		}

		@Override
		public int getMaxItemUseDuration(ItemStack stack) {
			return 62;
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}
	}
}
