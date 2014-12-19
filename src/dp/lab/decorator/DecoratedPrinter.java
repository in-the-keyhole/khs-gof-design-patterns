package dp.lab.decorator;

public abstract class DecoratedPrinter extends Printer {
	
	private Printer decoratee = null;
	
	public DecoratedPrinter(Printer d){
		
		setDecoratee(d);
	}
	

	/**
	 * Returns the decoratee.
	 * @return Printer
	 */
	public Printer getDecoratee() {
		return decoratee;
	}

	/**
	 * Sets the decoratee.
	 * @param decoratee The decoratee to set
	 */
	public void setDecoratee(Printer decoratee) {
		this.decoratee = decoratee;
	}

}
