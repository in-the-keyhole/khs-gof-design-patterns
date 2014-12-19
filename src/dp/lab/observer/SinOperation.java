package dp.lab.observer;


public class SinOperation extends Operation {


	public SinOperation() {
		super("sin");
	}

	public void execute(Calculator calc) {
		calc.setResult(Math.sin(calc.getRightValue()));
		return;
	}

}
