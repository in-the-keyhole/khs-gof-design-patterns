package dp.lab.composite;

import java.util.Stack;

import dp.lab.composite.Calculator.Memento;

public class CalculatorMemory {

	Stack<Memento> mementos = new Stack<>();
	
	public void remember(Calculator calc) {
		
		mementos.push(calc.produceMemento());
	}
	
	public void recall(Calculator calc) {
		
		calc.applyMemento(mementos.pop());
		
	}
		

}
