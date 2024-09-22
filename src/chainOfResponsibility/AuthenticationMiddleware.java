package chainOfResponsibility;

public class AuthenticationMiddleware extends Middleware{

	@Override
	public boolean next(String username, String password) {
		if(username.equals("admin") || password.equals("1234")) {
			System.out.println("Authentication successfull");
			return nextCheck(username,password);
		}
		else {
			System.out.println("Authentication failed");
			return false;
			
		}
		
	}

	

}
