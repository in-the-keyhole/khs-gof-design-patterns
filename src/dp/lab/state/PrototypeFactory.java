package dp.lab.state;

import dp.lab.strategy.*;


public class PrototypeFactory {

	// prototype instances
	static Calculator basic = null;
	static Calculator scientific = null;
	static Calculator programmer = null;

	static {

		// Create basic calculator
		basic = new Calculator();

		// install operations

		basic.install(new AddOperation());
		basic.install(new SubtractOperation());
		basic.install(new MultiplyOperation());
		basic.install(new DivideOperation());

		scientific = basic.copy();
		scientific.install(new SinOperation());
		scientific.install(new TanOperation());
		scientific.install(new LogOperation());
		
		programmer = scientific.copy();
		programmer.install(new BinaryOperation());

	}

	public static Calculator basic() {

		return basic.copy();

	}

	public static Calculator scientific() {
		return scientific.copy();
	}
	
	public static Calculator programmer() {
		return programmer;
	}
	

}
