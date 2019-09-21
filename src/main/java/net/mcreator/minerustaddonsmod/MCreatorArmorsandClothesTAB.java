package net.mcreator.minerustaddonsmod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

public class MCreatorArmorsandClothesTAB extends minerustaddonsmod.ModElement {

	public MCreatorArmorsandClothesTAB(minerustaddonsmod instance) {
		super(instance);
	}

	public static CreativeTabs tab = new CreativeTabs("tabarmorsandclothestab") {

		@SideOnly(Side.CLIENT)
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(MCreatorBuckethelmet.helmet, (int) (1));
		}

		@SideOnly(Side.CLIENT)
		public boolean hasSearchBar() {
			return false;
		}
	};
}
