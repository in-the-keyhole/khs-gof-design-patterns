package dp.lab.objectadapter;


public class BinaryOperation extends Operation {


	public BinaryOperation() {
		super("bin");
	}


	public void execute(Calculator calc) {
		calc.state = new BinaryOutputState();
	}

}
