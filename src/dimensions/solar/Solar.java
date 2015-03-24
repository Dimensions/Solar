package dimensions.solar;

public class Solar
{
    private static Server server;

    private Solar(Server s)
    {
        server = s;
    }

    public static Server getServer()
    {
        return server;
    }

    public static String getName()
    {
        return server.getName();
    }

    public static String getMotd()
    {
        return server.getMotd();
    }

    public static String getVersion()
    {
        return server.getVersion();
    }
}
