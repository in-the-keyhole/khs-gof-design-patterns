package dp.lab.singleton;


public abstract class CalculatorFactory {

	public abstract Calculator basic();
	public abstract Calculator scientific();
	public abstract Calculator programmer();
	private static CalculatorFactory instance = null;
	
	public static CalculatorFactory getInstance() {
		
		if (instance == null)
		 {  // Concrete class can determined at runtime
		 	// by externalizing class name and using 
		 	// reflection
		 	instance =  new ConcreteCalculatorFactory(); }
		 
		 return instance;
	}
	

}
