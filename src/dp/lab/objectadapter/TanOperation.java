package dp.lab.objectadapter;


public class TanOperation extends Operation {


	public TanOperation() {
		super("tan");
	}


	public void execute(Calculator calc) {
		calc.setResult(Math.tan(calc.getRightValue()));
		return;
	}

}
