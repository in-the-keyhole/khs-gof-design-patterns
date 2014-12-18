package dp.lab.gui.mememto;



import javax.swing.*;
import java.awt.event.ActionEvent;

public class KeypadHandler extends CalculatorHandler {

	public KeypadHandler(CalculatorPanel aCalc)
	{
		super(aCalc);
	}
	
	/**
	 * @see CalculatorHandler#actionPerformed(ActionEvent)
	 */
	public void actionPerformed(ActionEvent event) {
				
		JButton aButton = (JButton) event.getSource();
	
		if (aButton.getText().equals("+/-")) {
			calcPanel.negate();}
		else if (aButton.getText().equals(".")) {
			calcPanel.decimalPoint(); }	
	
		else {
		calcPanel.applyDigit(aButton.getText()); }
		
	}

}

