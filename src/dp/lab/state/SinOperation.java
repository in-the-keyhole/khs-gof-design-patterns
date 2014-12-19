package dp.lab.state;

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
	public void execute(Calculator calc) {
		calc.setResult(Math.sin(calc.getRightValue()));
		return;
	}

}
