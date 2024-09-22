package command_DP;

import java.util.Stack;

public class TextEditor {
	  Stack<Command> undoSt;
	  Stack<Command> redoSt;
	  Document doc;

	  public TextEditor(Document doc) {
	        this.doc = doc;
	        this.undoSt = new Stack<>();
	        this.redoSt = new Stack<>();
	        
	  }

	    public void type(String str) {
	        Command c = new Typing(doc, str);
	        c.execute();
	        undoSt.push(c);
	        redoSt.clear(); 
	    }

	    public void undo() {
	        if (!undoSt.isEmpty()) {
	            Command c = undoSt.pop();
	            //c.execute()
	            c.undo(); 
	            redoSt.push(c);
	            //c.execute()
	        } else {
	            System.out.println("Nothing to undo");
	        }
	    }

	    public void redo() {
	        if (!redoSt.isEmpty()) {
	            Command c = redoSt.pop();
	            c.execute(); 
	            undoSt.push(c); 
	            
	        } else {
	            System.out.println("Nothing to redo");
	        }
	    }

	    public void print() {
	        System.out.println(doc.getText());
	    }
}
