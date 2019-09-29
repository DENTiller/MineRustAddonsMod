package net.mcreator.minerustaddonsmod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.HashMap;

public class MCreatorRawfish extends minerustaddonsmod.ModElement {

	@GameRegistry.ObjectHolder("minerustaddonsmod:rawfish")
	public static final Item block = null;

	public MCreatorRawfish(minerustaddonsmod instance) {
		super(instance);
		instance.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("minerustaddonsmod:rawfish", "inventory"));
	}

	public static class ItemFoodCustom extends ItemFood {

		public ItemFoodCustom() {
			super(0, 0.3F, false);
			setUnlocalizedName("rawfish");
			setRegistryName("rawfish");
			setPotionEffect(new PotionEffect(MobEffects.POISON, 600, 0), 1.0F);
			setCreativeTab(MCreatorFoodsTab.tab);
			setMaxStackSize(1);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}

		@Override
		protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
			super.onFoodEaten(itemStack, world, entity);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				MCreatorInfectedEAT.executeProcedure($_dependencies);
			}
		}
	}
}
