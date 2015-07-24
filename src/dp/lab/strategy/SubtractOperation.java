package dp.lab.strategy;


public class SubtractOperation extends Operation {

	public SubtractOperation(){
		super("-");
	}

	
	public String execute(double leftValue, double rightValue) {
		return String.valueOf(leftValue - rightValue);
	}

}
