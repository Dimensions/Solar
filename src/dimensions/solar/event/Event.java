package dimensions.solar.event;

public abstract class Event{

    protected boolean cancelled = false;

    protected void setCancelled(boolean b){
        cancelled = b;
    }

    public boolean isCancelled(){
        return cancelled;
    }

}
