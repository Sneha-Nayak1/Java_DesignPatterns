package observer_DP;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
	
	List<Observer> list=new ArrayList<>();
	public String temp;
	public String pressure;
	public String humidity;

	@Override
	public void register(Observer ob) {
		list.add(ob);
	}

	@Override
	public void deregister(Observer ob) {
		list.remove(ob);
	}

	@Override
	public void notifyPeople() {
		for(Observer o: list) {
			o.update(temp, pressure, humidity);
		}
	}
	
	public void setweather(String temp, String pressure, String humidity) {
		this.temp=temp;
		this.pressure=pressure;
		this.humidity=humidity;
		notifyPeople();
	}

}
