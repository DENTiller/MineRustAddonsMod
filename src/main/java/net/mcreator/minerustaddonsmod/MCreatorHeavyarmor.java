package net.mcreator.minerustaddonsmod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.HashMap;

public class MCreatorHeavyarmor extends minerustaddonsmod.ModElement {

	@GameRegistry.ObjectHolder("minerustaddonsmod:heavyarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:heavyarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:heavyarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:heavyarmorboots")
	public static final Item boots = null;

	public MCreatorHeavyarmor(minerustaddonsmod instance) {
		super(instance);
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("HEAVYARMOR", "minerustaddonsmod:heavyarmor_", 21, new int[]{0, 6, 8, 7}, 0,
				null, 2f);
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("heavyarmorhelmet")
				.setRegistryName("heavyarmorhelmet").setCreativeTab(MCreatorArmorsandClothesTAB.tab));
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {

			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					MCreatorHeavyarmorEffect.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("heavyarmorbody").setRegistryName("heavyarmorbody").setCreativeTab(MCreatorArmorsandClothesTAB.tab));
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("heavyarmorlegs")
				.setRegistryName("heavyarmorlegs").setCreativeTab(MCreatorArmorsandClothesTAB.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("minerustaddonsmod:heavyarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("minerustaddonsmod:heavyarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("minerustaddonsmod:heavyarmorlegs", "inventory"));
	}
}
