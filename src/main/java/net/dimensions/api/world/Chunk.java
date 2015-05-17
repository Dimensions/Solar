package dimensions.solar.world;

import dimensions.solar.block.Block;
import dimensions.solar.entity.Entity;

public interface Chunk {

	public int getX();

	public int getZ();

	public World getWorld();

	public Block getBlockAt(int x, int y, int z);

	public Entity[] getEntities();

	public boolean isLoaded();

	public boolean load(boolean generate);

	public boolean unload(boolean save);

}
