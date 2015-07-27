package dp.lab.objectadapter;

import java.util.Stack;

import dp.lab.objectadapter.Calculator.Memento;

public class CalculatorMemory {

	Stack<Memento> mementos = new Stack<>();
	
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
