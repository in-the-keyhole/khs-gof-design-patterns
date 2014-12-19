package dp.lab.observer;


public abstract class DecoratedPrinter extends Printer {
	
	private Printer decoratee = null;
	
	public DecoratedPrinter(Printer d){
		
		setDecoratee(d);
	}
	

	public Printer getDecoratee() {
		return decoratee;
	}


	public void setDecoratee(Printer decoratee) {
		this.decoratee = decoratee;
	}

}
