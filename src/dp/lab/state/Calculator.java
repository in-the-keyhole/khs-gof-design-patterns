package dp.lab.state;

import java.util.Hashtable;
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

	private Hashtable<String, Operation> operations = new Hashtable<>();

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
		rightValue= 0.0;
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

		state.print(this);

	}
	
	public Calculator copy() {
		
		Calculator  copy = new Calculator();
		copy.setOperations(getOperations());
		
		return copy;
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

	

}