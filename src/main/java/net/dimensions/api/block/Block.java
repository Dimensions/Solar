package dimensions.solar.block;

import dimensions.solar.material.Material;
import dimensions.solar.world.World;

public interface Block {

	public Material getType();

	public void setType(Material m);

	public World getWorld();

	public String getUnlocalizedName(); //I don't think we need this because it's already in the Material

	public float getHardness();

	public int getLightValue();

	public boolean isReplaceable();

	public boolean isBurning();

	public int getFlameTick();

	public boolean isFlammable();

	public int getFireSpreadSpeed();

	public boolean isTileEntity();
}
