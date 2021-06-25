public enum EventState {
    IN_PROGRESS("inprogress"),
    PENDING("pending"),
    FAILED("failed"),
    RETRY("retry"),
    SUCCESS("success");

    private final String value;

    EventState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
