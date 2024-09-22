package chainOfResponsibility;

public class ValidationMiddleware extends Middleware{

	@Override
	public boolean next(String username, String password) {
		if(!username.isEmpty() && !password.isEmpty()) {
			System.out.println("Validation successfull");
			return nextCheck(username,password);
		}
		else {
			System.out.println("Validation failed");
			return false;
			
		}
	}

	

}
