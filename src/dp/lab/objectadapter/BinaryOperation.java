package dp.lab.objectadapter;

/**
 * @author dpitt
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
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
