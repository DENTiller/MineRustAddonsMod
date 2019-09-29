package net.mcreator.minerustaddonsmod;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;

import java.util.HashMap;

public class MCreatorAntiradFoodEatenUSE extends minerustaddonsmod.ModElement {

	public MCreatorAntiradFoodEatenUSE(minerustaddonsmod instance) {
		super(instance);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorAntiradFoodEatenUSE!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayerMP) {
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getCommandManager().executeCommand((EntityPlayerMP) entity, "effect @a[r=2] clear");
		}
	}
}
