package dp.lab.strategy;


public class OctOperation extends UnaryOperation{
	
	public OctOperation(){
		super("oct");
	}
	
	public String execute(double leftValue) {
		
		return  Integer.toOctalString((int) leftValue);
	}	 

}
