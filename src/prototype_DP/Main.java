package prototype_DP;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1=new Circle("Red",5);
		Circle c2=(Circle)c1.clone();
		c2.displayInfo();
		
		
		Rectangle r1=new Rectangle("Yellow",6,7);
		Rectangle r2=(Rectangle) r1.clone();
		
		r2.displayInfo();
		
		

	}

}



//Develop a graphics editor application. 
//In this application, you have different types of shapes (e.g., Circle, Rectangle) 
//that the user can draw on a canvas. 
//Each shape has some properties (e.g., position, color). 
//You want to be able to create new shapes by copying existing ones 
//to save time and maintain consistency by using prototype design pattern.
//1. Prototype Interface: Define a Shape interface with a clone() method.
//2. Concrete Prototypes: Implement the Shape interface in concrete classes 
     //like Circle and Rectangle.
//3. Main: Demonstrate how to create new shapes by cloning existing ones.