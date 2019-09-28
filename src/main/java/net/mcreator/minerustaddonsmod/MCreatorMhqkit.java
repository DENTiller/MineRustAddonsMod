package net.mcreator.minerustaddonsmod;

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

public class MCreatorMhqkit extends minerustaddonsmod.ModElement {

	@GameRegistry.ObjectHolder("minerustaddonsmod:mhqkithelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:mhqkitbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:mhqkitlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("minerustaddonsmod:mhqkitboots")
	public static final Item boots = null;

	public MCreatorMhqkit(minerustaddonsmod instance) {
		super(instance);
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("MHQKIT", "minerustaddonsmod:metal____", 14, new int[]{2, 2, 5, 5}, 0, null, 0f);
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("mhqkithelmet").setRegistryName("mhqkithelmet")
				.setCreativeTab(MCreatorArmorsandClothesTAB.tab));
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("mhqkitbody").setRegistryName("mhqkitbody")
				.setCreativeTab(MCreatorArmorsandClothesTAB.tab));
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("mhqkitlegs").setRegistryName("mhqkitlegs")
				.setCreativeTab(MCreatorArmorsandClothesTAB.tab));
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("mhqkitboots").setRegistryName("mhqkitboots")
				.setCreativeTab(MCreatorArmorsandClothesTAB.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("minerustaddonsmod:mhqkithelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("minerustaddonsmod:mhqkitbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("minerustaddonsmod:mhqkitlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("minerustaddonsmod:mhqkitboots", "inventory"));
	}
}
