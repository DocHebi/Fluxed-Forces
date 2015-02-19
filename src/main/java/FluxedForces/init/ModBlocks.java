package fluxedforces.init;

import net.minecraft.block.Block;
import fluxedforces.blocks.BlockAlphaCore;
import fluxedforces.blocks.BlockGravitonOre;
import fluxedforces.blocks.BlockSolderingTable;
import fluxedforces.help.RegisterHelper;
import fluxedforces.items.FluxedForcesItem;

public class ModBlocks
{
	
	public static Block alphaCore = new BlockAlphaCore();
	public static Block gravitonOre = new BlockGravitonOre();
	public static Block solideringTable = new BlockSolderingTable();
	
	public static void init()
	{
		RegisterHelper.registerBlock(alphaCore);
		RegisterHelper.registerBlock(gravitonOre);
		RegisterHelper.registerBlock(solideringTable);
	}
}
