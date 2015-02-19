package fluxedforces.init;

import fluxedforces.help.Reference;
import fluxedforces.help.RegisterHelper;
import fluxedforces.items.FluxedForcesItem;
import fluxedforces.tabs.FluxedForcesTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems
{
	public static Item blueprint = new FluxedForcesItem().setUnlocalizedName("Blueprint");
	public static Item rokBroken = new FluxedForcesItem().setUnlocalizedName("Repository of Knowledge(Broken)");
	public static Item qcore = new FluxedForcesItem().setUnlocalizedName("Q-Core");
	public static Item rok = new FluxedForcesItem().setUnlocalizedName("Repository of Knowledge");
	public static Item woodenCog = new FluxedForcesItem().setUnlocalizedName("Wooden Cog");
	public static Item assembleTable = new FluxedForcesItem().setUnlocalizedName("Assemble Table");
	public static Item analyticalEngine = new FluxedForcesItem().setUnlocalizedName("Analytical Engine");
	public static Item fabricator = new FluxedForcesItem().setUnlocalizedName("Fabricator");
	public static Item punchGen = new FluxedForcesItem().setUnlocalizedName("Tree Puncher 3000");
	public static Item gravitationPylon = new FluxedForcesItem().setUnlocalizedName("Gravitation Plyon");
	public static Item basicFuelGen = new FluxedForcesItem().setUnlocalizedName("Basic Fuel Generator");
	public static Item steamBoiler = new FluxedForcesItem().setUnlocalizedName("Steam Boiler");
	public static Item aquaCase = new FluxedForcesItem().setUnlocalizedName("Aqua Case");
	public static Item windCase = new FluxedForcesItem().setUnlocalizedName("Wind Case");
	public static Item steamCase = new FluxedForcesItem().setUnlocalizedName("Steam Case");
	public static Item turbine = new FluxedForcesItem().setUnlocalizedName("Turbine");
	public static Item crystal = new FluxedForcesItem().setUnlocalizedName("Blank Crystal");


	public static void init()
	{
		RegisterHelper.registerItem(blueprint);
		RegisterHelper.registerItem(qcore);
		RegisterHelper.registerItem(rok);
		RegisterHelper.registerItem(rokBroken);
		RegisterHelper.registerItem(woodenCog);
		RegisterHelper.registerItem(assembleTable);
		RegisterHelper.registerItem(aquaCase);
		RegisterHelper.registerItem(steamBoiler);
		RegisterHelper.registerItem(basicFuelGen);
		RegisterHelper.registerItem(gravitationPylon);
		RegisterHelper.registerItem(punchGen);
		RegisterHelper.registerItem(fabricator);
		RegisterHelper.registerItem(analyticalEngine);
		RegisterHelper.registerItem(windCase);
		RegisterHelper.registerItem(steamCase);
		RegisterHelper.registerItem(turbine);
		RegisterHelper.registerItem(crystal);
		
	}
}
