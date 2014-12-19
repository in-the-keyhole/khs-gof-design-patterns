package dp.lab.decorator;

public class DivideOperation extends Operation {

	public DivideOperation() {
		super("/");
	}

	public void execute(Calculator calc) {
		calc.setResult(calc.getLeftValue() /  calc.getRightValue());
		return;
	}

}
