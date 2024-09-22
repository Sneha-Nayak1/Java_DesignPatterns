package command_DP;

public class Redoing implements Command{
	 private Document doc;
	    private String previousText;

	    public Redoing(Document doc) {
	        this.doc = doc;
	    }

	    @Override
	    public void execute() {
	        // Save current text state for undo
	        previousText = doc.getText();

	        // Perform redo operation (if needed; here we maintain original functionality)
	        doc.redo();
	    }

	    @Override
	    public void undo() {
	        // Reapply the previous text state
	        doc.setText(previousText);
	    }
}
