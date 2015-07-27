package dp.lab.memento;

import java.util.Stack;

import dp.lab.memento.Calculator.Memento;

public class CalculatorMemory {

	Stack<Memento> mementos = new Stack<>();
	
	public void remember(Calculator calc) {
		
		mementos.push(calc.produceMemento());
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
