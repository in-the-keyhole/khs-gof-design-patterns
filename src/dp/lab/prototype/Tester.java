package dp.lab.prototype;

import dp.lab.strategy.*;

public class Tester {

	public static void main(String[] args) {

		// basic calculator

		System.out.println("* * Basic Calculator * *");

		CalculatorP calc = PrototypeFactory.basic();
		// install operations

		calc.execute("+", 10.0);
		calc.execute("+", 10.0);
		calc.print();
		calc.execute("-", 10.0);
		calc.print();
		calc.execute("/", 2.0);
		calc.print();
	
	}

}
