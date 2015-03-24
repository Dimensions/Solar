package net.dimensions.solar.event;

public interface Cancellable{

    public void setCancelled(boolean cancel);

    public boolean isCancelled();

}
