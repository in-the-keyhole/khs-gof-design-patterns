package dp.lab.strategy;


public class AddOperation extends Operation{
	
	public AddOperation(){
		super("+");
	}
	
	public double execute(double leftValue,double rightValue) {
		
		
		return leftValue + rightValue; 
		
	}	 

}
