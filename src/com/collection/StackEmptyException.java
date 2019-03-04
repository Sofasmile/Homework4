package collection;

public class StackEmptyException extends RuntimeException {
    public StackEmptyException() {
        super();
    }

    public StackEmptyException(String message) {
        super(message);
    }
}
