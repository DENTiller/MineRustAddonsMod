package net.mcreator.minerustaddonsmod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

public class MCreatorCandyweapon extends minerustaddonsmod.ModElement {

	@GameRegistry.ObjectHolder("minerustaddonsmod:candyweapon")
	public static final Item block = null;

	public MCreatorCandyweapon(minerustaddonsmod instance) {
		super(instance);
		instance.items.add(() -> new ItemSword(EnumHelper.addToolMaterial("CANDYWEAPON", 0, 100, 0f, 0.5f, 0)) {

			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("sword", 0);
				return ret.keySet();
			}
		}.setUnlocalizedName("candyweapon").setRegistryName("candyweapon").setCreativeTab(MCreatorToolsTab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("minerustaddonsmod:candyweapon", "inventory"));
	}
}
