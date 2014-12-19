package dp.lab.state;

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
	public void execute(Calculator calc) {
		calc.setResult(Math.tan(calc.getRightValue()));
		return;
	}

}
