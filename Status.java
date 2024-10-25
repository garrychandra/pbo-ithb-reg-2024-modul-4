enum Status {
    HADIR(0), ALPHA(1);

    private final int value;

    private Status(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
