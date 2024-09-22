package mediator_DP;

public class Main {

	public static void main(String[] args) {
		ChatRoom m=new ConcreteMediator();
		Colleague c1=new User1("Sneha",m);
		Colleague c2=new User1("Manu",m);
		Colleague c3=new User1("Ram",m);
		c1.send("Hii All");

	}

}


//Imagine you are designing a simple chat room application.
//Users can send messages to the chat room, and 
//the chat room will broadcast the messages to all other users. 
//Using the Mediator pattern can help manage the 
//communication between users and the chat room.
//1. Mediator Interface: Defines the interface for communication 
     //between colleagues (participants).
//2. Concrete Mediator: Implements the mediator interface and
//coordinates communication between colleagues.
//3. Colleague Interface: Defines the interface for communication with the mediator.
//4. Concrete Colleague: Implements the colleague interface 
       //and communicates with other colleagues through the mediator.
//5. Main class: To demonstrate chatroom.

