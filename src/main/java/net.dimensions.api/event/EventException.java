package dimensions.solar.event;

public class EventException extends Exception{

	private static final long serialVersionUID = 8627866409985405610L;

	public EventException(String message) {
        super(message);
    }

    public EventException(Throwable cause) {
        super(cause);
    }

    public EventException(String message, Throwable cause) {
        super(message, cause);
    }

}
