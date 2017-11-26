/**
 * This class is an extension of exception class. It is thrown when the user just inputs a single number in calculator . 
 * @author harman Randhawa
 *
 */
public class MissingOperatorAndSecondOperandException extends Exception {

	/**
	 * Default Constructor
	 */
	public MissingOperatorAndSecondOperandException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * COnstructor with string input 
	 * @param arg0 message about exception 
	 */
	public MissingOperatorAndSecondOperandException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor with throwable argument 
	 * @param arg0 Input 
	 */
	public MissingOperatorAndSecondOperandException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
    * Constructor with string and throwable argument  
	 * @param arg0 string 
	 * @param arg1 throwable 
	 */
	public MissingOperatorAndSecondOperandException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor with 4 arguments 
	 * @param arg0 string
	 * @param arg1 throwable
	 * @param arg2 boolean
	 * @param arg3 boolean
	 */
	public MissingOperatorAndSecondOperandException(String arg0,
			Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

}
