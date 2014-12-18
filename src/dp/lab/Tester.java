package dp.lab;
public class Tester {

	public static void main(String[] args) {

		// basic calculator
		System.out.println("* * Basic Calculator * *");
		
		Calculator calc = new Calculator();
		calc.add(10.0)
		    .add(10.0)
		    .subtract(20.0)
		    .add(10)
		    .multiply(20.22)
		    .print();
		
		// Scientific Calculator
	
		System.out.println("* * Scientific Calculator * *");
		
		
		ScientificCalculator scalc = new ScientificCalculator();
		scalc.log(10.0)
			 .add(10.0);
		scalc.sin(20.0);
		scalc.print();
			 
			 
		// Programmers Calculator
		
		System.out.println("* * Programmers Calculator * *");
		
		ProgrammerCalculator pcalc = new ProgrammerCalculator();
		pcalc.add(10.00);
		pcalc.add(20.00);
		pcalc.bin();
		pcalc.octal();
		pcalc.hex();
		pcalc.decimal();	 
		
		
		
	}
}

