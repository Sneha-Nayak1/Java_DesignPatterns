package prototype_DP;

public class Circle implements Shape{
	String color;
	int radius;
	//String color;
	
	

	public Circle(String color, int radius) {
		this.color=color;
		this.radius=radius;
	}
	
	
	@Override
	public Shape clone() {
		return new  Circle(color,radius);
	}
	@Override
	public void displayInfo() {
		System.out.println("I'm "+color+" in color and radius is "+ radius);
		
	}

}
