package command;

public class Typing implements Command{
	
	Document doc;
	String txt;
	String prev;
	
	
	public Typing(Document doc,String txt) {
		this.doc = doc;
		this.txt=txt;
	}

	@Override
	public void execute() {
		prev = doc.getText();
		doc.type(txt);
		//return txt;
	}
	@Override
    public void undo() {
		//System.out.println("typing undo "+prev);
        doc.setText(prev);
    }

}
