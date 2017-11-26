
/**
 * This class is extension of exception class. It is thrown when the expression is unary type
 * @author harman Randhawa 
 *
 */
public class UnaryException extends Exception {

	/**
	 * Default Constructor 
	 */
	public UnaryException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor with string argument 
	 * @param arg0 string 
	 */
	public UnaryException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor with throwable argument 
	 * @param arg0 throwable 
	 */
	public UnaryException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor with string and throwable argument 
	 * @param arg0 string 
	 * @param arg1 throwable 
	 */
	public UnaryException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor with string,throwable and 2 boolean arguments 
	 * @param arg0 string 
	 * @param arg1 throwable 
	 * @param arg2 boolean
	 * @param arg3 boolean 
	 */
	public UnaryException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

}
