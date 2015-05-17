package dimensions.solar.world;

import dimensions.solar.block.Block;
import dimensions.solar.entity.Entity;
import dimensions.solar.entity.Player;
import dimensions.solar.material.Material;
import dimensions.solar.position.Location;

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
