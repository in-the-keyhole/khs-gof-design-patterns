package dp.lab.memento;

/**
 * @author dpitt
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class AddOperation extends Operation{
	
	public AddOperation(){
		super("+");
	}
	
	public void execute(Calculator calc) {
		
		calc.setResult(calc.getLeftValue()+ calc.getRightValue());
				   
				
		return; 
		
	}	 

}
