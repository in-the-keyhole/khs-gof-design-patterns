package dp.lab.observer;

/**
 * @author dpitt
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
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
