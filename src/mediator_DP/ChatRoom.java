package mediator_DP;

public interface ChatRoom {
	void sendMesg(String msg, Colleague c);
	void addUser(Colleague c);
	
}
