package dp.lab.gui;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import dp.lab.strategy.*;

public class CalculatorPanel extends javax.swing.JPanel {
	private JTextField displayField = null;
	private Calculator calculator = null;
	boolean startover = false;
	private String currentOperation = null;
	private boolean operationExecuted = false;
	private boolean fraction = false;

	public static final int DISPLAY_WIDTH = 80;

	/**
	 * CalculatorPanel constructor comment.
	 */
	public CalculatorPanel(Calculator aCalc) {
		super();
		calculator = aCalc;
		initialize();
	}

	private String leftPad(String aString) {

		String display = aString;
		int length = display.length();
		for (int i = 0; i < DISPLAY_WIDTH - length; i++) {
			display = " " + display;
		}

		return display;
	}


	void decimalPoint() {
		fraction = true;
	}

	void negate() {
		
		double value = Double.parseDouble(displayField.getText());
		displayField.setText(leftPad(""+(-1.00 * value)));
		
		
	}	
		

	void applyDigit(String aString) {

		// left pad with spaces
		operationExecuted = false;
		String display = displayField.getText().trim();
		// after an operation is pressed, start over
		if (startover) {
			display = ".";
			startover = false;
		}

		display = leftPad(display);

		int decimalPoint = display.indexOf(".");
		// adjust for decimal point
		if (fraction) {
			 decimalPoint++; }
		
		String whole = display.substring(0, decimalPoint);
		String fraction = display.substring(decimalPoint);
		
		
		displayField.setText(whole + aString + fraction);

	}

	


	void applyOperation(String aString) {

		double value = Double.parseDouble(displayField.getText().trim());

		if (operationExecuted) {
			currentOperation = aString;
		} else {
			currentOperation = aString.equals("=") ? currentOperation : aString;
			calculator.execute(currentOperation, value);
			operationExecuted = true;
		}

		displayField.setText(leftPad("" + calculator.getResult()));
		startover = true;
		fraction = false;

	}

	void display(String aString) {

		displayField.setText(aString);
	}

	private void initialize() {

		setName("CalculatorPanel");
		setLayout(null);
		setSize(272, 183);
		add(createDisplayLabel(), "display");
		add(createKeyPanel(), "keypad");
		add(createOperationsPanel(), "operations");
	}

	private JTextField createDisplayLabel() {

		displayField = new JTextField();
		displayField.setText(".");
		displayField.setEditable(false);
		displayField.setName("displayfield");
		displayField.setAlignmentX(java.awt.Component.RIGHT_ALIGNMENT);
		displayField.setBackground(java.awt.Color.white);
		displayField.setBounds(4, 1, 262, 27);

		return displayField;

	}

	private JPanel createKeyPanel() {

		JPanel panel = new JPanel();
		JButton aButton = null;
		KeypadHandler handler = new KeypadHandler(this);

		panel.setName("KeyPanel");
		// Create Layout Control

		GridLayout layout = new java.awt.GridLayout();
		layout.setRows(4);

		panel.setLayout(layout);
		panel.setBounds(6, 28, 174, 141);

		// create 1-9 push buttons
		for (int i = 1; i < 10; i++) {
			String aName = "" + i;
			aButton = new JButton(aName);
			aButton.addActionListener(handler);
			panel.add(aButton, aName);
		}

		// add 0 buttons

		aButton = new JButton("0");
		panel.add(aButton);

		// add +/- button
		aButton = new JButton("+/-");
		aButton.addActionListener(handler);
		panel.add(aButton);

		// add . button
		aButton = new JButton(".");
		panel.add(aButton);
		aButton.addActionListener(handler);

		return panel;

	}

	private JPanel createOperationsPanel() {

		JPanel panel = new JPanel();
		JButton aButton = null;
		OperationHandler handler = new OperationHandler(this);

		panel.setName("OperationsPanel");
		// Create Layout Control

		GridLayout layout = new java.awt.GridLayout();
		layout.setRows(calculator.getOperations().size() + 1);

		panel.setLayout(layout);
		panel.setBounds(189, 29, 77, 136);

		Iterator iterator = calculator.getOperations().keySet().iterator();

		// create operations from calculator instance
		while (iterator.hasNext()) {
			String aName = "" + iterator.next();
			aButton = new JButton(aName);
			aButton.addActionListener(handler);
			panel.add(aButton, aName);
		}

		// add =  button

		aButton = new JButton("=");
		aButton.addActionListener(handler);
		panel.add(aButton);

		return panel;

	}

	/**
	 * main entrypoint - starts the part when it is run as an application
	 * @param args java.lang.String[]
	 */
	public static void main(java.lang.String[] args) {
		try {
			javax.swing.JFrame frame = new javax.swing.JFrame();
			CalculatorPanel aCalculatorPanel;
			aCalculatorPanel = new CalculatorPanel(new Calculator());
			frame.setContentPane(aCalculatorPanel);
			frame.setSize(aCalculatorPanel.getSize());
			frame.addWindowListener(new java.awt.event.WindowAdapter() {
				public void windowClosing(java.awt.event.WindowEvent e) {
					System.exit(0);
				};
			});
			frame.show();
			java.awt.Insets insets = frame.getInsets();
			frame.setSize(
				frame.getWidth() + insets.left + insets.right,
				frame.getHeight() + insets.top + insets.bottom);
			frame.setVisible(true);
		} catch (Throwable exception) {
			System.err.println(
				"Exception occurred in main() of javax.swing.JPanel");
			exception.printStackTrace(System.out);
		}
	}
}