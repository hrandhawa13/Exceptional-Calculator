import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * This class is an extension of jframe class. It is used to 
 * add all the buttons and text fields to the frame
 * @author harman Randhawa
 *
 */
public class MyFrame extends JFrame {

	private static final int FRAME_WIDTH = 850;
	private static final int FRAME_HEIGHT = 450;
	private static final String DEFAULT_MESSAGE = "";
	
	private JLabel resultLabel; 
	private JTextField inputField; 
	private JButton button;
	private JPanel resultPanel;
	Calculator calc;
	/**
	 * Default Constructor that constructs the jframe.
	 */
	public MyFrame(){
		calc = new Calculator();
		resultLabel = new JLabel("Your answer will be shown here ");
		resultLabel.setOpaque(true);
		createInputField();
		createButton();
		createPanel();
		
		setSize(FRAME_WIDTH,FRAME_HEIGHT);
	}	
	/**
	 * This method creates a button onto the jframe
	 */
	private void createButton() {
		button = new JButton("Calculate");
		button.addActionListener( 
				( ActionEvent event ) ->  startCalculation() 
		);
	}
	/**
	 * This method starts calculation once user hits enter.
	 */
	private void startCalculation(){
		String str = inputField.getText().toString();
		String message = calc.startProcessing(str);
		if ( !calc.isCorrect() ){
         resultLabel.setText(message.toUpperCase());
			resultLabel.setBackground(Color.RED);
			resultLabel.setFont(new Font("Serif", Font.BOLD, 18));
			}
		else {
         resultLabel.setText(message);
			resultLabel.setBackground(Color.GREEN);
			resultLabel.setFont(new Font("Serif", Font.ITALIC, 18));
         
		}
	}
	/**
	 * This method creates an input field using jtextfield. User inputs the data into this.
	 */
	private void createInputField() {
		inputField = new JTextField();
		inputField.setText(DEFAULT_MESSAGE);
      inputField.addActionListener(
         (ActionEvent e) -> startCalculation()
      ); 
	}
	
	/**
	 * THis method creates all the components for the GUI
	 */
	private void createPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,2));
		panel.add(inputField);
		panel.add(button);
		
		JPanel outputPanel = new JPanel();
		outputPanel.add(panel,BorderLayout.NORTH);
		outputPanel.add(resultLabel);
		add(new CalculatorComponent());
		add(outputPanel);
	}
	
}
