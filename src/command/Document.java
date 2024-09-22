package command;

import java.util.Stack;

public class Document {
	StringBuilder text;
    //Stack<String> s=new Stack<>();
    
	public Document() {
		this.text = new StringBuilder();
	}
	
//	public String undo() {
//		if(text.length()>0) {
//			text.deleteCharAt(text.length()-1);
//		}
//		return text.toString();
//	}
//	
	
	
	public String redo() {
		return text.toString();
	}
	
	
	
	public void type(String  textAdd) {
		text.append(textAdd);
	}
	
	public String getText() {
		return text.toString();
	}
	
	public void setText(String text) {
        this.text = new StringBuilder(text);
        //System.out.println("Document"+ text);
    }
	

}
