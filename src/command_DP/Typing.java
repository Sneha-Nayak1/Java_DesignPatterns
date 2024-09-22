package command_DP;

public class Typing implements Command{
	  Document doc;
	  String textToAdd;
	  String previousText;

	  public Typing(Document doc, String textToAdd) {
	        this.doc = doc;
	        this.textToAdd = textToAdd;
	   }

	    @Override
	    public void execute() { 
	        previousText = doc.getText();
	        doc.type(textToAdd);
	        
	    }

	    @Override
	    public void undo() {
	        doc.setText(previousText);
	    }
}
