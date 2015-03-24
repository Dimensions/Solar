package dimensions.solar.plugin;


import dimensions.solar.command.CommandContainer;

import java.util.ArrayList;
import java.util.List;

public class PluginContainer
{
    public String pluginId;
    public String name = pluginId;
    public String version = "1.0.0";
    public List<String> dependencies = new ArrayList<>();
    public List<CommandContainer> commands = new ArrayList<>();
}
