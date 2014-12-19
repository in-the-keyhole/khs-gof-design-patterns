package dp.lab.memento;

public class AddOperation extends Operation{
	
	public AddOperation(){
		super("+");
	}
	
	public void execute(Calculator calc) {
		
		calc.setResult(calc.getLeftValue()+ calc.getRightValue());
				   				
		return; 
		
	}	 

}
