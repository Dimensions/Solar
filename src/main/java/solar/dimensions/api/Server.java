package solar.dimensions.api;

import solar.dimensions.api.entity.Player;

import java.util.List;
import java.util.UUID;

public interface Server {

    String getName();

    String getMotd();

    String getVersion();

    int getMaxPlayers();

    List<Player> getOnlinePlayers();

    List<Player> getPlayers(String... names);

    List<Player> getPlayers(UUID... uuids);

    Player getPlayer(String name);

    Player getPlayer(UUID uuid);

    

}
