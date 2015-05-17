package dimensions.solar.plugin;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(TYPE)
@Retention(RUNTIME)
public @interface Plugin {

	/**
	 * The unique id of the plugin.
	 */
	String id();

	/**
	 * The human-readable name of the plugin.
	 */
	String name();

	/**
	 * The version of the plugin.
	 */
	String version() default "v0.0";

	/**
	 * The authors of the plugin
	 */
	String[] authors() default {"unknown"};
}
