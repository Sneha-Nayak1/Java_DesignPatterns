package command;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;




public class TextEditor {
	//Stack<Command> type;
	Stack<Command> undoSt;
	Stack<Command> redoSt;
	Document doc;
	
	
	public TextEditor(Document doc) {
		//this.type=new Stack<>();
		this.undoSt=new Stack<>();
		this.redoSt=new Stack<>();
		this.doc=doc;
	}
	
	
public void type(String str) {
	Command c=new Typing(doc,str);
	c.execute();
	undoSt.push(c);
	redoSt.clear();
	
}

public void undo() {
	//System.out.println(undoSt);
	if(!undoSt.isEmpty()) {
		Command c=undoSt.pop();
		c.undo();
		redoSt.push(c);
		//String cm=undoSt.pop();
		
		//c.execute(); 
		//redoSt.push(c);
		//c.execute();
	}else {
		System.out.println("Nothing in undo");
	}
}



public void redo() {
	if(!redoSt.isEmpty()) {
		Command c=redoSt.pop();
		c.execute();
		undoSt.push(c);
	}else {
		System.out.println("Nothing in redo");
	}
}
public void print() {
	System.out.println(doc.getText());
}

//	public String executeOperation(Command c) {
//		list.add(c);
//		return c.execute();
//	}

}
