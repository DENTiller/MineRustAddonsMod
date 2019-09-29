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

public class MCreatorSpecialforceshelmet extends minerustaddonsmod.ModElement {

	@GameRegistry.ObjectHolder("minerustaddonsmod:specialforceshelmethelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:specialforceshelmetbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:specialforceshelmetlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:specialforceshelmetboots")
	public static final Item boots = null;

	public MCreatorSpecialforceshelmet(minerustaddonsmod instance) {
		super(instance);
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("SPECIALFORCESHELMET", "minerustaddonsmod:specialforceshelmet__", 3, new int[]{0,
				0, 0, 3}, 0, null, 0f);
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("specialforceshelmethelmet")
				.setRegistryName("specialforceshelmethelmet").setCreativeTab(MCreatorArmorsandClothesTAB.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("minerustaddonsmod:specialforceshelmethelmet", "inventory"));
	}
}
