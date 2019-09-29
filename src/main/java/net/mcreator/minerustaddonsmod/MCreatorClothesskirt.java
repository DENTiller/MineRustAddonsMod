package net.mcreator.minerustaddonsmod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public class MCreatorClothesskirt extends minerustaddonsmod.ModElement {

	@GameRegistry.ObjectHolder("minerustaddonsmod:clothesskirthelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:clothesskirtbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:clothesskirtlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:clothesskirtboots")
	public static final Item boots = null;

	public MCreatorClothesskirt(minerustaddonsmod instance) {
		super(instance);
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("CLOTHESSKIRT", "minerustaddonsmod:clothesskirt_", 2, new int[]{0, 0, 1, 1}, 0,
				null, 0f);
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("clothesskirthelmet")
				.setRegistryName("clothesskirthelmet").setCreativeTab(MCreatorArmorsandClothesTAB.tab));
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("clothesskirtbody")
				.setRegistryName("clothesskirtbody").setCreativeTab(MCreatorArmorsandClothesTAB.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("minerustaddonsmod:clothesskirthelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("minerustaddonsmod:clothesskirtbody", "inventory"));
	}
}
