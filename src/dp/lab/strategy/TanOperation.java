package dp.lab.strategy;


public class TanOperation extends UnaryOperation {

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
	public String execute(double leftValue) {
		return String.valueOf(Math.tan(leftValue));
	}

}
