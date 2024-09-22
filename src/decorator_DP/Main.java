package decorator_DP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee c=new SimpleCoffee();
		System.out.println(c.getDescription()+" costs "+c.getCost());
		
		c=new MilkDecorator(c);
		System.out.println(c.getDescription()+ " costs "+c.getCost());
		
		c=new SugarDecorator(c);
		System.out.println(c.getDescription()+ " costs "+c.getCost());
		
		c=new CaramelDecorator(c);
		System.out.println(c.getDescription()+ " costs "+c.getCost());
		
		

	}

}

//Develop a coffee shop application where customers can order different types of coffee. 
//Each type of coffee can have additional ingredients like milk, sugar, and caramel. 
//You want to be able to add these ingredients dynamically to any type of coffee 
  //using decorator design pattern.
//1. Create a Component Interface: Define a Coffee interface with a method 
   //to get the cost and a method to get the description.
//2. Implement Concrete Components: Implement the Coffee interface in concrete classes 
//like SimpleCoffee.
//3. Create a Decorator Class: Create an abstract decorator class
   //that implements the Coffee interface and has a reference to a Coffee object.
//4. Implement Concrete Decorators: Implement concrete decorators 
   //for different ingredients like MilkDecorator, SugarDecorator, and CaramelDecorator.
//5. Use the Decorators: Demonstrate how to add ingredients to coffee dynamically.