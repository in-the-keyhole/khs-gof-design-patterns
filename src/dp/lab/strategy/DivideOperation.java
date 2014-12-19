package dp.lab.strategy;


public class DivideOperation extends Operation {

	/**
	 * Constructor for DivideOperation.
	 * @param op
	 */
	public DivideOperation() {
		super("/");
	}

	/**
	 * @see dp.lab.strategy.Operation#execute(double, double)
	 */
	public double execute(double leftValue, double rightValue) {
		return leftValue / rightValue;
	}

}
