package dp.lab.decorator;

/**
 * @author dpitt
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class BinaryOutputState extends OutputState {

	/**
	 * @see dp.lab.state.OutputState#print(Calculator)
	 */
	public void print(Calculator calc) {
		
	    int itemp = new Integer((int) calc.getLeftValue()).intValue();
		String sresult = " (bin) " + Integer.toBinaryString(itemp);
		sresult += calc.getOperation();
		itemp = new Integer((int) calc.getRightValue()).intValue();
		sresult += Integer.toBinaryString(itemp);
		sresult += " = ";
		itemp = new Integer((int) calc.getResult()).intValue();
		sresult += Integer.toBinaryString(itemp);	
		
		System.out.println(sresult);
	}

}
