package solar.dimensions.api.event.plugin;

import solar.dimensions.api.event.common.PluginEvent;
import solar.dimensions.api.plugin.Plugin;

/**
 * Called when a Plugin is Enabled.
 */
public class PluginEnableEvent extends PluginEvent {
    public PluginEnableEvent(Plugin plugin) {
        super(plugin);
    }
}
