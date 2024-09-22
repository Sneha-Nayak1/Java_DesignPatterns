package state_DP;

public class Context {
	State st;
	public Context() {
		this.st=new Green();
	}
	public void setState(State st) {
		this.st=st;
	}
	
	public void signal() {
		st.change(this);
	}
	
//	public State getState() {
//		return st;
//	}

}
