package solar.dimensions.api.world;

import solar.dimensions.api.block.Block;
import solar.dimensions.api.entity.Entity;
import solar.dimensions.api.entity.Player;
import solar.dimensions.api.material.Material;
import solar.dimensions.api.position.Location;

import java.util.List;
import java.util.UUID;

public interface World {
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
