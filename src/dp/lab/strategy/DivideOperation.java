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
	public String execute(double leftValue, double rightValue) {
		return String.valueOf(leftValue / rightValue);
	}

}
