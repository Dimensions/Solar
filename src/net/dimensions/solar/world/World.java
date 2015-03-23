package net.dimensions.solar.world;

import net.dimensions.solar.block.Block;

public interface World
{
    String getWorldName();

    Block getBlock(int posX, int posY, int posZ);

    void setBlock(Block block, int posX, int posY, int posZ);
}
