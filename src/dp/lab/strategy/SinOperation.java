package dp.lab.strategy;


public class SinOperation extends UnaryOperation {

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
	public String execute(double leftValue) {
		return String.valueOf(Math.sin(leftValue));
	}

}
