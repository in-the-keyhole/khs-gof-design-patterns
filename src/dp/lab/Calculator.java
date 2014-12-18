package dp.lab;
/* 
 * Basic Calclator Class
 */

public class Calculator {

	private double result = 0.0;
	private double leftValue = 0.0;
	private String operation = "";
	private double rightValue = 0.0;
		

	// operations	
	public Calculator add(double value) {

		operation = "+";
		swap(value);
		result = result + value;
		return this;
		
	}

	public Calculator divide(double value) {

		operation = "/";
		swap(value);
		result = result / value;
		return this;
		
	}

	public Calculator multiply(double value) {

		operation = "*";
		swap(value);
		result = result * value;
		return this;
		
	}

	public Calculator subtract(double value) {
		operation = "-";
		swap(value);
		result = result - value;
		return this;
		
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
	public void print(String aString) {
		
				
		System.out.println(aString);
			

	}
	public void print() {
	
		
    	print(leftValue + " " + operation + " " + rightValue + " = " + result);

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
	
	
}
	