package dp.lab.observer;


public class MemoryOperation extends Operation {


	public MemoryOperation() {
		super("rcl");
	}

	public void execute(Calculator calc) {
		calc.recall();
	}

}
