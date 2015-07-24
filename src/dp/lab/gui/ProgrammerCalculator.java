package dp.lab.gui;

import dp.lab.strategy.*;

public class ProgrammerCalculator {

	/**
	 * Constructor for Programmer's calculator.
	 */
	public ProgrammerCalculator() {
		super();
	}

	public static void main(String[] args) {

		try {
			javax.swing.JFrame frame = new javax.swing.JFrame();
			frame.setTitle("Programmer's Calculator");
			CalculatorPanel aCalculatorPanel;
			Calculator calc = new Calculator();
			calc.install(new AddOperation());
			calc.install(new SubtractOperation());
			calc.install(new MultiplyOperation());
			calc.install(new DivideOperation());
			calc.install(new BinaryOperation());
			calc.install(new HexOperation());
			calc.install(new OctOperation());
			
			
			aCalculatorPanel = new CalculatorPanel(calc);
			
			
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
			System.err.println("Exception occurred in main() of javax.swing.JPanel");
		    exception.printStackTrace(System.out);
		}
	
	}
}
	