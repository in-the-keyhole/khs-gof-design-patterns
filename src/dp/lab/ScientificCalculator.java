package dp.lab;

/**
 * @author CrossLogic
 *
 * Scientific Calculator.
 */
public class ScientificCalculator extends Calculator {
	
	
	
public Calculator sin(double value) {

		setOperation("sin");
		swap(value);
		setResult( Math.sin(value) );
		return this;
		
	}

public Calculator log(double value) {

		setOperation("log");
		swap(value);
		setResult( Math.log(value) );
		return this;
		
	}



}
