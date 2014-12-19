package dp.lab.memento;

public class LogOperation extends Operation {

	/**
	 * Constructor for LogOperation.
	 * @param op
	 */
	public LogOperation() {
		super("log");
	}

	/**
	 * @see dp.lab.strategy.Operation#execute(double, double)
	 */
	public void execute(Calculator calc) {
		calc.setResult(Math.log(calc.getRightValue()));
	}

}
