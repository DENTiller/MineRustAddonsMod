package net.mcreator.minerustaddonsmod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import java.util.List;

public class MCreatorMrcoin extends minerustaddonsmod.ModElement {

	@GameRegistry.ObjectHolder("minerustaddonsmod:mrcoin")
	public static final Item block = null;

	public MCreatorMrcoin(minerustaddonsmod instance) {
		super(instance);
		instance.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("minerustaddonsmod:mrcoin", "inventory"));
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("mrcoin");
			setRegistryName("mrcoin");
			setCreativeTab(MCreatorProjectTAB.tab);
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

		@Override
		public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add("\u00A7a\u00A7l\u0418\u0433\u0440\u043E\u0432\u0430\u044F \u0432\u0430\u043B\u044E\u0442\u0430 \u043F\u0440\u043E\u0435\u043A\u0442\u0430.");
			list.add("\u00A7a\u00A7l\u041F\u043E\u0442\u0440\u0430\u0442\u044C\u0435 \u0438\u0445 \u0432 \u0442\u043E\u0440\u0433\u043E\u0432\u043E\u043C \u043A\u043E\u043C\u043F\u043B\u0435\u043A\u0441\u0435.");
		}
	}
}
