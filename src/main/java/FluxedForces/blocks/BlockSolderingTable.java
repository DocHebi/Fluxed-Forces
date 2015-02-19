package fluxedforces.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import fluxedforces.tabs.ModTabs;
import fluxedforces.tile.TileEntitySolderingTable;

public class BlockSolderingTable extends Block implements ITileEntityProvider {
	
	public BlockSolderingTable()
	{
		super(Material.anvil);
		setBlockName("solideringTable");
		setCreativeTab(ModTabs.tabFluxedForces);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta){
		return new TileEntitySolderingTable();
	}
	
	@Override
	public int getRenderType()
	{
		return -2;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public int damageDropped(int meta) {
		return meta;
	}
	
}
