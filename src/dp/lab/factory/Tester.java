package dp.lab.factory;


import dp.lab.strategy.*;

public class Tester {

	public static void main(String[] args) {

		// create factory

		CalculatorFactory factory = new CalculatorFactoryA();

		// basic calculator

		System.out.println("* * Basic Calculator * *");

		Calculator calc = factory.basic();
		// install operations

		calc.execute("+", 10.0);
		calc.execute("+", 10.0);
		calc.print();
		calc.execute("-", 10.0);
		calc.print();
		calc.execute("/", 2.0);
		calc.print();
		// Scientific Calculator

		calc = factory.scientific();

		System.out.println("* * Scientific Calculator * *");

		//calc.log(10.0)
		calc.execute("+", 10.0);
		calc.execute("sin", 20.0);
		calc.print();
		calc.execute("log", 100);
		calc.print();

	}

}
