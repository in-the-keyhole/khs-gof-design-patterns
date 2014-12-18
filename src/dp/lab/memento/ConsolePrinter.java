package dp.lab.memento;

/**
 * @author dpitt
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ConsolePrinter extends Printer {
	
	
	public void print(Calculator calc) {
		
		calc.getState().print(calc);
	}

}
