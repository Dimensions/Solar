package dimensions.solar.event;

public class EventException extends Exception{

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
