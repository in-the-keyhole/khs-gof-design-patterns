package dp.lab.strategy;


public class MultiplyOperation extends Operation {


	public MultiplyOperation() {
		super("*");
	}


	public double execute(double leftValue, double rightValue) {
		return leftValue * rightValue  ;
	}

}
