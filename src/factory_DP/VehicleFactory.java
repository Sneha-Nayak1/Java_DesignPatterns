package factory_DP;

public class VehicleFactory {
	public static Vehicle getInstace(String s) {
		
		if(s.equals("B")) {
			return new Bike();
		}
		else if(s.equals("C")) {
			return new Car();
		}else {
			return new Truck();
		}
	}

}
