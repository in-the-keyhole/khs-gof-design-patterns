package dp.lab.strategy;


public class HexOperation extends UnaryOperation{
	
	public HexOperation(){
		super("hex");
	}
	
	public String execute(double leftValue) {
		
		return Integer.toHexString((int) leftValue);
		
	}	 

}
