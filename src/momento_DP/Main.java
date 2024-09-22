package momento_DP;

public class Main {

	public static void main(String[] args) {
		
		Canvas c=new Canvas();
		DrawingApp d=new DrawingApp(c);
		d.addShape("Circle");
		d.addShape("Square");
		System.out.println("The shapes are:");
		c.show();
		
		d.undo();
		System.out.println("The shapes are:");
		c.show();
		
		
		d.redo();
		System.out.println("The shapes are:");
		c.show();
		d.addShape("Triangle");
		d.undo();
		d.redo();
		System.out.println("The shapes are:");
		c.show();
		//System.out.println("After undoing: "+c);
		

	}

}
//Create a simple drawing application that supports adding shapes to a canvas. 
//The application should also provide undo and redo functionality. 
//Implement this functionality using the Memento design pattern.
//1. Memento: This class will store the state of the Canvas.
//2. Originator: The Canvas class will create and restore states from Mementos.
//3. Caretaker: Manages the save and restore of Mementos.
//4. Main: Demonstrate - Add shape Circle and Square, perform undo and redo.
      //Then add shape Triangle then perform undo and redo.
