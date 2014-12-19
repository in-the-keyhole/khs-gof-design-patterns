package dp.lab.composite;
public class Tester {

	public static void main(String[] args) {

	
		// basic calculator

		System.out.println("* * Basic Calculator * *");

		Calculator calc = PrototypeFactory.basic();

		// Create Memory caretaker
		
		CalculatorMemory memory = new CalculatorMemory();
		
		
		FormulaOperation formula = new FormulaOperation();
		formula.add(new AddOperation(),30.00);
		formula.add(new SubtractOperation(),20.00);
		calc.execute(formula);
		calc.print();
							

	}

}
