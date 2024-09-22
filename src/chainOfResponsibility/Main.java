package chainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Middleware aut=new AuthenticationMiddleware();
		Middleware author=new AuthorizationMiddleware();
		Middleware log=new LoggingMiddleware();
		Middleware val=new ValidationMiddleware();
		aut.setNextLevel(author).setNextLevel(log).setNextLevel(val);
		
		if(aut.next("admin","1234")) {
		System.out.println("All levels Passed");
		}else {
			System.out.println("Didnt pass all level");
		}
		System.out.println();
		if(aut.next("admin", "1222")) {
			System.out.println("All levels Passed");
			}else {
				System.out.println("Didnt pass all level");
			}
			
		

	}

}


//Consider a web application where you need to process incoming HTTP requests 
//through a series of middleware components. 
//These components could include authentication, authorization, logging, 
//and request validation. Each component should have the opportunity to 
//handle the request, modify it, or pass it to the next component in the chain.
//1. Middleware Class: The abstract Middleware class defines the interface for
     //handling requests and maintaining a reference to the next handler in the chain.
//2. Concrete Middleware: AuthenticationMiddleware, AuthorizationMiddleware, 
    //LoggingMiddleware, and ValidationMiddleware are concrete implementations of the 
    //Middleware class. Each middleware handles a specific aspect of the request processing.
//3. Chain of Middleware: The linkWith method allows chaining multiple middleware
      //components together. The main method sets up the chain of responsibility 
      //by linking the middleware components in the desired order.
//4. Processing Requests: In the main method, requests are passed to the chain of 
       //middleware. Each middleware processes the request and decides whether 
      //to pass it to the next middleware in the chain.
//The final result is determined based on whether all middleware
//components successfully processed the request.