package chainOfResponsibility;

public abstract class Middleware {
	Middleware m;
	public Middleware setNextLevel(Middleware m) {
		this.m=m;
		return m;
	}
	
	public abstract boolean next(String username, String password);
	
	public boolean nextCheck(String username, String password) {
		if(m==null) {
			return true;
		}
		return m.next(username,password);
	}
	
	
	

}
