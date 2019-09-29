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

public class MCreatorMhqkit extends minerustaddonsmod.ModElement {

	@GameRegistry.ObjectHolder("minerustaddonsmod:mhqkithelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:mhqkitbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:mhqkitlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:mhqkitboots")
	public static final Item boots = null;

	public MCreatorMhqkit(minerustaddonsmod instance) {
		super(instance);
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("MHQKIT", "minerustaddonsmod:metal____", 14, new int[]{2, 2, 5, 5}, 0, null, 0f);
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("mhqkithelmet").setRegistryName("mhqkithelmet")
				.setCreativeTab(MCreatorArmorsandClothesTAB.tab));
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("mhqkitbody").setRegistryName("mhqkitbody")
				.setCreativeTab(MCreatorArmorsandClothesTAB.tab));
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("mhqkitlegs").setRegistryName("mhqkitlegs")
				.setCreativeTab(MCreatorArmorsandClothesTAB.tab));
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("mhqkitboots").setRegistryName("mhqkitboots")
				.setCreativeTab(MCreatorArmorsandClothesTAB.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("minerustaddonsmod:mhqkithelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("minerustaddonsmod:mhqkitbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("minerustaddonsmod:mhqkitlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("minerustaddonsmod:mhqkitboots", "inventory"));
	}
}
