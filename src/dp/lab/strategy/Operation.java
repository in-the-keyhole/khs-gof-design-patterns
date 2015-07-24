package dp.lab.strategy;


public abstract class Operation {
	
	private String name = null;
	
	public Operation(String op)
	{
		setName(op);
	}

	public abstract String execute(double leftvalue,double rightValue); 


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
