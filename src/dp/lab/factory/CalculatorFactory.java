package dp.lab.factory;
import dp.lab.strategy.*;

public abstract class CalculatorFactory {

	public abstract Calculator basic();
	public abstract Calculator scientific();

}
