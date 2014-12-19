package dp.lab.decorator;

public class BinaryOperation extends Operation {

	/**
	 * Constructor for BinaryOperation.
	 * @param op
	 */
	public BinaryOperation() {
		super("bin");
	}

	/**
	 * @see dp.lab.state.Operation#execute(Calculator)
	 */
	public void execute(Calculator calc) {
		calc.state = new BinaryOutputState();
	}

}
