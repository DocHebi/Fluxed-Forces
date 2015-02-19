package fluxedforces.tabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fluxedforces.init.ModBlocks;
import fluxedforces.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FluxedForcesTab extends CreativeTabs
{
	
	String name;
	
	public FluxedForcesTab(int par1, String par2Str)
	{
		super(par1, par2Str);
		this.name = par2Str;
	}
	
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem()
	{
		if (this.name == "tabFluxedForces") 
		{
			return ModItems.rok;
		} 
		return null;
	}
}
