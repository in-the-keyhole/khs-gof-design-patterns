package dp.lab.memento;

public class DefaultOutputState extends OutputState {

	/**
	 * @see dp.lab.state.OutputState#print()
	 */
	public void print(Calculator calc) {
		
	System.out.println(calc.getLeftValue() + " " + calc.getOperation() + " " + calc.getRightValue() + " = " + calc.getResult());
		
	}

}
