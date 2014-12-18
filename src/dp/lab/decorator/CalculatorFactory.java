package dp.lab.decorator;
import dp.lab.strategy.*;
/**
 * @author dpitt
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public abstract class CalculatorFactory {

	public abstract Calculator basic();
	public abstract Calculator scientific();
	public abstract Calculator programmer();
	

}