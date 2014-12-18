package dp.lab.objectadapter;
public class Tester {

	public static void main(String[] args) {

	
		// basic calculator

		System.out.println("* * Basic Calculator * *");

		Calculator calc = ConcreteCalculatorFactory.getInstance().basic();

		// Create Memory caretaker
		
		CalculatorMemory memory = new CalculatorMemory();
		
		calc.execute("+", 10.0);
		// remember result
		memory.remember(calc);
		calc.execute("/", 2.0);
		// recall from memory
		memory.recall(calc);
		calc.execute("*",5.0);
		calc.print();
				

	}

}
