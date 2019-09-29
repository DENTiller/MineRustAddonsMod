package net.mcreator.minerustaddonsmod;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.HashMap;

public class MCreatorBeanscanuse extends minerustaddonsmod.ModElement {

	public MCreatorBeanscanuse(minerustaddonsmod instance) {
		super(instance);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorBeanscanuse!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorBeanscanuse!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorBeanscanuse!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorBeanscanuse!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorBeanscanuse!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.playSound((EntityPlayer) null, x, y, z,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("minerustaddonsmod:eat.food")),
				SoundCategory.NEUTRAL, (float) 1, (float) 1);
		if (entity instanceof EntityPlayer)
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(MCreatorBeanscanempty.block, (int) (1)));
	}
}
