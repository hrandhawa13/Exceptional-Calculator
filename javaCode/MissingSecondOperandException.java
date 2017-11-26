/**
 * This class is an extension of exception class. It is thrown when user forgets about entering the second operand. 
 * @author harman Randhawa
 *
 */
public class MissingSecondOperandException extends Exception {

	/**
	 * Default COnstructor 
	 */
	public MissingSecondOperandException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * COnstructor with string parameter for the message of the exception 
	 * @param arg0 messge 
	 */
	public MissingSecondOperandException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * COnstructor with throwable argument 
	 * @param arg0 argument of type throwable 
	 */
	public MissingSecondOperandException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * COnstructor with string and throwable constructor
	 * @param arg0 string
	 * @param arg1 throwable
	 */
	public MissingSecondOperandException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * COnstructor  with string, throwable, and 2 booleans 
	 * @param arg0 string
	 * @param arg1 throwable
	 * @param arg2 boolean 
	 * @param arg3 boolean 
	 */
	public MissingSecondOperandException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

}
