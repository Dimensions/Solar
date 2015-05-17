package dimensions.solar.plugin;

public interface PluginContainer {

    String getId();

    String getName();

    String getVersion();
    
    String[] getAuthors();
    
    Plugin getInstance();

}
