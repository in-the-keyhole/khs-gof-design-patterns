package dp.lab.state;


public class MultiplyOperation extends Operation {


	public MultiplyOperation() {
		super("*");
	}


	public void execute(Calculator calc) {
		calc.setResult(calc.getLeftValue() * calc.getRightValue());
		return;
	}

}
