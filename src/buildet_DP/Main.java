package buildet_DP;

public class Main {
	public static void main(String[] args) {
		//Computer  c= new Computer("CPU",2,32,"game","windows");
		Computer c = new Computer.Builder("CPU",4).setOs("Windows").getComputer();;
				
		System.out.println(c);
	}

}

//Build a Computer object with various configurations, 
//that can lead to a complex constructor or a large number of constructors 
//to handle all possible configurations. Instead, use the Builder Design Pattern
//to simplify the creation process.
//1. Computer Class: Contains private fields for all configurable options and a private constructor that takes a Builder instance.
//(attributes: CPU,RAM,Storage,Graphics Card and Operating System)
//2. Builder Class: Nested static class inside Computer. It has methods to set each optional parameter and a build method to create a Computer object.
//3. Main Class: Demonstrates creating Computer objects using the Builder class.