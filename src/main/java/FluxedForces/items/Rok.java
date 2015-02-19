package fluxedforces.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import fluxedforces.help.Reference;
import fluxedforces.tabs.FluxedForcesTab;
import fluxedforces.tabs.ModTabs;

public class Rok extends Item {
	
	public Rok()
	{
		super();
		setCreativeTab(ModTabs.tabFluxedForces);
		
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister par1IconRegister)
	{
		itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":rokOn");
	}

}
