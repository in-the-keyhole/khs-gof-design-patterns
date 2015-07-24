package dp.lab.strategy;

//operations only using one parameter
public abstract class UnaryOperation {
	
	private String name = null;
	
	public UnaryOperation(String op)
	{
		setName(op);
	}

	public abstract String execute(double leftvalue); 


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
