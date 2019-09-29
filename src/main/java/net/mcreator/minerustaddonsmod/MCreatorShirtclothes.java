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

public class MCreatorShirtclothes extends minerustaddonsmod.ModElement {

	@GameRegistry.ObjectHolder("minerustaddonsmod:shirtclotheshelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:shirtclothesbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:shirtclotheslegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:shirtclothesboots")
	public static final Item boots = null;

	public MCreatorShirtclothes(minerustaddonsmod instance) {
		super(instance);
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("SHIRTCLOTHES", "minerustaddonsmod:shirtclothes_", 3, new int[]{1, 0, 1, 1}, 0,
				null, 0f);
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("shirtclotheshelmet")
				.setRegistryName("shirtclotheshelmet").setCreativeTab(MCreatorArmorsandClothesTAB.tab));
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("shirtclothesbody")
				.setRegistryName("shirtclothesbody").setCreativeTab(MCreatorArmorsandClothesTAB.tab));
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("shirtclothesboots")
				.setRegistryName("shirtclothesboots").setCreativeTab(MCreatorArmorsandClothesTAB.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("minerustaddonsmod:shirtclotheshelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("minerustaddonsmod:shirtclothesbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("minerustaddonsmod:shirtclothesboots", "inventory"));
	}
}
