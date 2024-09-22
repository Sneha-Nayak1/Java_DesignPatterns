//package command;
//
//public class Undoing implements Command{
//	
//	Document doc;
//	String prev;
//	
//	
//	public Undoing(Document doc) {
//		this.doc = doc;
//	}
//
//	@Override
//	public void execute() {
//		prev=doc.getText();
//		//doc.undo();
//		//return doc.undo();
//		
//	}
//	
//	 @Override
//	    public void undo() {
//	        doc.setText(prev);
//	        
//	    }
//
//}
