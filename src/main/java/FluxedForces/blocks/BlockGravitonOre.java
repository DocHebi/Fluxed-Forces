package fluxedforces.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import fluxedforces.help.Reference;
import fluxedforces.tabs.FluxedForcesTab;
import fluxedforces.tabs.ModTabs;

public class BlockGravitonOre extends Block {

		public BlockGravitonOre()
		{
			super(Material.iron);
			setBlockName("gravitonOre");
			//setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabFluxedForces);
		}
}
