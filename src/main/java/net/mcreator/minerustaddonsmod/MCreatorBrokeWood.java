package net.mcreator.minerustaddonsmod;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.EntityPlayer;

import java.util.HashMap;

public class MCreatorBrokeWood extends minerustaddonsmod.ModElement {

	public MCreatorBrokeWood(minerustaddonsmod instance) {
		super(instance);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorBrokeWood!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorBrokeWood!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorBrokeWood!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorBrokeWood!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
				.getObject(new ResourceLocation("minerustaddonsmod:broke.wood")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
	}
}
