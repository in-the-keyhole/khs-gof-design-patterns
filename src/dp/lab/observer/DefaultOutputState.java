package dp.lab.observer;


public class DefaultOutputState extends OutputState {


	public void print(Calculator calc) {
		
	System.out.println(calc.getLeftValue() + " " + calc.getOperation() + " " + calc.getRightValue() + " = " + calc.getResult());
		
	}

}
