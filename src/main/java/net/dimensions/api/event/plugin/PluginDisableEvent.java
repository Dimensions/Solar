package dimensions.solar.event.plugin;

import dimensions.solar.event.common.PluginEvent;
import dimensions.solar.plugin.Plugin;

/**
 * @Called when a Plugin is Disabled.
 */

public class PluginDisableEvent extends PluginEvent {

	public PluginDisableEvent(Plugin plugin) {
		super(plugin);
	}

}
