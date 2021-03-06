package dp.lab.prototype;

import dp.lab.strategy.*;

public class PrototypeFactory {

	static CalculatorP basic = null;

	static {

		// Create basic calculator
		basic = new CalculatorP();

		// install operations

		basic.install(new AddOperation());
		basic.install(new SubtractOperation());
		basic.install(new MultiplyOperation());
		basic.install(new DivideOperation());

	}

	public static CalculatorP basic() {

		return basic.copy();

	}

}
