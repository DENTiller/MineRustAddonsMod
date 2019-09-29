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

public class MCreatorBlackjacketsnow extends minerustaddonsmod.ModElement {

	@GameRegistry.ObjectHolder("minerustaddonsmod:blackjacketsnowhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:blackjacketsnowbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:blackjacketsnowlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:blackjacketsnowboots")
	public static final Item boots = null;

	public MCreatorBlackjacketsnow(minerustaddonsmod instance) {
		super(instance);
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("BLACKJACKETSNOW", "minerustaddonsmod:blackjacketsnow_", 3,
				new int[]{0, 5, 2, 1}, 0, null, 0f);
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("blackjacketsnowhelmet")
				.setRegistryName("blackjacketsnowhelmet").setCreativeTab(MCreatorArmorsandClothesTAB.tab));
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("blackjacketsnowbody")
				.setRegistryName("blackjacketsnowbody").setCreativeTab(MCreatorArmorsandClothesTAB.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("minerustaddonsmod:blackjacketsnowhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("minerustaddonsmod:blackjacketsnowbody", "inventory"));
	}
}
