package dp.lab.composite;

public class BorderDecorator extends DecoratedPrinter {

	
	public BorderDecorator(Printer d) {
		super(d);
	}

	public void print(Calculator calc) {

		// output border lines

		System.out.println("=====================");
		getDecoratee().print(calc);
		System.out.println("=====================");

	}

}
