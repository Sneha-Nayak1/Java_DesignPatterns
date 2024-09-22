package mediator_DP;

public class User1 implements Colleague{
	
	String name;
	ChatRoom m;
	public User1(String name, ChatRoom m) {
		this.m=m;
		this.name=name;
		m.addUser(this);
	}
	@Override
	public void send(String s) {
		System.out.println(name+" sending mesg : "+s);
		m.sendMesg(s, this);
		
	}
	@Override
	public void receive(String s) {
		System.out.println(name+ " received mesg: "+ s);
		
	}

	

}
