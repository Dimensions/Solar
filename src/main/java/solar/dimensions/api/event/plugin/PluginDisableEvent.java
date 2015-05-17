package solar.dimensions.api.event.plugin;

import solar.dimensions.api.event.common.PluginEvent;
import solar.dimensions.api.plugin.Plugin;

/**
 * Called when a Plugin is Disabled.
 */
public class PluginDisableEvent extends PluginEvent {
    public PluginDisableEvent(Plugin plugin) {
        super(plugin);
    }
}
