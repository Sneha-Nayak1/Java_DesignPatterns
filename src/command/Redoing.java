//package command;
//
//public class Redoing implements Command{
//	Document doc;
//	String prev;
//	
//	public Redoing(Document doc) {
//		this.doc = doc;
//	}
//	@Override
//	public void execute() {
//		prev=doc.getText();
//		//return doc.redo();
//		doc.redo();
//	}
//	
//	@Override
//    public void undo() {
//        doc.setText(prev);
//        
//    }
//
//}
