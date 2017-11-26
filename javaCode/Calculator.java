


/**
 * This class computes the expression and gives result of the expression. If there are multiple errors in the 
 * expression, it will report the first error.
 * @author harman Randhawa
 *
 */
public class Calculator {
	private int result ;
	private String expression;
	private boolean correct;
	
	/**
	 * Default Constructor of the class
	 */
	public Calculator(){
		result =0;
		expression = "";
		correct = false;
	}
	/**
	 * This constructor sets the parameter as the input to the calculator and starts processing for the result 
	 * @param str The expression to be worked for calculations
	 */
	public Calculator( String str ){
		this.expression = str;
		startProcessing(expression);
		
	}
	/**
	 * THis method returns whether the input is correct or not 
	 * @return returns boolean
	 */
	public boolean isCorrect(){
		return correct;
	}
	/**
	 * This method will process the input string for calculations
	 * @param str This is the expression which will be input for calculator 
	 * @return correct answer or the error message
	 */
	public String startProcessing(String str) {
		result = 0;
		String message ="";
		try {
			String[] input = getArrayForInput(str);
			input = evaluateExpression(input);
			result = calculate( input );
			correct = true;
			return " Result = " + result;
		}
		catch ( UnaryException e ){
			correct = false;
			return e.getMessage();
		}
		catch ( MoreThanTwoOperands e ){
			correct = false;
			return e.getMessage();
		}
		catch ( ArrayIndexOutOfBoundsException e ){
			correct = false;
			return e.getMessage();
		}
		catch ( StringIndexOutOfBoundsException e ){
			correct = false;
			return e.getMessage();
		}
		catch ( ArithmeticException e ){
			correct = false;
			return e.getMessage();
		}
		catch ( MissingOperatorAndSecondOperandException e ){
			correct = false;
			return e.getMessage();
		}
      catch ( InvalidExpressionException e ){
    	  correct = false;
			return e.getMessage();
		}
      catch ( MissingSecondOperandException e ){
    	  correct = false;
			return e.getMessage();
		}
      catch ( NullPointerException e ){
    	   correct = false;
			return "Enter as per assignment dexcription";
		}
	}
/**
 * This method splits the input string to array for computation
 * @param str String to be split
 * @return returns an array or throws following exceptions if the string is not in correct format
 * @throws UnaryException throws this if the expression is unary 
 * @throws MoreThanTwoOperands throws if the expression has more than 2 operands
 * @throws ArrayIndexOutOfBoundsException throws if input is regular expression 
 * @throws StringIndexOutOfBoundsException throws if input is empty 
 * @throws InvalidExpressionException throws if input is incorrect 
 * @throws MissingSecondOperandException thows if input is just a number and misses second operand  
 * @throws ArithmeticException throws if division or modudlus is done by 0 
 * @throws MissingOperatorAndSecondOperandException throws if input is just a single number and misses second operand and operator 
 * @throws NullPointerException If user doesnt enter the space properly 
 */
	public String[] getArrayForInput( String str ) throws UnaryException,MoreThanTwoOperands, ArrayIndexOutOfBoundsException,
		ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException, InvalidExpressionException,MissingSecondOperandException,
		ArithmeticException, MissingOperatorAndSecondOperandException,NullPointerException{
		String[] arr;
		try {			
			arr = splitString(str);//this will trim all the whitespaces of input and return an array for 			
		}
		finally{};
		return arr;	
	}
	/**
	 * This method will trim all the spaces and split the string into array 
	 * @param input String to be split
	 * @return returns an array or throws following exception if expression is not in correct format 
	 * @throws StringIndexOutOfBoundsException throws if input is empty 
	 * @throws MoreThanTwoOperands throws if the expression has more than 2 operands
	 * @throws UnaryException throws this if the expression is unary 
	 * @throws MissingOperatorAndSecondOperandException throws if input is just a single number and misses second operand and operator 
	 * @throws InvalidExpressionException throws if input is incorrect 
	 * @throws MissingSecondOperandException thows if input is just a number and misses second operand
    * @throws NullPointerException User entered no space 
	 */
	private String[] splitString(String input) throws StringIndexOutOfBoundsException, ArrayIndexOutOfBoundsException,
	MoreThanTwoOperands, UnaryException, MissingOperatorAndSecondOperandException,InvalidExpressionException ,MissingSecondOperandException,
   NullPointerException{
		String[] arr = new String[3];
      String str;
		try {
			str = input.trim();
			arr = str.split(" ",3);
			try{//this will give an SIOOBException if input is empty 
            arr[0].charAt(0);
			}
			catch(StringIndexOutOfBoundsException e ){
				throw new StringIndexOutOfBoundsException("No Input");
			}
			try{//this method will try to catch the exception if the string has more than 2 operands and operators 
				String[] tempArr = new String[3];
            tempArr = arr[2].split(" ");
            try{
					try{
						arr[1].charAt(0);//will give AIOOBException in case of unary expressions 
						arr[2].charAt(0);//will give SIOOBException in case of regular expression missing second operand
					}
               catch ( ArrayIndexOutOfBoundsException e ){//unary
						throw new ArrayIndexOutOfBoundsException();
					}
					catch ( StringIndexOutOfBoundsException e ){//when second operand is missing
						throw new StringIndexOutOfBoundsException("Second Operand not entered");
					}
					try{
						tempArr[1].charAt(0);//regular expression will give AOOBException
					}
					catch ( ArrayIndexOutOfBoundsException e ){//regular expression so nothing to do here 
						return arr;
					}
				}
            catch ( StringIndexOutOfBoundsException e){
               throw e;
               }
				//if it reaches here then it is not null
				throw new MoreThanTwoOperands("More than just 2 operands and operator ");
			}
			catch ( ArrayIndexOutOfBoundsException e ){//happen if input was int+  or +int  or int +
				throw new UnaryException();
			}
         catch(NullPointerException e){
            throw new NullPointerException("No Space between second operand and operator");
            }
		}
		catch ( UnaryException e ){//so the expression is unary or second operand is missing 
			String[] unaryArr = new String[3];
			try{
				Integer.parseInt(arr[0].charAt(0) + "");//will give number format exception in case of +int
            unaryArr=formatPostUnary(arr);
			}
			catch( NumberFormatException f){//in the format of +int
				unaryArr=formatPreUnary(arr);
				}
          catch ( StringIndexOutOfBoundsException j ){//when second operand is missing
						throw j;
					}
			catch ( MissingOperatorAndSecondOperandException f ){
				throw f;
			}
			try{
					validUnary( unaryArr[1] );
			}
			finally{}
			return unaryArr;
			}
		}
	
/**
 * This method gets a string of length 5, format x + y. It evaluates the expression and returns the answer
 * @param arr array to be evaluated
 * @return the answer after calculating the expression or throws following exceptions
 * @throws ArithmeticException throws if division or modudlus is done by 0 
 * @throws InvalidExpressionException throws if input is incorrect 
 */
	private int calculate(String[] arr) throws ArithmeticException,InvalidExpressionException{
		int x = Integer.parseInt( arr[0] );
		int y = Integer.parseInt( arr[2] );
		try{
			switch ( arr[1].charAt(0)){
				case '+' : return x+y;
				case '-' : return x-y;
				case '*' : return x*y;
				case '/' : {
					try {
						int z = x/y;
						return z;
					}
					catch ( ArithmeticException e ){
						throw new ArithmeticException( " division by zero not possible ");
					}	
				}
				case '%' : {
					try {
						int z = x%y;
						return z;
					}
					catch ( ArithmeticException e ){
						throw new ArithmeticException( "Modulus by zero not possible ");
					}
				}
				case '^' : return (int) java.lang.Math.pow(x, y );
				default: throw new InvalidExpressionException("Illegeal Opeartor \" " + arr[1].charAt(0) + " \" ");
			}
		}
		finally{}
	}
	/**
	 * This method checks whether the arr is in correct format or not. The correct format is int, operand, int
	 * @param input The array to be checked
	 * @return the same array if it is correct otherwise throw an exception
	 * @throws InvalidExpressionException throws if first or second operand is not an integer
	 */
	private String[] evaluateExpression(String[] input)throws InvalidExpressionException,NullPointerException {
		try{
			Integer.parseInt( input[0] );//first operand
			try{
				Integer.parseInt( input[2] );
			}
			catch( NumberFormatException e){
				throw new InvalidExpressionException("Second operand is not an integer ");
			}
		}
		catch ( NumberFormatException e){
			throw new InvalidExpressionException("First operand is not an integer ");
		}
		return input;
	}
	/**
	 * This method gets an array and it formats it to the proper format so that it can be used for calculation
	 * @param input array to be evaluated 
	 * @return an array which is in correct format or throws following exceptions
	 * @throws MissingOperatorAndSecondOperandException throws if expression misses second operand and second operator 
	 * @throws MissingSecondOperandException throws if expression misses second operand 
	 */
	private String[] formatPostUnary(String[] input) throws MissingOperatorAndSecondOperandException,MissingSecondOperandException,
   NullPointerException{
		// this mehtod will get an arr of type 2+,null, null
		//it will return 2,+,1
		String DEFAULT_VALUE = "1";
		char lastCharacter = input[0].charAt( input[0].length() -1 );
		try{
			Integer.parseInt(lastCharacter + "");//if it is + or - it will give an exception 
         try{
            Integer.parseInt(input[1]);
            return null;
            }
			catch( NumberFormatException f){
            throw new MissingSecondOperandException("Missing second operand");
            }
         catch( ArrayIndexOutOfBoundsException s){
            throw new MissingOperatorAndSecondOperandException("Second Operand and Operator Missing");
            }
		}
		catch( NumberFormatException e ){
			String operand1 = input[0].substring( 0,input[0].length()-1);
			String[] arr = new String[3]; 
			arr[0] = operand1;
			arr[1] = lastCharacter +"";
			arr[2] = DEFAULT_VALUE; 
			return arr;
		}
	
	}
	/**
	 * This method gets an array and it formats it to the proper format so that it can be used for calculation 
	 * @param input It is the arr to be formatted
	 * @return It returns an arr after it formates the input array 
	 */
	private String[] formatPreUnary(String[] input) {
		// this method will get an arr of type +2,null, null
		//it will return 2,+,1
		String DEFAULT_VALUE = "1";
		String[] arr = new String[3]; 
		arr[0] = input[0].charAt(1)+"";
		arr[1] = input[0].charAt(0) +"";
		arr[2] = DEFAULT_VALUE; 
		return arr;
	}

	/**
	 * This method checks if the parameter character is + or -. Throws an exception if the str is neither one of them 
	 * @param str string that needs to be checked
	 */
	private void validUnary(String str ) throws UnaryException,NullPointerException{
		try{
			String[] arr= new String[1];
			arr[0] =str.charAt(0) == '+' || str.charAt(0) == '-' ? "1":"false";
			Integer.parseInt(arr[0]);
		}
		catch( NumberFormatException e ){
			throw new UnaryException("Operator must be + or - ");
		}
	}

	
}
