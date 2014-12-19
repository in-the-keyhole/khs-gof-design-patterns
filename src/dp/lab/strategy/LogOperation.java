package dp.lab.strategy;

public class LogOperation extends Operation {


	public LogOperation() {
		super("log");
	}


	public double execute(double leftvalue, double rightValue) {
		return Math.log(rightValue);
	}

}
