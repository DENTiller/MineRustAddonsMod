package net.mcreator.minerustaddonsmod;

import java.util.List;
import java.util.HashMap;

import net.minecraft.entity.passive.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.boss.*;
import net.minecraft.creativetab.*;
import net.minecraft.world.chunk.storage.*;

import net.minecraftforge.fml.common.network.*;

import net.minecraft.server.management.*;
import net.minecraft.client.particle.*;

import net.minecraftforge.client.model.obj.*;
import net.minecraftforge.oredict.*;

import net.minecraft.client.settings.*;

import net.minecraftforge.fml.common.eventhandler.*;

import net.minecraft.client.entity.*;

import net.minecraftforge.fml.relauncher.*;
import net.minecraftforge.fml.server.*;

import net.minecraft.block.state.pattern.*;
import net.minecraft.network.*;
import net.minecraft.client.renderer.tileentity.*;
import net.minecraft.crash.*;
import net.minecraft.stats.*;
import net.minecraft.world.gen.structure.template.*;
import net.minecraft.tileentity.*;

import net.minecraftforge.fml.client.registry.*;

import net.minecraft.world.gen.*;

import net.minecraftforge.fml.common.asm.transformers.*;

import net.minecraft.enchantment.*;

import net.minecraftforge.event.entity.*;
import net.minecraftforge.fml.common.discovery.*;

import net.minecraft.command.*;
import net.minecraft.dispenser.*;

import net.minecraftforge.event.entity.item.*;

import net.minecraft.client.gui.*;
import net.minecraft.server.*;
import net.minecraft.advancements.critereon.*;
import net.minecraft.block.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.inventory.*;

import net.minecraftforge.items.*;

import net.minecraft.world.gen.layer.*;

import net.minecraftforge.event.terraingen.*;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.fml.common.*;

import net.minecraft.pathfinding.*;

import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.fml.common.toposort.*;

import net.minecraft.client.util.*;

import net.minecraftforge.client.event.sound.*;
import net.minecraftforge.client.model.*;

import net.minecraft.server.gui.*;

import net.minecraftforge.client.event.*;

import net.minecraft.util.*;

import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.event.world.*;

import net.minecraft.client.renderer.block.statemap.*;

import net.minecraftforge.fml.common.discovery.asm.*;

import net.minecraft.item.crafting.*;
import net.minecraft.entity.effect.*;
import net.minecraft.client.gui.achievement.*;

import net.minecraftforge.event.entity.minecart.*;

import net.minecraft.client.renderer.culling.*;

import net.minecraftforge.fml.common.versioning.*;

import net.minecraft.entity.projectile.*;

import net.minecraftforge.common.*;

import net.minecraft.util.math.*;
import net.minecraft.entity.item.*;
import net.minecraft.item.*;

import net.minecraftforge.fml.client.*;
import net.minecraftforge.fluids.*;

import net.minecraft.init.*;
import net.minecraft.advancements.*;
import net.minecraft.client.audio.*;
import net.minecraft.world.gen.feature.*;

import net.minecraftforge.fml.common.asm.*;

import net.minecraft.block.state.*;
import net.minecraft.client.renderer.*;
import net.minecraft.util.text.*;
import net.minecraft.entity.player.*;

import net.minecraftforge.fml.common.gameevent.*;

import net.minecraft.world.storage.*;
import net.minecraft.world.biome.*;
import net.minecraft.client.*;

import net.minecraftforge.common.util.*;

import net.minecraft.network.rcon.*;
import net.minecraft.profiler.*;

import net.minecraftforge.classloading.*;

import net.minecraft.village.*;
import net.minecraft.potion.*;
import net.minecraft.block.material.*;
import net.minecraft.world.*;
import net.minecraft.nbt.*;
import net.minecraft.world.gen.structure.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.server.integrated.*;
import net.minecraft.client.renderer.block.model.*;
import net.minecraft.block.properties.*;
import net.minecraft.entity.ai.attributes.*;

import net.minecraftforge.client.*;
import net.minecraftforge.fml.common.registry.*;

import net.minecraft.world.chunk.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.entity.monster.*;

import net.minecraftforge.event.*;

import net.minecraft.server.dedicated.*;

public class MCreatorArmoredwall extends minerustaddonsmod.ModElement {

	@GameRegistry.ObjectHolder("minerustaddonsmod:armoredwall")
	public static final Block block = null;

	public MCreatorArmoredwall(minerustaddonsmod instance) {
		super(instance);
		instance.blocks.add(() -> new BlockCustom());
		instance.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("minerustaddonsmod:armoredwall",
				"inventory"));
	}

	public static class BlockCustom extends Block {

		public static final PropertyDirection FACING = BlockHorizontal.FACING;

		public BlockCustom() {
			super(Material.IRON);
			setRegistryName("armoredwall");
			setUnlocalizedName("armoredwall");
			setSoundType(SoundType.METAL);
			setHarvestLevel("pickaxe", 10);
			setHardness(60000F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(MCreatorBuildingBlock.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add("\u00A7fLevel Protection : \u00A7a[4] \u00A7a");
			list.add("- Not Breaks only explode!");
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getBlockLayer() {
			return BlockRenderLayer.SOLID;
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING});
		}

		@Override
		public IBlockState getStateFromMeta(int meta) {
			return this.getDefaultState().withProperty(FACING, EnumFacing.getFront(meta));
		}

		@Override
		public int getMetaFromState(IBlockState state) {
			return ((EnumFacing) state.getValue(FACING)).getIndex();
		}

		@Override
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta,
				EntityLivingBase placer) {
			return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
		}

		@Override
		public void onBlockDestroyedByExplosion(World world, BlockPos pos, Explosion e) {
			super.onBlockDestroyedByExplosion(world, pos, e);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			Block block = this;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				MCreatorArmoredBrokenEXP.executeProcedure($_dependencies);
			}
		}

		@Override
		public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase entity, ItemStack itemstack) {
			super.onBlockPlacedBy(world, pos, state, entity, itemstack);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			Block block = this;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				MCreatorBuildArmored.executeProcedure($_dependencies);
			}
		}
	}
}
