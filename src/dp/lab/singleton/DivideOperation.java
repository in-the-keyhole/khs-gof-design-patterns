package dp.lab.singleton;


public class DivideOperation extends Operation {


	public DivideOperation() {
		super("/");
	}


	public void execute(Calculator calc) {
		calc.setResult(calc.getLeftValue() /  calc.getRightValue());
		return;
	}

}
