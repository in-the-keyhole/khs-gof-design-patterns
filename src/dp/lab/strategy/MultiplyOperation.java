package dp.lab.strategy;


public class MultiplyOperation extends Operation {


	public MultiplyOperation() {
		super("*");
	}


	public String execute(double leftValue, double rightValue) {
		return String.valueOf(leftValue * rightValue);
	}

}
