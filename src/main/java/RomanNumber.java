public enum RomanNumber {
    I(1, 1),
    V(5, 2),
    X(10, 3),
    L(50, 4),
    C(100, 5),
    D(500, 6);

    private int value;
    private int priority;

    RomanNumber(int value, int priority) {
        this.value = value;
        this.priority = priority;
    }

    int getPriority() {
        return priority;
    }
}
