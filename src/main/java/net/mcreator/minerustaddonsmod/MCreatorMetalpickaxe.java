package net.mcreator.minerustaddonsmod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

public class MCreatorMetalpickaxe extends minerustaddonsmod.ModElement {

	@GameRegistry.ObjectHolder("minerustaddonsmod:metalpickaxe")
	public static final Item block = null;

	public MCreatorMetalpickaxe(minerustaddonsmod instance) {
		super(instance);
		instance.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("METALPICKAXE", 3, 100, 0f, 0f, 0)) {

			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 3);
				return ret.keySet();
			}
		}.setUnlocalizedName("metalpickaxe").setRegistryName("metalpickaxe").setCreativeTab(MCreatorToolsTab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("minerustaddonsmod:metalpickaxe", "inventory"));
	}
}
