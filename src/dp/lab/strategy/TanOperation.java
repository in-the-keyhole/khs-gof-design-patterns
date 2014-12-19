package dp.lab.strategy;


public class TanOperation extends Operation {

	/**
	 * Constructor for TanOperation.
	 * @param op
	 */
	public TanOperation() {
		super("tan");
	}

	/**
	 * @see dp.lab.strategy.Operation#execute(double, double)
	 */
	public double execute(double leftvalue, double rightValue) {
		return Math.tan(rightValue);
	}

}
