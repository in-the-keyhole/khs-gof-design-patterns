package dp.lab.memento;

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
	public void execute(Calculator calc) {
		calc.setResult(calc.getLeftValue() /  calc.getRightValue());
		return;
	}

}
