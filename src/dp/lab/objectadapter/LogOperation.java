package dp.lab.objectadapter;

public class LogOperation extends Operation {


	public LogOperation() {
		super("log");
	}


	public void execute(Calculator calc) {
		calc.setResult(Math.log(calc.getRightValue()));
	}

}
