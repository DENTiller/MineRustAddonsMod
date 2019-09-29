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

public class MCreatorMetalsword extends minerustaddonsmod.ModElement {

	@GameRegistry.ObjectHolder("minerustaddonsmod:metalsword")
	public static final Item block = null;

	public MCreatorMetalsword(minerustaddonsmod instance) {
		super(instance);
		instance.items.add(() -> new ItemSword(EnumHelper.addToolMaterial("METALSWORD", 3, 100, 0f, 1f, 0)) {

			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("sword", 3);
				return ret.keySet();
			}
		}.setUnlocalizedName("metalsword").setRegistryName("metalsword").setCreativeTab(MCreatorToolsTab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("minerustaddonsmod:metalsword", "inventory"));
	}
}
