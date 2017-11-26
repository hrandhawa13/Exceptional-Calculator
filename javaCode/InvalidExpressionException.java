/**
 * This class is an extension of Illegal argument exception class. It is used to distinct different exceptions. 
 * @author harman Randhawa
 *
 */
public class InvalidExpressionException extends IllegalArgumentException {
	/**
	 * Default Constructor
	 */
	public InvalidExpressionException(){}
	/**
	 * Constructor in case a string is input 
	 * @param msg The input string for the exception 
	 */
	public InvalidExpressionException( String msg ){
		super(msg);
	}
}
