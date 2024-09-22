package command_DP;

public class Main {

	public static void main(String[] args) {
		Document doc = new Document();
        TextEditor t = new TextEditor(doc);
        t.type("Hello, ");
        t.print();
        t.type("world!");
        t.print();
        t.type("Sneha!");
        t.print();
        t.undo();
        t.print(); 
        t.undo();
        t.print();
        t.redo();
        t.print(); 
        t.redo();
        t.print();

	}

}
