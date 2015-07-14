package solar.dimensions.api.event;

public class ListenerRegistration {

    private final EventExecutor executor;
    private final Order orderSlot;
    private final Object owner;

    public ListenerRegistration(final EventExecutor executor, final Order orderSlot, final Object owner) {
        this.executor = executor;
        this.orderSlot = orderSlot;
        this.owner = owner;
    }

    public EventExecutor getExecutor() {
        return executor;
    }

    public Object getOwner() {
        return owner;
    }

    public Order getOrder() {
        return orderSlot;
    }
}
