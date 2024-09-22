package composite_DP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemComponent f1=new File("File1","2mb");
		FileSystemComponent f2=new File("File2","4mb");
		FileSystemComponent f3=new File("File3","9mb");
		FileSystemComponent f4=new File("File4","10mb");
		
		Folder mf=new Folder("Main folder");
		Folder fo1=new Folder("Folder 1");
		Folder fo2=new Folder("Folder 2");
		Folder fo3=new Folder("Folder 3");
		
		fo1.addFolder(fo3);
		fo1.addFolder(f1);
		fo3.addFolder(f3);
		fo3.addFolder(f4);
		fo2.addFolder(f2);
		mf.addFolder(fo1);
		mf.addFolder(fo2);
		
		mf.display();
		
//                                        mainFolder
//                                        /       \
//                                     Folder1   Folder2
//                                     /     \         \
//                                  Folder3  file1     file2
//                                  /    \
//                               file3  file4
		
	}

}



//Develop a file system viewer application that shows a hierarchy of files and folders.
//Each folder can contain files and other folders. 
//You want to be able to treat files and folders uniformly when performing operations
//like displaying their contents using composite design pattern.
//1. Create a Component Interface: Define a FileSystemComponent interface with common operations.
//2. Implement Leaf and Composite Classes: Implement the FileSystemComponent interface 
   //in concrete classes like File (leaf) and Folder (composite).
//3. Use the Composite: Demonstrate how to create and manipulate a
   //file system hierarchy using the composite pattern.


