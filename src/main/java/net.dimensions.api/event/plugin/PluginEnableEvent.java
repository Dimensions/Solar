package dimensions.solar.event.plugin;
import dimensions.solar.event.common.PluginEvent;
/**
 * @Called when a Plugin is Enabled.
 */
import dimensions.solar.plugin.Plugin;

public class PluginEnableEvent extends PluginEvent {

	public PluginEnableEvent(Plugin plugin) {
		super(plugin);
		// TODO Auto-generated constructor stub
	}

}
