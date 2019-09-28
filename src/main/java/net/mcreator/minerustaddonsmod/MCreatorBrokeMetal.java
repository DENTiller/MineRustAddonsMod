package net.mcreator.minerustaddonsmod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class MCreatorBrokeMetal extends minerustaddonsmod.ModElement {

	public MCreatorBrokeMetal(minerustaddonsmod instance) {
		super(instance);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorBrokeMetal!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorBrokeMetal!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorBrokeMetal!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorBrokeMetal!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorBrokeMetal!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer && !world.isRemote) {
			((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Message"), (false));
		}
		if (((new Object() {

			public double getValue(BlockPos pos) {
				TileEntity tileEntity = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble("blockHealth");
				return -1;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z))) > 0)) {
			{
				TileEntity tileEntity = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (tileEntity != null)
					tileEntity.getTileData().setDouble("blockHealth", ((new Object() {

						public double getValue(BlockPos pos) {
							TileEntity tileEntity = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble("blockHealth");
							return -1;
						}
					}.getValue(new BlockPos((int) x, (int) y, (int) z))) - 1));
			}
		} else {
			world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
					.getObject(new ResourceLocation("minerustaddonsmod:broke.metal")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
		}
	}
}
