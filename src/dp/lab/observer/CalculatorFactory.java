package dp.lab.observer;
import dp.lab.strategy.*;

public abstract class CalculatorFactory {

	public abstract Calculator basic();
	public abstract Calculator scientific();
	public abstract Calculator programmer();
	

}
