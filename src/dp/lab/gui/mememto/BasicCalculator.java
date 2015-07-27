package dp.lab.gui.mememto;

import dp.lab.memento.*;

public class BasicCalculator {

	public BasicCalculator() {
		super();
	}

	public static void main(String[] args) {

		try {
			javax.swing.JFrame frame = new javax.swing.JFrame();
			frame.setTitle("Basic Calculator");
			CalculatorPanel aCalculatorPanel;
			Calculator calc = new Calculator();
			calc.install( new AddOperation() );
			calc.install( new SubtractOperation() );
			calc.install( new MultiplyOperation() );
			calc.install( new DivideOperation() );
			
			
			aCalculatorPanel = new CalculatorPanel(calc);
			
			
			frame.setContentPane(aCalculatorPanel);
			frame.setSize(aCalculatorPanel.getSize());
			frame.addWindowListener(new java.awt.event.WindowAdapter() {
				public void windowClosing(java.awt.event.WindowEvent e) {
					System.exit(0);
				};
			});
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
	
	
