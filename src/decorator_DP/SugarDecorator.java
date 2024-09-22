package decorator_DP;

public class SugarDecorator extends DecoratorCoffee{

	public SugarDecorator(Coffee c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCost() {
		return super.getCost() + 15.0;
		
	}

	@Override
	public String getDescription() {
		return super.getDescription()+  " with sugar, ";
	}
}
