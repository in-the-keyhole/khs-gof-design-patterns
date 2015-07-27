package dp.lab.composite;

import java.util.ArrayList;

public class FormulaOperation extends Operation {

	private ArrayList<Operation> operations = new ArrayList<>();
	private ArrayList<Double> values = new ArrayList<>();
	
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
			Operation op = (Operation) operations.get(i);
			Double value = (Double) values.get(i);
			calc.execute(op,value.doubleValue());
		}
		
		
	} 

	public void add(Operation op, double value) {
		operations.add(op);
		values.add( new Double(value));
		
	}			

	
	
}
