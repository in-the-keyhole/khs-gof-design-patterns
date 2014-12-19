package dp.lab.objectadapter;

import java.util.Iterator;
import java.util.Vector;

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
	private Vector memory = new Vector();

	private java.util.Hashtable operations = new java.util.Hashtable();

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
		memory.addElement(mem);
	}

	public void recall() {

		if (!memory.isEmpty()) {
			Memento mem = (Memento) memory.elementAt(0);
			mem.recall(this);
			memory.remove(0);
		}
	}

	public void printMemory() {

		Iterator iterator = memory.iterator();
		while (iterator.hasNext()) {

			Memento mem = (Memento) iterator.next();
			System.out.println(mem);
		}

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


	public java.util.Hashtable getOperations() {
		return operations;
	}


	public void setOperations(java.util.Hashtable operations) {
		this.operations = operations;
	}


	public OutputState getState() {
		return state;
	}


	public void setState(OutputState state) {
		this.state = state;
	}


	public Printer getPrinter() {
		return printer;
	}


	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

}