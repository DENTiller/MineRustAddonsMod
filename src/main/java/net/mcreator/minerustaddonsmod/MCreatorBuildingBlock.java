package net.mcreator.minerustaddonsmod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

public class MCreatorBuildingBlock extends minerustaddonsmod.ModElement {

	public MCreatorBuildingBlock(minerustaddonsmod instance) {
		super(instance);
	}

	public static CreativeTabs tab = new CreativeTabs("tabbuildingblock") {

		@SideOnly(Side.CLIENT)
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(MCreatorMetalwall.block, (int) (1));
		}

		@SideOnly(Side.CLIENT)
		public boolean hasSearchBar() {
			return false;
		}
	};
}
