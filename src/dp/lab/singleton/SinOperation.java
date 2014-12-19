package dp.lab.singleton;


public class SinOperation extends Operation {


	public SinOperation() {
		super("sin");
	}

	
	public void execute(Calculator calc) {
		calc.setResult(Math.tan(calc.getRightValue()));
		return;
	}

}
