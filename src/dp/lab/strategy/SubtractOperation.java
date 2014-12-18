package dp.lab.strategy;

/**
 * @author dpitt
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class SubtractOperation extends Operation {

	public SubtractOperation(){
		super("-");
	}

	/**
	 * @see dp.lab.strategy.Operation#execute(double, double)
	 */
	public double execute(double leftValue, double rightValue) {
		return leftValue - rightValue;
	}

}
