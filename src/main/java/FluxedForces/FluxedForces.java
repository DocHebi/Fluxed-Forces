package fluxedforces;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import fluxedforces.crafting.Recipes;
import fluxedforces.help.Reference;
import fluxedforces.init.ModBlocks;
import fluxedforces.init.ModItems;

@Mod(modid= Reference.MODID, name = Reference.NAME, version = Reference.VERSION)

public class FluxedForces 
{
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
		ModItems.init();
		ModBlocks.init();
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		
		Recipes.init();
	}
	
	@Mod.EventHandler
	public void postInit(FMLInitializationEvent event)
	{
		
	}
}
