package dp.lab.decorator;
public class Tester {

	public static void main(String[] args) {

		
		

		// basic calculator

		System.out.println("* * Basic Calculator * *");

		Calculator calc = PrototypeFactory.basic();
		// install operations

		// Create Printer
		Printer printer = new ConsolePrinter();
		// Decorate Printer with Borders
		printer = new BorderDecorator(printer);
					
		calc.setPrinter( printer );


		calc.execute("+", 10.0);
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

		// Programmer Calculator

		calc = PrototypeFactory.programmer();

		System.out.println("* * Programmers Calculator * *");

		//calc.log(10.0)
		calc.execute("+", 10.0);
		calc.execute("+", 20.0);
		calc.execute("bin");
		calc.print();

	}

}
