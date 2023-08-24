package Output_InputStream;

public class RevisionException extends Exception{

	private static final long serialVersionUID = 1L;

	public RevisionException() {
		super();
	}

	public RevisionException(String message) {
		super(message);
	}

	public RevisionException(String message, Throwable cause) {
		super(message, cause);
	}

}
