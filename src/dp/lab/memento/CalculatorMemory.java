package dp.lab.memento;

import java.util.Vector;

public class CalculatorMemory {

	Vector mementos = new Vector();
	
	public void remember(Calculator calc) {
		
		mementos.addElement(calc.produceMemento());
	}
	
	public void recall(Calculator calc) {
		
		if (!mementos.isEmpty())
		{	
			Object o = mementos.elementAt(0);
			calc.applyMemento(o);
			mementos.removeElementAt(0);
		}
		
	}
		

}
