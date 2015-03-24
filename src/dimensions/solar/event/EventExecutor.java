package dimensions.solar.event;


public interface EventExecutor {

    public void execute(Event event) throws EventException;

}
