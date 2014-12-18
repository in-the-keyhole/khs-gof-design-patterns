package dp.lab.gui.mememto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class CalculatorHandler implements ActionListener {
	
	CalculatorPanel calcPanel = null;
	
	
	
	public CalculatorHandler(CalculatorPanel aPanel)
	{
		calcPanel = aPanel;
	}

	/**
	 * @see ActionListener#actionPerformed(ActionEvent)
	 */
	public abstract void actionPerformed(ActionEvent arg0);
		
		
		
	
}

