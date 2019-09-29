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

public class MCreatorEasyclothes extends minerustaddonsmod.ModElement {

	@GameRegistry.ObjectHolder("minerustaddonsmod:easyclotheshelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:easyclothesbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:easyclotheslegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:easyclothesboots")
	public static final Item boots = null;

	public MCreatorEasyclothes(minerustaddonsmod instance) {
		super(instance);
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("EASYCLOTHES", "minerustaddonsmod:easyclothes_____", 2, new int[]{0, 1, 1, 0}, 0,
				null, 0f);
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("easyclothesbody")
				.setRegistryName("easyclothesbody").setCreativeTab(MCreatorArmorsandClothesTAB.tab));
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("easyclotheslegs")
				.setRegistryName("easyclotheslegs").setCreativeTab(MCreatorArmorsandClothesTAB.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("minerustaddonsmod:easyclothesbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("minerustaddonsmod:easyclotheslegs", "inventory"));
	}
}
