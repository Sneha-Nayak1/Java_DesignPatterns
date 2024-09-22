package flyweight_DP;

import java.util.ArrayList;
import java.util.List;

public class Main {
	private List<CharacterInt> l =new ArrayList<>();
	
	//CharacterFlyweight c =new CharacterFlyweight();
	Factory f=new Factory();
	public void addChar(char ch,String font, String color) {
		CharacterInt c=f.getChar(ch);
		l.add(c);
		c.render(font, color);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m=new Main();
		m.addChar('s', "Times New Roman", "Red");
		m.addChar('r', "Calibri", "Blue");
		m.addChar('s', "Times New Roman", "Black");
		
		

	}

}


//Develop a text editor application. In this application,
  //each character (glyph) that the user types is represented as an object.
//To render a document with thousands of characters efficiently, 
//you want to avoid creating a new object for each character and
//instead share objects where possible.
//1. Create a Flyweight Interface: Define a Character interface 
        //with methods for rendering.
//2. Implement Concrete Flyweights: Implement the Character interface
      //in concrete classes.
//3. Create a Flyweight Factory: Create a factory to manage and 
       //reuse Character objects.
//4. Use the Flyweight: Demonstrate how to use the factory to get
   //and use Character objects.
