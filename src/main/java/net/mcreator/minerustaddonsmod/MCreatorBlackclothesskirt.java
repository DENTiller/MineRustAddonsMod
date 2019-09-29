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

public class MCreatorBlackclothesskirt extends minerustaddonsmod.ModElement {

	@GameRegistry.ObjectHolder("minerustaddonsmod:blackclothesskirthelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:blackclothesskirtbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:blackclothesskirtlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:blackclothesskirtboots")
	public static final Item boots = null;

	public MCreatorBlackclothesskirt(minerustaddonsmod instance) {
		super(instance);
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("BLACKCLOTHESSKIRT", "minerustaddonsmod:blackclothes__", 1,
				new int[]{0, 0, 1, 0}, 0, null, 0f);
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("blackclothesskirtbody")
				.setRegistryName("blackclothesskirtbody").setCreativeTab(MCreatorArmorsandClothesTAB.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("minerustaddonsmod:blackclothesskirtbody", "inventory"));
	}
}
