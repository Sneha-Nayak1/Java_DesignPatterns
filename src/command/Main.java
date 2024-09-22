package command;

public class Main {

	public static void main(String[] args) {
		
		Document doc = new Document();
        TextEditor t = new TextEditor(doc);
        t.type("Hi, ");
        t.print();
        t.type("Hello");
        t.print();
        t.type("Sneha");
        t.print();
        
        System.out.println();
        System.out.println("Undo action");
        t.undo();
        t.print(); 
        t.undo();
        t.print(); 
    
        System.out.println();
        System.out.println("Redo action");
        t.redo();
        t.print(); 
        t.redo();
        t.print(); 
       
     
        
//        res = t.executeOperation(new Undoing(doc));
//        System.out.println(res);
//
//       
//        res = t.executeOperation(new Redoing(doc));
//        System.out.println(res);
        
        //TextEditor t=new TextEditor();
        //t.executeOperation(new Typing( new Document("hi.txt")));

	}

}


//Develop a simple text editor application. 
//The text editor should support operations like typing text, 
//undoing the last operation, and redoing the undone operation.
//Implement this functionality using the Command design pattern.
//1. Command Interface: Define an interface that declares an execution method.
//2. Concrete Commands: Implement commands for typing text, undoing, and redoing.
//3. Invoker: The text editor will act as an invoker that will execute the commands.
//4. Receiver: The document (text buffer) is the receiver of the commands.
