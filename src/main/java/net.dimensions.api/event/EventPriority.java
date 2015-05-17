package dimensions.solar.event;

public enum EventPriority{

    FIRST(0, false),
    EARLY_IGNORE_CANCEL(1, true),
    EARLY(2, false),
    DEFAULT_IGNORE_CANCEL(3, true),
    DEFAULT(4, false),
    LATE_IGNORE_CANCEL(5, true),
    LATE(6, false),
    LAST_IGNORE_CANCEL(7, true),
    LAST(8, false);

    private final int index;
    private final boolean ignoreCancel;

    EventPriority(int i, boolean b){
        this.index = i;
        this.ignoreCancel = b;
    }

    public int getIndex(){
        return this.index;
    }

    public boolean ignoreCancel(){
        return this.ignoreCancel;
    }

}
