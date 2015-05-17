package solar.dimensions.api.event;

public abstract class Event {
    protected boolean cancelled = false;
    private String name;

    public boolean isCancelled() {
        return cancelled;
    }

    protected void setCancelled(boolean b) {
        cancelled = b;
    }

    /**
     * Gets a name for the event.
     *
     * @return the name of the event.
     */
    public String getEventName() {
        if (name == null) {
            name = getClass().getSimpleName();
        }
        return name;
    }
}
