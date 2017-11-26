import javax.swing.JFrame;
/**
 * This class is used to declare the jframe on which calculator works.
 * It assumes that user will enter the expression in the format as specified by assignment description
 * @author harman Randhawa
 *
 */
public class CalculatorViewer {
	public static void main(String[] args) {
		JFrame frame = new MyFrame();
    	frame.setTitle("Lets Calculate :) ");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    	}

	}
