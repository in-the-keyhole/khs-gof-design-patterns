package dp.lab.composite;


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
