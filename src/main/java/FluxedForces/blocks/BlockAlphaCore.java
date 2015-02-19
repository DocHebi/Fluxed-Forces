package fluxedforces.blocks;

import fluxedforces.help.Reference;
import fluxedforces.tabs.FluxedForcesTab;
import fluxedforces.tabs.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;



public class BlockAlphaCore extends Block
{
	public BlockAlphaCore()
	{
		super(Material.iron);
		setBlockName("alphaCore");
		//setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTabs.tabFluxedForces);
	}
}
