package net.mcreator.minerustaddonsmod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Potion;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.Block;

import java.util.function.Supplier;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

@Mod(modid = minerustaddonsmod.MODID, version = minerustaddonsmod.VERSION)
public class minerustaddonsmod implements IFuelHandler, IWorldGenerator {

	public static final String MODID = "minerustaddonsmod";
	public static final String VERSION = "2.0";
	@SidedProxy(clientSide = "net.mcreator.minerustaddonsmod.ClientProxyminerustaddonsmod", serverSide = "net.mcreator.minerustaddonsmod.CommonProxyminerustaddonsmod")
	public static CommonProxyminerustaddonsmod proxy;
	@Instance(MODID)
	public static minerustaddonsmod instance;
	public final List<ModElement> elements = new ArrayList<>();
	public final List<Supplier<Block>> blocks = new ArrayList<>();
	public final List<Supplier<Item>> items = new ArrayList<>();
	public final List<Supplier<Biome>> biomes = new ArrayList<>();
	public final List<Supplier<EntityEntry>> entities = new ArrayList<>();
	public final List<Supplier<Potion>> potions = new ArrayList<>();

	public minerustaddonsmod() {
		FluidRegistry.enableUniversalBucket();
		elements.add(new MCreatorBuildingBlock(this));
		elements.add(new MCreatorDecorationsTAB(this));
		elements.add(new MCreatorToolsTab(this));
		elements.add(new MCreatorArmorsandClothesTAB(this));
		elements.add(new MCreatorGameplayTAB(this));
		elements.add(new MCreatorOtherTab(this));
		elements.add(new MCreatorIconmod(this));
		elements.add(new MCreatorHayfloor(this));
		elements.add(new MCreatorHayWall(this));
		elements.add(new MCreatorWoodfloor(this));
		elements.add(new MCreatorWoodwall(this));
		elements.add(new MCreatorStonefloor(this));
		elements.add(new MCreatorStoneWall(this));
		elements.add(new MCreatorMetalfloor(this));
		elements.add(new MCreatorMetalwall(this));
		elements.add(new MCreatorArmoredfloor(this));
		elements.add(new MCreatorArmoredwall(this));
		elements.add(new MCreatorAsphalt(this));
		elements.add(new MCreatorDecorbox(this));
		elements.add(new MCreatorBluecontainer(this));
		elements.add(new MCreatorDecorbrick(this));
		elements.add(new MCreatorStonebrick(this));
		elements.add(new MCreatorGarbage(this));
		elements.add(new MCreatorGarage(this));
		elements.add(new MCreatorTerraingrass1(this));
		elements.add(new MCreatorTerraingrass2(this));
		elements.add(new MCreatorTerraingrass3(this));
		elements.add(new MCreatorTerraingravel(this));
		elements.add(new MCreatorMetal1(this));
		elements.add(new MCreatorMetal2(this));
		elements.add(new MCreatorMetal3(this));
		elements.add(new MCreatorMetal4(this));
		elements.add(new MCreatorMetal5(this));
		elements.add(new MCreatorMetal6(this));
		elements.add(new MCreatorMetal7(this));
		elements.add(new MCreatorMetal8(this));
		elements.add(new MCreatorMetal9(this));
		elements.add(new MCreatorMetal10(this));
		elements.add(new MCreatorMetal11(this));
		elements.add(new MCreatorMetal12(this));
		elements.add(new MCreatorMetal13(this));
		elements.add(new MCreatorMetal14(this));
		elements.add(new MCreatorMetal15(this));
		elements.add(new MCreatorMetal16(this));
		elements.add(new MCreatorMetal17(this));
		elements.add(new MCreatorMetal18(this));
		elements.add(new MCreatorMetal19(this));
		elements.add(new MCreatorMetal20(this));
		elements.add(new MCreatorMetal21(this));
		elements.add(new MCreatorMetal22(this));
		elements.add(new MCreatorMetal23(this));
		elements.add(new MCreatorMetal24(this));
		elements.add(new MCreatorMetal25(this));
		elements.add(new MCreatorMetal26(this));
		elements.add(new MCreatorMetal27(this));
		elements.add(new MCreatorTile(this));
		elements.add(new MCreatorPlank(this));
		elements.add(new MCreatorRedcontainer(this));
		elements.add(new MCreatorTerrainsand(this));
		elements.add(new MCreatorTerrainsnow(this));
		elements.add(new MCreatorBrokenasphalt(this));
		elements.add(new MCreatorTerrainstone1(this));
		elements.add(new MCreatorTerrainstone2(this));
		elements.add(new MCreatorTerrainstone3(this));
		elements.add(new MCreatorTerrainstone4(this));
		elements.add(new MCreatorDarkwoodplank(this));
		elements.add(new MCreatorOakwoodplank(this));
		elements.add(new MCreatorPlankbroken(this));
		elements.add(new MCreatorYellowcontainer(this));
		elements.add(new MCreatorFoodapple(this));
		elements.add(new MCreatorBuildWood(this));
		elements.add(new MCreatorBrokeWood(this));
		elements.add(new MCreatorBuildStone(this));
		elements.add(new MCreatorBrokeStone(this));
		elements.add(new MCreatorBuildMetal(this));
		elements.add(new MCreatorBrokeMetal(this));
		elements.add(new MCreatorBuildArmored(this));
		elements.add(new MCreatorEat(this));
		elements.add(new MCreatorMedicalsTAB(this));
		elements.add(new MCreatorFoodsTab(this));
		elements.add(new MCreatorUseSyringe(this));
		elements.add(new MCreatorSyringe(this));
		elements.add(new MCreatorUseBandage(this));
		elements.add(new MCreatorBandage(this));
		elements.add(new MCreatorHorsemeatcooked(this));
		elements.add(new MCreatorInfectedEAT(this));
		elements.add(new MCreatorHorsemeatraw(this));
		elements.add(new MCreatorBlueberries(this));
		elements.add(new MCreatorOtherpaper(this));
		elements.add(new MCreatorResourcesTab(this));
		elements.add(new MCreatorSulfur(this));
		elements.add(new MCreatorSulfurore(this));
		elements.add(new MCreatorResbone(this));
		elements.add(new MCreatorBookwithblueprints(this));
		elements.add(new MCreatorFishcanempty(this));
		elements.add(new MCreatorScrap(this));
		elements.add(new MCreatorBuildingplan(this));
		elements.add(new MCreatorBeanscanempty(this));
		elements.add(new MCreatorMushroom(this));
		elements.add(new MCreatorWoodcoal(this));
		elements.add(new MCreatorChickenmeatcooked(this));
		elements.add(new MCreatorChickenmeatraw(this));
		elements.add(new MCreatorPiecestone(this));
		elements.add(new MCreatorPiecewood(this));
		elements.add(new MCreatorMetalore(this));
		elements.add(new MCreatorChocolatebar(this));
		elements.add(new MCreatorMhq(this));
		elements.add(new MCreatorFlq(this));
		elements.add(new MCreatorExplosive(this));
		elements.add(new MCreatorPipe(this));
		elements.add(new MCreatorFhq(this));
		elements.add(new MCreatorSewingkit(this));
		elements.add(new MCreatorGears(this));
		elements.add(new MCreatorOilRaw(this));
		elements.add(new MCreatorSmgbody(this));
		elements.add(new MCreatorSemiautomaticbody(this));
		elements.add(new MCreatorRope(this));
		elements.add(new MCreatorMetalSheet(this));
		elements.add(new MCreatorResleather(this));
		elements.add(new MCreatorRoadsign(this));
		elements.add(new MCreatorCLoth(this));
		elements.add(new MCreatorAnimalfat(this));
		elements.add(new MCreatorHolographicsight(this));
		elements.add(new MCreatorMetalfragments(this));
		elements.add(new MCreatorMhqore(this));
		elements.add(new MCreatorFishmeatcooked(this));
		elements.add(new MCreatorBarkcactus(this));
		elements.add(new MCreatorFishmeatraw(this));
		elements.add(new MCreatorSilencer(this));
		elements.add(new MCreatorGlue(this));
		elements.add(new MCreatorRiflebody(this));
		elements.add(new MCreatorResgunpowder(this));
		elements.add(new MCreatorHumanmeatcooked(this));
		elements.add(new MCreatorHumanmeatraw(this));
		elements.add(new MCreatorBlackberryinfected(this));
		elements.add(new MCreatorBlueberriesinfected(this));
		elements.add(new MCreatorMuzzleaccelerator(this));
		elements.add(new MCreatorSniperriflex8(this));
		elements.add(new MCreatorLargemedkit(this));
		elements.add(new MCreatorTank(this));
		elements.add(new MCreatorLog(this));
		elements.add(new MCreatorLock(this));
		elements.add(new MCreatorCamera(this));
		elements.add(new MCreatorMaplocation(this));
		elements.add(new MCreatorPumpkin(this));
		elements.add(new MCreatorCodelock(this));
		elements.add(new MCreatorFishcan(this));
		elements.add(new MCreatorFishcanuse(this));
		elements.add(new MCreatorBearmeatcooked(this));
		elements.add(new MCreatorBearmeatraw(this));
		elements.add(new MCreatorMuzzlebrake(this));
		elements.add(new MCreatorMuq(this));
		elements.add(new MCreatorBlueprint(this));
		elements.add(new MCreatorPlanksitem(this));
		elements.add(new MCreatorBoarmeatcooked(this));
		elements.add(new MCreatorBoardmeatraw(this));
		elements.add(new MCreatorBlackberry(this));
		elements.add(new MCreatorCrackers(this));
		elements.add(new MCreatorAppleinfected(this));
		elements.add(new MCreatorSnipersightx4(this));
		elements.add(new MCreatorChip(this));
		elements.add(new MCreatorCorn(this));
		elements.add(new MCreatorShotgunbody(this));
		elements.add(new MCreatorWolfmeatcooked(this));
		elements.add(new MCreatorPistolbody(this));
		elements.add(new MCreatorWolfmeatraw(this));
		elements.add(new MCreatorBeanscanuse(this));
		elements.add(new MCreatorBeanscan(this));
		elements.add(new MCreatorBlades(this));
		elements.add(new MCreatorTarp(this));
		elements.add(new MCreatorMuqpre(this));
		elements.add(new MCreatorLaser(this));
		elements.add(new MCreatorLaptop(this));
		elements.add(new MCreatorSmallstashitem(this));
		elements.add(new MCreatorHammer(this));
		elements.add(new MCreatorPieceblueprint(this));
		elements.add(new MCreatorBigstonewall(this));
		elements.add(new MCreatorWoodenkit(this));
		elements.add(new MCreatorWolfkit(this));
		elements.add(new MCreatorBuckethelmet(this));
		elements.add(new MCreatorMhqkit(this));
		elements.add(new MCreatorRedjacketkit(this));
		elements.add(new MCreatorRoadsignkit(this));
		elements.add(new MCreatorClothkit(this));
		elements.add(new MCreatorBonekit(this));
		elements.add(new MCreatorMetalaxe(this));
		elements.add(new MCreatorMetalpickaxe(this));
		elements.add(new MCreatorMetalsword(this));
		elements.add(new MCreatorBonetool(this));
		elements.add(new MCreatorKnife(this));
		elements.add(new MCreatorHatchet(this));
		elements.add(new MCreatorIronpickaxe(this));
		elements.add(new MCreatorMachete(this));
		elements.add(new MCreatorRoadsignbaton(this));
		elements.add(new MCreatorMace(this));
		elements.add(new MCreatorStoneaxe(this));
		elements.add(new MCreatorStonepickaxe(this));
		elements.add(new MCreatorLongsword(this));
		elements.add(new MCreatorStonespear(this));
		elements.add(new MCreatorWarhammer(this));
		elements.add(new MCreatorBoneknife(this));
		elements.add(new MCreatorWhiteblock(this));
		elements.add(new MCreatorStone1(this));
		elements.add(new MCreatorRoadblockline(this));
		elements.add(new MCreatorRoadblock(this));
		elements.add(new MCreatorStone2(this));
		elements.add(new MCreatorStone3(this));
		elements.add(new MCreatorStone4(this));
		elements.add(new MCreatorStone5(this));
		elements.add(new MCreatorCactus(this));
		elements.add(new MCreatorGarageblock(this));
		elements.add(new MCreatorTerraingrass4(this));
		elements.add(new MCreatorTerrainGrass5(this));
		elements.add(new MCreatorTerrainGrass6(this));
		elements.add(new MCreatorGravel2(this));
		elements.add(new MCreatorGravelsnow(this));
		elements.add(new MCreatorGreenboxs(this));
		elements.add(new MCreatorGreenstonebrick(this));
		elements.add(new MCreatorJunglewood(this));
		elements.add(new MCreatorLeaves1(this));
		elements.add(new MCreatorLeaves2(this));
		elements.add(new MCreatorLootboxdecor(this));
		elements.add(new MCreatorMetal28(this));
		elements.add(new MCreatorMetal29(this));
		elements.add(new MCreatorMetal30(this));
		elements.add(new MCreatorJungleleaves(this));
		elements.add(new MCreatorMetal31(this));
		elements.add(new MCreatorMetal32(this));
		elements.add(new MCreatorMetal33(this));
		elements.add(new MCreatorMetal34(this));
		elements.add(new MCreatorMetal35(this));
		elements.add(new MCreatorMetal36(this));
		elements.add(new MCreatorMetal37(this));
		elements.add(new MCreatorMetal38(this));
		elements.add(new MCreatorStone6(this));
		elements.add(new MCreatorMetal39(this));
		elements.add(new MCreatorTile2(this));
		elements.add(new MCreatorTile3(this));
		elements.add(new MCreatorTerrainsanddark(this));
		elements.add(new MCreatorSandlight(this));
		elements.add(new MCreatorSandstone(this));
		elements.add(new MCreatorTerrainstone5(this));
		elements.add(new MCreatorTerrainstone6(this));
		elements.add(new MCreatorSandlodark(this));
		elements.add(new MCreatorLeavessnow(this));
		elements.add(new MCreatorSnowlog(this));
		elements.add(new MCreatorStone7(this));
		elements.add(new MCreatorStone8(this));
		elements.add(new MCreatorStone9(this));
		elements.add(new MCreatorStone10(this));
		elements.add(new MCreatorStone11(this));
		elements.add(new MCreatorStone12(this));
		elements.add(new MCreatorTerrainsandraw(this));
		elements.add(new MCreatorTerraingrass7(this));
		elements.add(new MCreatorTerrainstone7(this));
		elements.add(new MCreatorTerraingrass8(this));
		elements.add(new MCreatorTerrainstone8(this));
		elements.add(new MCreatorTerrainstone9(this));
		elements.add(new MCreatorStoneterrain10(this));
		elements.add(new MCreatorTerrainstone11(this));
		elements.add(new MCreatorTerrainstone12(this));
		elements.add(new MCreatorTerraingrass9(this));
		elements.add(new MCreatorTerraingrass10(this));
		elements.add(new MCreatorWood1(this));
		elements.add(new MCreatorWood2(this));
		elements.add(new MCreatorWood3(this));
		elements.add(new MCreatorBigchest(this));
		elements.add(new MCreatorSmallchest(this));
		elements.add(new MCreatorPlaceCHest(this));
		elements.add(new MCreatorSmallstash(this));
		elements.add(new MCreatorSmallStashgui(this));
		elements.add(new MCreatorSmallstashOpen(this));
		elements.add(new MCreatorSmallchestgui(this));
		elements.add(new MCreatorBigchestgui(this));
		elements.add(new MCreatorSmallchestopen(this));
		elements.add(new MCreatorBigchestopen(this));
		elements.add(new MCreatorStoneblock(this));
		elements.add(new MCreatorMetaloreblock(this));
		elements.add(new MCreatorSulfuroreblock(this));
		elements.add(new MCreatorMhqoreblock(this));
		elements.add(new MCreatorMuqoreblock(this));
		elements.add(new MCreatorBuildingplanuse(this));
		elements.add(new MCreatorSmallchestplace(this));
		elements.add(new MCreatorSmallstashplace(this));
		elements.add(new MCreatorBigstonewallplace(this));
		elements.add(new MCreatorStone15(this));
		elements.add(new MCreatorMetal40(this));
		elements.add(new MCreatorMetal41(this));
		elements.add(new MCreatorMetal42(this));
		elements.add(new MCreatorGreenwoodplank1(this));
		elements.add(new MCreatorMetal43(this));
		elements.add(new MCreatorWhitewood(this));
		elements.add(new MCreatorMetal44(this));
		elements.add(new MCreatorMetal45(this));
		elements.add(new MCreatorStone16(this));
		elements.add(new MCreatorHaydetails1(this));
		elements.add(new MCreatorMetal46(this));
		elements.add(new MCreatorMetal47(this));
		elements.add(new MCreatorStone17(this));
		elements.add(new MCreatorHaydetails2(this));
		elements.add(new MCreatorMetal48(this));
		elements.add(new MCreatorMetal49(this));
		elements.add(new MCreatorMetal50(this));
		elements.add(new MCreatorTerraingrass11(this));
		elements.add(new MCreatorWhitewoodplank(this));
		elements.add(new MCreatorMetal51(this));
		elements.add(new MCreatorMetal52(this));
		elements.add(new MCreatorMetal53(this));
		elements.add(new MCreatorTerraingrass12(this));
		elements.add(new MCreatorWooddeafult(this));
		elements.add(new MCreatorMetal54(this));
		elements.add(new MCreatorMetal55(this));
		elements.add(new MCreatorMetal56(this));
		elements.add(new MCreatorTerraingravel1(this));
		elements.add(new MCreatorStone18(this));
		elements.add(new MCreatorMetal57(this));
		elements.add(new MCreatorMetal58(this));
		elements.add(new MCreatorTerrain(this));
		elements.add(new MCreatorStone19(this));
		elements.add(new MCreatorMetal59(this));
		elements.add(new MCreatorMetal60(this));
		elements.add(new MCreatorWoodplankgray(this));
		elements.add(new MCreatorTerrain2(this));
		elements.add(new MCreatorStone20(this));
		elements.add(new MCreatorGarageblock2(this));
		elements.add(new MCreatorMetal61(this));
		elements.add(new MCreatorStone21(this));
		elements.add(new MCreatorMetal62(this));
		elements.add(new MCreatorMetal63(this));
		elements.add(new MCreatorRocktool(this));
		elements.add(new MCreatorMetal64(this));
		elements.add(new MCreatorMetal65(this));
		elements.add(new MCreatorMetal66(this));
		elements.add(new MCreatorMetal67(this));
		elements.add(new MCreatorWheel(this));
		elements.add(new MCreatorStone22(this));
		elements.add(new MCreatorStone23(this));
		elements.add(new MCreatorGarbage2(this));
		elements.add(new MCreatorGarbage3(this));
		elements.add(new MCreatorRecycler(this));
		elements.add(new MCreatorWoodBrokenExp(this));
		elements.add(new MCreatorStoneBrokenExp(this));
		elements.add(new MCreatorMetalBrokenEXP(this));
		elements.add(new MCreatorArmoredBrokenEXP(this));
		elements.add(new MCreatorUpinwood(this));
		elements.add(new MCreatorUpinstone(this));
		elements.add(new MCreatorUpinmetal(this));
		elements.add(new MCreatorUpinmhq(this));
		elements.add(new MCreatorHayfloorupinwood(this));
		elements.add(new MCreatorHayWallupwood(this));
		elements.add(new MCreatorWoodfloorupstone(this));
		elements.add(new MCreatorWoodwallupstone(this));
		elements.add(new MCreatorStonefloorupmetal(this));
		elements.add(new MCreatorStoneWallupstone(this));
		elements.add(new MCreatorMetalflooruparmored(this));
		elements.add(new MCreatorMetalwalluparmored(this));
		elements.add(new MCreatorStone13(this));
		elements.add(new MCreatorStone14(this));
		elements.add(new MCreatorBlood(this));
		elements.add(new MCreatorMetalspring(this));
		elements.add(new MCreatorBlueprint2(this));
		elements.add(new MCreatorBiggift(this));
		elements.add(new MCreatorHighgift(this));
		elements.add(new MCreatorEmptybucket(this));
		elements.add(new MCreatorFlare(this));
		elements.add(new MCreatorSupplysignalgrenade(this));
		elements.add(new MCreatorSticks(this));
		elements.add(new MCreatorRawfish(this));
		elements.add(new MCreatorScullhuman(this));
		elements.add(new MCreatorKey(this));
		elements.add(new MCreatorSeedpumpkin(this));
		elements.add(new MCreatorSeedhemp(this));
		elements.add(new MCreatorSmallgift(this));
		elements.add(new MCreatorNote(this));
		elements.add(new MCreatorCoal2(this));
		elements.add(new MCreatorSeedcorn(this));
		elements.add(new MCreatorStone24(this));
		elements.add(new MCreatorBotabag(this));
		elements.add(new MCreatorCandycane(this));
		elements.add(new MCreatorCandyweapon(this));
		elements.add(new MCreatorCornplant(this));
		elements.add(new MCreatorHemp(this));
		elements.add(new MCreatorPumpkinplant(this));
		elements.add(new MCreatorGingerbreadmen(this));
		elements.add(new MCreatorDucttape(this));
		elements.add(new MCreatorGuitar(this));
		elements.add(new MCreatorZombieflesh(this));
		elements.add(new MCreatorSkullanimal(this));
		elements.add(new MCreatorBinoculars(this));
		elements.add(new MCreatorPhotocamera(this));
		elements.add(new MCreatorCustomsight(this));
		elements.add(new MCreatorTEST21(this));
	}

	@Override
	public int getBurnTime(ItemStack fuel) {
		for (ModElement element : elements) {
			int ret = element.addFuel(fuel);
			if (ret != 0)
				return ret;
		}
		return 0;
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator cg, IChunkProvider cp) {
		elements.forEach(element -> element.generateWorld(random, chunkX * 16, chunkZ * 16, world, world.provider.getDimension(), cg, cp));
	}

	@SubscribeEvent
	public void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(blocks.stream().map(Supplier::get).toArray(Block[]::new));
	}

	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(items.stream().map(Supplier::get).toArray(Item[]::new));
	}

	@SubscribeEvent
	public void registerBiomes(RegistryEvent.Register<Biome> event) {
		event.getRegistry().registerAll(biomes.stream().map(Supplier::get).toArray(Biome[]::new));
	}

	@SubscribeEvent
	public void registerEntities(RegistryEvent.Register<EntityEntry> event) {
		event.getRegistry().registerAll(entities.stream().map(Supplier::get).toArray(EntityEntry[]::new));
	}

	@SubscribeEvent
	public void registerPotions(RegistryEvent.Register<Potion> event) {
		event.getRegistry().registerAll(potions.stream().map(Supplier::get).toArray(Potion[]::new));
	}

	@SubscribeEvent
	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
		ResourceLocation sound0 = new ResourceLocation("minerustaddonsmod", "broke.wood");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound0).setRegistryName(sound0));
		ResourceLocation sound1 = new ResourceLocation("minerustaddonsmod", "broke.stone");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound1).setRegistryName(sound1));
		ResourceLocation sound2 = new ResourceLocation("minerustaddonsmod", "build.wood");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound2).setRegistryName(sound2));
		ResourceLocation sound3 = new ResourceLocation("minerustaddonsmod", "eat.food");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound3).setRegistryName(sound3));
		ResourceLocation sound4 = new ResourceLocation("minerustaddonsmod", "build.metal");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound4).setRegistryName(sound4));
		ResourceLocation sound5 = new ResourceLocation("minerustaddonsmod", "eat.infected");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound5).setRegistryName(sound5));
		ResourceLocation sound6 = new ResourceLocation("minerustaddonsmod", "build.stone");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound6).setRegistryName(sound6));
		ResourceLocation sound7 = new ResourceLocation("minerustaddonsmod", "use.syringe");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound7).setRegistryName(sound7));
		ResourceLocation sound8 = new ResourceLocation("minerustaddonsmod", "build.armored");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound8).setRegistryName(sound8));
		ResourceLocation sound9 = new ResourceLocation("minerustaddonsmod", "broke.metal");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound9).setRegistryName(sound9));
		ResourceLocation sound10 = new ResourceLocation("minerustaddonsmod", "use.bandage");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound10).setRegistryName(sound10));
		ResourceLocation sound11 = new ResourceLocation("minerustaddonsmod", "chest.place");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound11).setRegistryName(sound11));
		ResourceLocation sound12 = new ResourceLocation("minerustaddonsmod", "smallstash.open");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound12).setRegistryName(sound12));
		ResourceLocation sound13 = new ResourceLocation("minerustaddonsmod", "chest.open");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound13).setRegistryName(sound13));
		ResourceLocation sound14 = new ResourceLocation("minerustaddonsmod", "smallchestopen");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound14).setRegistryName(sound14));
		ResourceLocation sound15 = new ResourceLocation("minerustaddonsmod", "smallstash.place");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound15).setRegistryName(sound15));
		ResourceLocation sound16 = new ResourceLocation("minerustaddonsmod", "smallchest.place");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound16).setRegistryName(sound16));
		ResourceLocation sound17 = new ResourceLocation("minerustaddonsmod", "broken.structure");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound17).setRegistryName(sound17));
		ResourceLocation sound18 = new ResourceLocation("minerustaddonsmod", "bigstonewall.place");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound18).setRegistryName(sound18));
		ResourceLocation sound19 = new ResourceLocation("minerustaddonsmod", "broken.stone");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound19).setRegistryName(sound19));
		ResourceLocation sound20 = new ResourceLocation("minerustaddonsmod", "broken.wood");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound20).setRegistryName(sound20));
		ResourceLocation sound21 = new ResourceLocation("minerustaddonsmod", "metal.broken");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound21).setRegistryName(sound21));
		ResourceLocation sound22 = new ResourceLocation("minerustaddonsmod", "armored.broken");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound22).setRegistryName(sound22));
	}

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		elements.forEach(element -> element.registerModels(event));
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
		GameRegistry.registerFuelHandler(this);
		GameRegistry.registerWorldGenerator(this, 5);
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		elements.forEach(element -> element.preInit(event));
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		elements.forEach(element -> element.init(event));
		proxy.init(event);
	}

	@EventHandler
	public void serverLoad(FMLServerStartingEvent event) {
		elements.forEach(element -> element.serverLoad(event));
	}

	public static class GuiHandler implements IGuiHandler {

		@Override
		public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			if (id == MCreatorSmallStashgui.GUIID)
				return new MCreatorSmallStashgui.GuiContainerMod(world, x, y, z, player);
			if (id == MCreatorSmallchestgui.GUIID)
				return new MCreatorSmallchestgui.GuiContainerMod(world, x, y, z, player);
			if (id == MCreatorBigchestgui.GUIID)
				return new MCreatorBigchestgui.GuiContainerMod(world, x, y, z, player);
			return null;
		}

		@Override
		public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			if (id == MCreatorSmallStashgui.GUIID)
				return new MCreatorSmallStashgui.GuiWindow(world, x, y, z, player);
			if (id == MCreatorSmallchestgui.GUIID)
				return new MCreatorSmallchestgui.GuiWindow(world, x, y, z, player);
			if (id == MCreatorBigchestgui.GUIID)
				return new MCreatorBigchestgui.GuiWindow(world, x, y, z, player);
			return null;
		}
	}

	public static class ModElement {

		public static minerustaddonsmod instance;

		public ModElement(minerustaddonsmod instance) {
			this.instance = instance;
		}

		public void init(FMLInitializationEvent event) {
		}

		public void preInit(FMLPreInitializationEvent event) {
		}

		public void generateWorld(Random random, int posX, int posZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		public void registerModels(ModelRegistryEvent event) {
		}

		public int addFuel(ItemStack fuel) {
			return 0;
		}
	}
}
