package composite_DP;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{
	String name;
	public Folder(String name) {
		super();
		this.name = name;
	}
	
	List<FileSystemComponent> l=new ArrayList<>();
	public void addFolder(FileSystemComponent f) {
		l.add(f);
	}
	
	
	@Override
	public void display() {
		System.out.println("Folder: "+name);
		for(FileSystemComponent f:l) {
			f.display();
		}
		
	}

}
