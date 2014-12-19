package dp.lab.strategy;


public class SubtractOperation extends Operation {

	public SubtractOperation(){
		super("-");
	}

	
	public double execute(double leftValue, double rightValue) {
		return leftValue - rightValue;
	}

}
