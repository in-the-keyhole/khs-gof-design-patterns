package dp.lab.singleton;


public class BinaryOutputState extends OutputState {


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
