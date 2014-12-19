package dp.lab.strategy;


public class SinOperation extends Operation {

	/**
	 * Constructor for SinOperation.
	 * @param op
	 */
	public SinOperation() {
		super("sin");
	}

	/**
	 * @see dp.lab.strategy.Operation#execute(double, double)
	 */
	public double execute(double leftvalue, double rightValue) {
		return Math.sin(rightValue);
	}

}
