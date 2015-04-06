package dimensions.solar.event.plugin;
/**
 * @Called when a Plugin is Disabled.
 */
import dimensions.solar.plugin.Plugin;

public class PluginDisableEvent extends PluginEvent {

	public PluginDisableEvent(Plugin plugin) {
		super(plugin);
	}

}
