package net.dimensions.solar.world;

import net.dimensions.solar.block.Block;

public interface World{

    String getName();

    UUID getUUID();

    Location getSpawnLocation();

    long getSeed();

    Block getBlock(int x, int y, int z);

    void setBlock(Material m, int x, int y, int z);

    Chunk getChunkAt(int x, int z);

    Chunk[] getLoadedChunks();

    List<Entity> getEntities();

    List<Player> getPlayers();

}
