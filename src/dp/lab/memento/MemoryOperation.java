package dp.lab.memento;

/**
 * @author dpitt
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class MemoryOperation extends Operation {

	/**
	 * Constructor for MemoryOperation.
	 */
	public MemoryOperation() {
		super("rcl");
	}

	public void execute(Calculator calc) {
		calc.recall();
	}

}
