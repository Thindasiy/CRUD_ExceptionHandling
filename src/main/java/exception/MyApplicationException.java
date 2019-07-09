package exception;

public class MyApplicationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public MyApplicationException() {
		
	}
	public MyApplicationException(String message) {
		super(message);
	}
}
