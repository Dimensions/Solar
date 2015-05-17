package solar.dimensions.api.event.common;

import solar.dimensions.api.event.Event;
import solar.dimensions.api.plugin.Plugin;

public class PluginEvent extends Event {
    private final Plugin plugin;

    /**
     * Creates a PluginEvent
     *
     * @param plugin for this event
     */
    public PluginEvent(final Plugin plugin) {
        this.plugin = plugin;
    }

    /**
     * Gets the plugin involved in this event
     *
     * @return Plugin for this event
     */
    public Plugin getPlugin() {
        return plugin;
    }
}
