package solar.dimensions.api.event.plugin;

import solar.dimensions.api.event.common.PluginEvent;
import solar.dimensions.api.plugin.Plugin;

public class PluginPreLoadEvent extends PluginEvent {
    public PluginPreLoadEvent(Plugin plugin) {
        super(plugin);
    }
}
