package momento_DP;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

public class DrawingApp {
	private final Stack<Memonto> undoSt = new Stack<>();
	private final Stack<Memonto> redoSt=new Stack<>();
	Canvas c;
	
	public DrawingApp(Canvas c) {
		this.c=c;
	}
	
	
	public void addShape(String shape) {
		undoSt.push(c.save());
		redoSt.clear();
		c.add(shape);
	}
	
	
	
	public void undo() {
		if(!undoSt.empty()) {
			redoSt.push(c.save());
			c.restore(undoSt.pop());
			//System.out.println(undoSt);
			
		}else {
			System.out.println("Nothing in undostack");
		}
	}
	
	
	public void redo() {
		if(!redoSt.empty()) {
			undoSt.push(c.save());
			c.restore(redoSt.pop());
			//System.out.println(redoSt);
		}else {
			System.out.println("Nothing in redostack");
		}
	}
}
