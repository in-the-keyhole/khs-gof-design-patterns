package dp.lab.composite;

import java.util.Hashtable;
import java.util.Stack;

/* 
 * Basic Calclator Class
 */

public class Calculator {

	private double result = 0.0;
	private double leftValue = 0.0;
	private String operation = "";
	private double rightValue = 0.0;
	private boolean reset = false;
	public OutputState state = new DefaultOutputState();
	public Printer printer = new ConsolePrinter();
	private Stack<Memento> memory = new Stack<>();

	private Hashtable<String, Operation> operations = new Hashtable<>();

	public Memento produceMemento() {

		Memento mem = new Memento();
		mem.result = this.result;

		return mem;
	}

	public void applyMemento(Object o) {

		result = ((Memento) o).result;

	}

	// memento inner class
	public class Memento {

		double result = 0.00;
		String operation = null;

		public void remember(Calculator calc) {

			result = getResult();
			operation = calc.getOperation();
		}

		public void recall(Calculator calc) {

			calc.setResult(result);

		}

		public String toString() {

			return " " + result;

		}

	}

	public Calculator() {

		install(new MemoryOperation());
		install(new RecallOperation());

	}

	public Calculator execute(String opKey, double value) {

		Operation op = (Operation) getOperations().get(opKey);
		if (op == null) {
			throw new RuntimeException(
				"Operation " + opKey + " not supported...");
		}
		operation = opKey;
		swap(value);
		if (reset) {
			op.execute(this);

		} else {
			result = value;
		}
		reset = true;
		return this;

	}

	public Calculator execute(String opKey) {
		Operation op = (Operation) getOperations().get(opKey);
		if (op == null) {
			throw new RuntimeException(
				"Operation " + opKey + " not supported...");
		}
		op.execute(this);

		return this;
	}
	
	public Calculator execute(Operation op) {
		
		op.execute(this);	
		return this;
	}		
		
		

	public void clear() {

		reset = false;
		leftValue = 0.0;
		rightValue = 0.0;
		result = 0.0;
	}

	public void install(Operation op) {
		operations.put(op.getName(), op);
	}

	/*
	 *  New operation is going to be performed, swap
	 *  values
	 */
	void swap(double value) {

		leftValue = result;
		rightValue = value;
	}

	/**
	 * Print current result and operation expression
	 */
	public void print() {

		printer.print(this);

	}

	public Calculator copy() {

		Calculator copy = new Calculator();
		copy.setOperations(getOperations());

		return copy;
	}

	public void remember() {

		Memento mem = new Memento();
		mem.remember(this);
		memory.push(mem);
	}

	public void recall() {

		if (!memory.isEmpty()) {
			Memento mem = (Memento) memory.pop();
			mem.recall(this);
		}
	}

	public void printMemory() {

		System.out.println(memory.toString());

	}

	/**
	 *  getters/setters
	 */

	public double getLeftValue() {
		return leftValue;
	}

	public void setLeftValue(double leftValue) {
		this.leftValue = leftValue;
	}

	public double getRightValue() {
		return rightValue;
	}

	public void setRightValue(double rightValue) {
		this.rightValue = rightValue;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	/**
	 * Returns the operations.
	 * @return java.util.Hashtable
	 */
	public Hashtable<String, Operation> getOperations() {
		return operations;
	}

	/**
	 * Sets the operations.
	 * @param operations The operations to set
	 */
	public void setOperations(Hashtable<String, Operation> operations) {
		this.operations = operations;
	}

	/**
	 * Returns the state.
	 * @return OutputState
	 */
	public OutputState getState() {
		return state;
	}

	/**
	 * Sets the state.
	 * @param state The state to set
	 */
	public void setState(OutputState state) {
		this.state = state;
	}

	/**
	 * Returns the printer.
	 * @return Printer
	 */
	public Printer getPrinter() {
		return printer;
	}

	/**
	 * Sets the printer.
	 * @param printer The printer to set
	 */
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	public Calculator execute(Operation op,double value) {
		
		execute(op.getName(),value);	
		return this;
	}
}