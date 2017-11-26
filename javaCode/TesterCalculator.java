/**
 * This is the class used to run the application. It has the main method.
 * @author harma
 *
 */
public class TesterCalculator {

	public static void main(String[] args){
		Calculator calc = new Calculator("2 ^ 3 ");
		Calculator calc1 = new Calculator("2^ ");
		Calculator calc2 = new Calculator("2 ) 7 ");
		Calculator calc3 = new Calculator("2 + p ");
		Calculator calc4 = new Calculator("2 + 3 + ");
	}
}
