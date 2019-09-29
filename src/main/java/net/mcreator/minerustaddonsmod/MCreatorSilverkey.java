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

public class MCreatorSilverkey extends minerustaddonsmod.ModElement {

	@GameRegistry.ObjectHolder("minerustaddonsmod:silverkey")
	public static final Item block = null;

	public MCreatorSilverkey(minerustaddonsmod instance) {
		super(instance);
		instance.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("minerustaddonsmod:silverkey", "inventory"));
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 1;
			setUnlocalizedName("silverkey");
			setRegistryName("silverkey");
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
			list.add("\u00A7e\u00A7l\u041A\u043B\u044E\u0447 \u043A  \u0441\u0435\u0440\u0435\u0431\u0440\u044F\u043D\u043E\u043C\u0443 \u043A\u0435\u0439\u0441\u0443.");
			list.add("\u00A7e\u00A7l\u0412\u043E\u0441\u043F\u043E\u043B\u044C\u0437\u0443\u0439\u0442\u0435\u0441\u044C \u0438\u043C \u0447\u0442\u043E\u0431\u044B \u043E\u0442\u043A\u0440\u044B\u0442\u044C");
			list.add("\u00A7e\u00A7l\u043F\u0440\u043E\u0441\u0442\u043E \u043A\u0435\u0439\u0441 \u0438 \u043F\u043E\u043B\u0443\u0447\u0438\u0442\u044C");
			list.add("\u00A7e\u00A7l\u0440\u0430\u043D\u0434\u043E\u043C\u043D\u044B\u0439 \u043F\u0440\u0435\u0434\u043C\u0435\u0442.");
		}
	}
}
