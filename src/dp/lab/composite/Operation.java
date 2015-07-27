package dp.lab.composite;


public abstract class Operation {
	
	private String name = null;
	
	public Operation(String op)
	{
		setName(op);
	}

	public abstract void execute(Calculator calculator); 

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Operation()
	{
		
	}
}
