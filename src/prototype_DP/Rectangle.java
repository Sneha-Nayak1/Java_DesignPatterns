package prototype_DP;

public class Rectangle implements Shape{
	String color;
	int height,width;
	
	public Rectangle(String color, int height, int width) {
		this.color=color;
		this.height=height;
		this.width=width;
	}
	
	
	@Override
	public Shape clone(){
		return new Rectangle(color,height,width);
	}
	@Override
	public void displayInfo() {
		System.out.println("I'm "+color+" in color and height: "+height+" width: "+width);
		
	}

}
