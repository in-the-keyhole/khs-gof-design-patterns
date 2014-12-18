package dp.lab.memento;

/**
 * @author dpitt
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
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
