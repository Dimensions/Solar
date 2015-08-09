package solar.dimensions.api.event;

public enum EventResult {
    /**
     * Deny the event. Depending on the event, the action indicated by the event
     * will either not take place or will be reverted. Some actions may not be
     * denied.
     */
    DENY,
    /**
     * Neither deny nor allow the event. The server will proceed with its normal
     * handling.
     */
    DEFAULT,
    /**
     * Allow / Force the event. The action indicated by the event will take
     * place if possible, even if the server would not normally allow the
     * action. Some actions may not be allowed.
     */
    ALLOW;

}
