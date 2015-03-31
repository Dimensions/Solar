package dimensions.solar.event;

public enum Order {

    EARLIEST(0, false),

    EARLY_IGNORE_CANCELLED(1, true),

    EARLY(2, false),

    DEFAULT_IGNORE_CANCELLED(3, true),

    DEFAULT(4, false),

    LATE_IGNORE_CANCELLED(5, true),

    LATE(6, false),

    LATEST_IGNORE_CANCELLED(7, true),

    LATEST(8, false),

    MONITOR(9, true);

    private final int id;
    private final boolean ignoreCancelled;

    Order(int index, boolean ignoreCancelled) {
        this.index = id;
        this.ignoreCancelled = ignoreCancelled;
    }

    public int getId() {
        return id;
    }

    public boolean ignoresCancelled() {
        return ignoreCancelled;
    }
}
