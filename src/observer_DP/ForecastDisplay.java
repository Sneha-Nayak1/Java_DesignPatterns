package observer_DP;

public class ForecastDisplay implements Observer{
	public String temp;
	public String pressure;
	public String humidity;
	
	@Override
	public void update(String temp, String humidity, String pressure) {
		this.temp=temp;
		this.pressure=pressure;
		this.humidity=humidity;
		display();
	}
	public void display() {
		System.out.println("ForecastDisplay: Temperature is "+ temp+" Humidity is: "+humidity+" Pressure is: "+pressure);
	}
}
