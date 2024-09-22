package factory_DP;

public class Car implements Vehicle{

	@Override
	public void getType() {
		System.out.println("Car");
		
	}

	@Override
	public void getNumberOfWheels() {
		System.out.println("4");
		
	}

	@Override
	public void getCapacity() {
		System.out.println("5");
		
	}

}
