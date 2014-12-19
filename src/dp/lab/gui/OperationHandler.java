package dp.lab.gui;
import javax.swing.*;
import java.awt.event.ActionEvent;
public class OperationHandler extends CalculatorHandler{


	public OperationHandler(CalculatorPanel aPanel) {
		super(aPanel);
	}
	
	public void actionPerformed(ActionEvent event) {
		
		
		JButton aButton = (JButton) event.getSource();
		calcPanel.applyOperation(aButton.getText());
		
	}
	
	

}

