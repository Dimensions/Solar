package dimensions.solar.event;

public abstract class Event{

    protected boolean cancelled = false;
	private String name;

    protected void setCancelled(boolean b){
        cancelled = b;
    }

    public boolean isCancelled(){
        return cancelled;
    }
    
    /**
     * Gets a name for the event.
     * @return the name of the event.
     */
    
    public String getEventName() {
        if (name == null) {
            name = getClass().getSimpleName();
        }
        return name;
    }
}
