package dp.lab.prototype;

import dp.lab.factory.*;
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
		// Scientific Calculator

		calc = PrototypeFactory.scientific();

		System.out.println("* * Scientific Calculator * *");

		//calc.log(10.0)
		calc.execute("+", 10.0);
		calc.execute("sin", 20.0);
		calc.print();
		calc.execute("log", 100);
		calc.print();

	  // Custom calculator 
	  
	  System.out.println("* * Custom Calculator * *");
	  calc = calc.copy();
	  calc.install(new TanOperation());
	  calc.execute("tan",20.00);
	  calc.print();
	  
	  


	}

}
