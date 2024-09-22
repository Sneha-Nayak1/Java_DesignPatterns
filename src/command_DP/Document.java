package command_DP;

public class Document {
	private StringBuilder text;

    public Document() {
        this.text = new StringBuilder();
        
    }

    public String getText() {
        return text.toString();
        
    }

    public void setText(String text) {
        this.text = new StringBuilder(text);
        
    }

    public void type(String str) {
        text.append(str);
        
    }

    public String undo() {
        if (text.length() > 0) {
            text.deleteCharAt(text.length() - 1);
        }
        return text.toString();
        
    }

    public String redo() {
        
        return text.toString();
    }
}
