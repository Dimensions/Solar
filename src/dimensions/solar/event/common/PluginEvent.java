package dimensions.solar.event.common;

import dimensions.solar.event.Event;
import dimensions.solar.plugin.Plugin;

public class PluginEvent extends Event {

	private final Plugin plugin;

	/**
     * Creates a PluginEvent
     *
     * @param Plugin for this event
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
