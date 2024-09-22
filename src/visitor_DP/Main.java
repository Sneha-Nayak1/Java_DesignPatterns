package visitor_DP;

public class Main {

	public static void main(String[] args) {
		File2 f1=new File2("demo1",10);
		File2 f2=new File2("demo2",20);
		File2 f3=new File2("demo3",30);
		
		Directory2 d=new Directory2("Parent File");
		d.addElement(f1);
		d.addElement(f2);
		d.addElement(f3);
		
		PrintStructure ps=new PrintStructure();
		d.accept(ps);
		
		CalculateTotalSize ts=new CalculateTotalSize();
		d.accept(ts);
		System.out.println("Total size is: "+ ts.getTotalSize());
		
		FindFile f=new FindFile("Demo");
		d.accept(f);
		File2 find=f.foundFile();
		
		if(find!=null) {
			System.out.println("File name is: "+ find.getFilename());
			System.out.println("Its size is: "+find.getSize());
			
		}else {
			System.out.println("File not found!!!");
		}
		
	}

}
/*Develop a file system where you have different types of files and directories. You want to perform various operations such as printing the file structure, calculating the total size, and finding a specific file. 
1. Element Interface: Define accept method where the Element in the file system that can accept a visitor 
2. Concrete Elements: Implements the interface for File and Directory
3. Visitor Interface: Defind visit methods for File and Directory
4. Concrete Visitors: Implement Visotor interface to PrintStructure, CalculateTotalSize and FindFile
5. Main: Demonstrate Print Structure, Total Size and Find File*/