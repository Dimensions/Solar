package dimensions.solar.event;

public class SubscribeRegistration {

	private final EventExecutor executor;
	private final Order order;
	private final Object owner;

	public SubscribeRegistration(EventExecutor e, Order o, Object ow) {
		executor = e;
		order = o;
		owner = ow;
	}

	public EventExecutor getExecutor() {
		return executor;
	}

	public Order getOrder() {
		return order;
	}

	public Object getOwner() {
		return owner;
	}

}
