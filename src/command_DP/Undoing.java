package command_DP;

public class Undoing implements Command{
	 private Document doc;
	    private String previousText;

	    public Undoing(Document doc) {
	        this.doc = doc;
	    }

	    @Override
	    public void execute() {
	        previousText = doc.getText();
	        doc.undo();
	        
	    }

	    @Override
	    public void undo() {
	        doc.setText(previousText);
	        
	    }
}
