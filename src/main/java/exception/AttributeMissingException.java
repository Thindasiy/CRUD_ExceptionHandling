package exception;

public class AttributeMissingException extends RuntimeException {

	private static final long serialVersionUID = 8128292837012703774L;

	public AttributeMissingException() {
		super();
	}
	public AttributeMissingException(String message) {
		super(message);
	}
}
