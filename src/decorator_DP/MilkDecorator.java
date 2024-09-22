package decorator_DP;

public class MilkDecorator extends DecoratorCoffee{

	public MilkDecorator(Coffee c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCost() {
		return super.getCost() + 10.0;
		
	}

	@Override
	public String getDescription() {
		return super.getDescription()+ " with milk,";
		
	}

}
