package dp.lab;

/**
 * @author dpitt
 *
 * Programmers Calculator.
 */
public class ProgrammerCalculator extends Calculator {

	// display state

	private int displayState = 0;

	// states
	static final int DECIMAL = 0;
	static final int BINARY = 1;
	static final int HEX = 2;
	static final int OCTAL = 3;

	public void bin() {
		setDisplayState(BINARY);
		print();

	}

	public void hex() {
		setDisplayState(HEX);
		print();
	}

	public void octal() {
		setDisplayState(OCTAL);
		print();

	}

	public void decimal() {
		setDisplayState(DECIMAL);
		print();

	}

	/**
	 * Convert expression to binary
	 */

	public String printBinary() {

		int itemp = new Integer((int) getLeftValue()).intValue();
		String sresult = "(bin) " + Integer.toBinaryString(itemp);
		sresult += getOperation();
		itemp = new Integer((int) getRightValue()).intValue();
		sresult += Integer.toBinaryString(itemp);
		sresult += " = ";
		itemp = new Integer((int) getResult()).intValue();
		sresult += Integer.toBinaryString(itemp);

		return sresult;

	}

	/**
	 * Convert expression to Hex
	 */

	public String printHex() {

		int itemp = new Integer((int) getLeftValue()).intValue();
		String sresult = "(hex) "+Integer.toHexString(itemp);
		sresult += getOperation();
		itemp = new Integer((int) getRightValue()).intValue();
		sresult += Integer.toHexString(itemp);
		sresult += " = ";
		itemp = new Integer((int) getResult()).intValue();
		sresult += Integer.toHexString(itemp);

		return sresult;

	}

	/**
	 * Convert expression to binary
	 */

	public String printOctal() {

		int itemp = new Integer((int) getLeftValue()).intValue();
		String sresult = "(octal) " + Integer.toOctalString(itemp);
		sresult += getOperation();
		itemp = new Integer((int) getRightValue()).intValue();
		sresult += Integer.toOctalString(itemp);
		sresult += " = ";
		itemp = new Integer((int) getResult()).intValue();
		sresult += Integer.toOctalString(itemp);

		return sresult;

	}

	/**
	 * Convert expression to binary
	 */

	public String printDecimal() {

		String sresult =
			"(decimal) "
				+ getLeftValue()
				+ " "
				+ getOperation()
				+ " "
				+ getRightValue()
				+ " = "
				+ getResult();

		return sresult;

	}

	public void print() {

		String display = "";
		switch (displayState) {
			case BINARY :
				display = printBinary();
				break;
			case HEX :
				display = printHex();
				break;
			case OCTAL :
				display = printOctal();
				break;
			case DECIMAL :
				display = printDecimal();
				break;

		}

		super.print(display);
	}

	/**
	 * Returns the displayState.
	 * @return int
	 */
	public int getDisplayState() {
		return displayState;
	}

	/**
	 * Sets the displayState.
	 * @param displayState The displayState to set
	 */
	public void setDisplayState(int displayState) {
		this.displayState = displayState;
	}

}
