package dp.lab.observer;


public class ConsolePrinter extends Printer {
		
	public void print(Calculator calc) {
		
		calc.getState().print(calc);
	}

}
