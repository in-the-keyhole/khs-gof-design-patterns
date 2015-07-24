package dp.lab.strategy;

public class LogOperation extends UnaryOperation {


	public LogOperation() {
		super("log");
	}


	public String execute(double leftValue) {
		return String.valueOf(Math.log(leftValue));
	}

}
