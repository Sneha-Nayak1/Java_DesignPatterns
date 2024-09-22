package momento_DP;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
	
	List<String> list=new ArrayList<>();
	
	public void add(String shape) {
		list.add(shape);
		System.out.println("Added shape is --> "+shape);
	}
	
	public Memonto save() {
		return new Memonto(list);
	}
	public void show() {
		System.out.println("Current shape --> "+list);
	}
	
	public void restore(Memonto m) {
		list=new ArrayList<>(m.getState());
		System.out.println("Canvas restored: "+list);
	}
}
