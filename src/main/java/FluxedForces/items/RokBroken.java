package fluxedforces.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fluxedforces.help.Reference;
import fluxedforces.tabs.FluxedForcesTab;
import fluxedforces.tabs.ModTabs;

public class RokBroken extends Item {

	public RokBroken()
	{
		super();
		setCreativeTab(ModTabs.tabFluxedForces);
		
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister par1IconRegister)
	{
		itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":rokBroken");
	}

}


