package abstractFactory_DP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUIFactory g = new DarkThemeFactory();
		Button b=g.button();
		b.Display_Button();
		TextField t=g.text();
		t.Display_Text();
		
		

	}

}






//Create a GUI framework that supports different look-and-feel themes using Abstract Factory Design Pattern. The GUI framework should be able to create various UI components like buttons and text fields that conform to the look-and-feel of the chosen theme
//1. Abstract Products: Button and TextField are interfaces that define the operations that can be performed on these objects.
//2. Concrete Products: DarkButton, DarkTextField, LightButton, and LightTextField are the concrete implementations of the abstract products.
//3. Abstract Factory: GUIFactory is the abstract factory interface that declares methods for creating abstract products (Button and TextField).
//4. Concrete Factories: DarkThemeFactory and LightThemeFactory are concrete implementations of the GUIFactory interface. They provide the implementation for creating concrete products corresponding to their themes.
//5. Main: The Main class uses the GUIFactory to create theme-specific components without needing to know their concrete classes.