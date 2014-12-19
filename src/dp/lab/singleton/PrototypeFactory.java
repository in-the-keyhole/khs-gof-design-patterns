package dp.lab.singleton;


public class PrototypeFactory {

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
		
		// create programmer calculator
		programmer = basic.copy();
		programmer.install(new BinaryOperation());

	}	
	public static Calculator programmer() {
		return programmer;
	}
		

	
	public static Calculator basic() {

		return basic.copy();

	}

	public static Calculator scientific() {
		return scientific.copy();
	}

}
