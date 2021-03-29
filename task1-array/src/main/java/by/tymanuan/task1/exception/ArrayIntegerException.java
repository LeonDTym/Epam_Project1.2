package by.tymanuan.task1.exception;

public class ArrayIntegerException extends Exception {

	private static final long serialVersionUID = 1L;

	public ArrayIntegerException() {
		
	}
	
	public ArrayIntegerException (String message) {
		super(message);
	}
	
	public ArrayIntegerException (String message, Throwable cause) {
		super(message, cause);
	}
	
	public ArrayIntegerException (Throwable cause) {
		super(cause);
	}
}
