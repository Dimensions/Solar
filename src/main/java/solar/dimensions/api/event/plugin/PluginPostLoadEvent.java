package solar.dimensions.api.event.plugin;

import solar.dimensions.api.event.common.PluginEvent;
import solar.dimensions.api.plugin.Plugin;

public class PluginPostLoadEvent extends PluginEvent {
    public PluginPostLoadEvent(Plugin plugin) {
        super(plugin);
    }
}
