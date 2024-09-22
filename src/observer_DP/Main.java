package observer_DP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherStation ws=new WeatherStation();
		Observer ob1= new CurrentConditionsDisplay();
		Observer ob2= new StatisticsDisplay();
		Observer ob3= new ForecastDisplay();
		
		ws.register(ob1);
		ws.register(ob2);
		ws.register(ob3);
		
		ws.setweather("30 degree celsius\n", "69%\n", "757 mmHg\n");
		System.out.println("------------------------------------------------------");
		
		ws.deregister(ob1);
		System.out.println();
		ws.setweather("27 degree celsius\n", "78%\n", "768 mmHg\n");
		
	}

}


/*Create a notification system for a weather station. 
 * The weather station collects data and notifies various display units 
 * whenever there is a change in the weather conditions. 
 * The display units could be a CurrentConditionsDisplay, a StatisticsDisplay,
 *  and a ForecastDisplay.
1. Observer: Interface with update method to collect temperature, humidity and pressure.
2. Subject: Interface with method to register, deregister with Observer and to notify. 
3. WeatherStation: Implements the Subject interface to perform register,
    deregister and notify.
4. Display units: Implements various dispaly units
 (CurrentConditionsDisplay, StatisticsDisplay, ForecastDisplay) 
 that implement the Observer interface.
5. Main class: Demonstrate the notification mechanism by 
creating a weather station and adding/removing display units.*/

