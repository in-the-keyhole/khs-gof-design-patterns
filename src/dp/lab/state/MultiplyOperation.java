package dp.lab.state;

/**
 * @author dpitt
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class MultiplyOperation extends Operation {

	/**
	 * Constructor for MultiplyOperation.
	 * @param op
	 */
	public MultiplyOperation() {
		super("*");
	}

	/**
	 * @see dp.lab.strategy.Operation#execute(double, double)
	 */
	public void execute(Calculator calc) {
		calc.setResult(calc.getLeftValue() * calc.getRightValue());
		return;
	}

}
