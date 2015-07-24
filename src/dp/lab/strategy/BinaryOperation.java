package dp.lab.strategy;


public class BinaryOperation extends UnaryOperation{
	
	public BinaryOperation(){
		super("bi");
	}
	
	public String execute(double leftValue) {
		return Integer.toBinaryString((int) leftValue);
	}	 

}
