package dp.lab.objectadapter;


public class SinOperation extends Operation {


	public SinOperation() {
		super("sin");
	}

	
	public void execute(Calculator calc) {
		calc.setResult(Math.sin(calc.getRightValue()));
		return;
	}

}
