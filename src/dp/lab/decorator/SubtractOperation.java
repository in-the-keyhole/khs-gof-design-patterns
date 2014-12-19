package dp.lab.decorator;

public class SubtractOperation extends Operation {

	public SubtractOperation(){
		super("-");
	}


	public void execute(Calculator calc) {
		calc.setResult(calc.getLeftValue() - calc.getRightValue());
		return;
	}

}
