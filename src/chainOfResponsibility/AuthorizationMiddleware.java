package chainOfResponsibility;

public class AuthorizationMiddleware extends Middleware{

	@Override
	public boolean next(String username, String password) {
		if(username.equals("admin") && password.equals("1234")) {
			System.out.println("Authorization successfull");
			return nextCheck(username,password);
		}
		else {
			System.out.println("Authorization failed");
			return false;
			
		}
	}

	

}
