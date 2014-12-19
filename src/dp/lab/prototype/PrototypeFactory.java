package dp.lab.prototype;

import dp.lab.strategy.*;

public class PrototypeFactory {

	static CalculatorP basic = null;
	static CalculatorP scientific = null;

	static {

		// Create basic calculator
		basic = new CalculatorP();

		// install operations

		basic.install(new AddOperation());
		basic.install(new SubtractOperation());
		basic.install(new MultiplyOperation());
		basic.install(new DivideOperation());

		scientific = basic.copy();
		scientific.install(new SinOperation());
		scientific.install(new TanOperation());
		scientific.install(new LogOperation());

	}

	public static CalculatorP basic() {

		return basic.copy();

	}

	public static CalculatorP scientific() {
		return scientific.copy();
	}

}
