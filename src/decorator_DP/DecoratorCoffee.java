package decorator_DP;

public abstract class DecoratorCoffee implements Coffee{
	 Coffee c;

	public DecoratorCoffee(Coffee c) {
		super();
		this.c = c;
	}
	
	 @Override
	    public double getCost() {
	        return c.getCost();
	    }

	    @Override
	    public String getDescription() {
	        return c.getDescription();
	    }

}
