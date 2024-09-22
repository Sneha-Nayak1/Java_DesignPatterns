package factory_DP;

public class Main {
	public static void main(String[] args) {
		//Vehicle v = new Car();
		//VehicleFactory vh=new VehicleFactory();
		Vehicle v=VehicleFactory.getInstace("T");
		v.getCapacity();
		
	}
}



//Develop a system for a transportation company that provides different types of vehicles(e.g., Car, Bike, and Truck) without exposing the creation logic to the main code using Factory design pattern
//1. Vehicle Interface: Create a Vehicle interface with methods getType, getNumberOfWheels, and getCapacity.
//2. Concrete Vehicle Classes: Implement three concrete classes Car, Bike, and Truck that implement the Vehicle interface.
//3. Vehicle Factory: Implement a VehicleFactory class that creates and returns instances of Car, Bike, and Truck based on the input parameter.
//4. Main Code: Write main code to demonstrate the usage of the factory to create different types of vehicles.