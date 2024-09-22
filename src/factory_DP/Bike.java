package factory_DP;

public class Bike implements Vehicle{

	@Override
	public void getType() {
		System.out.println("Bike");
		
	}

	@Override
	public void getNumberOfWheels() {
		System.out.println("2");
		
	}

	@Override
	public void getCapacity() {
		System.out.println("3");
		
	}

}
