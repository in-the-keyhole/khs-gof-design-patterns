package dp.lab.composite;

/**
 * @author dpitt
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
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
