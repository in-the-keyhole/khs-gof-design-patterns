package dp.lab.composite;

import java.util.Vector;

public class FormulaOperation extends Operation {

	private Vector operations = new Vector();
	private Vector values = new Vector();
	
	public FormulaOperation(String op) {
		super(op);
	}

	/**
	 * Constructor FormulaOperation.
	 */
	public FormulaOperation() {
	}


	public void execute(Calculator calc) {
			
		for (int i = 0; i < operations.size(); i++)
		{
			Operation op = (Operation) operations.elementAt(i);
			Double value = (Double) values.elementAt(i);
			calc.execute(op,value.doubleValue());
		}
		
		
	} 

	public void add(Operation op, double value) {
		operations.addElement(op);
		values.addElement( new Double(value));
		
	}			

	
	
}
