package solar.dimensions.api;

public interface Server {

    String getName();

    String getMotd();

    String getVersion();

    List<Player> getPlayers();

}
