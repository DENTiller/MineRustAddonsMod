package net.mcreator.minerustaddonsmod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

public class MCreatorMedicalsTAB extends minerustaddonsmod.ModElement {

	public MCreatorMedicalsTAB(minerustaddonsmod instance) {
		super(instance);
	}

	public static CreativeTabs tab = new CreativeTabs("tabmedicalstab") {

		@SideOnly(Side.CLIENT)
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(MCreatorSyringe.block, (int) (1));
		}

		@SideOnly(Side.CLIENT)
		public boolean hasSearchBar() {
			return false;
		}
	};
}
