package dp.lab.singleton;


public class ConcreteCalculatorFactory extends CalculatorFactory {

		
	
	public Calculator basic() {

		// basic calculator

		Calculator calc = new Calculator();
		// install operations

		calc.install(new AddOperation());
		calc.install(new SubtractOperation());
		calc.install(new MultiplyOperation());
		calc.install(new DivideOperation());

		return calc;
	}

	public Calculator scientific() {

		// produce scientific calculator

		Calculator calc = new Calculator();

		calc.install(new AddOperation());
		calc.install(new SubtractOperation());
		calc.install(new MultiplyOperation());
		calc.install(new DivideOperation());
		calc.install(new SinOperation());
		calc.install(new TanOperation());
		calc.install(new LogOperation());

		return calc;
	}

public Calculator programmer() {

		// produce programmers calculator

		Calculator calc = new Calculator();

		calc.install(new AddOperation());
		calc.install(new SubtractOperation());
		calc.install(new MultiplyOperation());
		calc.install(new DivideOperation());
		calc.install(new SinOperation());
		calc.install(new TanOperation());
		calc.install(new LogOperation());
		calc.install(new BinaryOperation());
		

		return calc;
	}




}
