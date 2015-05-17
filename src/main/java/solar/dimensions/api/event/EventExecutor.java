package solar.dimensions.api.event;


public interface EventExecutor {
    void execute(Event event) throws EventException;
}
