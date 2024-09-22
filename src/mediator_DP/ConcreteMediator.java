package mediator_DP;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements ChatRoom{
	
	List<Colleague> list=new ArrayList<>();
	@Override
	public void sendMesg(String s, Colleague c) {
		for(Colleague cl: list) {
			if(cl!=c) {
				cl.receive(s);
			}
		}
		
		
	}

	@Override
	public void addUser(Colleague c) {
		list.add(c);
		
	}

	

}
