package dp.lab.composite;

public class ConsolePrinter extends Printer {
	
	
	public void print(Calculator calc) {
		
		calc.getState().print(calc);
	}

}
