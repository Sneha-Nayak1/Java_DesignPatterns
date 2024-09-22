package facade_DP;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		HomeAutomationFacade h=new HomeAutomationFacade();
		System.out.println("Pess 1 to enter and 0 to exit");
		int n=s.nextInt();
		if(n==1) {
			h.enter();
		}
		else if(n==0){
			h.exitt();
		}
		else {
			System.out.println("Enter valid input");
			System.exit(0);
		}
		

	}

}


//Develop a home automation system. In this system, 
//you have various subsystems such as lighting, heating, and security. 
//Each subsystem has its own complex operations. 
//You want to provide a simplified interface to the client
//to control the entire home automation system without needing to
//know the details of each subsystem using facade design pattern.
//1. Create Subsystems: Define the subsystems (e.g., Lighting, Heating, Security)
      //with their operations.
//2. Create a Facade: Implement a HomeAutomationFacade class
     //that provides a simple interface to control the subsystems.
//3. Use the Facade: Demonstrate how to use the HomeAutomationFacade 
    //to control the home automation system.