package solar.dimensions.api.world;

import solar.dimensions.api.block.Block;
import solar.dimensions.api.entity.Entity;

public interface Chunk {
    int getX();

    int getZ();

    World getWorld();

    Block getBlockAt(int x, int y, int z);

    Entity[] getEntities();

    boolean isLoaded();

    boolean load(boolean generate);

    boolean unload(boolean save);
}
