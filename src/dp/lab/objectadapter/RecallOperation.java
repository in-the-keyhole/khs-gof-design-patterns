package dp.lab.objectadapter;

/**
 * @author dpitt
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class RecallOperation extends Operation {

	/**
	 * Constructor for MemoryOperation.
	 */
	public RecallOperation() {
		super("mem");
	}

	public void execute(Calculator calc) {
		calc.remember();
	}

}
