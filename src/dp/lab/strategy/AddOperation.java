package dp.lab.strategy;


public class AddOperation extends Operation{
	
	public AddOperation(){
		super("+");
	}
	
	public String execute(double leftValue,double rightValue) {
		
		return String.valueOf(leftValue + rightValue); 
		
	}	 

}
