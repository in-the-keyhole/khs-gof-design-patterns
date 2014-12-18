package dp.lab.strategy;
public class Tester {

	public static void main(String[] args) {
		
		// basic calculator
		
		System.out.println("* * Basic Calculator * *");
		
		Calculator calc = new Calculator();
		// install operations
		
		calc.install(new AddOperation());
		calc.install(new SubtractOperation());
		calc.install(new MultiplyOperation());
		calc.install(new DivideOperation());
		
		calc.execute("+",10.0);
 		calc.print();
		calc.execute("+",10.0);
		calc.print();
		calc.execute("-",10.0);
		calc.print();
		calc.execute("/",2.0);
		calc.print();
		// Scientific Calculator
		
		calc = new Calculator();
		
		calc.install(new AddOperation());
		calc.install(new SubtractOperation());
		calc.install(new MultiplyOperation());
		calc.install(new DivideOperation());
		calc.install(new SinOperation());
		calc.install(new TanOperation());
		calc.install(new LogOperation());

		System.out.println("* * Scientific Calculator * *");
			
		//calc.log(10.0)
		calc.execute("+",10.0);
		calc.execute("sin",2.0);
		calc.print();
		calc.execute("log",2.00);
		calc.print();
			 
		
		
		
	}
	
	
}

