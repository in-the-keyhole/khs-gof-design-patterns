package dp.lab.objectadapter;

public class RecallOperation extends Operation {


	public RecallOperation() {
		super("mem");
	}

	public void execute(Calculator calc) {
		calc.remember();
	}

}
