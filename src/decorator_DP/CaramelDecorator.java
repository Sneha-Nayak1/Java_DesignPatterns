package decorator_DP;

public class CaramelDecorator extends DecoratorCoffee{

	public CaramelDecorator(Coffee c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCost() {
		return  super.getCost() +25.0;
	}

	@Override
	public String getDescription() {
	return super.getDescription()+ " with caramel,";
	}

}
