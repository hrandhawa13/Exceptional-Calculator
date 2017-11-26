/**
 * This class is an extension of exception class. It is thrown when user enters more than 2 operands in the expession
 * @author harman Randhawa
 *
 */
public class MoreThanTwoOperands extends Exception {
	/**
	 * Default Constructor
	 */
	public MoreThanTwoOperands() {
	}

	/**
	 * Constructor that takes a string argument
	 * @param arg0 string argument 
	 */
	public MoreThanTwoOperands(String arg0) {
		super(arg0);
	}
}
