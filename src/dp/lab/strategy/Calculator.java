package dp.lab.strategy;

import java.util.Hashtable;

/* 
 * Basic Calclator Class
 */

public class Calculator {

	private String result = "0.0";
	private double leftValue = 0.0;
	private String operation = "";
	private double rightValue = 0.0;
	private boolean reset = false;
	
	private Hashtable<String, Object> operations = new java.util.Hashtable<>();
	private Hashtable<String, Object> unaryOperations = new java.util.Hashtable<>();

	public Calculator execute(String opKey,double value) {

	    Operation op = (Operation) getOperations().get(opKey);
	    UnaryOperation uop = (UnaryOperation) getUnaryOperations().get(opKey);
	    
	    //tests if the operation used is unary or binary or the clear operation
	    if(opKey == "clr"){
	    	
	    	clear();
	    	
	    } else if (uop != null) {
	    	operation = opKey;
			leftValue = value;
			
			result = uop.execute(getLeftValue());
			
			reset = true;
			
			if(opKey == "hex" || opKey == "oct" || opKey == "bi"){
				reset = false;
			}
			
	    }else if (op != null){
		    operation = opKey;
			swap(value);
			
			if (reset) {
				result = op.execute(getLeftValue(),getRightValue());
			} else {
				result = String.valueOf(value);
			}
			
			reset = true;
			
	    }else{
	    	throw new RuntimeException("Operation "+opKey+" not supported...");
	    }
	    
	    return this;
		
	}

	public void install(Operation op) {
		operations.put(op.getName(),op);
	}
	
	public void install(UnaryOperation op) {
		unaryOperations.put(op.getName(),op);
	}
	
	public void clear() {
		
		reset = false;
		leftValue = 0.0;
		rightValue= 0.0;
		result = "0.0";
	}
		
		
	
	/*
	 *  New operation is going to be performed, swap
	 *  values
	 */
	void swap(double value) {
	
		leftValue = Double.parseDouble(result);
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

	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
	
	
	/**
	 * Returns the operations.
	 * @return java.util.Hashtable
	 */
	public java.util.Hashtable<String, Object> getOperations() {
		return operations;
	}
	
	public java.util.Hashtable<String, Object> getUnaryOperations() {
		return unaryOperations;
	}

	/**
	 * Sets the operations.
	 * @param operations The operations to set
	 */
	public void setOperations(java.util.Hashtable<String, Object> operations) {
		this.operations = operations;
	}
	
	public void setUnaryOperations(java.util.Hashtable<String, Object> operations) {
		this.operations = unaryOperations;
	}

}
	