package chainOfResponsibility;

public class LoggingMiddleware extends Middleware{

	@Override
	public boolean next(String username, String password) {
		System.out.println("Logged info: "+ username);
		return nextCheck(username,password);
		
		
	}


}
