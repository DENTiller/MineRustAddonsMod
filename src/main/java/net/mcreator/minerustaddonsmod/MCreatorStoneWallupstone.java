package net.mcreator.minerustaddonsmod;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import java.util.HashMap;

public class MCreatorStoneWallupstone extends minerustaddonsmod.ModElement {

	public MCreatorStoneWallupstone(minerustaddonsmod instance) {
		super(instance);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorStoneWallupstone!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorStoneWallupstone!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorStoneWallupstone!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorStoneWallupstone!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorStoneWallupstone!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((new Object() {

			ItemStack stack() {
				ItemStack stack = ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).copy();
				stack.setCount(1);
				return stack;
			}
		}.stack()).getItem() == new ItemStack(MCreatorUpinmetal.block, (int) (1)).getItem())) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), MCreatorMetalwall.block.getDefaultState(), 3);
			world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
					.getObject(new ResourceLocation("minerustaddonsmod:build.metal")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(MCreatorUpinmetal.block, (int) (1)).getItem(), -1, (int) 1, null);
		}
		if (((new Object() {

			ItemStack stack() {
				ItemStack stack = ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).copy();
				stack.setCount(1);
				return stack;
			}
		}.stack()).getItem() == new ItemStack(MCreatorCreativeupgradehammer.block, (int) (1)).getItem())) {
			world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
					.getObject(new ResourceLocation("minerustaddonsmod:build.metal")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), MCreatorMetalwall.block.getDefaultState(), 3);
		}
	}
}
