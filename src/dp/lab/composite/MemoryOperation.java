package dp.lab.composite;

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
