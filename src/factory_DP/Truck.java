package factory_DP;

public class Truck implements Vehicle{

	@Override
	public void getType() {
		System.out.println("Truck");
		
	}

	@Override
	public void getNumberOfWheels() {
		System.out.println("8");
		
	}

	@Override
	public void getCapacity() {
		System.out.println("25");
		
	}

}
